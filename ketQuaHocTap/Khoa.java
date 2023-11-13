package ketQuaHocTap;

import java.util.List;

public class Khoa {
    String tenKhoa;
    List<SinhVien> danhSachSinhVien;

    public Khoa(String tenKhoa, List<SinhVien> danhSachSinhVien) {
        this.tenKhoa = tenKhoa;
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public void soLuongSVChinhQuy() {
        int soLuongSVChinhQuy = 0;
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.isSinhVienChinhQuy() == true) {
                soLuongSVChinhQuy += 1;
            }
        }
        System.out.println("Số lượng sinh viên chính quy của khoa " + this.tenKhoa + " " + soLuongSVChinhQuy);
    }
}
