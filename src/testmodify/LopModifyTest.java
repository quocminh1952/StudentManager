package testmodify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.LopModify;
import model.Lop;

public class LopModifyTest {

    private LopModify lopModify;

    @BeforeEach
    public void setUp() {
        lopModify = new LopModify();
    }

    @AfterEach
    public void tearDown() {
        lopModify = null;
    }

    @Test
    public void testAddLop() {
        Lop lop = new Lop("L01", "Lop A", "QTKD");
        boolean result = lopModify.addLop(lop);
        // Kiểm tra xem việc thêm lớp có thành công không
        assertTrue(result);
        // Kiểm tra xem lớp đã được thêm vào cơ sở dữ liệu không
        assertTrue(lopModify.checkMaLop("L01"));
    }

    @Test
    public void testUpdateLop() {
        Lop lop = new Lop("L01", "Lop B", "K02");
        boolean result = lopModify.updateLop(lop);
        // Kiểm tra xem việc cập nhật lớp có thành công không
        assertTrue(result);
        // Kiểm tra xem lớp đã được cập nhật trong cơ sở dữ liệu không
        assertEquals("Lop B ", lopModify.getTenLop("01"));
        assertEquals("QTKD", lopModify.getMaKhoa("01"));
    }

    @Test
    public void testDeleteLop() {
        boolean result = lopModify.deleteLop("L01");
        // Kiểm tra xem việc xóa lớp có thành công không
        assertTrue(result);
        // Kiểm tra xem lớp đã bị xóa khỏi cơ sở dữ liệu không
        assertFalse(lopModify.checkMaLop("L01"));
    }

    @Test
    public void testCheckMaLop() {
        boolean result = lopModify.checkMaLop("01");
        // Kiểm tra xem mã lớp đã tồn tại trong cơ sở dữ liệu hay chưa
        assertTrue(result);
    }

    @Test
    public void testGetListLop() {
        ArrayList<Lop> list = lopModify.getListLop();
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(3, list.size());
    }
}
