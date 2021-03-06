package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class MainJFrame extends JFrame {
	BufferedImage img = null;
	
	public MainJFrame() {
		setTitle("POST OFFICE");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(690, 500);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/logo.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		// button
		JButton loginBtn = new JButton("LOGIN");
		loginBtn.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		loginBtn.setBackground(new Color(255, 255, 255));
		loginBtn.setForeground(new Color(249, 163, 61));
		loginBtn.setBounds(87,60,205,60);
		layeredPane.add(loginBtn);
		
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hide();
				new LoginGUI();
			}
		});
		
		
		JButton joinBtn = new JButton("JOIN");
		joinBtn.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		joinBtn.setBackground(new Color(255, 255, 255));
		joinBtn.setForeground(new Color(249, 163, 61));
		joinBtn.setBounds(400,60,205,60);
		layeredPane.add(joinBtn);
		
		joinBtn.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
				hide();
				new UserJDailogGUI(null, "가입");
	     	}
	     });
		
		
		// panel
		backgroundPanel panel = new backgroundPanel();
		panel.setSize(690, 500);
		layeredPane.add(panel);		
		
		setLayout(null);
		add(layeredPane);
		
		
		// base settings
		setBounds(0, 0, 690, 500);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
	}
	
	class backgroundPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
	
	public static void main(String[] args) {
		new MainJFrame();
	}
}