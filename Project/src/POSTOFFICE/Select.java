//테스트프레임
package POSTOFFICE;
 
import java.awt.*;

import java.awt.event.*; 
import javax.swing.*;

public class Select extends JFrame{
		JPanel p;
		JLabel la, la1, la2, la3, la4, la5;
		JButton Mail, Post, Iq1, Ifq, Cancel, ChangeIf, Management;
    	public Select() {
    	setTitle("receipt");
			// setting
	        setSize(800, 510);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(false);
	        
	        p = new JPanel();
		    p.setLayout(null);
	        p.setBackground(new Color(230, 230, 250));
	        getContentPane().add(p);
	        
	        Mail = new JButton(); //우편접수
	        Mail.setBounds(84,71,102,37);
	        Mail.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Mailchoose1.PNG")));
	        Mail.setBorderPainted(false); //외곽선 x
	        Mail.setContentAreaFilled(false); //영역 채우기 x
	        Mail.setFocusPainted(false); //테두리 x
	        Mail.setSize(140,180);
	        p.add(Mail);
	        
	        la = new JLabel("우편접수");
	        la.setFont(new Font("굴림", Font.PLAIN, 14));
	        la.setBounds(129, 181, 57, 23);
	        p.add(la);
	        
	        Mail.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		hide();
						new showMailChoose();
		    	}
		    });
			
	        Post = new JButton(); //택배접수
	        Post.setBounds(312,53,140,219);
	        Post.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Parcelchoose1.PNG")));
	        Post.setBorderPainted(false); //외곽선 x
	        Post.setContentAreaFilled(false); //영역 채우기 x
	        Post.setFocusPainted(false); //테두리 x
	        Post.setSize(175,190);
	        p.add(Post);
	        
	        
	       	la1 = new JLabel("택배접수");
			la1.setFont(new Font("굴림", Font.PLAIN, 14));
			la1.setBounds(368, 189, 57, 15);
			p.add(la1);
	        
	        Post.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
						hide();
						new showParcelChoose();
		    	}
		    });
	        
	        Iq1 = new JButton(); //요금조회
			Iq1.setBounds(509,53,230,180);
			Iq1.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Searchmail1.PNG")));
			Iq1.setBorderPainted(false); //외곽선 x
		    Iq1.setContentAreaFilled(false); //영역 채우기 x
		    Iq1.setFocusPainted(false); //테두리 x
		    Iq1.setSize(205,170);
			p.add(Iq1);
			
			la2 = new JLabel("요금조회");
			la2.setFont(new Font("굴림", Font.PLAIN, 14));
			la2.setBounds(608, 189, 57, 15);
			p.add(la2);
			
			Iq1.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
						hide();
						new showChoose();
		    	}
		    });
			 
			Ifq = new JButton(); //정보조회
			Ifq.setBounds(67, 298, 163, 69);
			Ifq.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Searchnumber1.PNG")));
			Ifq.setBorderPainted(false); //외곽선 x
		    Ifq.setContentAreaFilled(false); //영역 채우기 x
		    Ifq.setFocusPainted(false); //테두리 x
		    Ifq.setSize(175,165);
			p.add(Ifq);
			
			la3 = new JLabel("정보조회");
			la3.setFont(new Font("굴림", Font.PLAIN, 14));
			la3.setBounds(139, 412, 57, 15);
			p.add(la3);
			
			Ifq.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
						hide();
						//new MenuJTabaleExam();
						new Check();
		    	}
		    });
			/*
			Cancel = new JButton(); //취소
			Cancel.setBounds(299, 286, 163, 69);
			Cancel.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Cancel1.PNG")));
			Cancel.setBorderPainted(false); //외곽선 x
		    Cancel.setContentAreaFilled(false); //영역 채우기 x
		    Cancel.setFocusPainted(false); //테두리 x
		    Cancel.setSize(175,165);
			p.add(Cancel);
			
			la4 = new JLabel("접수취소");
			la4.setFont(new Font("굴림", Font.PLAIN, 14));
			la4.setBounds(368, 413, 57, 15);
			p.add(la4);
			
			Cancel.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
						hide();
						//new UserJDailogGUI(null, "삭제");
		    	}
		    });

			ChangeIf = new JButton(); //정보수정
			ChangeIf.setBounds(531, 298, 163, 69);
			ChangeIf.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Modify1.PNG")));
			ChangeIf.setBorderPainted(false); //외곽선 x
		    ChangeIf.setContentAreaFilled(false); //영역 채우기 x
		    ChangeIf.setFocusPainted(false); //테두리 x
		    ChangeIf.setSize(175,165);
			p.add(ChangeIf);
			
			la5 = new JLabel("정보수정");
			la5.setFont(new Font("굴림", Font.PLAIN, 14));
			la5.setBounds(608, 413, 57, 15);
			p.add(la5);
			
			ChangeIf.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
						hide();
						new MenuJTabaleExam(); //수정 부분이 회원관리 창에서 선택된 행을 수정하는거라 따로 새 창이 안 열림.
						//new UserJDailogGUI(null, "수정");
		    	}
		    });
			
			
			Management = new JButton(); //회원관리
			Management.setBounds(677, 346, 107, 125);
			Management.setIcon(new ImageIcon(MainJFrame.class.getResource("/TEST/IMG/Gearwhell1.PNG"))); //사이즈조정하기
			Management.setBorderPainted(false); //외곽선 x
		    Management.setContentAreaFilled(false); //영역 채우기 x
		    Management.setFocusPainted(false); //테두리 x
		    Management.setSize(105,125);
			p.add(Management);
			
			Management.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
						hide();
						new MenuJTabaleExam();
		    	}
		    	});
		    	*/
    }
}
