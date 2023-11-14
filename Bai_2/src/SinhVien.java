import java.util.ArrayList;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private String ngaySinh;
	private int namNhapHoc;
	private double diemDauVao;
	private ArrayList<KetQuaHocTap> danhSachKetQua;

	public SinhVien(String maSinhVien, String hoTen, String ngaySinh, int namNhapHoc, double diemDauVao) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.namNhapHoc = namNhapHoc;
		this.diemDauVao = diemDauVao;
		this.danhSachKetQua = new ArrayList<>();

	}

	public String getMaSinhVien() {
		return this.maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getNamNhapHoc() {
		return this.namNhapHoc;
	}

	public void setNamNhapHoc(int namNhapHoc) {
		this.namNhapHoc = namNhapHoc;
	}

	public double getDiemDauVao() {
		return this.diemDauVao;
	}

	public void setDiemDauVao(double diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public ArrayList<KetQuaHocTap> getDanhSachKetQua() {
		return danhSachKetQua;
	}

	public void setDanhSachKetQua(ArrayList<KetQuaHocTap> danhSachKetQua) {
		this.danhSachKetQua = danhSachKetQua;
	}
	
	
    public void themKetQuaHocTap(KetQuaHocTap ketQua) {
        danhSachKetQua.add(ketQua);
    }
	
    public double diemTrungBinh() {
        double tongDiem = 0;
        for (KetQuaHocTap ketQua : danhSachKetQua) {
            tongDiem = tongDiem + ketQua.getDiemTrungBinh();
        }
        return tongDiem / danhSachKetQua.size();
    }
	
	

	// Kiem tra sinh vien co phai chinh quy khong?
	public boolean laSinhVienChinhQuy() {
		return this instanceof SinhVienChinhQuy;
	}

	// Hien thi diem trung binh qua cac ky
	public void hienThiDiemTrungBinh() {
		System.out.println("Thông tin điểm trung bình qua các kỳ của sinh viên " + this.maSinhVien + " - " + this.hoTen);
		for (KetQuaHocTap ketQua : danhSachKetQua) {
			System.out.println("Học kỳ: " + ketQua.getTenHocKy() + ", Điểm trung bình: " + ketQua.getDiemTrungBinh());
		}
		System.out.println("Trung bình tất cả các kỳ: " + this.diemTrungBinh());
	}

}
