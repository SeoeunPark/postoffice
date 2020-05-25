import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

	public class Mail{//우편 접수
		
	private double MailWeight;  //우편 중량
	private int MailCount;  //우편 수량
	private String answer; // 입력받는 값
	private int pay; //금액
	private String m_phoneNumber; //우편 전화번호
	private String m_address; //주소
	private String m_addresser; //수신인
	private String m_addressee; //발신인
	private final String URL= "jdbc:mysql://localhost/testdb?characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false\\r\\n&serverTimezone=UTC&useSSL=false";

	Mail(String address, String addressee, String addresser, String phoneNumber) { //우편 생성자
			this.m_address=address; 
			this.m_addressee=addressee;
			this.m_addresser=addresser;
			this.m_phoneNumber=phoneNumber;
			
		}//end of 생성자

		public double getMailWeight() {
		return MailWeight;
	}

	public void setMailWeight(double mailWeight) {
		MailWeight = mailWeight;
	}

	public int getMailCount() {
		return MailCount;
	}

	public void setMailCount(int mailCount) {
		MailCount = mailCount;
	}

	public String getM_phoneNumber() {
		return m_phoneNumber;
	}

	public void setM_phoneNumber(String m_phoneNumber) {
		this.m_phoneNumber = m_phoneNumber;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public String getM_addresser() {
		return m_addresser;
	}

	public void setM_addresser(String m_addresser) {
		this.m_addresser = m_addresser;
	}

	public String getM_addressee() {
		return m_addressee;
	}

	public void setM_addressee(String m_addressee) {
		this.m_addressee = m_addressee;
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
			String Type = "우편";
			System.out.println("");
			System.out.println("운송장번호는 "+number+"입니다.");
			String dbCommand = "INSERT testdb.user VALUES('"+address+"','"+addressee+"','"+addresser +"','"+phoneNumber+"','"+number+"','"+Type+"')";
			//System.out.println("**"+dbCommand);
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

	public void MailCheck() { //우편 요금 조회
		Scanner scan= new Scanner(System.in);
		System.out.println("우편 수량을 입력하세요"); //우편수량입력
		System.out.print("-> ");
		int ncount = scan.nextInt();
		System.out.println("우편 무게를 입력하세요(단위: 0.0g)"); //우편무게입력
		System.out.print("-> ");
		double nweight = scan.nextDouble();

		this.MailCount = ncount; //수량
		this.MailWeight = nweight; //중량

		if(this.MailWeight <= 5.0 && this.MailWeight > 0.0) { //0초과 5이하
			pay = 350;
		} else if(this.MailWeight *this.MailCount > 5.0 && this.MailWeight *this.MailCount <= 25.0 ) { //5초과 25이하
			pay = 380;
		} else if(this.MailWeight *this.MailCount > 25.0  && this.MailWeight *this.MailCount<= 50.0 ) { //25초과 50이하
			pay= 400;
		} else{ //50 초과
			System.out.println("우편의 최대 중량은 50까지 입니다. 다시 입력해주세요.");
		}
		//출력문
		System.out.println("");
		System.out.println("우편 수량: " + this.MailCount + "개 " + "\n" 
				+"중량: " + this.MailWeight + "g  " + "\n"
				+"총 금액은: " + pay + "입니다.");
		System.out.println("");
	} //end of MailCheck
	
	}//end of mail