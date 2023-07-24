package java1.day08.Ex5;

import java.util.Scanner;

public class Ex5_객체배열 {//class s

	public static void main(String[] args) {// main s
		
		Member[] memberList = new Member[100]; // member 객체 100개를 저장할 수 있는 
		
		while(true) {// 무한루프 
			System.out.println("회원가입 : ");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			int ch =sc.nextInt();
			if(ch==1) {
				System.out.println("아이디 :");		String id = sc.next();
				System.out.println("비밀번호");		String pw = sc.next();
				// 1. 객체화 : 클래스명 객체변수명 = new 생성자명();
				Member m = new Member(); 		//1. 객체 생성
				m.id = id; m.pw =pw;		//2. 생성된 객체로부터 .접근연산자를 이용한 각 필드에 입력값 대입
				// 2. 배열에 저장
				for(int i = 0; i<memberList.length ;i++) {
					if(memberList[i]==null) {
						memberList[i]=m; //i번쨰 인덱스의 생성된 객체를 대입
						break;
					}//if end
				}//for end
				
			}//if end
		}// while e
		
		
		
	}// main e
	
	
}//class e
