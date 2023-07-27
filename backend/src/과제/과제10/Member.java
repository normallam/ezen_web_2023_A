package 과제.과제10;

public class Member {

	// 1. 필드 : 객체의 데이터를 저장하는 곳 = 인스턴스 vs 정적멤버static
	String id;
	String pw;
	String name;
	String phone;
	int age;
	
	// 2. 생성자 : 객체의 초기화를 담당 역할 = 인스턴스 vs 정적멤버static
	
	// 3. 메소드 : 객체의 행동을 담당 역할 =인스턴스 vs 정적멤버static
	
		// 1. setter or getter
	
		// 2. toString : 객체호출시 객체의 주소가 아닌 필드의 값을 반환해주는 함수[*개발자가 검사용]
	
		
}


/*


	JVM : 자바 가상(논리적으로 만들어낸) 메모리
		- 자바는 하드웨어(직접적으로 메모리 관리X) 조작X
		
		 Member.java ----클래스로더-----> Member.class --------------->  메소드영역				스택영역		힙여역
		자바 코드파일						바이트코드파일				클래스 코드, 메소드 코드,			 { }		
																정적멤버(Static)

	this 		: 인스턴스 멤버 : new 힙 생성시 할당 되고 힙 초기화될때[GC] [공용x , 각각]
				- static 키워드 없으면
				- 객체를 통해 사용
	static 		: 정적멤버 : 프로그램 시작 할당 되고 프로그램이 종료될때 [전역/공통/공용/공유]
				- static 키워드 있으면
				- 클래스 통해 사용
	final 		: 수정불가 : 초기화할때 대입만 가능하고 수정 불가능
	static final : 상수 : 프로그램내에서 1개만 저장(static) 수정불가능(final) 합친 키워드
	new 

*/