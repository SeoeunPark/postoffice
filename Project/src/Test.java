
/*
public class Join extends JPanel{
	private static final JPanel panel = new JPanel();
		JButton login, join;
		public Join(){
		//join.addActionListener(new ActionListener(e));
		JFrame frm = new JFrame("회원가입");
        //프레임 크기
        frm.setSize(700, 500);
 
        //프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);
        FlowLayout fLay = new FlowLayout();
        frm.getContentPane().setLayout(null);
		
		//회원가입
		Label join = new Label("JOIN");
		frm.getContentPane().add(join);
		
		//--------------------------------
		Label name_label = new Label("이름  ");
		name_label.setBackground(new Color(255, 255, 255));
		name_label.setBounds(50, 80, 80, 50);
		frm.getContentPane().add(name_label);
		
		TextField name_user = new TextField("");
		name_user.setBounds(140, 95, 80, 20);
		frm.getContentPane().add(name_user);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox guest = new Checkbox("손님", group, true);
		guest.setBackground(new Color(255, 255, 255));
		Checkbox courier = new Checkbox("기사", group, false);
		courier.setBackground(new Color(255, 255, 255));
		frm.getContentPane().add(guest);
		frm.getContentPane().add(courier);
		guest.setBounds(240, 80, 50, 50);
		courier.setBounds(300, 80, 50, 50);
		
		//--------------------------------
		Label birth_label = new Label("생년월일  ");
		birth_label.setBackground(new Color(255, 255, 255));
		birth_label.setBounds(50, 120, 80, 50);
		frm.getContentPane().add(birth_label);
		
		TextField birth_text1 = new TextField("");
		birth_text1.setBounds(140, 135, 50, 20);
		frm.getContentPane().add(birth_text1);
		TextField birth_text2 = new TextField("");
		birth_text2.setBounds(200, 135, 30, 20);
		frm.getContentPane().add(birth_text2);
		TextField birth_text3 = new TextField("");
		birth_text3.setBounds(240, 135, 30, 20);
		frm.getContentPane().add(birth_text3);
		
		Label birth_label1 = new Label("ex) 1997.04.04");
		birth_label1.setBackground(new Color(255, 255, 255));
		birth_label1.setBounds(275, 120, 100, 50);
		frm.getContentPane().add(birth_label1);
		
		//--------------------------------
		Label id_label = new Label("아이디  ");
		id_label.setBackground(new Color(255, 255, 255));
		id_label.setBounds(50, 160, 80, 50);
		frm.getContentPane().add(id_label);
		
		TextField id_text = new TextField("");
		id_text.setBounds(140, 173, 80, 20);
		frm.getContentPane().add(id_text);
		
		Button b = new Button("아이디 중복 확인");
		b.setBackground(new Color(255, 204, 153));
		b.setBounds(250, 173, 110, 25);
		frm.getContentPane().add(b);
		
		//--------------------------------
		Label pw_label = new Label("비밀번호  ");
		pw_label.setBackground(new Color(255, 255, 255));
		pw_label.setBounds(50, 195, 80, 50);
		frm.getContentPane().add(pw_label);
		
		TextField pw_text = new TextField("");
		pw_text.setBounds(140, 210, 130, 20);
		frm.getContentPane().add(pw_text);
		
		//--------------------------------
		Label email_label = new Label("email 입력  ");
		email_label.setBackground(new Color(255, 255, 255));
		email_label.setBounds(50, 235, 80, 50);
		frm.getContentPane().add(email_label);
		
		TextField email_text = new TextField("");
		email_text.setBounds(140, 250, 100, 20);
		frm.getContentPane().add(email_text);
		
		Label email_label1 = new Label("@");
		email_label1.setBackground(new Color(255, 255, 255));
		email_label1.setBounds(240, 250, 20, 20);
		frm.getContentPane().add(email_label1);
		
		TextField email_text1 = new TextField("");
		email_text1.setBounds(260, 250, 100, 20);
		frm.getContentPane().add(email_text1);
		
		Label email_label2 = new Label("ex) 1234@naver.com");
		email_label2.setBounds(150, 250, 120, 20);
		frm.getContentPane().add(email_label2);
		
		//--------------------------------
		Label phone_label = new Label("핸드폰번호  ");
		phone_label.setBackground(new Color(255, 255, 255));
		phone_label.setBounds(50, 280, 80, 50);
		frm.getContentPane().add(phone_label);
		Choice phone_text1 = new Choice();
		
		phone_text1.setBounds(140, 295, 50, 20);
		phone_text1.add("02");
		phone_text1.add("070");
		phone_text1.add("010");
		phone_text1.add("011");
		phone_text1.add("016");
		phone_text1.add("017");
		frm.getContentPane().add(phone_text1);
		TextField phone_text2 = new TextField("");
		phone_text2.setBounds(200, 295, 70, 20);
		frm.getContentPane().add(phone_text2);
		TextField phone_text3 = new TextField("");
		phone_text3.setBounds(280, 295, 70, 20);
		frm.getContentPane().add(phone_text3);
		
		/*Label phone_label1 = new Label("ex) 1997.04.04");
		phone_label1.setBounds(275, 140, 100, 50);
		frm.add(phone_label1);
		*/
		/*
		//--------------------------------
		Choice email = new Choice();
		email.setBounds(360, 250, 100, 50);
		
		email.add("직접 입력");
		email.add("naver.com");
		email.add("gmail.com");
		email.add("daum.net");
		email.add("e-mirim.hs.kr");
		frm.getContentPane().add(email);
		
		//--------------------------------
		Label user_label = new Label("우편번호  ");
		user_label.setBackground(new Color(255, 255, 255));
		user_label.setBounds(50, 320, 80, 50);
		frm.getContentPane().add(user_label);
		
		TextField user_text = new TextField("");
		user_text.setBounds(140, 335, 50, 20);
		frm.getContentPane().add(user_text);
        
		Label user_label3 = new Label("-");
		user_label3.setBackground(new Color(255, 255, 255));
		user_label3.setBounds(200, 335, 10, 10);
		frm.getContentPane().add(user_label3);
		
		TextField user_text1 = new TextField("");
		user_text1.setBounds(220, 335, 50, 20);
		frm.getContentPane().add(user_text1);
		
		Button user_button = new Button("우편번호 검색");
		user_button.setBackground(new Color(255, 204, 153));
		user_button.setBounds(280, 335, 100, 25);
		frm.getContentPane().add(user_button);
		
		//--------------------------------
		Label address_label1 = new Label("주소  ");
		address_label1.setBackground(new Color(255, 255, 255));
		address_label1.setBounds(50, 360, 80, 50);
		frm.getContentPane().add(address_label1);
		
		TextField address_text = new TextField("");
		address_text.setBounds(140, 375, 350, 20);
		frm.getContentPane().add(address_text);
		
		TextField address_text1 = new TextField("");
		address_text1.setBounds(140, 405, 350, 20);
		frm.getContentPane().add(address_text1);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 684, 461);
		frm.getContentPane().add(panel);
		
		//--------------------------------
	}
}





/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
 
 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
 
public class LOGIN extends JFrame {
 
    private JPanel contentPane;
    private JTextField idField;
    private JPasswordField pw;
    private JLabel IblResult;
    private Map<String, String> map;
    private JButton joinBtn;
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LOGIN frame = new LOGIN();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    
     * Create the frame.
     
    public LOGIN() {
        map= new HashMap<String,String>();
        map.put("kim", "1234");
        map.put("park", "1111");
        map.put("hong", "2222");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 452, 439);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("아이디");
        lblNewLabel.setBounds(12, 34, 57, 15);
        contentPane.add(lblNewLabel);
        
        idField = new JTextField();
        idField.setBounds(95, 31, 116, 21);
        contentPane.add(idField);
        idField.setColumns(10);
        
        JLabel label = new JLabel("비밀번호");
        label.setBounds(12, 80, 57, 15);
        contentPane.add(label);
        
        JButton btnNewButton = new JButton("로그인");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result;
                String id = idField.getText();
                String pass = String.valueOf(pw.getPassword());
                if(map.containsKey(id)&&pass.equals(map.get(id))){
                    result=" 환영합니다.";
                    IblResult.setForeground(Color.green);
                }else{
                    result="아이디 또는 비번이 잘못됨";
                    IblResult.setForeground(Color.blue);
                }
                System.out.println(map.containsKey(id));
                System.out.println(map.get(id));
                System.out.println(pass);
                
                IblResult.setText(result);
            }
        });
        btnNewButton.setBounds(95, 120, 97, 23);
        contentPane.add(btnNewButton);
        
        IblResult = new JLabel("New label");
        IblResult.setBounds(12, 176, 199, 92);
        contentPane.add(IblResult);
        
        pw = new JPasswordField();
        pw.setBounds(95, 77, 116, 21);
        contentPane.add(pw);
        
        joinBtn = new JButton("회원가입");
        joinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JoinForm newOne=new JoinForm();
                newOne.setVisible(true);
            }
        });
        joinBtn.setBounds(237, 120, 97, 23);
        contentPane.add(joinBtn);
    }
}*/

