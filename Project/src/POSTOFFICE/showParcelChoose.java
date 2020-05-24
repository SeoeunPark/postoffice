package POSTOFFICE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*; 

public class showParcelChoose extends JFrame {
	//PrintJFrame pj = new PrintJFrame();
	showMailChoose smc = new showMailChoose();
	
	JPanel p1; 
	JTextField /*w2, c2,*/ ad1, ad2, ad3;
	JButton button, button_1;
	JLabel la, la1, la2, la3, la4, la5;
	
	public showParcelChoose() {
		//showParcelChoose spc = new showParcelChoose();
		// setting
	    setTitle("택배접수");
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
        
        smc.w1 = new JTextField(10);
        smc.c1 = new JTextField(10);
        ad1 = new JTextField(30);
        ad2 = new JTextField(30);
        ad3 = new JTextField(100);
        
        la = new JLabel("ParcelChoose");
        
        button = new JButton("접수");
        button_1 = new JButton("취소");
        
        p1.add(la);

        la1 = new JLabel("택배 수량(개)");
        la1.setSize(168, 26);
        la1.setLocation(12, 67);
        p1.add(la1);
        p1.add(smc.w1);
        
        la2 = new JLabel("택배 무게(단위 : 0.0kg)");
        la2.setSize(168, 26);
        la2.setLocation(12, 144);
        p1.add(la2);
        p1.add(smc.c1);
        
        la3 = new JLabel("수신인");
        la3.setSize(168, 26);
        la3.setLocation(12, 213);
        p1.add(la3);
        p1.add(ad1);
        
        la4 = new JLabel("발신인");
        la4.setSize(168, 26);
        la4.setLocation(12, 296);
        p1.add(la4);
        p1.add(ad2);
        
        la5 = new JLabel("주소");
        la5.setSize(168, 26);
        la5.setLocation(12, 372);
        p1.add(la5);
        p1.add(ad3);

        p1.add(button);
        p1.add(button_1);
       
       
        // add  
        la.setFont(new Font("Felix Titling", Font.BOLD, 26));
        la.setBounds(12, 10, 235, 57);
        
        smc.w1.setBounds(12, 98, 155, 26);
        smc.c1.setBounds(12, 175, 155, 26);
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
					new Select();
	    	}
	    	});
	}
}