import java.util.ArrayList;

public class Khoa {
	private String tenKhoa;
	private ArrayList<SinhVien> danhSachSinhVien;
	
	public Khoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
		this.danhSachSinhVien = new ArrayList<>(); 
	}
	
	public String getTenKhoa() {
		return this.tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public ArrayList<SinhVien> getDanhSachSinhVien() {
		return this.danhSachSinhVien;
	}

	public void setDanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}
	
    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    public int tongSoSinhVien() {
        return danhSachSinhVien.size();
    }

	// Xac dinh tong so sinh vien chinh quy
	public int tongSoSinhVienChinhQuy() {
	    int count = 0;
	    for (SinhVien sv : danhSachSinhVien) {
	        if (sv instanceof SinhVienChinhQuy) {
	            count++;
	        }
	    }
	    return count;
	}

	// Tim sinh vien co diem dau vao cao nhat
	public SinhVien timSinhVienDiemCaoNhat() {
	    SinhVien sinhVienDiemCaoNhat = null;
	    double diemCaoNhat = Double.MIN_VALUE;

	    for (SinhVien sv : danhSachSinhVien) {
	        if (sv.getDiemDauVao() > diemCaoNhat) {
	            diemCaoNhat = sv.getDiemDauVao();
	            sinhVienDiemCaoNhat = sv;
	        }
	    }
	    return sinhVienDiemCaoNhat;
	}

	
}
