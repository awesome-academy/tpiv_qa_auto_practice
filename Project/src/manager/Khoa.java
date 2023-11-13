package manager;

import java.util.List;

public class Khoa {
    String tenKhoa;
    List<SinhVien> danhSachSinhVien;

    public Khoa(String tenKhoa, List<SinhVien> danhSachSinhVien) {
        this.tenKhoa = tenKhoa;
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public void getSoLuongSinhVienChinhQuy() {
        int count = 0;
        for (SinhVien sv : danhSachSinhVien) {
            if (sv instanceof SinhVienChinhQuy) {
                count++;
            }
        }
        System.out.println("--------------");
        System.out.println("So luong Sinh vien chinh Quy " + this.tenKhoa + " " + count);
        System.out.println("--------------");
    }
    
    
    public SinhVien getMaxScore() {
    	SinhVien topStudent = null;
        for (SinhVien sv : danhSachSinhVien) {
            if (topStudent == null || sv.diemDauVao > topStudent.diemDauVao) {
                topStudent = sv;
            }
        }
        return topStudent;
    }
    
    
}

