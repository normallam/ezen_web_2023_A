package java1.day13.Ex2.model.dto;

public class BoardDto {
	//싱글톤(공유)X : 게시물 1개당 DTO 1개 이기 때문에 여러 DTO가 필요

	// 1. 필드
		// 1. 작성자(문자열String), 내용(문자열), 조회수(int)
	private String content;
	private String writer;
	private int view;
	// 2. 생성자
		// 1. (권장)빈생성자 -> 컨트롤 스페이스 -> construct
		public BoardDto() {
			// TODO Auto-generated constructor stub
		}
		// 2. (권장)풀생성자 -> 마우스 우 클릭 -> super
		public BoardDto(String content, String writer, int view) {
			super();
			this.content = content;
			this.writer = writer;
			this.view = view;
		}


		// 3. (선택) 게시물 등록시 사용되는 생성자
		public BoardDto(String content, String writer) {
			super();
			this.content = content;
			this.writer = writer;
		}
		
		
	// 3. 메소드
		//1. (권장) setter and getter : 외부로투버 필드 값이 호출이 불가능하기 때문에
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public int getView() {
			return view;
		}
		public void setView(int view) {
			this.view = view;}
		//2. (권장) toString()
		@Override
		public String toString() {
			return "BoardDto [content=" + content + ", writer=" + writer + ", view=" + view + "]";
		}
		
			
			
			
			
			
			
			
			
}
/*
	DTO : 이동객체
		1. 객체에 저장할 필드 선정
			1. private으로 필드 선언[권장]	: 객체내 필드 직접적인 x
			2. 타입
			3. 필드명
		2. 생성자
			1. 빈생성자
			2. 풀생성자
			3. 그외 사용에 따라 선언 [ex) 등록할 때 사용되는 생성자]
		3. 메소드
			1. setter and getter	: 필드가 직접적인[private] 불가능 하기 떄문에 메소드를 이용한 필드 간접접근
				set필드명()	: 필드에 값 대입할 때 사용되는 메소드
				get필드명()	: 필드에 값 호출할 때 사용되는 메소드
			2. to String	:객체 호출시 주소값이 반환되지만 

*/