package POSTOFFICE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*; 

public class showPayChoose extends JFrame {
	JPanel p; //p 배경
	JLabel la;
	JButton Money, Card, bt1, bt2;
	JTextField tf;
	public showPayChoose() {
		// setting
	    setTitle("PAY");
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
	    
	    Money = new JButton("현금");
	    Card = new JButton("카드");
	    
	    //결제수단 선택 후 -> 돈을 얼마 낼 것인지 입력을 받는 창이 밑에 추가로 뜨게 끔. 아니면 그 위에 새창으로뜨거나 기존 창이 바뀌게 하자.
	    //왜!!!!!!!!버튼 위치가 자유롭지 않은가!!!!!!!!!!
	    
	    // add
	    la = new JLabel("결제 수단을 선택해주세요");
	    la.setFont(new Font("돋움체", Font.PLAIN, 14));
	    la.setBounds(65, 20, 189, 38);
	    
	    p.add(la);
	    p.add(Money);
	    p.add(Card);
	    
	   
	    Money.setForeground(new Color(0, 128, 128));
	    Money.setBackground(Color.WHITE);
	    Money.setBounds(79, 75, 140, 41);
	    
	    Money.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new pay();
					//new PrintJFrame();
	    	}
	    	});
	    
	    Card.setForeground(new Color(0, 128, 128));
	    Card.setBackground(Color.WHITE);
	    Card.setBounds(79, 136, 140, 41);
	    
	    Card.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new pay();
					//new PrintJFrame();   	
			}
	    	});
	}
	
class pay extends showPayChoose{
	public pay() {
		// setting
	    setTitle("PAY");
	    setSize(300, 250);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // visible
	    setVisible(true);
	   
	    // Layout
	    p.setLayout(null);
	    
	    p = new JPanel();
	    p.setBackground(new Color(255, 255, 255));
	    getContentPane().add(p);
	    
	    bt1 = new JButton("확인");
        bt2 = new JButton("취소");
	    
	    // add
	    la = new JLabel("내실 금액 입력주세요");
	    la.setFont(new Font("돋움체", Font.PLAIN, 14));
	    la.setBounds(65, 20, 189, 38);
	    
	    p.add(la);
	    
	    tf = new JTextField(20);
	    tf.setBounds(65, 60, 189, 38);
	    
	    bt1.setForeground(new Color(245, 245, 245));
        bt1.setBounds(30, 110, 69, 21);
        bt1.setBackground(new Color(47, 79, 79));
        bt1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new PrintJFrame(); 
	    	}
	    	});
        
        bt2.setForeground(new Color(245, 245, 245));
        bt2.setBounds(80, 110, 69, 21);
        bt2.setBackground(new Color(47, 79, 79));
        bt2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new showPayChoose();
	    	}
	    	});
	}
}
}
