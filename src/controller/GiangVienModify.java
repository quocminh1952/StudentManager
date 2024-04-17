package controller;

import model.GiangVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GiangVienModify {

    private Connection conn;

    public GiangVienModify() {
        try {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/quanlylophoc";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // them
    public boolean addGV(GiangVien gv) {
        String add = "insert into tblgiangvien values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, gv.getMaGV());
            ps.setString(2, gv.getTenGV());
            ps.setString(3, gv.getMaKhoa());
            if (gv.getGioiTinh().equalsIgnoreCase("Nam")) {
                ps.setInt(4, 1);
            } else {
                ps.setInt(4, 0);
            }
            ps.setString(5, gv.getNgaySinh());
            ps.setString(6, gv.getSDT());
            ps.setString(7, gv.getEmail());
            ps.setString(8, gv.getDiaChi());
            ps.setString(9, gv.getHinh());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //sua
    public boolean updateGV(GiangVien gv) {
        String update = "update tblgiangvien set TenGV = ?, MaKhoa = ?, "
                + "GioiTinh = ?, NgaySinh = ?, SDT = ?, Email = ?, DiaChi = ?, Hinh = ?"
                + " where MaGV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, gv.getTenGV());
            ps.setString(2, gv.getMaKhoa());
            if (gv.getGioiTinh().equalsIgnoreCase("Nam")) {
                ps.setInt(3, 1);
            } else {
                ps.setInt(3, 0);
            }

            ps.setString(4, gv.getNgaySinh());
            ps.setString(5, gv.getSDT());
            ps.setString(6, gv.getEmail());
            ps.setString(7, gv.getDiaChi());
            ps.setString(8, gv.getHinh());
            ps.setString(9, gv.getMaGV());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //xoa
    public boolean deleteGV(String magv) {

        String delete = "delete from tblgiangvien where MaGV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, magv);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // kiem tra trung ma gv
    public boolean checkID(String id) {
        String checkID = "select MaGV from tblgiangvien where MaGV =?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkID);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkSDT(String s) {
        String checkSDT = "select * from tblgiangvien where SDT = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkSDT);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean checkEmail(String s) {
        String check = "select * from tblgiangvien where Email = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getName(String s) {
        String tenGV = "";
        String get_TenGV = "select * from tblgiangvien gv, tbltaikhoan tk where username = ? and gv.Email = tk.Email";
        try {
            PreparedStatement ps = conn.prepareStatement(get_TenGV);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenGV = rs.getString("TenGV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenGV;
    }

    public String getTenGV(String s) {
        String tenGV = "";
        String get_TenGV = "select * from tblgiangvien where MaGV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get_TenGV);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenGV = rs.getString("TenGV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenGV;
    }

    public ArrayList<GiangVien> getListGV() {
        ArrayList<GiangVien> list = new ArrayList<>();
        String hienthi = "select *, case when GioiTinh = 0 then N'Nữ'"
                + "else N'Nam'"
                + "end view_GioiTinh from tblgiangvien";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setMaGV(rs.getString("MaGV"));
                gv.setTenGV(rs.getString("TenGV"));
                gv.setMaKhoa(rs.getString("MaKhoa"));
                gv.setGioiTinh(rs.getString("view_GioiTinh"));
                gv.setNgaySinh(rs.getString("NgaySinh"));
                gv.setSDT(rs.getString("SDT"));
                gv.setEmail(rs.getString("Email"));
                gv.setDiaChi(rs.getString("DiaChi"));
                gv.setHinh(rs.getString("Hinh"));
                list.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<GiangVien> getListTK(String s) {
        ArrayList<GiangVien> list = new ArrayList<>();
        String hienthi = "select *, case when GioiTinh = 0 then N'Nữ'"
                + "else N'Nam'"
                + "end view_GioiTinh from tblgiangvien where MaGV like ? or TenGV like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, "%" + s + "%");
            ps.setString(2, "%" + s + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setMaGV(rs.getString("MaGV"));
                gv.setTenGV(rs.getString("TenGV"));
                gv.setMaKhoa(rs.getString("MaKhoa"));
                gv.setGioiTinh(rs.getString("view_GioiTinh"));
                gv.setNgaySinh(rs.getString("NgaySinh"));
                gv.setSDT(rs.getString("SDT"));
                gv.setEmail(rs.getString("Email"));
                gv.setDiaChi(rs.getString("DiaChi"));
                gv.setHinh(rs.getString("Hinh"));
                list.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int demGV(String makhoa) {
        int sogv = 0;
        String dem = "select count(MaGV) SoGV from tblgiangvien where MaKhoa = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(dem);
            ps.setString(1, makhoa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sogv = rs.getInt("SoGV");
                return sogv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sogv;
    }

    public static void main(String[] args) {
        new GiangVienModify();
    }
}
