package ketQuaHocTap;

import java.util.HashMap;
import java.util.Map;

public class SinhVienTaiChuc extends SinhVien{
    String lienKetDaoTao;
    public SinhVienTaiChuc(int maSV, String hoTen, String ngayThangNamSinh, int namVaoHoc, int diemDauVao, Map ketQuaHocTap, String lienKetDaoTao) {
        super(maSV, hoTen, ngayThangNamSinh, namVaoHoc, diemDauVao, ketQuaHocTap);
        this.lienKetDaoTao = lienKetDaoTao;
    }
}
