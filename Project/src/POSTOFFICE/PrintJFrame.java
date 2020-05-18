package POSTOFFICE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*; 


public class PrintJFrame extends JFrame{
	showMailChoose smc = new showMailChoose();
	showParcelChoose spc = new showParcelChoose();
	showPayChoose spac = new showPayChoose();
	showPayChoose pay = new showPayChoose();
	MailCheck mc = new MailCheck();
	ParcelCheck pc = new ParcelCheck();
	
	JPanel p1; 
	JLabel la, la1, la2, la3, la4; //la 틀  / la1... 출력
	JButton print, main;
	
	public PrintJFrame() { //계산 출력창 (접수)
		//PrintJFrame pj = new PrintJFrame();
		// setting
		setTitle("PAY");
		setSize(700, 500);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
        // visible
        setVisible(true);
        
        // Layout
        p1 = new JPanel();
        p1.setLayout(null);
        getContentPane().add(p1);
        
	    la = new JLabel("Billing History");
	    la.setBounds(242, 10, 298, 48);
	    la.setFont(new Font("Felix Titling", Font.BOLD, 26));
	    
	    la1 = new JLabel();
		la1.setSize(630, 38);
        la1.setLocation(12, 126);
        
		la2 = new JLabel();
		la2.setSize(630, 38);
        la2.setLocation(12, 180);
        
		la3 = new JLabel();
		la3.setSize(630, 38);
        la3.setLocation(12, 239);
        
		la4 = new JLabel();
		la4.setSize(630, 38);
        la4.setLocation(12, 307);
	    
	    la1.setFont(new Font("나눔바른고딕", Font.PLAIN, 19));
	    la2.setFont(new Font("나눔바른고딕", Font.PLAIN, 19));
	    la3.setFont(new Font("나눔바른고딕", Font.PLAIN, 19));
	    la4.setFont(new Font("나눔바른고딕", Font.PLAIN, 19));

	    print = new JButton("Print");
	    print.setBackground(new Color(255, 255, 255));
	    print.setForeground(new Color(189, 183, 107));
	    print.setBounds(12, 408, 145, 38);
	    print.setFont(new Font("Felix Titling", Font.BOLD, 16));
	    
	    main = new JButton("Main");
	    main.setBackground(new Color(255, 255, 255));
	    main.setForeground(new Color(189, 183, 107));
	    main.setBounds(537, 408, 145, 38);
	    main.setFont(new Font("Felix Titling", Font.BOLD, 16));
	 
        //add
        p1.setBackground(new Color(238, 232, 170));
	    
	    p1.add(la);
	    p1.add(la1);
	    p1.add(la2);
	    p1.add(la3);
	    p1.add(la4);
	    p1.add(print);
	    p1.add(main);
	    
	    
	}
		public void itemStateChanged(ItemEvent e){ // 텍스트필드와 라디오버튼의 이벤트처리를 위한 메서드
			PrintJFrame pj = new PrintJFrame();
			double weight, count, paymoney, money; 
			double result = 0;
			weight = Double.parseDouble(smc.w1.getText());
			count = Double.parseDouble(smc.c1.getText());
			money = Double.parseDouble(pay.tf.getText());
			
			result = weight * count;

		    if(smc.button.isSelected()) {
		    	if(result <= 5.0 && result >= 0.0 ) {
					paymoney = 350;
					pj.la1.setText("수량 : "+count+"개");
					pj.la2.setText("중량 : "+weight+"g");
					pj.la3.setText("총 결제 금액은 "+paymoney+"원 이며");
					if(spac.Money.isSelected()) { 
						la4.setText("거스름돈은 "+(paymoney-money)+"원 입니다.");
					}
				}
				else if(result > 5.0 && result <= 25.0 ) {
					paymoney = 380;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("총 결제 금액은 "+paymoney+"원 이며");
					if(spac.Money.isSelected()) {
						la4.setText("거스름돈은 "+(paymoney-money)+"원 입니다.");
					}
				}
				else if(result > 25.0 && result <= 50.0 ) {
					paymoney = 400;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("총 결제 금액은 "+paymoney+"원 이며");
					if(spac.Money.isSelected()) { 
						la4.setText("거스름돈은 "+(paymoney-money)+"원 입니다.");
					}
				}
				else{
					paymoney = 500;
					pj.la1.setText("수량 : "+count+"개");
					pj.la2.setText("중량 : "+weight+"g");
					pj.la3.setText("총 결제 금액은 "+paymoney+"원 이며");
					if(spac.Money.isSelected()) { 
						pj.la4.setText("거스름돈은 "+(paymoney-money)+"원 입니다.");
					}
				}
		    }//end of smc if
		    
		    if(spc.button.isSelected() || pc.bt1.isSelected()) {
		    	if(result < 10.0 && result >= 0.0 ) {
					paymoney = 5000;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("총 결제 금액은 "+paymoney+"원 이며");
					if(spac.Money.isSelected()) { 
						la4.setText("거스름돈은 "+(paymoney-money)+"원 입니다.");
					}
				}
				else if(result > 10.0) {
					paymoney = result*200;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("총 결제 금액은 "+paymoney+"원 이며");
					if(spac.Money.isSelected()) { 
						la4.setText("거스름돈은 "+(paymoney-money)+"원 입니다.");
					}
				}
		    }//end of spc if
		    
		    if(mc.bt1.isSelected()) {
		    	if(result <= 5.0 && result > 0.0 ) {
					paymoney = 350;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("예상 금액 : "+paymoney+"원");
				}
				else if(result > 5.0 && result <= 25.0 ) {
					paymoney = 380;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("예상 금액 : "+paymoney+"원");
					
				}
				else if(result > 25.0 && result <= 50.0 ) {
					paymoney = 400;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("예상 금액 : "+paymoney+"원");
					
				}
				else{
					paymoney = 500;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("예상 금액 : "+paymoney+"원");
					
				}
		    	
		    } // end of mc if
		    else if(pc.bt1.isSelected()) {
		    	if(result < 10.0 && result >= 0.0 ) {
					paymoney = 5000;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("예상 금액 : "+paymoney+"원");
				}
				else if(result > 10.0) {
					paymoney = result*200;
					la1.setText("수량 : "+count+"개");
					la2.setText("중량 : "+weight+"g");
					la3.setText("예상 금액 : "+paymoney+"원");
				}
		    }
		} // end of pc if
}