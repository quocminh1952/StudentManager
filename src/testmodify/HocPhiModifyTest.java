package testmodify;
import controller.HocPhiModify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.HocPhiModify;
import model.HocPhi;

public class HocPhiModifyTest {

    private HocPhiModify hocPhiModify;

    @BeforeEach
    public void setUp() {
        hocPhiModify = new HocPhiModify();
    }

    @AfterEach
    public void tearDown() {
        hocPhiModify = null;
    }

    @Test
    public void testGetListHP() {
        ArrayList<HocPhi> list = hocPhiModify.getListHP();
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(2, list.size());
        // Bạn cũng có thể kiểm tra các giá trị hoặc điều kiện cụ thể nếu cần thiết
    }

    @Test
    public void testGetListTK() {
        ArrayList<HocPhi> list = hocPhiModify.getListTK("chuoiTimKiem");
        // Kiểm tra xem danh sách trả về có khác null không
        assertNotNull(list);
        // Kiểm tra xem danh sách có số phần tử như mong đợi không
        assertEquals(0, list.size());
        // Bạn cũng có thể kiểm tra các giá trị hoặc điều kiện cụ thể nếu cần thiết
    }

    @Test
    public void testGetSoSV() {
        int soSV = hocPhiModify.getSoSV();
        // Kiểm tra số sinh viên dự kiến
        assertEquals(7, soSV);
    }

    @Test
    public void testGetSoSVDaDong() {
        int soSVDaDong = hocPhiModify.getSoSVDaDong();
        // Kiểm tra số sinh viên đã đóng học phí dự kiến
        assertEquals(2, soSVDaDong);
    }

    @Test
    public void testGetQuy() {
        int quy = hocPhiModify.getQuy();
        // Kiểm tra số tiền dự kiến trong quỹ
        assertEquals(1700000, quy);
    }

    // Thêm các bài kiểm tra khác nếu cần

}
