package POSTOFFICE;
 
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.IOException;
import javax.imageio.ImageIO;


public class Select extends JFrame{
	BufferedImage img = null;
	
    Select() {
    	setTitle("SELECT");

    	JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(800, 510);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/select.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		// button
		JButton mailBtn = new JButton();				// 우편 접수 버튼
		mailBtn.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/mailChooseIcon.png")));
		mailBtn.setBorderPainted(false); 				// 외곽선 x
		mailBtn.setContentAreaFilled(false); 			// 영역 채우기 x
		mailBtn.setFocusPainted(false); 				// 테두리 x
		mailBtn.setBounds(18, 140, 179, 210);
		layeredPane.add(mailBtn);
	    
		mailBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new showMailChoose();
	    	}
	    });
		
		
		JButton postBtn = new JButton();				// 택배 접수 버튼
		postBtn.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/parcelChooseIcon.png")));
		postBtn.setBorderPainted(false); 				// 외곽선 x
		postBtn.setContentAreaFilled(false); 			// 영역 채우기 x
		postBtn.setFocusPainted(false); 				// 테두리 x
		postBtn.setBounds(215, 140, 179, 210);
		layeredPane.add(postBtn);
	    
		postBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new showParcelChoose();
	    	}
	    });
		
		
		JButton searchBtn = new JButton();				// 요금 조회 버튼
		searchBtn.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/searchMoney.png")));
		searchBtn.setBorderPainted(false); 				// 외곽선 x
		searchBtn.setContentAreaFilled(false); 			// 영역 채우기 x
		searchBtn.setFocusPainted(false); 				// 테두리 x
		searchBtn.setBounds(410, 140, 179, 210);
		layeredPane.add(searchBtn);
	    
		searchBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new showChoose();
	    	}
	    });
		
		
		JButton cancelBtn = new JButton();				// 접수 취소 버튼
		cancelBtn.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/cancel.png")));
		cancelBtn.setBorderPainted(false); 				// 외곽선 x
		cancelBtn.setContentAreaFilled(false); 			// 영역 채우기 x
		cancelBtn.setFocusPainted(false); 				// 테두리 x
		cancelBtn.setBounds(600, 140, 179, 210);
		layeredPane.add(cancelBtn);
	    
		cancelBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new UserJDailogGUI(null, "삭제");
	    	}
	    });
    	
		
		// panel
		selectPanel panel = new selectPanel();
		panel.setSize(800, 510);
		layeredPane.add(panel);		
						
		getContentPane().setLayout(null);
		getContentPane().add(layeredPane);
    	
    	
		// base settings
		setBounds(0, 0, 815, 535);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
    }
		
		
    	//-------------------------------------------
//			Ifq = new JButton(); //정보조회
//			Ifq.setBounds(67, 298, 163, 69);
//			Ifq.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/Searchnumber.png")));
//			Ifq.setBorderPainted(false); //외곽선 x
//		    Ifq.setContentAreaFilled(false); //영역 채우기 x
//		    Ifq.setFocusPainted(false); //테두리 x
//		    Ifq.setSize(175,165);
//			p.add(Ifq);
//			
//			la3 = new JLabel("정보조회");
//			la3.setFont(new Font("굴림", Font.PLAIN, 14));
//			la3.setBounds(139, 412, 57, 15);
//			p.add(la3);
//			
//			Ifq.addActionListener(new ActionListener() {
//		    	public void actionPerformed(ActionEvent e) {
//						hide();
//						//new MenuJTabaleExam();
////						new Check();
//		    	}
//		    });
			

//			ChangeIf = new JButton(); //정보수정
//			ChangeIf.setBounds(531, 298, 163, 69);
//			ChangeIf.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/Modify.png")));
//			ChangeIf.setBorderPainted(false); //외곽선 x
//		    ChangeIf.setContentAreaFilled(false); //영역 채우기 x
//		    ChangeIf.setFocusPainted(false); //테두리 x
//		    ChangeIf.setSize(175,165);
//			p.add(ChangeIf);
//			
//			la5 = new JLabel("정보수정");
//			la5.setFont(new Font("굴림", Font.PLAIN, 14));
//			la5.setBounds(608, 413, 57, 15);
//			p.add(la5);
//			
//			ChangeIf.addActionListener(new ActionListener() {
//		    	public void actionPerformed(ActionEvent e) {
//						hide();
//						new MenuJTabaleExam(); //수정 부분이 회원관리 창에서 선택된 행을 수정하는거라 따로 새 창이 안 열림.
//						//new UserJDailogGUI(null, "수정");
//		    	}
//		    });
//			
//			
//			Management = new JButton(); //회원관리
//			Management.setBounds(677, 346, 107, 125);
//			Management.setIcon(new ImageIcon(MainJFrame.class.getResource("/IMG/Gearwhell.png"))); //사이즈조정하기
//			Management.setBorderPainted(false); //외곽선 x
//		    Management.setContentAreaFilled(false); //영역 채우기 x
//		    Management.setFocusPainted(false); //테두리 x
//		    Management.setSize(105,125);
//			p.add(Management);
//			
//			Management.addActionListener(new ActionListener() {
//		    	public void actionPerformed(ActionEvent e) {
//						hide();
//						new MenuJTabaleExam();
//		    	}
//		    	});
	//-------------------------------------------

	class selectPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}	
}