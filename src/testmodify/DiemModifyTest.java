package testmodify;
import controller.DiemModify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import model.Diem;

class DiemModifyTest {

    private DiemModify diemModify;
    
    @BeforeEach
    public void setUp() {
        diemModify = new DiemModify();
    }
    
    @AfterEach
    public void tearDown() {
        // Code dọn dẹp sau khi chạy mỗi test case (nếu cần)
    }
    
    @Test
    public void testAddDiem() {
        // Tạo một đối tượng Diem mới để thêm vào CSDL
        Diem diem = new Diem();
        diem.setMaSV("SV001");
        diem.setMaMH("MH001");
        diem.setDiemCC(8.5f);
        diem.setDiemGK(7.5f);
        diem.setDiemCK(9.0f);
        
        // Thêm đối tượng Diem vào CSDL
        boolean result = diemModify.addDiem(diem);
        
        // Kiểm tra kết quả trả về
        assertTrue(result);
        
        // Kiểm tra xem dữ liệu đã được thêm thành công hay chưa
        ArrayList<Diem> list = diemModify.getListDiem();
        boolean found = false;
        for (Diem d : list) {
            if (d.getMaSV().equals("SV001") && d.getMaMH().equals("MH001")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
        
        // Xóa dữ liệu đã thêm vào CSDL để tránh ảnh hưởng tới các test case khác
        diemModify.deleteDiem("SV001", "MH001");
    }
    
    @Test
    public void testUpdateDiem() {
        // Tạo một đối tượng Diem mới để cập nhật vào CSDL
        Diem diem = new Diem();
        diem.setMaSV("SV001");
        diem.setMaMH("MH001");
        diem.setDiemCC(8.5f);
        diem.setDiemGK(7.5f);
        diem.setDiemCK(9.0f);
        
        // Thêm đối tượng Diem vào CSDL trước khi cập nhật
        diemModify.addDiem(diem);
        
        // Cập nhật điểm cho đối tượng Diem
        diem.setDiemCC(9.5f);
        diem.setDiemGK(8.5f);
        diem.setDiemCK(9.0f);
        
        // Cập nhật đối tượng Diem vào CSDL
        boolean result = diemModify.updateDiem(diem);
        
        // Kiểm tra kết quả trả về
        assertTrue(result);
        
        // Kiểm tra xem dữ liệu đã được cập nhật thành công hay chưa
        Diem updatedDiem = diemModify.getListDiem().stream()
                .filter(d -> d.getMaSV().equals("SV001") && d.getMaMH().equals("MH001"))
                .findFirst()
                .orElse(null);
        assertNotNull(updatedDiem);
        assertEquals(9.5f, updatedDiem.getDiemCC(), 0.01);
        assertEquals(8.5f, updatedDiem.getDiemGK(), 0.01);
        assertEquals(9.0f, updatedDiem.getDiemCK(), 0.01);
        
        // Xóa dữ liệu đã thêm vào CSDL để tránh ảnh hưởng tới các test case khác
        diemModify.deleteDiem("SV001", "MH001");
    }
    
    @Test
    public void testDeleteDiem() {
        // Tạo một đối tượng Diem mới để xóa khỏi CSDL
        Diem diem = new Diem();
        diem.setMaSV("SV001");
        diem.setMaMH("MH001");
        diem.setDiemCC(8.5f);
        diem.setDiemGK(7.5f);
        diem.setDiemCK(9.0f);
        
        // Thêm đối tượng Diem vào CSDL trước khi xóa
        diemModify.addDiem(diem);
        
        // Xóa đối tượng Diem khỏi CSDL
        boolean result = diemModify.deleteDiem("SV001", "MH001");
        
        // Kiểm tra kết quả trả về
        assertTrue(result);
        
        // Kiểm tra xem dữ liệu đã được xóa thành công hay chưa
        ArrayList<Diem> list = diemModify.getListDiem();
        boolean found = false;
        for (Diem d : list) {
            if (d.getMaSV().equals("SV001") && d.getMaMH().equals("MH001")) {
                found = true;
                break;
            }
        }
        assertFalse(found);
    }
    
    @Test
    public void testCheckID() {
        // Tạo một đối tượng Diem mới để kiểm tra
        Diem diem = new Diem();
        diem.setMaSV("SV001");
        diem.setMaMH("MH001");
        diem.setDiemCC(8.5f);
        diem.setDiemGK(7.5f);
        diem.setDiemCK(9.0f);
        
        // Thêm đối tượng Diem vào CSDL trước khi kiểm tra
        diemModify.addDiem(diem);
        
        // Kiểm tra ID của đối tượng Diem
        boolean result = diemModify.checkID("SV001", "MH001");
        
        // Kiểm tra kết quả trả về
        assertTrue(result);
        
        // Kiểm tra ID không tồn tại trong CSDL
        result = diemModify.checkID("SV002", "MH002");
        
        // Kiểm tra kết quả trả về
        assertFalse(result);
        
        // Xóa dữ liệu đã thêm vào CSDL để tránh ảnh hưởng tới các test case khác
        diemModify.deleteDiem("SV001", "MH001");
    }

}
