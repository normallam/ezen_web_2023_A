package java1.day14.Ex1_상속;

public class Ex1_실행 {

	public static void main(String[] args) {
		
		// 1. Phone 부모객체
		Phone phone = new Phone();
		System.out.println(phone.color);
		System.out.println(phone.model);
		//System.out.println(phone.wifi); //오류발생 : 자식 클래스의 멤버이므로 불가능
		
		phone.bell();
		phone.sendVoice();
		phone.receivevoice();
		phone.hangUp();
		//phone.setwifi(true);
		//오류발생 : 해당객체는 부모객체이고 해당 메소드는 자식 클래스의 멤버이므로 불가능
		// phone.internet();
		
		
		// 2. SmartPhone 자식 객체
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		System.out.println(myPhone.color);	//해당 객체의 부모클래스 멤버이므로 사용 가능
		System.out.println(myPhone.model);	//해당 객체의 부모클래스 멤버이므로 사용 가능
		System.out.println(myPhone.wifi); //해당 객체의 멤버이므로 사용 가능
		
		
		
		
		
		
		
	}
	
}
