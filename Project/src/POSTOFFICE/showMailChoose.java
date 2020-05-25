package POSTOFFICE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*; 

public class showMailChoose extends JFrame {
	//PrintJFrame pj = new PrintJFrame();
	JPanel p1;
	JTextField w1, c1, ad1, ad2, ad3;
	JButton button, button_1;
	JLabel la1, la2, la3, la4, la5, la6;
	Login log = new Login();
	Select sel = new Select();
	
	public showMailChoose() {
		//showMailChoose smc = new showMailChoose();
		setTitle("우편접수");
        setSize(500, 510);
		setResizable(false);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // visible
        setVisible(true);
        
        // Layout  
        p1 = new JPanel();
        p1.setLayout(null); 
        getContentPane().add(p1);
        
        w1 = new JTextField(10);
        c1 = new JTextField(10);
        ad1 = new JTextField(30);
        ad2 = new JTextField(30);
        ad3 = new JTextField(100);
        
        la1 = new JLabel("MailChoose");
        
        button = new JButton("접수");
        button_1 = new JButton("취소");
      
        p1.add(la1);

        la2 = new JLabel("우편 수량(개)");
        la2.setSize(168, 26);
        la2.setLocation(12, 67);
        p1.add(la2);
        p1.add(w1);
        
        la3 = new JLabel("우편 중량(단위 : 0.0kg)");
        la3.setSize(168, 26);
        la3.setLocation(12, 144);
        p1.add(la3);
        p1.add(c1);
        
        la4 = new JLabel("수신인");
        la4.setSize(168, 26);
        la4.setLocation(12, 213);
        p1.add(la4);
        p1.add(ad1);
        
        la5 = new JLabel("발신인");
        la5.setSize(168, 26);
        la5.setLocation(12, 296);
        p1.add(la5);
        p1.add(ad2);
        
        la6 = new JLabel("주소");
        la6.setSize(168, 26);
        la6.setLocation(12, 372);
        p1.add(la6);
        p1.add(ad3);

        p1.add(button);
        p1.add(button_1);
       
       
        // add  
        la1.setFont(new Font("Felix Titling", Font.BOLD, 26));
        la1.setBounds(12, 10, 184, 57);
        
        w1.setBounds(12, 98, 155, 26);
        c1.setBounds(12, 175, 155, 26);
        ad1.setBounds(12, 249, 155, 26);
        ad2.setBounds(12, 332, 155, 26);
        ad3.setBounds(12, 408, 307, 26);
        
        button.setForeground(new Color(245, 245, 245));
        button.setBounds(396, 387, 69, 21);
        button.setBackground(new Color(47, 79, 79));
        button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new Receipt();
	    	}
	    	});
        
        button_1.setForeground(new Color(245, 245, 245));
        button_1.setBounds(396, 413, 69, 21);
        button_1.setBackground(new Color(47, 79, 79));
        button_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					sel.setVisible(true);
	    	}
	    	});
   	}
	

	
}	