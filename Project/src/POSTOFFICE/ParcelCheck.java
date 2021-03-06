package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import POSTOFFICE.MailCheck.mailCheckPanel;

import java.io.IOException;
import javax.imageio.ImageIO;


public class ParcelCheck extends JFrame {
	BufferedImage img = null;
	
	ParcelCheck() {
		setTitle("택배 요금조회");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(400, 300);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/parcelCheck.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		
		// button
		JButton okBtn = new JButton("확인");
		okBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		okBtn.setBackground(new Color(255, 255, 255));
		okBtn.setForeground(new Color(247, 0, 0));
		okBtn.setBounds(217, 238, 80, 38);
		layeredPane.add(okBtn);
	      
		okBtn.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
				hide();
				new Receipt();
		    }
		});
	      
		JButton cancelBtn = new JButton("취소");
		cancelBtn.setFont(new Font("레시피코리아 Medium", Font.PLAIN, 13));
		cancelBtn.setBackground(new Color(255, 255, 255));
		cancelBtn.setForeground(new Color(247, 0, 0));
		cancelBtn.setBounds(307, 238, 80, 38);
		layeredPane.add(cancelBtn);
	      
		cancelBtn.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
				hide();
		    	new Select();
		   }
		});
		
		
		// panel
		parcelCheckPanel panel = new parcelCheckPanel();
		panel.setSize(400, 300);
		layeredPane.add(panel);		
				
		getContentPane().setLayout(null);
		getContentPane().add(layeredPane);
		
		
		// textfield
		JTextField idText = new JTextField();
		idText.setBounds(31, 79, 155, 30);
		idText.setColumns(5);
		layeredPane.add(idText);
				
		JTextField pwText = new JTextField();
		pwText.setBounds(31, 175, 155, 30);
		pwText.setColumns(5);
		layeredPane.add(pwText);
		
				
		// base settings
		setBounds(0, 0, 415, 330);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
	}

	class parcelCheckPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
}