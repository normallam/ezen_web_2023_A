package model.dto;

public class HrmDto {

	private int eno;
	private String epi;
	private String ename;
	private String ecall;
	private String egrade;
	private String eredate;
	
	public HrmDto() {
		// TODO Auto-generated constructor stub
	}

	public HrmDto(int eno, String epi, String ename, String ecall, String egrade, String eredate) {
		super();
		this.eno = eno;
		this.epi = epi;
		this.ename = ename;
		this.ecall = ecall;
		this.egrade = egrade;
		this.eredate = eredate;
	}
	

	public HrmDto(String epi, String ename, String ecall, String egrade, String eredate) {
		super();
		this.epi = epi;
		this.ename = ename;
		this.ecall = ecall;
		this.egrade = egrade;
		this.eredate = eredate;
	}
	
	public HrmDto(String epi, String ename, String ecall, String egrade) {
		super();
		this.epi = epi;
		this.ename = ename;
		this.ecall = ecall;
		this.egrade = egrade;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEpi() {
		return epi;
	}

	public void setEpi(String epi) {
		this.epi = epi;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcall() {
		return ecall;
	}

	public void setEcall(String ecall) {
		this.ecall = ecall;
	}

	public String getEgrade() {
		return egrade;
	}

	public void setEgrade(String egrade) {
		this.egrade = egrade;
	}

	public String getEredate() {
		return eredate;
	}

	public void setEredate(String eredate) {
		this.eredate = eredate;
	}

	@Override
	public String toString() {
		return "HrmDto [eno=" + eno + ", epi=" + epi + ", ename=" + ename + ", ecall=" + ecall + ", egrade=" + egrade
				+ ", eredate=" + eredate + "]";
	}
	
}
