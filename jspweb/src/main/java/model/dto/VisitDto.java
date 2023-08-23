package model.dto;

public class VisitDto {
	
	private  int vno; 		
    private String vname; 		
    private String vpw; 		
    private String vtext; 		
    private String vdate;
    
    public VisitDto() {
		// TODO Auto-generated constructor stub
	}

	public VisitDto(int vno, String vname, String vpw, String vtext, String vdate) {
		super();
		this.vno = vno;
		this.vname = vname;
		this.vpw = vpw;
		this.vtext = vtext;
		this.vdate = vdate;
	}

	
	
	// 추가된 부분
	public VisitDto(String vname, String vpw, String vtext) {
		super();
		this.vname = vname;
		this.vpw = vpw;
		this.vtext = vtext;
	}

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVpw() {
		return vpw;
	}

	public void setVpw(String vpw) {
		this.vpw = vpw;
	}

	public String getVtext() {
		return vtext;
	}

	public void setVtext(String vtext) {
		this.vtext = vtext;
	}

	public String getVdate() {
		return vdate;
	}

	public void setVdate(String vdate) {
		this.vdate = vdate;
	}

	@Override
	public String toString() {
		return "VisitDto [vno=" + vno + ", vname=" + vname + ", vpw=" + vpw + ", vtext=" + vtext + ", vdate=" + vdate
				+ "]";
	}
    
	
	
	
}
