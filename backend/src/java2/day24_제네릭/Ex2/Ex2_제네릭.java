package java2.day24_제네릭.Ex2;

public class Ex2_제네릭 {
	public static void main(String[] args) {
		
		// 1. Product 객체 만드는게 .. tv 객체를 가지고
			// 1. product객체 만들때. 필드에 사용할 타입 구체적으로 대입
		Product<Tv, String> product1 = new Product<>();
			// 2. product객체[ Tv kind = null; String model = null ;] *필드의 초기값 = 정수0실수0.0
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
			// 3. product객체[ Tv kind = new Tv(); String model = "스마트Tv";]
			
		
		
		
		// 2. Product 객체 만드는데 .. Car 객체를 가지고 
		
	}
}
