package ketQuaHocTap;

import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVienChinhQuy(1, "trang", "17/11/1999", 2000, 15, Map.of("k1", 9, "k2", 7, "k3", 5));
        SinhVien sv2 = new SinhVienChinhQuy(2, "minh", "5/1/1999", 1999, 15, Map.of("k1", 7, "k2", 10, "k3", 2));
        SinhVien sv3 = new SinhVienTaiChuc(3, "an", "5/10/1999", 1899, 25, Map.of("k1", 8, "k2", 7, "k3", 3, "k4", 10), "Dong Nai");

        Khoa khoaTinHoc = new Khoa("Tin Hoc", List.of(sv1, sv2));
        Khoa khoaHoaHoc = new Khoa("Hoa Hoc", List.of(sv3));

        sv1.printLoaiSinhVien();
        sv2.printLoaiSinhVien();
        sv3.printLoaiSinhVien();

        sv1.diemTBCacKy();
        sv2.diemTBCacKy();
        sv3.diemTBCacKy();

        khoaTinHoc.soLuongSVChinhQuy();
        khoaHoaHoc.soLuongSVChinhQuy();

        khoaTinHoc.diemDauVaoCaoNhat();
        khoaHoaHoc.diemDauVaoCaoNhat();
    }
}
