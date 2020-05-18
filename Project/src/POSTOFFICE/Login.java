package POSTOFFICE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

import javax.swing.JPanel;
import javax.swing.JRootPane;


public class Login extends Frame implements ActionListener {
	// jdbc 설정
	private String url = "jdbc:mysql://localhost/testlist1?characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false\\r\\n&serverTimezone=UTC&useSSL=false";// user테이블을 수정하면
	private String strUser = "root"; // 계정 id
	private String strPassword = "se9703709"; // 계정 패스워드
	private String strMySQLDriver = "com.mysql.jdbc.Driver"; // 드라이버
	//JPanel p1;
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	String id;
	String pawt;
	String name;
	String username;
	
	LoginGUI log = new LoginGUI(); 
	Data d = new Data();
	Select select = new Select();
	
	// 다이얼로그 , 버튼, 라벨,
	Button ok;
	Label msg;
	Dialog info;
	/*
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	*/

	Login() {
	try {
	// 로그인 버튼이 클릭 되었을시에 jdbc드라이버를 등록
	Class.forName(strMySQLDriver);
	con = (Connection) DriverManager.getConnection(url, strUser, strPassword);
	stmt = (Statement) con.createStatement();
	
	} catch (Exception b) {
	System.out.println("db연결실패");
	}
	log.bt1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	// 해당하는 버튼값 가져오기
	Object obj = e.getSource();
	if (obj.equals(log.bt1)) {
	// 로그인창의 로그인 버튼
		loginCheck();
		/*
		log.setVisible(false);
		select.setTitle(name + "님 로그인 중 입니다.");
		select.setVisible(true);
		*/
		} 
	}
	

	// 로그인 체크
	void loginCheck() {
		 //UserDefaultJTableDAO dao =new UserDefaultJTableDAO();
	// 로그인창의 텍스트필드에 쓴값을 가져오기
	id = log.tex1.getText().trim();
	pawt = log.tex2.getText().trim();
	
	// SELECT 쿼리를 작성한다. 해당하는 아이디값의 패스워드를 검색한다.
	String query = "SELECT * FROM testlist1.member where id='" + id + "'";
	System.out.println(query);
	try {
	// executeQuery() 메서드로 SELECT문의 실행시키고 결과로 ResultSet 객체를 받는다.
		ResultSet rs = stmt.executeQuery(query);
	// 레코드가 있는지 검사
	if (rs.next()) {
	//
		username = rs.getString("name");
		System.out.println(username);
		System.out.println(rs.getString("name"));
	// 텍스트필드에 쓴값과 데이터베이스에 있는 패스워드 값을 비교한다.
	if (pawt.equals(rs.getString("paw")) ) {
		System.out.println("Login Success");
		log.setVisible(false);
		select.setTitle(rs.getString("name") + "님 로그인 중 입니다.");
		select.setVisible(true);
		// 맞으면 선택창을 띄워준다.
	}else {
		System.out.println("Login Fail");
		//틀리면 메인으로.
		new MainJFrame();
		}
	}
	
	} catch (Exception b) {
	b.printStackTrace();
	}
	}
	}
	
