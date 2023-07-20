package java1.day06;

import java.util.Scanner;

public class Ex2_확인문제9_2 {//class s

	public static void main(String[] args) {//main s
		
		int count = 0; // 모든 경우의 수 if{}에서 공유하기 위해 if{}밖에서 선언
		int[] scores = new int[count]; // 모든 경우의 수 if{}에서 공유하기 위해 if{} 밖에서 선언
		// 현재 scores의 배열의 길이 = 0
		// 3. 변수 저장
		
		//[p.199] 확인문제 9
		while(true) { //while s //무한루프
			System.out.println("\n\n---------------------------------------");
			System.out.println("\n 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("\n-----------------------------------------");
			System.out.print("선택>");	
			// 1. Scanner 객체 생성 [ import ]
		Scanner scanner = new Scanner(System.in);
			// 2. 객체.nextLine(); : 입력받은 데이터를 문자열로 반환 함수 //
		int ch = scanner.nextInt();
		
		if(ch == 1) {// 1. 입력한 값(ch)가 1일때
			System.out.print("학생수>");
			count=scanner.nextInt(); // <--- 더럽게 안나옴// 학생수 입력 해야함
			System.out.print("입력한 학생수"+count);
			scores = new int[count]; // 학생수에 따라 달라지는 점수 저장용도??
			
		}
		if(ch == 2) {// 2. 입력한 값(ch)가 2일때
			for(int i=0; i<count;i++) { // 학생 수를 처음부터 끝까지 살펴본 후에 학생 점수 입력
				System.out.print("인덱스에 저장할 학생점수:");
				scores[i]=scanner.nextInt();
				
			}
		}
		if(ch == 3) {// 3. 입력한 값(ch)가 3일때
			for(int i=0; i<scores.length;i++){// 학생점수를 끝까지 살펴본 후에 학생점수 값 출력
				System.out.println("인덱스에 저장된 학생점수:"+scores[i]);
			}
			
		}
		if(ch == 4) {// 4. 입력한 값(ch)가 4일때
			int sum = 0 ; // 배열내 데이터를 모두 더한(누계) 값을 저장하는 변수
			int max = 0 ; // 배열내 데이터중에 가장 큰 값을 저장하는 변수
		
			//배열내 모든 데이터 호출[0인덱스 마지막 인덱스까지 호출]
			for(int i=0; i<scores.length;i++) {//학생점수를 끝까지 살펴본 후에 학생점수를 다 더하고 최대 값 구하고
				sum += scores[i];			
			if(max<scores[i])max=scores[i];
			}									
			System.out.println("최고점수 :"+max);	//그리고 반복문 나와서 출력
			System.out.println("평균"+((double)sum/count));
		}
		
		if(ch == 5) {// 5. 입력한 값(ch)가 5일때 //브레이크 걸어서 무한루프 종료
			System.out.println("프로그램 종료");break;
		}
			
			
		}//while e	
	} // main e
}//class e
	
/*
	step4
 	설계조건
 		- 학생수를 입력받아 입력받은 학생수 만큼 점수를 입력받아 저장 
 		- 현재 점수 출력 / 통계 
 		
 		1.학생수
 			- 학생수를 입력받아 '학생수' 변수에 저장한다.
 			- 그 학생수 만큼 배열 선언한다.[ 메모리 할당 ]  : 타입[] 변수명 = new 타입[길이]
 		2.점수입력
 			- 몇개 점수 입력?????????? 정해져 있지 않는 상태 --> 변수로만 처리 비효울적으로 --> 배열 효율적
 			- 1번기능에서 할당된 배열만큼 점수를 입력받아 각 인덱스에 저장한다.
 				[ 만일 학생수를 입력받지 않고 점수입력을 하면 오류 발생!!! ]
 		3.점수리스트
 			- 2번기능에서 저장된 배열내 모든 인덱스 데이터 호출 한다. 
 		4.분석
 			- 2번기능에서 저장된 배열내 모든 인덱스 데이터를 모두 더한후 학생수 만큼 나눈다. = sum/학생수(1번기능)
 			- 2번기능에서 저장된 배열내 모든 인덱스 데이터를 호출해서 최고점수 찾는다 = max
 		5.종료 
 			무한루프 종료해서 출력그만!!! break;
				
	// .nextLine() 사용시 주의할점 
 	 	* nextLine 사용시 다른 next~~() 앞뒤로 존재 했을때 하나로 인식 [ 오류 처럼 보일수 있다 ].
 	 	1. 해결 방안1
 	 	 	Integer.parseInt( scanner.nextLine() );
 	 	2. 해결 방안2
 	 		String 문자 = scanner.nextLine();
 	 		int 정수 = scanner.nextInt()
 	 		
 	 		scanner.nextLine(); !!!! 의미 없는 nexLine() 추가해서 
 	 		
 	 		String 문자 = scanner.nextLine();
				
				
				

 */
		