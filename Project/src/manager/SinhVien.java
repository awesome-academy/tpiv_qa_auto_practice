package manager;

import java.sql.Date;
import java.util.Collection;
import java.util.Map;

public class SinhVien {
	
	
    String maSV;
    String hoTen;
    String ngaySinh;
    int namVaoHoc;
    double diemDauVao;
    Map<String, Integer> ketQuaHocTap;
    
    

    public SinhVien(String maSV, String hoTen, String ngaySinh, int namVaoHoc, int diemDauVao, Map<String, Integer> ketQuaHocTap) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.namVaoHoc = namVaoHoc;
        this.diemDauVao = diemDauVao;
        this.ketQuaHocTap = ketQuaHocTap;
    }


	public boolean laSinhVienChinhQuy() {
		// TODO Auto-generated method stub
        System.out.println("--------------");
        System.out.println("La Sinh Vien chinh Quy?");
        System.out.println("--------------");		
		return false;
	}
	
	
    public void getAverageScore() {
        Integer sum = 0;
        Collection<Integer> listDiem = ketQuaHocTap.values();
        for (Integer diem : listDiem) {
            sum += diem;
        }
        System.out.println("Diem TB SV " + hoTen + ": " + sum / ketQuaHocTap.size());
        System.out.println("--------------");
    }
    

	

	
}



