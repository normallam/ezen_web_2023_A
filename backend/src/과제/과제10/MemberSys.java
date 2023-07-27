package 과제.과제10;
							//현재 클래스에서 같은 패키지에 있는 클래스 호출 = 생략
//import java.util.Arrays;	//현재 클래스에서 다른 패키지에 있는 클래스 호출 = import
							//java.lang 기본 패키지이므로 생략 (String, System 등)
//import java.util.Scanner;	//자동완성 이용해서 클래스 작성하면 import 작성
//vs
import java.util.*;			// 해당 패키지내 모든 클래스 호출


import 과제.과제9.Member;

public class MemberSys {//class s
	
	static Member[] memberList = new Member[100];
	static Scanner sc = new Scanner(System.in); // 2. 모든 함수에서 사용 가능한 인스턴스 멤버
												// 프로그램내 전역구역에서 공유 사용되는 메모리 = 정적멤버
												// 1. 인스턴스멤버		=힙영역		=new 마다 할당 => 
												// 2. 
			
	
	public static void main(String[] args) {// main s
		
		
		
		while(true) {	//무한루프
			
			System.out.println("\n\n--------- 회원 시스템 ---------"); 
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기    선택> ");
			// 1. 입력객체의 위치생각 // 입력객체는 현재{} 사용할껀지... 모든 구역에서 사용할껀지 
			//입력객체의 사용 구역 범위 생각!!!! [프로그램내 전역구역 =static]
			
			int ch = sc.nextInt(); 
			
			if( ch == 1 ) {	 회원가입 (); } //main함수 밖에 있는 다른 함수 호출
			// 1. 인스턴스멤버(static) 함수는 객체를 생성하고 호출한다.
			// 2. 정적멤버(static있는) 함수는 객체없이 클래스를 통한 호출한다.
			else if( ch == 2 ) { 로그인 (); } 
			else if( ch == 3 ) { 아이디찾기 (); } 
			else if( ch == 4 ) { 비밀번호찾기 (); } 
			
		} // w e 
	} //main e
	
	
	static void 회원가입 () {//인스턴스 멤버 =객체 생성해서 할당후 사용
		// 1. 입력받기
		System.out.println();
		System.out.println();
		
		
		
	} 
	static void 로그인 () { } //정적 멤버 = 우선할당
	static void 아이디찾기 () { }
	static void 비밀번호찾기 () { }
	
}
/*
	주제 : 회원제 시스템 
		0. 회원클래스 설계 = Member
			아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		0. Member 객체를 여러개 저장하는 배열 
			Member[] 객체배열 = new Member[100];
		
		1. 초기 메뉴 [ 24시간 ]
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 *임시 비밀번호(문자4자리 난수생성 ) 업데이트후 출력 
					- 아니면 없다.
*/