package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.sql.*;


public class pay extends showPayChoose {
	BufferedImage img = null;
	
	pay(){
		setTitle("PAY");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(300, 250);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/pay.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}

		// textfield
		JTextField payText = new JTextField();
		payText.setBounds(20, 90, 190, 32);
		payText.setColumns(20);
		layeredPane.add(payText);
		
		
		// button
		JButton okBtn = new JButton("확인");
 		okBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
 		okBtn.setBackground(new Color(255, 255, 255));
 		okBtn.setForeground(new Color(247, 0, 0));
 		okBtn.setBounds(131, 198, 73, 38);
 		layeredPane.add(okBtn);
 	      
 		okBtn.addActionListener(new ActionListener() {
 		   public void actionPerformed(ActionEvent e) {
 				hide();
 				new PrintJFrame();
 		    }
 		});
 	      
 		JButton cancelBtn = new JButton("취소");
 		cancelBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
 		cancelBtn.setBackground(new Color(255, 255, 255));
 		cancelBtn.setForeground(new Color(247, 0, 0));
 		cancelBtn.setBounds(213, 198, 73, 38);
 		layeredPane.add(cancelBtn);
 	      
 		cancelBtn.addActionListener(new ActionListener() {
 		   public void actionPerformed(ActionEvent e) {
 				hide();
 				new showPayChoose();
 		   }
 		});
		
		
		// panel
		payPanel panel = new payPanel();
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

	class payPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}	
}