package 복습.part2;

import java.util.Arrays;
import java.util.Scanner;

public class part2 {//class s

	public static void main(String[] args) {//main s		

	Scanner scanner = new Scanner(System.in);
	String 재고관리 = "";
	재고관리 ="10,0,300\n3,0,200\n2,0,100\n";
	
	System.out.println(Arrays.toString(재고관리.split("\n")));
	System.out.println((재고관리.split("\n")[0]));//콜라
	System.out.println((재고관리.split("\n")[1]));//사이다
	System.out.println((재고관리.split("\n")[2]));//환타
	
	while(true) {
		System.out.println("----------메뉴------------");
		System.out.println("1.콜라 2.사이다 3.환타 4.결제");
		System.out.println("선택>>>>>>>");
		
		String 콜라정보 = 재고관리.split("\n")[0];
		String 사이다정보 = 재고관리.split("\n")[1];
		String 환타정보 = 재고관리.split("\n")[2];
		
		int 콜라재고 = Integer.parseInt(콜라정보.split(",")[0]);
		int 콜라바구니 = Integer.parseInt(콜라정보.split(",")[1]);
		int 콜라가격 = Integer.parseInt(콜라정보.split(",")[2]);
		
		int 사이다재고 = Integer.parseInt(사이다정보.split(",")[0]);
		int 사이다바구니 = Integer.parseInt(사이다정보.split(",")[1]);
		int 사이다가격 = Integer.parseInt(사이다정보.split(",")[2]);
		
		int 환타재고 = Integer.parseInt(환타정보.split(",")[0]);
		int 환타바구니 = Integer.parseInt(환타정보.split(",")[1]);
		int 환타가격 = Integer.parseInt(환타정보.split(",")[2]);
	
		int select = scanner.nextInt();
		
		if(select==1) {
			if(콜라재고>0) {
				System.out.println("콜라가 담겼습니다");
				콜라바구니++;
				콜라재고--;
			}else {
				System.out.println("콜라재고가 없습니다");
			}
		}
		if(select==2) {
			if(사이다재고>0) {
				System.out.println("사이다가 담겼습니다");
				사이다바구니++;
				사이다재고--;
			}else {
				System.out.println("사이다재고가 없습니다");
			}
		}
		if(select==3) {
			if(환타재고>0) {
				System.out.println("환타가 담겼습니다");
				환타바구니++;
				환타재고--;
			}else {
				System.out.println("환타재고가 없습니다");
			}
		}	
		if(select==4) {
			System.out.println("현재바구니 현황표시");
			System.out.println("---------------");
			System.out.println("제품명   수량   가격");
			
			if(콜라바구니>0) {
				System.out.println("콜라"+ 콜라바구니 + "   "+ 콜라가격*콜라바구니);
			}
			if(사이다바구니>0) {
				System.out.println("사이다"+ 사이다바구니 + "   "+ 사이다가격*사이다바구니);
			}
			if(환타바구니>0) {
				System.out.println("환타"+ 환타바구니 + "   "+ 환타가격*환타바구니);
			}
			
			
			
			int sum = (콜라바구니*콜라가격)+(사이다바구니*사이다가격)+(환타바구니*환타가격);
			System.out.println("총가격 : "+ sum);
			if(sum>1) {
				System.out.println("1.결제 2.취소");
				int select2= scanner.nextInt();
				if(select2==1) {
					int money = scanner.nextInt();
					if(sum<=money) {
						System.out.println("결제성공");
						System.out.println(money-sum);
						콜라바구니=0; 사이다바구니=0; 환타바구니=0;
					}else {
						System.out.println("잔액부족");
						콜라재고+=콜라바구니;
						사이다재고+=사이다바구니;
						환타재고+=환타바구니;
						콜라바구니=0; 사이다바구니=0; 환타바구니=0;
					}
				}
				if(select2==2) {
					System.out.println("취소");
					콜라재고+=콜라바구니;
					사이다재고+=사이다바구니;
					환타재고+=환타바구니;
					콜라바구니=0; 사이다바구니=0; 환타바구니=0;
				}
				
				
				
			}
			
		
			
		}
		재고관리 = 콜라재고+","+콜라바구니+","+콜라가격+"\n"
				+ 환타재고+","+환타바구니+","+환타가격+"\n"
				+ 사이다재고+","+사이다바구니+","+사이다가격+"\n";

	}// while e
	
	
	
	
	}//main e
	
}//class e
