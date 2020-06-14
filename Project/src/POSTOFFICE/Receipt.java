package POSTOFFICE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import POSTOFFICE.showPayChoose.pay;

public class Receipt extends JFrame {
	JPanel p; //p 배경
	JLabel la;
	JTextField tf;
	JButton b1;
	 Connection con;
	  Statement st;
	  PreparedStatement ps;
	  ResultSet rs;
	Select select = new Select();
	showMailChoose showmail = new showMailChoose();
	LoginGUI log = new LoginGUI();
	
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/testlist1?characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false\\r\\n&serverTimezone=UTC&useSSL=false";
	  
	Receipt(){
		// setting
	    setTitle("접수완료");
	    setSize(300, 250);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // visible
	    setVisible(true);
	   
	    // Layout
	    p = new JPanel(); 
	    p.setLayout(null);
	    p.setBackground(new Color(230, 230, 250));
	    getContentPane().add(p);
	    
	    b1 = new JButton("메인으로");
	    // add
	    la = new JLabel("접수가 완료되었습니다.");
	    la.setFont(new Font("돋움체", Font.PLAIN, 14));
	    la.setBounds(65, 20, 189, 38);

	    p.add(la);
	    p.add(b1);
	    
	    b1.setForeground(new Color(0, 128, 128));
	    b1.setBackground(Color.WHITE);
	    b1.setBounds(79, 75, 140, 41);
	    
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					select.setTitle("로그인 중 입니다.");
					select.setVisible(true);
					//new PrintJFrame();
	    	}
	    	});
	    try {
	          // 로드
	          Class.forName(driver);
	          // 연결
	          con = DriverManager.getConnection(url,"root", "se9703709");
	          java.util.Scanner in = new java.util.Scanner(System.in);
	  			java.sql.Statement stmt = con.createStatement();
	          java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	          int random = (int) Math.random();
	          
//	          ps = con.prepareStatement("insert into testlist1.order values(?,?,?,?,?,?,?)");
//	          ps.setString(1, "123");
//	          ps.setString(2, log.tex1.getText());
//	          ps.setString(3, showmail.w1.getText());
//	          ps.setString(4, showmail.c1.getText());
//	          ps.setString(5, showmail.ad1.getText());
//	          ps.setString(6, showmail.ad2.getText());
//	          ps.setString(7, showmail.ad3.getText());
	          
	          
	          String idstr = log.tex1.getText().trim();
	          String w1str = showmail.w1.getText().trim();
	          String c1str =showmail.c1.getText().trim();
	          String ad1str= showmail.ad1.getText().trim();
	          String ad2str = showmail.ad2.getText().trim();
	          String ad3str = showmail.ad3.getText().trim();
	          //System.out.println(id);
	          //디비 연결 필요 
	          //디비 연결...
	          String dbCommand = "INSERT testlist1.order VALUES('111','"+idstr+"','"+w1str+"','"+c1str+"','"+ad1str+"','"+ad2str+"','"+ad3str+"')";
	          stmt.executeUpdate(dbCommand);
	          
	      } catch (ClassNotFoundException e) {
	          System.out.println(e + "=> 로드 fail");
	      } catch (SQLException e) {
	          System.out.println(e + "=> 연결 fail");
	      }
	}
}
