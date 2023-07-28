package 복습.part3;

import java.util.Scanner;

public class part3 {//class s

	public static void main(String[] args) {//main s
	
	Scanner scanner = new Scanner(System.in);	
    String[] 재고관리 = { "10,0,300,콜라" , "3,0,200,환타" , "2,0,100,사이다"};

    while(true) {
    	System.out.println("-------메뉴--------");
    	System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
    	System.out.print(">>>>>>선택");
    	int drink = scanner.nextInt();
    	
    	if(drink==1||drink==2||drink==3) {
    		String product = 재고관리[drink-1];
    			System.out.println(drink+1+"번 제품 : "+product);
    		int stock = Integer.parseInt(product.split(",")[0]);
    		int basket = Integer.parseInt(product.split(",")[1]);
    		int price = Integer.parseInt(product.split(",")[2]);
    		String name = product.split(",")[3];
    		//유효성검사
    		if(stock>0) {
    			System.out.println(name+"제품을 담았습니다.");
    			stock--; basket++;
    			
    		}else {
    			System.out.println(name+"재고가 없습니다.");
    		}
    		//재고 업데이트
    		재고관리[drink-1]= stock+","+basket+","+price+","+name;
    		
    		
    	}
    	else if(drink==4) {
    		System.out.printf("%10s %10s %10s \n", "제품명","수량","가격");
    			for(int i=0;i<재고관리.length;i++) {
    				int basket = Integer.parseInt(재고관리[i].split(",")[1]);
    				int price = Integer.parseInt(재고관리[i].split(",")[2]);
    				String name =재고관리[i].split(",")[3];
    				if(basket>0) {
    	    			System.out.printf("%10s %10s %10s \n", name, basket, basket*price);
    			}

    		}
    	}
    }
	
	}//main e
	
}//class e
