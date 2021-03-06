package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.IOException;
import javax.imageio.ImageIO;


public class showChoose extends JFrame {
	BufferedImage img = null;
	Select select = new Select();
	
	showChoose() {
		setTitle("선택 화면");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(500, 200);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/Choose.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		// button
		JButton mailCheckBtn = new JButton("우편요금조회");
		mailCheckBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		mailCheckBtn.setBackground(new Color(247, 0, 0));
		mailCheckBtn.setForeground(new Color(255, 255, 255));
		mailCheckBtn.setBounds(60, 103, 150, 44);
		layeredPane.add(mailCheckBtn);
			      
		mailCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				new MailCheck();
			}
		});
			      
		JButton parcelCheckBtn = new JButton("택배요금조회");
		parcelCheckBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		parcelCheckBtn.setBackground(new Color(247, 0, 0));
		parcelCheckBtn.setForeground(new Color(255, 255, 255));
		parcelCheckBtn.setBounds(282, 103, 150, 44);
		layeredPane.add(parcelCheckBtn);
			      
		parcelCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				new ParcelCheck();
			}
		});
		
		JButton backBtn = new JButton("뒤로가기");
		backBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		backBtn.setBackground(new Color(255, 255, 255));
		backBtn.setForeground(new Color(255, 139, 0));
		backBtn.setBounds(400, 5, 90, 23);
		layeredPane.add(backBtn);
	    
		backBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
				hide();
				select.setTitle("로그인 중 입니다.");
				select.setVisible(true);
	    	}
	    });
				
				
		// panel
		showChoosePanel panel = new showChoosePanel();
		panel.setSize(500, 200);
		layeredPane.add(panel);		
						
		getContentPane().setLayout(null);
		getContentPane().add(layeredPane);
				
						
		// base settings
		setBounds(0, 0, 515, 230);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
	}

	class showChoosePanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
}