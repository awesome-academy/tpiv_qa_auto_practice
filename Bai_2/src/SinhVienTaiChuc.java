
public class SinhVienTaiChuc extends SinhVien {
	private String noiLienKetDaoTao;
	
    public SinhVienTaiChuc(String maSinhVien, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao, String noiLienKetDaoTao) {
        super(maSinhVien, hoTen, ngaySinh, namVaoHoc, diemDauVao);
        this.noiLienKetDaoTao = noiLienKetDaoTao;
    }

	public String getNoiLienKetDaoTao() {
		return this.noiLienKetDaoTao;
	}

	public void setNoiLienKetDaoTao(String noiLienKetDaoTao) {
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}
    
    
    
    
    
    
    
    
    
    
    
}
