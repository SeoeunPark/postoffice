package POSTOFFICE;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*;


public class MainJFrame extends JFrame {
	JPanel p;
	JLabel la,la1,la2,la3;
	JButton bt1, bt2;
	Font f1;
	
	public MainJFrame() {
		setTitle("POST OFFICE");
	    setSize(690, 500);
	    setResizable(false);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    JPanel p = new JPanel();
	    p.setBackground(Color.WHITE);
	    p.setLayout(null);
	    
	    setVisible(true);
	    getContentPane().add(p);
	    
	    f1 = new Font("돋움", Font.PLAIN, 25);
	    
	    
	    bt1 = new JButton("LOGIN");
	    bt1.setFont(new Font("Britannic Bold", Font.PLAIN, 21));
	    bt1.setBackground(new Color(250, 250, 210));
	    bt1.setForeground(new Color(204, 0, 0));
	    p.add(bt1);
	    bt1.setBounds(157,220,158,51);
	    
	    bt1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    			hide();
	    			new Login();
	    	}
	    });
	    
	    bt2 = new JButton("JOIN");
	    bt2.setFont(new Font("Britannic Bold", Font.PLAIN, 21));
	    bt2.setForeground(new Color(204, 0, 0));
	    bt2.setBackground(new Color(250, 250, 210));
	    p.add(bt2);
	    bt2.setBounds(377,220,158,51);
	    
	     bt2.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
					hide();
					new UserJDailogGUI(null, "가입");
	     	}
	     });
	     
	    la = new JLabel();
	    la.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/logo.PNG")));
	    la.setBounds(0, 0, 684, 471);
	    p.add(la);
	    
	    la1 = new JLabel("*POSTOFFICE에 오신 걸 환영합니다*");
	    la1.setFont(f1);
	    la1.setBounds(215, 290, 265, 33);
	    //la1.setHorizontalAlignment(JLabel.CENTER);
	    p.add(la1);
	    
	    la2 = new JLabel("처음 이용하시는 분은 회원가입을");
	    la2.setFont(f1);
	    la2.setBounds(238, 315, 229, 27);
	    //la2.setHorizontalAlignment(JLabel.CENTER);
	    p.add(la2);
	    
	    la3 = new JLabel("기존 사용자분은 로그인을 눌러주세요.");
	    la3.setFont(f1);
	    la3.setBounds(225, 337, 255, 27);
	    //la3.setHorizontalAlignment(JLabel.CENTER);
	    p.add(la3);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
