package testmodify;
import controller.GiangVienModify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import model.GiangVien;

class GiangVienModifyTest {

	private GiangVienModify giangVienModify;

	@BeforeEach
    public void setUp() {
        giangVienModify = new GiangVienModify();
    }

    @AfterEach
    public void tearDown() {
        // Xóa các dữ liệu kiểm thử được tạo trong cơ sở dữ liệu
    }

    @Test
    public void testAddGV() {
        // Tạo một đối tượng GiangVien với dữ liệu kiểm thử
        GiangVien giangVien = new GiangVien();
        giangVien.setMaGV("GV001");
        giangVien.setTenGV("John Doe");
        giangVien.setMaKhoa("QTKD");
        giangVien.setGioiTinh("Nam");
        giangVien.setNgaySinh("1990-01-01");
        giangVien.setSDT("1234567890");
        giangVien.setEmail("john.doe@example.com");
        giangVien.setDiaChi("123 Đường, Thành phố");
        giangVien.setHinh("image.jpg");

        // Thêm đối tượng GiangVien vào cơ sở dữ liệu
        boolean result = giangVienModify.addGV(giangVien);

        // Kiểm tra xem việc thêm có thành công hay không
        assertTrue(result);
    }

    @Test
    public void testUpdateGV() {
        // Tạo một đối tượng GiangVien với dữ liệu cập nhật
        GiangVien giangVien = new GiangVien();
        giangVien.setMaGV("GV001");
        giangVien.setTenGV("Jane Smith");
        giangVien.setMaKhoa("K001");
        giangVien.setGioiTinh("Nữ");
        giangVien.setNgaySinh("1995-05-05");
        giangVien.setSDT("9876543210");
        giangVien.setEmail("jane.smith@example.com");
        giangVien.setDiaChi("456 Đại lộ, Thành phố");
        giangVien.setHinh("new_image.jpg");

        // Cập nhật đối tượng GiangVien trong cơ sở dữ liệu
        boolean result = giangVienModify.updateGV(giangVien);

        // Kiểm tra xem việc cập nhật có thành công hay không
        assertTrue(result);
    }

    @Test
    public void testDeleteGV() {
        // Xóa một đối tượng GiangVien khỏi cơ sở dữ liệu
        boolean result = giangVienModify.deleteGV("GV001");

        // Kiểm tra xem việc xóa có thành công hay không
        assertTrue(result);
    }

    @Test
    public void testGetListGV() {
        // Lấy danh sách các đối tượng GiangVien từ cơ sở dữ liệu
        ArrayList<GiangVien> list = giangVienModify.getListGV();

        // Kiểm tra xem danh sách không null
        assertNotNull(list);

        // Kiểm tra xem danh sách chứa ít nhất một phần tử
        assertTrue(list.size() > 0);
    }

}
