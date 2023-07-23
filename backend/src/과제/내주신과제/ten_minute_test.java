package 과제.내주신과제;

import java.util.Scanner;

public class ten_minute_test {//class s
	
	public static void main(String[] args) {//main s
	
		Scanner scanner = new Scanner(System.in);
		
		int 콜라재고 = 10 ;    int 환타재고 = 10 ;    int 사이다재고 = 10;
	      
        int 콜라바구니 = 0 ;    int 환타바구니 = 0 ;    int 사이다바구니 = 0;
     
        int 콜라가격 = 300 ;   int 환타가격 = 200 ;   int 사이다가격 = 100 ; 
		
		while(true) {//무한
			System.out.println("메뉴선택");
			System.out.println("1.콜라 2.사이다 3.환타 4.결제");
			int drink = scanner.nextInt();
			if(drink==1) {
				if(콜라재고>0) {
					System.out.println("콜라를 담았습니다.");
					콜라재고--;
					콜라바구니++;
				}
			}
			if(drink==2) {
				if(사이다재고>0) {
					System.out.println("사이다를 담았습니다.");
					사이다재고--;
					사이다바구니++;
				}	
			}
			if(drink==3) {
				if(환타재고>0) {
					System.out.println("환타를 담았습니다.");
					환타재고--;
					환타바구니++;
				}
			}
			if(drink==4) {
				System.out.println("현재 장바구니 현황 표시 목록");
				System.out.println("----------------------");
				System.out.println("제품명      수량      가격");
				//유효성검사
				
				if(콜라바구니 != 0) {
					System.out.println("콜라"+   콜라바구니 +"  " + 콜라가격);
				}
				if(사이다바구니 != 0) {
					System.out.println("사이다"+   사이다바구니 +"  "+  사이다가격);
				}
				if(환타바구니 != 0) {
					System.out.println("환타"+   환타바구니 +"  "+  환타가격);
					
				}
				int sum = (콜라바구니*콜라가격)+(사이다바구니*사이다가격)+(환타바구니*환타가격);
				
				System.out.println("총가격 :" + sum);
				
				
					if(sum>1) {
						System.out.println("1.결제 2.취소");
						int select = scanner.nextInt();
						if(select==1) {
							int money = scanner.nextInt();
							if(sum<=money) {
								System.out.println("결제성공");
								콜라바구니=0; 사이다바구니=0; 환타바구니=0;
							}else {
								System.out.println("잔액부족");
								콜라재고+=콜라바구니;	콜라바구니=0;
								사이다재고+=사이다바구니;	 사이다바구니=0;
								환타재고+=환타바구니;	환타바구니=0;				
							}
							
						}
						if(select==2) {
							콜라재고+=콜라바구니;	콜라바구니=0;
							사이다재고+=사이다바구니;	 사이다바구니=0;
							환타재고+=환타바구니;	환타바구니=0;
						}
		
				}//sum>1 e

			}			
		}
		
	}//main e
}//class e
