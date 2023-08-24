package model.dto;

public class MemberDto {

	private int mno;
	private String mid;
	private String mpw;
	private String memail;
	private String mimg;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int mno, String mid, String mpw, String memail, String mimg) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.memail = memail;
		this.mimg = mimg;
	}
	

	public MemberDto(String mid, String mpw, String memail, String mimg) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.memail = memail;
		this.mimg = mimg;
	}

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

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMimg() {
		return mimg;
	}

	public void setMimg(String mimg) {
		this.mimg = mimg;
	}

	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpw=" + mpw + ", memail=" + memail + ", mimg=" + mimg
				+ "]";
	}
	
	
	
	
}
