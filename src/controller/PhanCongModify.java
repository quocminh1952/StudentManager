package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.PhanCong;

public class PhanCongModify {

    private Connection conn;

    public PhanCongModify() {
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
    public boolean addPC(PhanCong p) {
        String add = "insert into tblphancong values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, p.getMaGV());
            ps.setString(2, p.getMaMH());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //sua
    public boolean updatePC(PhanCong p) {
        String update = "update tblphancong set MaMH = ? where MaGV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, p.getMaMH());
            ps.setString(2, p.getMaGV());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //xoa
    public boolean deletePC(String magv, String mamh) {

        String delete = "delete from tblphancong where MaGV = ? and MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, magv);
            ps.setString(2, mamh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkPC(String mamh) {

        String delete = "select * from tblphancong where MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, mamh);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<PhanCong> getListTK(String s) {
        ArrayList<PhanCong> list = new ArrayList<>();
        String hienthi = "select * from tblphancong where MaGV like ? or MaMH like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, "%" + s + "%");
            ps.setString(2, "%" + s + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhanCong p = new PhanCong();
                p.setMaGV(rs.getString("MaGV"));
                p.setMaMH(rs.getString("MaMH"));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<PhanCong> getListPC() {
        ArrayList<PhanCong> list = new ArrayList<>();
        String hienthi = "select * from tblphancong";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhanCong p = new PhanCong();
                p.setMaGV(rs.getString("MaGV"));
                p.setMaMH(rs.getString("MaMH"));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
