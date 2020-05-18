package POSTOFFICE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*; 


public class ParcelCheck extends JFrame {
	//PrintJFrame pj = new PrintJFrame();
	JPanel p;
	JLabel la, la1, la2;
	JButton bt1, bt2;
	JTextField tf1, tf2;
    public ParcelCheck() {
    	//ParcelCheck pc = new ParcelCheck();
    	// setting
        setTitle("택배요금조회");
        setSize(400, 300);
		setResizable(false);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // panel
        p = new JPanel();
	    p.setLayout(null);
        p.setBackground(new Color(245, 245, 220));
        getContentPane().add(p);

        // visible
        setVisible(true);
        
        // add
        la = new JLabel("Parcel Check");
        la.setForeground(new Color(178, 34, 34));
        la.setFont(new Font("Felix Titling", Font.BOLD, 26));
        la.setBounds(12, 10, 235, 57);
        p.add(la);
        
        la1 = new JLabel("택배 수량을 입력하세요(단위 : 개)");
        la1.setBounds(12, 87, 202, 21);
        p.add(la1);
        tf1 = new JTextField();
        tf1.setBounds(12, 118, 155, 26);
        p.add(tf1);
        tf1.setColumns(10);
        
        la2 = new JLabel("택배 중량을 입력하세요(단위 : 0.0kg)");
        la2.setBounds(12, 168, 260, 26);
        p.add(la2);
        tf2 = new JTextField();
        tf2.setBounds(12, 204, 155, 26);
        p.add(tf2);
        tf2.setColumns(10);
       
        
        bt1 = new JButton("확인");
        bt1.setForeground(new Color(255, 250, 250));
        bt1.setBounds(314, 209, 68, 21);
        bt1.setBackground(new Color(205, 133, 63));
        p.add(bt1);
        
        bt1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new PrintJFrame();
	    	}
	    	});
        
        bt2 = new JButton("취소");
        bt2.setForeground(new Color(255, 250, 250));
        bt2.setBounds(314, 240, 68, 21);
        bt2.setBackground(new Color(205, 133, 63));
        p.add(bt2);
        
        bt2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new Select();
	    	}
	    	});	
	}
}
