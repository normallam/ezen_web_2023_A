package java1.day10.Ex1;

import java.util.Scanner;

//p233~234
public class Ex1_메소드선언호출 {//class s
	//실행목적
	public static void main(String[] args) {//main s
		//powerOn(); // 호출할 메소드가 다른 쿨래스(객체)에 존재하므로 호출 불가능

		
		// 1. 메소드 호출 하기 위한 객체 생성
		Calculator myCalc = new Calculator();
		
		// 2. 객체 통한 메소드 호출 / 매개변수 전달 x / 리턴 x
		myCalc.powerOn();
		
		// 3. 객체 통한 메소드 호출 / 매개변수 전달 = 2개/ 리턴 o
		myCalc.plus(5, 6);
		// 5, 6전달 5+6 =11을 호출했던 곳으로 리턴// 리턴 다음작업은 우리가 해야함(저장할 껀지 말껀지) 
		
		
		// 3. 객체 통한 메소드 호출 / 매개변수 전달 = 2개'리터럴' /리턴 o-> 변수 담아주기
		int result = myCalc.plus(5,6);
		System.out.println("result1 :" +result);
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		//4. 객체 통한 메소드호출 / 매개변수 전달 = 2개'변수(값,주소)' / 리턴 o
		int x =10;
		int y =4;
		
		double result2 =myCalc.divide(x,y);
		System.out.println("result2 : "+ result2);
		
		myCalc.powerOff();
		
	}//main e
	
}//class e
