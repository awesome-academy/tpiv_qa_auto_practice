package manager;

import java.sql.Date;
import java.util.Map;

public class SinhVienTaiChuc extends SinhVien {
	String lienKetDaoTao;
    public SinhVienTaiChuc(String maSV, String hoTen, String ngaySinh, int namVaoHoc, int diemDauVao,
			Map ketQuaHocTap, String lienKetDaoTao) {
		super(maSV, hoTen, ngaySinh, namVaoHoc, diemDauVao, ketQuaHocTap);
		this.lienKetDaoTao = lienKetDaoTao;
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean laSinhVienChinhQuy() {
        return false;
    }
}