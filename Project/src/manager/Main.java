package manager;

import java.util.List;
import java.util.Map;

public class Main {
	
	
	
    public static void main(String[] args) {
    	SinhVien student1 = new SinhVienChinhQuy("B1" , "Nguyen Van A", "06/06/1999", 2017 , 28, Map.of("toan", 5, "ly", 6, "hoa", 7) );
    	SinhVien student2 = new SinhVienChinhQuy("B2" , "Nguyen Van B", "06/06/1999", 2016 , 24, Map.of("toan", 6, "ly", 4, "hoa", 9) );
    	SinhVien student3 = new SinhVienTaiChuc("B3" , "Nguyen Van C", "06/06/1999", 2012 , 26, Map.of("toan", 7, "ly", 9, "hoa", 8), "Ho Chi Minh");
    	SinhVien student4 = new SinhVienTaiChuc("B4" , "Nguyen Van D", "06/06/1999", 2019 , 29, Map.of("toan", 8, "ly", 8, "hoa", 7), "Da Nang" );
    	
    	
    	
        Khoa quantrikinhdoanh = new Khoa("Quan tri kinh doanh", List.of(student1, student4));
        Khoa khoataichinh = new Khoa("Khoa tai chinh", List.of(student3, student2));
        
        
        student1.laSinhVienChinhQuy();
        student2.laSinhVienChinhQuy();
        student3.laSinhVienChinhQuy();
        student4.laSinhVienChinhQuy();
        
        student1.getAverageScore();
        student2.getAverageScore();
        student3.getAverageScore();
        student4.getAverageScore();
        
        quantrikinhdoanh.getSoLuongSinhVienChinhQuy();
        khoataichinh.getSoLuongSinhVienChinhQuy();
        
        quantrikinhdoanh.getMaxScore();
        khoataichinh.getMaxScore();
    }

}
