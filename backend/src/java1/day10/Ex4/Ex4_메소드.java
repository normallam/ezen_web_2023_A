package java1.day10.Ex4;

public class Ex4_메소드 {
	
	public static void main(String[] args) {
		
		//-------------메소드 사용/호출------------//
		// 1. 객체 필요!!!!
		Member m = new Member();
		// 2. 객체내 .(도트연산자) 이용한 필드/메소드 호출
			// 1. 리턴x매개변수x 함수 호출
		m.signup();
			// 2. 리턴x매개변수o 함수 호출
		//m.login("qwe","1234"); //오류 : 문자1개 정수1개 순서로 전달하는걸로 약속/선언했는데 문자2개주니까 거부/오류
		m.login("qwe",1234);
			// 3. 리턴o매개변수x 함수 호출
		m.findId(); // 리턴된 값을 받았지만 추후에 그 값을 사용할 목적이 없어서 저장x
		//String result1 = m.findId(); //리턴된 값을 받았지만 저장하는데 있어 타입 일치하지 않는 경우
		String result2 = m.findId(); //리턴된 값을 받았어서 추후[다음코드]에 그 값을 사용할 목적이 있어서 변수에 저장o
			// 4. 리턴o매개변수o 함수 호출
		String[] result3 = m.findPw("qwe", "qwe");
			// 5. 가변길이
		m.delete("안녕","하세요");
		m.delete("안녕","하세요","!");
		
		
			// 6. 오버로딩 ->> 얘를 왜하지
		m.delete(1,"안녕","하세요","!");
	}
	
}