/*

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextField;

public class LOGIN{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(200, 200, 800, 700);
		f.setLayout(null);
		
		//회원가입
		Label join = new Label("JOIN");
		f.add(join);
		
		//--------------------------------
		Label name_label = new Label("이름 | ");
		name_label.setBounds(50, 100, 80, 50);
		f.add(name_label);
		
		TextField name_user = new TextField("");
		name_user.setBounds(140, 115, 80, 20);
		f.add(name_user);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox guest = new Checkbox("손님", group, true);
		Checkbox courier = new Checkbox("기사", group, false);
		f.add(guest);
		f.add(courier);
		guest.setBounds(240, 100, 50, 50);
		courier.setBounds(300, 100, 50, 50);
		
		//--------------------------------
		Label birth_label = new Label("생년월일 | ");
		birth_label.setBounds(50, 140, 80, 50);
		f.add(birth_label);
		
		TextField birth_text1 = new TextField("");
		birth_text1.setBounds(140, 155, 50, 20);
		f.add(birth_text1);
		TextField birth_text2 = new TextField("");
		birth_text2.setBounds(200, 155, 50, 20);
		f.add(birth_text2);
		TextField birth_text3 = new TextField("");
		birth_text3.setBounds(240, 155, 50, 20);
		f.add(birth_text3);
		
		//--------------------------------
		Label id_label = new Label("아이디 | ");
		id_label.setBounds(50, 180, 80, 50);
		f.add(id_label);
		
		TextField id_text = new TextField("");
		id_text.setBounds(140, 193, 80, 20);
		f.add(id_text);
		
		Button b = new Button("아이디 중복 확인");
		b.setBounds(250, 193, 110, 20);
		f.add(b);
		
		//--------------------------------
		Label pw_label = new Label("비밀번호 | ");
		pw_label.setBounds(50, 220, 80, 50);
		f.add(pw_label);
		
		TextField pw_text = new TextField("");
		pw_text.setBounds(140, 235, 130, 20);
		f.add(pw_text);
		
		Label pw_label1= new Label("비밀번호 재입력 | ");
		pw_label1.setBounds(50, 260, 80, 50);
		f.add(pw_label1);
		
		TextField pw_text1 = new TextField("");
		pw_text1.setBounds(140, 275, 130, 20);
		f.add(pw_text1);
		
		//--------------------------------
		Label email_label = new Label("email 입력 | ");
		email_label.setBounds(50, 300, 80, 50);
		f.add(email_label);
		
		TextField email_text = new TextField("");
		email_text.setBounds(140, 315, 100, 20);
		f.add(email_text);
		
		Label email_label1 = new Label("@");
		email_label1.setBounds(240, 315, 20, 20);
		f.add(email_label1);
		
		TextField email_text1 = new TextField("");
		email_text1.setBounds(260, 315, 100, 20);
		f.add(email_text1);
		
		Label email_label2 = new Label("ex) 1234@naver.com");
		email_label2.setBounds(150, 335, 120, 20);
		f.add(email_label2);
		
		//--------------------------------
		Label phone_label = new Label("핸드폰번호 | ");
		phone_label.setBounds(50, 350, 80, 50);
		f.add(phone_label);
		Choice phone_text1 = new Choice();
		
		phone_text1.setBounds(140, 365, 50, 20);
		phone_text1.add("02");
		phone_text1.add("070");
		phone_text1.add("010");
		phone_text1.add("011");
		phone_text1.add("016");
		phone_text1.add("017");
		phone_text1.add("018");
		phone_text1.add("019");
		f.add(phone_text1);
		TextField phone_text2 = new TextField("");
		phone_text2.setBounds(200, 365, 70, 20);
		f.add(phone_text2);
		TextField phone_text3 = new TextField("");
		phone_text3.setBounds(280, 365, 70, 20);
		f.add(phone_text3);
		
		Label phone_label1 = new Label("ex) 1997.04.04");
		phone_label1.setBounds(275, 140, 100, 50);
		f.add(phone_label1);
		
		//--------------------------------
		Choice email = new Choice();
		email.setBounds(360, 314, 100, 50);
		
		email.add("직접 입력");
		email.add("naver.com");
		email.add("gmail.com");
		email.add("daum.net");
		email.add("e-mirim.hs.kr");
		f.add(email);
		
		//--------------------------------
		Label user_label = new Label("우편번호 | ");
		user_label.setBounds(50, 450, 80, 50);
		f.add(user_label);
		
		TextField user_text = new TextField("");
		user_text.setBounds(140, 465, 50, 20);
		f.add(user_text);
        
		Label user_label3 = new Label("-");
		user_label3.setBounds(200, 465, 10, 10);
		f.add(user_label3);
		
		TextField user_text1 = new TextField("");
		user_text1.setBounds(220, 465, 50, 20);
		f.add(user_text1);
		
		Button user_button = new Button("우편번호 검색");
		user_button.setBounds(280, 465, 100, 25);
		f.add(user_button);
		
		//--------------------------------
		Label address_label1 = new Label("주소 | ");
		address_label1.setBounds(50, 490, 80, 50);
		f.add(address_label1);
		
		TextField address_text = new TextField("");
		address_text.setBounds(140, 500, 350, 20);
		f.add(address_text);
		
		TextField address_text1 = new TextField("");
		address_text1.setBounds(140, 540, 350, 20);
		f.add(address_text1);
		
		//--------------------------------
		
	}
}




/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
 
 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
 
public class LOGIN extends JFrame {
 
    private JPanel contentPane;
    private JTextField idField;
    private JPasswordField pw;
    private JLabel IblResult;
    private Map<String, String> map;
    private JButton joinBtn;
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LOGIN frame = new LOGIN();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    
     * Create the frame.
     
    public LOGIN() {
        map= new HashMap<String,String>();
        map.put("kim", "1234");
        map.put("park", "1111");
        map.put("hong", "2222");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 452, 439);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("아이디");
        lblNewLabel.setBounds(12, 34, 57, 15);
        contentPane.add(lblNewLabel);
        
        idField = new JTextField();
        idField.setBounds(95, 31, 116, 21);
        contentPane.add(idField);
        idField.setColumns(10);
        
        JLabel label = new JLabel("비밀번호");
        label.setBounds(12, 80, 57, 15);
        contentPane.add(label);
        
        JButton btnNewButton = new JButton("로그인");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result;
                String id = idField.getText();
                String pass = String.valueOf(pw.getPassword());
                if(map.containsKey(id)&&pass.equals(map.get(id))){
                    result=" 환영합니다.";
                    IblResult.setForeground(Color.green);
                }else{
                    result="아이디 또는 비번이 잘못됨";
                    IblResult.setForeground(Color.blue);
                }
                System.out.println(map.containsKey(id));
                System.out.println(map.get(id));
                System.out.println(pass);
                
                IblResult.setText(result);
            }
        });
        btnNewButton.setBounds(95, 120, 97, 23);
        contentPane.add(btnNewButton);
        
        IblResult = new JLabel("New label");
        IblResult.setBounds(12, 176, 199, 92);
        contentPane.add(IblResult);
        
        pw = new JPasswordField();
        pw.setBounds(95, 77, 116, 21);
        contentPane.add(pw);
        
        joinBtn = new JButton("회원가입");
        joinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JoinForm newOne=new JoinForm();
                newOne.setVisible(true);
            }
        });
        joinBtn.setBounds(237, 120, 97, 23);
        contentPane.add(joinBtn);
    }
}*/