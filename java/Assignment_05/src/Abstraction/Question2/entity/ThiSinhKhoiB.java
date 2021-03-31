package Abstraction.Question2.entity;

public class ThiSinhKhoiB extends ThiSinh{
	private String monToan;
	private String monHoa;
	private String monSinh;
	String khoi="B";
	
	public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String monToan, String monHoa,
			String monSinh, String khoi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		this.monToan = monToan;
		this.monHoa = monHoa;
		this.monSinh = monSinh;
		this.khoi = khoi;
	}

	public String getMonToan() {
		return monToan;
	}

	public void setMonToan(String monToan) {
		this.monToan = monToan;
	}

	public String getMonHoa() {
		return monHoa;
	}

	public void setMonHoa(String monHoa) {
		this.monHoa = monHoa;
	}

	public String getMonSinh() {
		return monSinh;
	}

	public void setMonSinh(String monSinh) {
		this.monSinh = monSinh;
	}

	public String getKhoi() {
		return khoi;
	}

	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}
	
	
}
