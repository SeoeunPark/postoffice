
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Parcel {

	private String p_address; //주소
	private String p_addressee; //수신인
	private String p_addresser;// 발신인 
	private String p_phoneNumber;//전화번호
	private String p_number; //우편 운송장번호
	private final String URL= "jdbc:mysql://localhost/testdb?characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false\\r\\n&serverTimezone=UTC&useSSL=false";



	Parcel(String address,  String addressee, String addresser, String phoneNumber){
		this.p_address= address;
		this.p_addressee=addressee;
		this.p_addresser=addresser;
		this.p_phoneNumber=phoneNumber;
	} //생성자
	
	public String getAddress() {
		return p_address;
	}
	public void setAddress(String address) {
		this.p_address = address;
	}
	public String getAddressee() {
		return p_addressee;
	}
	public void setAddressee(String addressee) {
		this.p_addressee = addressee;
	}
	public String getAddresser() {
		return p_addresser;
	}
	public void setAddresser(String addresser) {
		this.p_addresser = addresser;
	}
	public String getPhoneNumber() {
		return p_phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.p_phoneNumber = phoneNumber;
	}
	public String getNumber() {
		return p_number;
	}
	public void setNumber(String number) {
		this.p_number = number;
	}
	
	
	public static String numberGen(int len, int dupCd ) {
        
        Random rand = new Random();
        String numStr = ""; //난수가 저장될 변수
        
        for(int i=0;i<len;i++) {

            String ran = Integer.toString(rand.nextInt(10));
            if(dupCd==1) {
                //중복 허용시 numStr에 append
                numStr += ran;
            }else if(dupCd==2) {
                //중복을 허용하지 않을시 중복된 값이 있는지 검사한다
                if(!numStr.contains(ran)) {
                    //중복된 값이 없으면 numStr에 append
                    numStr += ran;
                }else {
                    //생성된 난수가 중복되면 루틴을 다시 실행한다
                    i-=1;
                }
            }
        }
        return numStr;
    }//end of numberGen
	
	public boolean insertMember(){   
		Connection conn = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection(URL, "root", "Weak");
		System.out.println("");
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.sql.Statement stmt = conn.createStatement();
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
		
		System.out.println("======정보입력=======");
		System.out.println("");
		System.out.println("주소를 입력하세요(띄어쓰기 X) "); 
		System.out.print("-> ");
		String address = in.next();
		
		System.out.println("수신인을 입력하세요  ");
		System.out.print("-> ");
		String addressee = in.next();
		
		System.out.println("발신인을 입력하세요  ");
		System.out.print("-> ");
		String addresser = in.next();
		
		System.out.println("전화번호를 입력하세요 "); 
		System.out.print("-> ");
		String phoneNumber = in.next();
		
		System.out.println("정보 입력이 끝났습니다."); 
		String number = numberGen(10,2);
		String Type = "택배";
		System.out.println("");
		System.out.println("운송장번호는 "+number+"입니다.");
		String dbCommand = "INSERT testdb.user VALUES('"+address+"','"+addressee+"','"+addresser +"','"+phoneNumber+"','"+number+"','"+Type+"')";
		System.out.println("**"+dbCommand);
		stmt.executeUpdate(dbCommand);

		conn.close();
	}
	catch(ClassNotFoundException e) {
		System.out.println("에러발생");
	}
	catch(SQLException e) {
		System.out.println("에러:" +e);
	}
	finally {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return false;
	}
	}
 
