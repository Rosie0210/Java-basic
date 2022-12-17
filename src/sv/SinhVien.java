package sv;

public class SinhVien {
	private String hoTen;
	private Integer tuoi;
	private Double diemToan;
	private Double diemLy;
	private Double diemHoa;

	public SinhVien() {
		super();
	}

	public SinhVien(String hoTen, Integer tuoi, Double diemToan, Double diemLy, Double diemHoa) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Integer getTuoi() {
		return tuoi;
	}

	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}

	public Double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(Double diemToan) {
		this.diemToan = diemToan;
	}

	public Double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(Double diemLy) {
		this.diemLy = diemLy;
	}

	public Double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(Double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public Double diemTB() {
		double tb = (getDiemHoa() + getDiemToan() + getDiemLy()) / 3;
		return (double) Math.round((tb * 10)/10);
	}
	
	public Double tongDiem() {
		return (getDiemHoa() + getDiemToan() + getDiemLy());
		
	}
	
	public String CNTT() {
		if (tongDiem() >= 26) {
			return "Y";
		}else {
			return "N";
		}
	}
	
	public String DTVT() {
		if (tongDiem() >= 20) {
			return "Y";
		}else {
			return "N";
		}
	}
	
	public String DT() {
		if (tongDiem() >= 18.5) {
			return "Y";
		}else {
			return "N";
		}
	}
	

	public void thongTinSinhVien() {
		System.out.printf("%-15s %-15s %-15s %5s %10s %10s \n",
				getHoTen(),tongDiem().toString() ,diemTB().toString(),CNTT(),DTVT(),DT());
	}
	
	
}
