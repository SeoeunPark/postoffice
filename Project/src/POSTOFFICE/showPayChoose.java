package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.sql.*;


public class showPayChoose extends JFrame {
	BufferedImage img = null;
	
	showPayChoose(){
		setTitle("PAY CHOOSE");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(300, 250);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/payChoose.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		// button
		JButton moneyBtn = new JButton("현금");
		moneyBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		moneyBtn.setBackground(new Color(255, 255, 255));
		moneyBtn.setForeground(new Color(27, 146, 0));
		moneyBtn.setBounds(55, 89, 192, 44);
		layeredPane.add(moneyBtn);
	    
	    moneyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new pay();
					//new PrintJFrame();
	    	}
	    });
	    
	    
	    JButton cardBtn = new JButton("카드");
	    cardBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
	    cardBtn.setBackground(new Color(255, 255, 255));
	    cardBtn.setForeground(new Color(0, 16, 156));
		cardBtn.setBounds(55, 155, 190, 44);
		layeredPane.add(cardBtn);
	    
	    cardBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new pay();
					//new PrintJFrame();   	
			}
	    });

	    
		// panel
		payChoosePanel panel = new payChoosePanel();
		panel.setSize(300, 250);
		layeredPane.add(panel);		
						
		getContentPane().setLayout(null);
		getContentPane().add(layeredPane);
		
		
		// base settings
		setBounds(0, 0, 315, 285);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
	}

	class payChoosePanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}	
}