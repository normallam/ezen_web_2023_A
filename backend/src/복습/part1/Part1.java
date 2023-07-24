package 복습.part1;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Part1 {//class s

	public static void main(String[] args) {//main s
		
		int 콜라재고 = 10 ; int 환타재고 = 3; int 사이다재고 = 2;
	    int 콜라바구니 = 0 ; int 환타바구니 = 0 ; int 사이다바구니 = 0;
	    int 콜라가격 = 300 ; int 환타가격 = 200 ; int 사이다가격 = 100 ;
	    
	    Scanner scanner= new Scanner(System.in);
	    
	    while(true) {
	    	System.out.println("선택항목");
	    	System.out.println("1.콜라 2.사이다 3.환타 4.결제");
	    	int drink = scanner.nextInt();
	    	if(drink==1) {
	    		if(콜라재고>0) {
	    			System.out.println("콜라가 담겼습니다");
	    			콜라바구니++;
	    			콜라재고--;
	    		}else {
	    			System.out.println("재고가 부족합니다.");
	    		}
	    		
	    		
	    	}
			if(drink==2) {
				if(사이다재고>0) {
	    			System.out.println("사이다가 담겼습니다");
	    			사이다바구니++;
	    			사이다재고--;
	    		}else {
	    			System.out.println("재고가 부족합니다.");
	    		}    		
				    		
				    		
				    	}
			if(drink==3) {
				if(환타재고>0) {
	    			System.out.println("환타가 담겼습니다");
	    			환타바구니++;
	    			환타재고--;
	    		}else {
	    			System.out.println("재고가 부족합니다.");
	    		}
				
				
			}
				    	
			if(drink==4) {
				System.out.println("현재바구니 현황 표시 목록");
				System.out.println("-----------------");
				System.out.println("제품명    수량    가격");
				if(콜라바구니>0) {
					System.out.println("콜라"+ 콜라바구니 +"    "+ 콜라가격);
				}
				if(사이다바구니>0) {
					System.out.println("사이다"+ 사이다바구니 +"    "+ 사이다가격);
				}
				if(환타바구니>0) {
					System.out.println("환타"+ 환타바구니 +"    "+ 환타가격);
				}
				int sum =(콜라바구니*콜라가격)+(사이다바구니*사이다가격)+(환타바구니*환타가격);
				
				System.out.println("1.결제 2.취소");
				if(sum>1) {
					int select = scanner.nextInt();
					if(select==1) {
						int money = scanner.nextInt();
						if(sum<=money) {
							System.out.println("결제성공");
							콜라바구니=0; 사이다바구니=0; 환타바구니=0;
						}else {
							System.out.println("잔액부족");
							콜라재고+=콜라바구니;
							사이다재고+=사이다바구니;
							환타재고+=환타바구니;
							콜라바구니=0; 사이다바구니=0; 환타바구니=0;
						}
						
						
					}
					if(select==2) {
						System.out.println("결제취소");
						콜라재고+=콜라바구니;
						사이다재고+=사이다바구니;
						환타재고+=환타바구니;
						콜라바구니=0; 사이다바구니=0; 환타바구니=0;
					}
					
					
				}
				
			}
	    }

	}//main e
	
}// class e
