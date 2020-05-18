import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

//package project1;

public class Post {
	public static void main(String[] args) throws IOException, SQLException{
		// TODO Auto-generated method stub
			
		home();
		
	}//end of main
	

	static Parcel p1= new Parcel(null, null, null, null);
	static Mail m1= new Mail(null, null, null, null);
	static Client c1= new Client();
	static Pay pa1= new Pay();

	public static void home() { //메인
		Scanner scan= new Scanner(System.in);
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("                    우체국에 오신 걸 환영합니다~! 무엇을 도와드릴까요?");
		System.out.println("");
		System.out.println("    <1> 택배 접수   <2> 우편 접수   <3> 우편 요금 조회   <4> 운송장 번호로 정보 조회"); 
		System.out.println("    <5> 접수 취소   <6> 정보 수정   <7> 사용자의 모든 정보 보기 ");
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");
		System.out.println("번호를 입력해주세요 ");
		System.out.print("-> ");
		int answer;
		answer=scan.nextInt();
		System.out.println("");
		
		
		switch(answer) {
		
		case 1: 
				parcelChoose(); //택배 접수
				
				break;
		case 2: 
				mailChoose(); // 우편 접수
				
		case 3: 
				searchMail(); // 우편 요금 조회
				break;
				
		case 4:
				searchNumber(); //운송장번호로 목록 조회
				break;
		case 5: 
				cancel(); //접수 취소
				break;
		
		case 6: modify();
				break;
				
		case 7:
				lookall(); //모든 정보 보기  
				break;
		}
		
	}

	public static void parcelChoose() { //택배접수
		Scanner scan=new Scanner(System.in);
			System.out.println("");
			System.out.println("택배 접수를 하시겠습니까?");
			System.out.println("1.예  / 2.아니요");
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
			int answer = scan.nextInt();
			if(answer==1) {
				p1.insertMember();
					System.out.println("");
					System.out.println("접수 중.. 결제 창으로 넘어갑니다.");
					System.out.println("");
					pa1.p_calculation();
					System.out.println("");
					pa1.Payment();
					tohome();
			}else {
				tohome();
			}
		}

	public  static void mailChoose() { //우편 접수
		Scanner scan= new Scanner(System.in);
			System.out.println("우편 접수를 하시겠습니까?");
			System.out.println("1.예  / 2.아니요");
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
			int answer = scan.nextInt();
				if(answer==1) {
					m1.insertMember();
						System.out.println("");
						System.out.println("접수 중.. 결제 창으로 넘어갑니다.");
						System.out.println("");
						pa1.m_calculation();
						System.out.println("");
						pa1.Payment();
						
						tohome();
				}else {
						tohome();
				}
			}
	
	public static void  searchMail() { // 우편요금 조회
		Scanner scan= new Scanner(System.in);
			System.out.println("예상 우편 요금을 조회해보시겠습니까? ");
			System.out.println("1.예 / 2.아니요");
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
				int answer = scan.nextInt();
			if(answer==1) {
				m1.MailCheck();
				tohome();
			}else {
				tohome();
			}	
	}
	public static void searchNumber() { //운송장번호로 정보 조회
		Scanner scan= new Scanner(System.in);
				System.out.println("운송장번호로 정보를 조회해보시겠습니까? ");
				System.out.println("1.예  / 2.아니요");
				System.out.println("");
				System.out.println("번호를 입력해주세요 ");
				System.out.print("-> ");
				int answer = scan.nextInt();
				
				if(answer==1) {
						System.out.println("");
						System.out.println("운송장 번호를 입력해주세요 ");
						System.out.print("-> ");
						String Number=scan.next();
						
						c1.getMember(Number);
							tohome();
				}else {
						tohome();
				}
	}
	public static void cancel() { //접수 취소
		Scanner scan= new Scanner(System.in);
			System.out.println("접수를 취소하시겠습니까?"); 
			System.out.println("1.예  / 2.아니요");
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
			int answer=scan.nextInt();
			
			if(answer==1) {
				c1.deleteMember();
				tohome();
			}else {
				tohome();
			}
		
	}
	public static void modify() { //정보 수정
		Scanner scan=new Scanner(System.in);
			System.out.println("사용자 정보를 수정하시겠습니까? ");
			System.out.println("1.예  / 2.아니요");
			
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
			int answer=scan.nextInt();
			
		if(answer==1) {
		System.out.println("수정할 주소를 입력하세요 ");
		System.out.print("-> ");
			String address=scan.next();
		System.out.println("수정할 수신인을 입력하세요 ");
		System.out.print("-> ");
			String addressee=scan.next();
		System.out.println("수정할 발신인을 입력하세요  ");
		System.out.print("-> ");
			String addresser=scan.next();
		System.out.println("수정할 전화번호를 입력하세요 ");
		System.out.print("-> ");
			String phonenumber=scan.next();
			c1.test(address, addressee, addresser, phonenumber);
			tohome();
		}else {
			tohome();
		}
	}//end of modify
	public static void lookall() { //모든 사용자의 정보 보기 
		Scanner scan= new Scanner(System.in);
			System.out.println("모든 사용자의 정보를 확인해보시겠습니까?"); 
			System.out.println("1.예  / 2.아니요");
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
			
			int answer=scan.nextInt();
			if(answer==1) {
				c1.getMemberList();
				tohome();
			}else {
				tohome();
			}
	}//end of lookall

	private static void tohome() {
		Scanner scan= new Scanner(System.in);
			System.out.println("");
			System.out.println("메인으로 이동하시겠습니까?");
			System.out.println("1.예  / 2.아니요");
			System.out.println("");
			System.out.println("번호를 입력해주세요 ");
			System.out.print("-> ");
			
				int answer = scan.nextInt();
				if(answer==1) {
					home();
				}else {
					System.out.println("우체국을 이용해주셔서 감사합니다.");
				}		
	}//end of tohome
}//end of boxlookup

