
	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
import java.util.Scanner;
	
public class Client {
	
	private static Connection conn;
    private PreparedStatement pstmt;
    private CallableStatement cstmt;
    private ResultSet rs;
	private String sql;
	private final String URL= "jdbc:mysql://localhost/testdb?characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false\\r\\n&serverTimezone=UTC&useSSL=false";
    private Statement st= null;
    

 

		     private void getConnection() throws SQLException, ClassNotFoundException{ //db 와 연결
		    	 Connection conn = null;
		            //접속정보
		            String url = "jdbc:mysql://localhost/testdb?characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false\\r\\n&serverTimezone=UTC&useSSL=false";
		            System.out.println("연결 성공");
		            
		            java.util.Scanner in = new java.util.Scanner(System.in);
					java.sql.Statement stmt = conn.createStatement();
		            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);

		            //JDBC드라이버 로드
		           Class.forName("com.mysql.jdbc.Driver");
		            conn = DriverManager.getConnection(url, "root", "Weak");
	        
		     }//end of getConnection

	    /**
	    * 회원번호에 해당하는 회원정보 보기
	    */
	    public Parcel getMember(String Number){ //운송장번호에 맞는 회원정보 보기
	    	 Connection conn = null;
	 		
	 		try {
	 			Class.forName("com.mysql.jdbc.Driver");
	 			conn = DriverManager.getConnection(URL, "root", "Weak");
	 			System.out.println("정보를 불러오는 중 입니다.");
				System.out.println("...");
				System.out.println("");
	 			
	 			java.util.Scanner in = new java.util.Scanner(System.in);
	 			java.sql.Statement stmt = conn.createStatement();
	            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	 			
	 			
	 			java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE Number='"+Number+"'");
	 			rs.beforeFirst();
	 			System.out.println("====================================================================================");
	 			System.out.println("     주소                     수신인           발신인                    전화번호               	운송장 번호             타입  		");
	 			System.out.println("====================================================================================");
	 			while(rs.next()) {
	 			
	 				System.out.println(rs.getString("address")+"           "+
				 			rs.getString("addressee")+"           "+
				 			rs.getString("addresser")+"               "+
				 			rs.getString("phoneNumber")+"        "+
				 			rs.getString("number")+"       "+
				 			rs.getString("Type"));
	 			}//while
	 			System.out.println("====================================================================================");
	 			conn.close();
	 		}
	 		catch(ClassNotFoundException e) {
	 			System.out.println("드라이버 로딩 실패");
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
	 		//return false;
			return null;
	     
	     }
	    /**
	    * 저장된 회원 목록 보기
	    */
	    public boolean getMemberList(){
	    	Connection conn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(URL, "root", "Weak");
				System.out.println("");
				System.out.println("정보를 불러오는 중 입니다.");
				System.out.println("...");
				System.out.println("");
				
				java.util.Scanner in = new java.util.Scanner(System.in);
				java.sql.Statement stmt = conn.createStatement();
	            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	          
				
				java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM user");
				rs.beforeFirst();
	 			System.out.println("====================================================================================");
	 			System.out.println("     주소                     수신인           발신인                    전화번호               	운송장 번호             타입  		");
	 			System.out.println("====================================================================================");
				while(rs.next()) {
				
					System.out.println(rs.getString("address")+"           "+
				 			rs.getString("addressee")+"           "+
				 			rs.getString("addresser")+"               "+
				 			rs.getString("phoneNumber")+"        "+
				 			rs.getString("number")+"       "+
				 			rs.getString("Type"));
				}//while
				System.out.println("====================================================================================");
				conn.close();
			}
			catch(ClassNotFoundException e) {
				System.out.println("드라이버 로딩 실패");
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
	    }//end of getmemberlist
	   //회원 수정 
	    
	    public void test(String address, String addressee,String addresser,String phonenumber) {

	    	  try {
	    		  Scanner scan=new Scanner(System.in);
	    		  Class.forName("com.mysql.jdbc.Driver");
		 			Connection conn = DriverManager.getConnection(URL, "root", "Weak");
		 			st = conn.createStatement();
		 			System.out.println("수정할 운송장번호를 입력하세요:");
					System.out.print("-> ");
					System.out.println("");
		 			String number=scan.next();
		 			String update = ("UPDATE user SET address ='"+address+"',addressee='"+addressee+"',addresser='"+addresser+"',phonenumber='"+phonenumber+"'WHERE number="+number+";");
		 			System.out.println("");
		 			st.executeUpdate(update);
	    	  
		 			String insert="SELECT*FROM user WHERE number='"+number+"';";
		 			System.out.println("");
		 			rs= st.executeQuery(insert);
	    	  
	    	   while(rs.next()) {
		 				String Address = rs.getString("address");
		 				String Addressee = rs.getString("addressee");
		 				String Addresser = rs.getString("addresser");
		 				String Phonenumber = rs.getString("phonenumber");
		 				System.out.println(" | "+Address+" | "+Addressee+" | "+Addresser+" | "+Phonenumber+" | ");
		 			}
	    }
	    	  catch(ClassNotFoundException ex) {
	    		  System.out.println("로딩 실패");
	    	  }catch(SQLException ex) {
	    		  System.out.println("오류 :"+ex);
	    	  }
	    	  finally {
	    		  if(rs!=null) {
	    			  try {
						st.close();
	    			  }catch(SQLException ex) {
	    				  ex.printStackTrace();
	    			  }
	    		  }
	    		  if(st != null) {
	    			  try {
	    				  st.close();
	    			  }catch (SQLException ex) {
	    				  ex.printStackTrace();
	    			  }
	    		  }
	    	  }
	    }

	    /**
	    * 회원 삭제
	    */
	    public boolean deleteM(String number){        
	     
	    	boolean result = false;            
	        try {
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(URL, "root", "Weak");
				java.sql.Statement stmt = conn.createStatement();
				String delete=("DELETE FROM user WHERE number ="+number+";");
				stmt.executeUpdate(delete);
	            
	        } catch (Exception e) {
	            System.out.println("예외발생:deleteMember()=> "+e.getMessage());
	        }finally{          
	            //dbClose();
	        }      
	        return result;
	    }//deleteMember()--------------
	    
	public void deleteMember(){
	
	Client cl = new Client();
    Scanner scan = new Scanner(System.in);
    System.out.println("삭제할 운송장번호를 입력해주세요");
	System.out.print("-> ");
    String Number = scan.nextLine();
    cl.deleteM(Number);
    System.out.println("");
    System.out.println("회원정보가 삭제되었습니다.");
	}  
}//end of client 