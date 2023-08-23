package accountbook.model.dto;

public class AccountbookDto {
	private int ano;
	private String atext;
	private String apay;
	private String adate;

	public AccountbookDto() {
		// TODO Auto-generated constructor stub
	}

	public AccountbookDto(int ano, String atext, String apay, String adate) {
		super();
		this.ano = ano;
		this.atext = atext;
		this.apay = apay;
		this.adate = adate;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAtext() {
		return atext;
	}

	public void setAtext(String atext) {
		this.atext = atext;
	}

	public String getApay() {
		return apay;
	}

	public void setApay(String apay) {
		this.apay = apay;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	@Override
	public String toString() {
		return "AccountbookDto [ano=" + ano + ", atext=" + atext + ", apay=" + apay + ", adate=" + adate + "]";
	}
	
	
	
	
}// class e
