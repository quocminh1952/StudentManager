package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TaiKhoan;

public class TaiKhoanModify {

    private Connection conn;

    public TaiKhoanModify() {
        try {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/quanlylophoc";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addTK(TaiKhoan tk) {
        String add = "insert into tbltaikhoan values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, tk.getTenTK());
            ps.setString(2, tk.getMK());
            ps.setString(3, tk.getEmail());
            ps.setInt(4, tk.getPhanQuyen());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //sua
    public boolean updateTK(TaiKhoan tk) {
        String update = "update tbltaikhoan set password = ?, Email = ?, PhanQuyen = ?"
                + " where username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, tk.getMK());
            ps.setString(2, tk.getEmail());
            ps.setInt(3, tk.getPhanQuyen());
            ps.setString(4, tk.getTenTK());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //xoa
    public boolean deleteTK(String user) {

        String delete = "delete from tbltaikhoan where username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, user);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // kiem tra trung ma d
    public boolean checkTK(String user) {
        String checkID = "select * from tbltaikhoan where username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkID);
            ps.setString(1, user);
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

    public boolean checkEmail(String s) {
        String checkID = "select * from tbltaikhoan where Email = ?";
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

    public boolean checkAcc(String tk, String mk) {
        String checkID = "select * from tbltaikhoan where username = ? and password = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkID);
            ps.setString(1, tk);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean Login(TaiKhoan tk) {
        try {
            String check = "select * from tbltaikhoan where username = ? and password = ? and PhanQuyen = ?";
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setString(1, tk.getTenTK());
            ps.setString(2, tk.getMK());
            ps.setInt(3, tk.getPhanQuyen());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean doiMK(String tk, String mk) {
        String update = "update tbltaikhoan set password = ? where username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, mk);
            ps.setString(2, tk);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Integer getPQ(String s) {
        Integer pq = 0;
        try {
            String get = "select * from tbltaikhoan where username  = ?";
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pq = rs.getInt("PhanQuyen");
                return pq;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pq;
    }

    public ArrayList<TaiKhoan> getListTK() {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String hienthi = "select * from tbltaikhoan";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setTenTK(rs.getString("username"));
                tk.setMK(rs.getString("password"));
                tk.setEmail(rs.getString("Email"));
                tk.setPhanQuyen(rs.getInt("PhanQuyen"));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
