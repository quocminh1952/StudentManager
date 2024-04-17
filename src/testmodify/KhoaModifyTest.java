package testmodify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.KhoaModify;
import model.Khoa;

public class KhoaModifyTest {

    private KhoaModify khoaModify;

    @BeforeEach
    public void setUp() {
        khoaModify = new KhoaModify();
    }

    @AfterEach
    public void tearDown() {
        khoaModify = null;
    }

    @Test
    public void testAddKhoa() {
        Khoa khoa = new Khoa("K01", "Khoa A");
        boolean result = khoaModify.addKhoa(khoa);
        // Kiểm tra xem việc thêm khoa có thành công không
        assertTrue(result);
        // Kiểm tra xem khoa đã được thêm vào cơ sở dữ liệu không
        assertTrue(khoaModify.checkMaKhoa("K01"));
    }

    @Test
    public void testUpdateKhoa() {
        Khoa khoa = new Khoa("K01", "Khoa B");
        boolean result = khoaModify.updateKhoa(khoa);
        // Kiểm tra xem việc cập nhật khoa có thành công không
        assertTrue(result);
        // Kiểm tra xem khoa đã được cập nhật trong cơ sở dữ liệu không
        assertEquals("Khoa B", khoaModify.getTenKhoa("K01"));
    }

    @Test
    public void testDeleteKhoa() {
        boolean result = khoaModify.deleteKhoa("K01");
        // Kiểm tra xem việc xóa khoa có thành công không
        assertTrue(result);
        // Kiểm tra xem khoa đã bị xóa khỏi cơ sở dữ liệu không
        assertFalse(khoaModify.checkMaKhoa("K01"));
    }

    @Test
    public void testCheckMaKhoa() {
        boolean result = khoaModify.checkMaKhoa("K01");
        // Kiểm tra xem mã khoa đã tồn tại trong cơ sở dữ liệu hay chưa
        assertTrue(result);
    }

    @Test
    public void testGetTenKhoa() {
        String tenKhoa = khoaModify.getTenKhoa("K01");
        // Kiểm tra xem tên khoa có khớp với dự kiến không
        assertEquals("Khoa A", tenKhoa);
    }

    @Test
    public void testGetMaKhoa() {
        String maKhoa = khoaModify.getMaKhoa("Quản trị kinh doanh");
        // Kiểm tra xem mã khoa có khớp với dự kiến không
        assertEquals("QTKD", maKhoa);
    }

    @Test
    public void testGetListKhoa() {
        ArrayList<Khoa> list = khoaModify.getListKhoa();
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(3, list.size());
    }
}

