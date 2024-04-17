package controller;

import model.SinhVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TaiKhoan;

public class SinhVienModify {

    private Connection conn;
    private TaiKhoanModify tkModify = new TaiKhoanModify();

    public SinhVienModify() {
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
    public boolean addSV(SinhVien s) {

        String add = "insert into tblsinhvien values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, s.getMaSV());
            ps.setString(2, s.getTenSV());
            ps.setString(3, s.getMaLop());
            if (s.getGioiTinh().equalsIgnoreCase("Nam")) {
                ps.setInt(4, 1);
            } else {
                ps.setInt(4, 0);
            }

            ps.setString(5, s.getNgaySinh());
            ps.setString(6, s.getSDT());
            ps.setString(7, s.getEmail());
            ps.setString(8, s.getDiaChi());
            ps.setString(9, s.getHinh());
            ps.executeUpdate();
            //
            TaiKhoan tk = new TaiKhoan();
            tk.setTenTK(s.getEmail());
            tk.setMK("1");
            tk.setEmail(s.getEmail());
            tk.setPhanQuyen(0);
            tkModify.addTK(tk);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //sua
    public boolean updateSV(SinhVien s) {
        String update = "update tblsinhvien set TenSV = ?, MaLop = ?, "
                + "GioiTinh = ?, NgaySinh = ?, SDT = ?, Email = ?, DiaChi = ?, Hinh = ?"
                + " where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, s.getTenSV());
            ps.setString(2, s.getMaLop());
            if (s.getGioiTinh().equalsIgnoreCase("Nam")) {
                ps.setInt(3, 1);
            } else {
                ps.setInt(3, 0);
            }

            ps.setString(4, s.getNgaySinh());
            ps.setString(5, s.getSDT());
            ps.setString(6, s.getEmail());
            ps.setString(7, s.getDiaChi());
            ps.setString(8, s.getHinh());
            ps.setString(9, s.getMaSV());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //xoa
    public boolean deletedSV(String msv) {

        String delete = "delete from tblsinhvien where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, msv);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // kiem tra trung ma sv
    public boolean checkID(String id) {
        String checkID = "select MaSV from tblsinhvien where MaSV =?";
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
        String checkSDT = "select * from tblsinhvien where SDT = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkSDT);
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

    public boolean checkEmail(String s) {
        String checkID = "select * from tblsinhvien where Email = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkID);
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
        String tenSV = "";
        String get_TenSV = "select * from tblsinhvien sv, tbltaikhoan tk where username = ? and sv.Email = tk.Email";
        try {
            PreparedStatement ps = conn.prepareStatement(get_TenSV);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenSV = rs.getString("TenSV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenSV;
    }

    // Tìm kiếm sv = ID
    public String getNameByMaSV(String s) {
        String tenSV = "";
        String get_TenSV = "select * from tblsinhvien where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get_TenSV);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenSV = rs.getString("TenSV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenSV;
    }

    public String getMaSV(String s) {
        String maSV = "";
        String get_MaSV = "select * from tblsinhvien sv, tbltaikhoan tk where username = ? and sv.Email = tk.Email";
        try {
            PreparedStatement ps = conn.prepareStatement(get_MaSV);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maSV = rs.getString("MaSV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maSV;
    }

    public String getKhoa(String s) {
        String k = "";
        String get = "select * from tblsinhvien sv, tbltaikhoan tk, tbllop l "
                + "where username = ? and sv.Email = tk.Email "
                + "and sv.MaLop = l.MaLop";
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                k = rs.getString("MaKhoa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public ArrayList<SinhVien> getListTK(String s) {
        ArrayList<SinhVien> list = new ArrayList<>();
        String hienthi = "select *, case when GioiTinh = 0 then N'Nữ'"
                + "else N'Nam'"
                + "end view_GioiTinh from tblsinhvien where MaSV like ? or TenSV like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, "%" + s + "%");
            ps.setString(2, "%" + s + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setTenSV(rs.getString("TenSV"));
                sv.setMaLop(rs.getString("MaLop"));
                sv.setGioiTinh(rs.getString("view_GioiTinh"));
                sv.setNgaySinh(rs.getString("NgaySinh"));
                sv.setSDT(rs.getString("SDT"));
                sv.setEmail(rs.getString("Email"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setHinh(rs.getString("Hinh"));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<SinhVien> getListSV() {
        ArrayList<SinhVien> list = new ArrayList<>();
        String hienthi = "select *, case when GioiTinh = 0 then N'Nữ'"
                + "else N'Nam'"
                + "end view_GioiTinh from tblsinhvien";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setTenSV(rs.getString("TenSV"));
                sv.setMaLop(rs.getString("MaLop"));
                sv.setGioiTinh(rs.getString("view_GioiTinh"));
                sv.setNgaySinh(rs.getString("NgaySinh"));
                sv.setSDT(rs.getString("SDT"));
                sv.setEmail(rs.getString("Email"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setHinh(rs.getString("Hinh"));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int demSV(String malop) {
        int sosv = 0;
        String dem = "select count(MaSV) SoSV from tblsinhvien where MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(dem);
            ps.setString(1, malop);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sosv = rs.getInt("SoSV");
                return sosv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sosv;
    }

    public static void main(String[] args) {
        new SinhVienModify();
    }
}
