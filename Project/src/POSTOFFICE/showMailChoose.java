package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import POSTOFFICE.MailCheck.mailCheckPanel;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.sql.*;


public class showMailChoose extends JFrame {
	BufferedImage img = null;
	LoginGUI log = new LoginGUI();
	Select sel = new Select();
	
	showMailChoose(){
		setTitle("MAIL RECEIPT");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(500, 510);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/mailChoose.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		// button
		JButton receiptBtn = new JButton("접수");
		receiptBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		receiptBtn.setBackground(new Color(255, 255, 255));
		receiptBtn.setForeground(new Color(247, 0, 0));
		receiptBtn.setBounds(305, 448, 80, 38);
		layeredPane.add(receiptBtn);
		
		receiptBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					new Receipt();
	    	}
	    });

		JButton cancelBtn = new JButton("취소");
		cancelBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		cancelBtn.setBackground(new Color(255, 255, 255));
		cancelBtn.setForeground(new Color(247, 0, 0));
		cancelBtn.setBounds(400, 448, 80, 38);
		layeredPane.add(cancelBtn);
		
		cancelBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
					hide();
					sel.setVisible(true);
	    	}
	    });
		
		
		// textfield
		JTextField countText = new JTextField();
		countText.setBounds(27, 84, 165, 31);
		countText.setColumns(5);
		layeredPane.add(countText);
						
		JTextField weightText = new JTextField();
		weightText.setBounds(27, 178, 165, 31);
		weightText.setColumns(5);
		layeredPane.add(weightText);
		
		JTextField addresseeText = new JTextField();
		addresseeText.setBounds(27, 272, 165, 31);
		addresseeText.setColumns(10);
		layeredPane.add(addresseeText);
		
		JTextField senderText = new JTextField();
		senderText.setBounds(287, 272, 166, 31);
		senderText.setColumns(10);
		layeredPane.add(senderText);
		
		JTextField addressText = new JTextField();
		addressText.setBounds(27, 368, 425, 32);
		addressText.setColumns(50);
		layeredPane.add(addressText);
		
		
		// panel
		mailChoosePanel panel = new mailChoosePanel();
		panel.setSize(500, 510);
		layeredPane.add(panel);		
						
		getContentPane().setLayout(null);
		getContentPane().add(layeredPane);
		
		
		// base settings
		setBounds(0, 0, 515, 540);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
	}

	class mailChoosePanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
}	