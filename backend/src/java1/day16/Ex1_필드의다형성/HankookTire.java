package java1.day16.Ex1_필드의다형성;

public class HankookTire extends Tire {
		// 상속 : 자식클래스 extends 부모클래스
	
	// !오버라이딩 : 부모클래스의 메소드를 물려받았지만 재정의(리모델링)
	@Override // 컨트롤 + 스페이스바 -> roll 
	public void roll() { // 메소드 선언부 그대로 사용
		// TODO Auto-generated method stub
		//super.roll();	// super.메소드() : 부모클래스의 메소드 호출
		// 새로운 코드 = 재정의
		System.out.println("한국 Tire 회전");
	}
}
