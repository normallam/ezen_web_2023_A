package java2.day26_컬렉션프레임워크;

public class Board {

	// 필드
	private String subject;
	private String content;
	private String Writer;
	// 생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		Writer = writer;
	}
	// 메소드
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", Writer=" + Writer + "]\n";
	}

	
}
