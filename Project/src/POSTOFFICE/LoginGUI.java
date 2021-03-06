package POSTOFFICE;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.IOException;
import javax.imageio.ImageIO;


public class LoginGUI extends JFrame {
	BufferedImage img = null;
	
	LoginGUI() {
		setTitle("LOGIN");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(300, 200);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(MainJFrame.class.getResource("/IMG/login.png"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		// font
		Font font = new Font("Britannic Bold", Font.BOLD, 13);
		
		
		// button
		JButton loginBtn = new JButton("LOGIN");
		loginBtn.setFont(font);
		loginBtn.setBackground(new Color(255, 255, 255));
		loginBtn.setForeground(new Color(247, 0, 0));
		loginBtn.setBounds(40, 145, 97, 32);
		layeredPane.add(loginBtn);
		
		JButton cancelBtn = new JButton("CANCEL");
		cancelBtn.setFont(font);
		cancelBtn.setBackground(new Color(255, 255, 255));
		cancelBtn.setForeground(new Color(247, 0, 0));
		cancelBtn.setBounds(165, 145, 97, 32);
		layeredPane.add(cancelBtn);
		
		cancelBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//hide();
	    		new MainJFrame();
	    	}
	    });

		
		// panel
		LoginPanel panel = new LoginPanel();
		panel.setSize(300, 200);
		layeredPane.add(panel);		
		
		getContentPane().setLayout(null);
		getContentPane().add(layeredPane);
		
		
		// textfield
		JTextField idText = new JTextField();
		idText.setBounds(115, 38, 125, 30);
		idText.setColumns(20);
		layeredPane.add(idText);
		
		JTextField pwText = new JTextField();
		pwText.setBounds(115, 92, 125, 30);
		pwText.setColumns(20);
		layeredPane.add(pwText);
		
		
		// base settings
		setBounds(0, 0, 315, 235);
		setVisible(true);									// 화면에 표시
		setResizable(false);								// 프레임 크기 고정
		setLocationRelativeTo(null);						// 창 가운데 정렬
		setDefaultCloseOperation(EXIT_ON_CLOSE);			// 종료 버튼 활성화
	}

	class LoginPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
}