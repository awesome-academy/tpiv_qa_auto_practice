package ketQuaHocTap;

import java.util.Collection;
import java.util.Map;

public class SinhVien {
    int maSV;
    String hoTen;
    String ngayThangNamSinh;
    int namVaoHoc;
    int diemDauVao;
    Map<String, Integer> ketQuaHocTap;

    public SinhVien(int maSV, String hoTen, String ngayThangNamSinh, int namVaoHoc, int diemDauVao, Map ketQuaHocTap) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.namVaoHoc = namVaoHoc;
        this.diemDauVao = diemDauVao;
        this.ketQuaHocTap = ketQuaHocTap;
    }

    public boolean isSinhVienChinhQuy() {
        if (this.getClass().toString().indexOf("SinhVienChinhQuy") != -1) {
            return true;
        } else return false;
    }

    public void printLoaiSinhVien() {
        if (this.isSinhVienChinhQuy() == true) {
            System.out.println(this.hoTen + ": la sinh vien Chinh Quy");
        } else System.out.println(this.hoTen + ": khong la sinh vien Chinh Quy");
        System.out.println("--------------");
    }

    public void diemTBCacKy() {
        Integer sum = 0;
        Collection<Integer> listDiem = ketQuaHocTap.values();
        for (Integer diem : listDiem) {
            sum += diem;
        }
        System.out.println("Diem TB SV " + hoTen + ": " + sum / ketQuaHocTap.size());
        System.out.println("--------------");
    }
}
