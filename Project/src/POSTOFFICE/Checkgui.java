package POSTOFFICE;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import java.awt.*;

public class Checkgui  extends JFrame {
	static JLabel label1, label2;
	JTextField tex1, tex2;
	JButton bt1, bt2;
	JPanel p1;
	Font f1,f2;
public String id1, paw1;

Checkgui(){
getContentPane().setBackground(new Color(245, 222, 179));
p1 = new JPanel();
p1.setBackground(new Color(245, 245, 220));
p1.setLayout(null);

f1 = new Font("Felix Titling", Font.BOLD, 13);
f2 = new Font("Felix Titling", Font.PLAIN, 14);

bt1 = new JButton("LOGIN");
bt1.setFont(f1);
bt1.setBackground(new Color(255, 255, 240));
bt1.setForeground(new Color(51, 0, 0));
bt1.setBounds(12, 108, 100, 23);
p1.add(bt1);

bt2 = new JButton("CANCEL");
bt2.setFont(f2);
bt2.setForeground(new Color(51, 0, 0));
bt2.setBackground(new Color(255, 255, 240));
bt2.setBounds(124, 108, 98, 23);
p1.add(bt2);

 bt2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    			//hide();
    			new MainJFrame();
    	}
    });
		
label1 = new JLabel("ID");
label1.setFont(f1);
label1.setBounds(27, 24, 80, 25);
p1.add(label1);

tex1 = new JTextField(); 
tex1.setColumns(10);
tex1.setBounds(102, 24, 120, 25);
p1.add(tex1);

label2 = new JLabel("PW");
label2.setFont(f2);
label2.setBounds(27, 65, 80, 25);
p1.add(label2);

tex2 = new JTextField(10);
tex2.setBounds(102, 65, 120, 25);
p1.add(tex2);

setTitle("회원정보확인");
setSize(300, 200);
setVisible(true);
setResizable(false);
setLocationRelativeTo(null);

getContentPane().add(p1);
}


}
