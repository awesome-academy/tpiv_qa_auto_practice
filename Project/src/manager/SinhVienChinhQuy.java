package manager;

import java.sql.Date;
import java.util.Map;

public class SinhVienChinhQuy extends SinhVien {
    public SinhVienChinhQuy(String maSV, String hoTen, String ngaySinh, int namVaoHoc, int diemDauVao,
    		Map<String, Integer> ketQuaHocTap) {
		super(maSV, hoTen, ngaySinh, namVaoHoc, diemDauVao, ketQuaHocTap);
		// TODO Auto-generated constructor stub
		
	}

	@Override
    public boolean laSinhVienChinhQuy() {
        return true;
    }
}