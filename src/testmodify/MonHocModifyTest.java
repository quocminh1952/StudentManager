package testmodify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.MonHocModify;
import model.MonHoc;

public class MonHocModifyTest {

    private MonHocModify monHocModify;

    @BeforeEach
    public void setUp() {
        monHocModify = new MonHocModify();
    }

    @AfterEach
    public void tearDown() {
        monHocModify = null;
    }

    @Test
    public void testAddMH() {
        MonHoc monHoc = new MonHoc("M01", "Toan", "K01", 3, 100);
        boolean result = monHocModify.addMH(monHoc);
        // Kiểm tra xem việc thêm môn học có thành công không
        assertTrue(result);
        // Kiểm tra xem môn học đã được thêm vào cơ sở dữ liệu không
        assertTrue(monHocModify.checkMaMH("M01"));
    }

    @Test
    public void testUpdateMH() {
        MonHoc monHoc = new MonHoc("M01", "Ly", "K02", 4, 120);
        boolean result = monHocModify.updateMH(monHoc);
        // Kiểm tra xem việc cập nhật môn học có thành công không
        assertTrue(result);
        // Kiểm tra xem môn học đã được cập nhật trong cơ sở dữ liệu không
        assertEquals("Ly", monHocModify.getTenMH("M01"));
        assertEquals("K02", monHocModify.getMaKhoa("M01"));
        //assertEquals(4, monHocModify.getSoTC("M01"));
        assertEquals(120, monHocModify.getHocPhi("M01"));
    }

    @Test
    public void testDeleteMH() {
        boolean result = monHocModify.deleteMH("M01");
        // Kiểm tra xem việc xóa môn học có thành công không
        assertTrue(result);
        // Kiểm tra xem môn học đã bị xóa khỏi cơ sở dữ liệu không
        assertFalse(monHocModify.checkMaMH("M01"));
    }

    @Test
    public void testCheckMaMH() {
        boolean result = monHocModify.checkMaMH("M01");
        // Kiểm tra xem mã môn học đã tồn tại trong cơ sở dữ liệu hay chưa
        assertTrue(result);
    }

    @Test
    public void testGetListMH() {
        ArrayList<MonHoc> list = monHocModify.getListMH();
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(5, list.size());
    }

    @Test
    public void testGetListBB() {
        ArrayList<MonHoc> list = monHocModify.getListBB("K01");
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(5, list.size());
    }

    @Test
    public void testGetListTC() {
        ArrayList<MonHoc> list = monHocModify.getListTC("K01");
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(5, list.size());
    }

    @Test
    public void testGetListTK() {
        ArrayList<MonHoc> list = monHocModify.getListTK("Toan");
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(5, list.size());
    }
}