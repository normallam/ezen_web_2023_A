package java1.day06;

import java.util.Arrays;

public class Ex1_배열 {//class s

	public static void main(String[] args) {// main s
	
		
		//[p.168]
		// 1. 선언
		String[] season = {"spring", "summer", "fall", "winter"};
		//String[] : String 클래스(타입)으로 배열 선언 = string데이터만 저장 가능!!!
		//{값1, 값2, 값3} : 배열에 저장할 데이터 순서대로 작성
		
		// 2. 호출
		System.out.println(season); // season변수는 배열주소값을 가지고 있는 스택영역
		System.out.println(Arrays.toString(season));
		//Arrays.toString(배열변수명)	// 주소를 찾아서 배열의 정보 호출
		
		System.out.println(season[0]); // 인덱스 0 값 데이터 호출
		System.out.println(season[1]); // 인덱스 0 값 데이터 호출
		System.out.println(season[2]); // 인덱스 0 값 데이터 호출
		System.out.println(season[3]); // 인덱스 0 값 데이터 호출
		
		// 3. 변경 ( 새로운값 대입 : 기본값을 불러와서 덮어씌움 )
		season[1] = "여름";	// season[0] = "summer" = "여름"
		System.out.println(season[1]);
		
		// 4. 삭제 ( 없음 : 배열은 선언될 때 고정!! ) 해당 인덱스를 null로 만든다
		season[1] = null;
		System.out.println(Arrays.toString(season)); // 의미없는 값으로 대체 가능 -> 메모리 효율성 조금 나음
		
		// 5. 추가 ( 없음 : 배열은 선언될 때 고정!! ) * 배열내 인덱스 중에 null 있으면 해당위치에 데이터 추가
		if(season[1] == null)season[1]="초여름";
		else System.out.println("공간이 부족합니다.");
		System.out.println(Arrays.toString(season));
		
		
		//
		int[] scores = {83, 90, 87};	//int형 배열 선언하고 3개의 정수를 초기화
		
		
		//배열내 데이터들의 총합 / 평균 구하기
		int sum = 0;
		for(int i = 0; i<3; i++) {//i는 0부터 3미만까지 1씩증가[0~2]// scores배열은 [인덱스: 0~2]
			sum += scores[i];
			//1회전 : sum += 83 // //2회전 : sum += 90 // 3회전 : sum += 87
		} // for end
		System.out.println("총합 :" + sum);
		System.out.println("총합 :" + sum/3.0);
		
		
		
		//[p.173]
		// 1. int형 배열
			// 1. new 연산자를 이용한 배열 선언
			int[] arr1 = new int[3];	// int 3개를 저장할 수 있는 배열 선언[0, 0, 0]
				System.out.println(Arrays.toString(arr1));
			// 2. 배열내 모든 데이터 호출
			for(int i = 0; i<3;i++) {System.out.println(arr1[i]);}
			
			// 3. 배열내 값 변경
			arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
				System.out.println(Arrays.toString(arr1));
		// 2. double형 배열
			// 1. new 연산자를 이용한 배열 선언
			double[] arr2 = new double[3];	//double 3개를 저장할 수 있는 배열 선언[0.0, 0.0, 0.0]
				System.out.println(Arrays.toString(arr2));
			// 2. 배열내 모든 데이터 호출 // 길이를 모르는 경우 => 배열명.length : 배열의 길이 수 반환
													// 배열명.length	,	문자열.length()
			for(int i = 0; i<arr2.length; i++) {System.out.println(arr2[i]);}
					//i<=arr2.length : 0~3	//i<=arr2.length-1 : 0~2
					//i<arr2.length :0~2
			// 3. 배열내 갑 변경
			arr2[0] = 0.1; arr2[1] =0.2; arr2[2] =0.3;
			//arr2.push() [x] : JS에서 사용되는 함수이므로 자바 불가능
			//arr2[3] = 0.4; //길이:3	인덱스:0~2	이므로 없는 인덱스 호출 불가능
			// 오류 이류: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			
		// 3. String 클래스 배열
			// 1. 선언
			String[] arr3= new String[3];	//String 객체(문자열)를 3개 저장할 수 있는 배열 선언[null, null, null]
			// 2. 호출
			for(int i = 0; i<arr3.length ; i++) {System.out.println(arr3[i]);}
			// 3. 값 변경
			arr3[0] = "1월";		arr3[1] = "2월";		arr3[2] = "3월";
				System.out.println(Arrays.toString(arr3));
				
			//* 값 삭제
		
		
		
	}//main e
	
}// class e


/*

	변수 : 하나의 데이터를 저장
	배열 : 여러개의 데이터를 저장
		1. 연속적인 공간에 데이터 저장하고 나열
		2. 각 데이터공간에 인덱스를 부여 [ 인덱스 : 0 ~ ]
		3. 특징 
			1. 배열은 선언된 타입의 값만 저장할 수 있다.
				int[] intArray = {1, "dd" } [x] -> 숫자랑 문자랑 같이 저장 x
				* int로 선언된 배열은 int형 데이터 저장가능
				int[] intArray = {1, 2 } [o]
			2. 배열의 길이는 선언될때 고정되므로 늘리거나 줄일 수 없다.
				int[] intArray = new int[길이];
				int[] intArray = new int[3];
				intArray[0], intArray[1], intArray[2]
				*추가하거나 줄일 수 없다.[ 고정길이 ] ->> 배열은 한 번 선언되면 하나만 삭제 안됨.
		4.선언
			1. 타입[] 변수명;	int[] intArray;
			2. 선언과 동시에 값 대입
				타입[] 변수명 = {값1, 값2, 값3, 값4}
			3. new 연산자로 배열 생성(기본값)으로 생성
				타입[] 변수명 = new 타입[길이];		* 길이 : 배열에 저장할 데이터 개수
*/