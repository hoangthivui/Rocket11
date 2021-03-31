package Abstraction.Question2.entity;

public class ThiSinhKhoiC extends ThiSinh{
	private String monVan;
	private String monSu;
	private String monDia;
	String khoi="C";
	
	public ThiSinhKhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String monVan, String monSu,
			String monDia, String khoi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		this.monVan = monVan;
		this.monSu = monSu;
		this.monDia = monDia;
		this.khoi = khoi;
	}

	public String getMonVan() {
		return monVan;
	}

	public void setMonVan(String monVan) {
		this.monVan = monVan;
	}

	public String getMonSu() {
		return monSu;
	}

	public void setMonSu(String monSu) {
		this.monSu = monSu;
	}

	public String getMonDia() {
		return monDia;
	}

	public void setMonDia(String monDia) {
		this.monDia = monDia;
	}

	public String getKhoi() {
		return khoi;
	}

	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}
	
	
}
