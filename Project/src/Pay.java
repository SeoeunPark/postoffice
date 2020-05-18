import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Pay {
	
   
	
	private int pay; // 요금
	private int userpay; //사용자의 금액 
	private double pweight; // 택배 무게
	private int pcount;//택배 수량 
	private double  mweight; //메일 중량
	private double mcount; //메일 수량
	private String number;//운송장번호
	private String answer=null; //답 입력 받는 거
	private Statement st= null;
	
	
	
	void p_calculation(){ //택배 요금 계산
		Scanner scan=new Scanner(System.in); 
		System.out.println("택배 수량을 입력하세요  "); 
		System.out.print("-> ");
		int pcount=scan.nextInt();
		
		System.out.println("택배 중량을 입력하세요 (단위: 0.0)  ");
		System.out.print("-> ");
		double pweight=scan.nextDouble();
		
		//택배 운임 계산 

		this.pcount = pcount; // 입력받은 값을 넘겨줌
		this.pweight=pweight; // 입력받은 값을 넘겨줌 

		if(this.pweight * this.pcount < 10.0 && this.pweight* this.pcount >= 0.0) { //택배의 중량이 10kg미만이면 기본요금 5000원
			pay = 5000; //기본요금
		}else if(this.pweight* this.pcount > 10.0){ //택배의 중량이 10kg초과하면 택배중량 * 200원 *택배수량
			pay = (int) (this.pweight * 200 * this.pcount);
		}
		//총 합계 출력
		System.out.println("");
		System.out.println("*************************************");
		System.out.println("택배 수량 : " + this.pcount + "개 " + "\n" 
				+"택배 무게 : " + this.pweight + "kg  " + "\n"
				+"총 금액은 " + pay + "원 입니다.");
		System.out.println("*************************************");
		System.out.println("");
	}//end of payment
	
	
	void m_calculation() { //우편 요금 계산
		Scanner scan= new Scanner(System.in);
		System.out.println("우편 수량을 입력하세요  "); 
		System.out.print("-> ");
		int mcount = scan.nextInt();
		
		System.out.println("우편 중량을 입력하세요(단위: 0.0kg)");
		System.out.print("-> ");
		double mweight = scan.nextDouble();

		this.mcount = mcount; //입력받은 값을 넘겨줌
		this.mweight = mweight; //입력받은 값을 넘겨줌

		if(this.mweight * this.mcount <= 5.0 && this.mweight * this.mcount > 0.0) { //우편 무게가 5g 이하면 기본요금 350원
			pay = 350;
		} else if(this.mweight * this.mcount > 5.0 && this.mweight * this.mcount <= 25.0) { //우편 무게가 5g초과 25g까지이면 기본요금 380원
			pay = 380;
		} else if(this.mweight * this.mcount > 25.0 && this.mweight * this.mcount <= 50.0) { //우편 무게가 25g초과 50g까지이면 기본요금 400원
			pay= 400;
		} else{ 
			pay= 500;
		}
		//총 합계 출력
		System.out.println("");
		System.out.println("*************************************");
		System.out.println("우편 수량 : " + this.mcount + "개 " + "\n" 
				+"우편 중량 : " + this.mweight + "g  " + "\n"
				+"총 금액은 " + pay + "원 입니다.");
		System.out.println("*************************************");
		System.out.println("");
	}
	


		void Payment(){
				Scanner scan=new Scanner(System.in); 
				System.out.println("결제는 무엇으로 하시겠습니까?");
				System.out.println("1.카드 / 2.현금");
				System.out.println("");
				System.out.println("번호를 입력해주세요 ");
				System.out.print("-> ");
				System.out.println("");
				int answer=scan.nextInt();
				
				switch(answer) {
				case 1: //카드결제
						System.out.println("결제중 ... 잠시만 기다려주십시오.");

						break;

				case 2: //현금결제
						System.out.println("금액을 넣어주십시오 (oooo원) ");
						System.out.print("->");
						userpay=scan.nextInt();
						System.out.println("");
						System.out.println("결제중... 잠시만 기다려주십시오.");
						System.out.println("");
						
						if(userpay>pay) {
							System.out.println("*************************************");
							System.out.println("거스름 돈은 "+ (userpay-pay) +"입니다.");
						}else if (userpay==pay) {
							System.out.println("*************************************");
							System.out.println("거스름 돈은 없습니다. ");
						}else {
							System.out.println("*************************************");
							System.out.println((pay-userpay)+"원  부족합니다. ");
							System.out.println("");
							System.out.println("결제가 취소되었습니다. 처음부터 다시 입력해주세요.");
							System.out.println("*************************************");
							Payment();
						}
							break;
			
						}
							System.out.println("결제가 완료되었습니다.");
							System.out.println("이용해주셔서 감사합니다.");
							System.out.println("*************************************");
						}
						} //end of pay