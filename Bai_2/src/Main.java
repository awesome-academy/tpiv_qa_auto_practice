
public class Main {
	public static void main(String[] args) {
		SinhVienChinhQuy sv1 = new SinhVienChinhQuy("001", "Anh Vu 1", "01/01/2011", 2022, 9);
		SinhVienTaiChuc sv2 = new SinhVienTaiChuc("002", "Anh Vu 2", "02/02/2012", 2021, 4, "Da Nang");
		SinhVienChinhQuy sv3 = new SinhVienChinhQuy("003", "Anh Vu 3", "03/03/2013", 2020, 7);
		System.out.println(sv1.getHoTen() + " là sinh viên chính quy? - " + sv1.laSinhVienChinhQuy());
		System.out.println(sv2.getHoTen() + " là sinh viên chính quy? - " + sv2.laSinhVienChinhQuy());
		
		System.out.println("-------");
		
		KetQuaHocTap ketQua1 = new KetQuaHocTap("Học kỳ 1", 7.5);
		KetQuaHocTap ketQua2 = new KetQuaHocTap("Học kỳ 2", 8.0);
		sv1.themKetQuaHocTap(ketQua1);
		sv1.themKetQuaHocTap(ketQua2);
		sv1.hienThiDiemTrungBinh();
		
		System.out.println("-------");
		
		Khoa khoa1 = new Khoa("CNTT");
		khoa1.themSinhVien(sv1);
		khoa1.themSinhVien(sv2);
		khoa1.themSinhVien(sv3);
		System.out.println("Tổng số sinh viên chính quy trong khoa " +khoa1.getTenKhoa() + ": " + khoa1.tongSoSinhVienChinhQuy());

		System.out.println("-------");
		
		SinhVien svDiemCaoNhat = khoa1.timSinhVienDiemCaoNhat();
		if (svDiemCaoNhat != null) {
		    System.out.println("Sinh viên có điểm đầu vào cao nhất: " + svDiemCaoNhat.getHoTen() + " - Điểm: " + svDiemCaoNhat.getDiemDauVao());
		}
		
	}
}
