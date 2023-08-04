package 과제.과제11.model.dto;

public class MemberDto {

	
	// 1. 필드
	private int mno;
	private String mid;
	private String mpw;
	private String mnmae;
	private String mphone;
	// 2. 생성자
		// 1. 기본생성자 컨트롤 스페이스바
	public MemberDto() {}
		// 2. 풀생성자 마우스 오른쪽 using
	public MemberDto(int mno, String mid, String mpw, String mnmae, String mphone) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.mnmae = mnmae;
		this.mphone = mphone;
	}
	
	
	// 3. 메소드
		// 1. setter 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMnmae() {
		return mnmae;
	}
	public void setMnmae(String mnmae) {
		this.mnmae = mnmae;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	
	
			
		// 2. to string
	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpw=" + mpw + ", mnmae=" + mnmae + ", mphone=" + mphone
				+ "]";
	}
	
	
	
	
}
