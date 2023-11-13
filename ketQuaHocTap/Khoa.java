package ketQuaHocTap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
        System.out.println("--------------");
    }

    public void diemDauVaoCaoNhat(){
        int max = this.danhSachSinhVien
                .stream()
                .map(sv -> sv.diemDauVao)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("Diem dau vao cao nhat của khoa " + this.tenKhoa + " " +max);
        System.out.print("Danh sach SV gom: ");
        this.danhSachSinhVien.stream().filter(sv -> sv.diemDauVao==max).forEach(s-> System.out.print(s.hoTen+","));
        System.out.println("\n");
    }
}
