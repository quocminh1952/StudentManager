package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TinChi;

public class TinChiModify {

    private Connection conn;

    public TinChiModify() {
        try {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/quanlylophoc";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addTinChi(TinChi tc) {
        String add = "insert into tbltinchi values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, tc.getMaSV());
            ps.setString(2, tc.getMaMH());
            ps.setInt(3, tc.getSoTC());
            ps.setInt(4, tc.getHocPhi());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean xoaTinChi(String masv, String mamh) {
        String add = "delete from tbltinchi where MaSV = ? and MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, masv);
            ps.setString(2, mamh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String checkTinChi(String masv, String mamh) {
        String add = "select * from tbltinchi where MaSV = ? and MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, masv);
            ps.setString(2, mamh);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "Đã đăng kí";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Chưa đăng ký";
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

    public int getHocPhi(String s) {
        int hp = 0;
        String getHP = "select sum(HocPhi*SoTinChi) TongHP  from tbltinchi where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(getHP);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                hp = rs.getInt("TongHP");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hp;
    }

    public int getDaDong(String s) {
        int dd = 0;
        String getDD = "select * from tblhocphi where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(getDD);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dd = rs.getInt("DaDong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dd;
    }

    public ArrayList<TinChi> getListTC(String s) {
        ArrayList<TinChi> list = new ArrayList<>();
        String hienthi = "select * from tbltinchi where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TinChi tc = new TinChi();
                tc.setMaSV(rs.getString("MaSV"));
                tc.setMaMH(rs.getString("MaMH"));
                tc.setSoTC(rs.getInt("SoTinChi"));
                tc.setHocPhi(rs.getInt("HocPhi"));
                list.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean nopHP(String masv, int money) {
        try {
            if (!checkHP(masv)) {
                String insert = "insert into tblhocphi value(?,?)";
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setString(1, masv);
                ps.setInt(2, money);
                ps.executeUpdate();
                return true;
            } else {
                String update = "update tblhocphi set DaDong = ? where MaSV = ?";
                PreparedStatement ps = conn.prepareStatement(update);
                ps.setInt(1, money);
                ps.setString(2, masv);
                ps.executeUpdate();
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean checkHP(String masv) {
        String check = "select * from tblhocphi where MaSV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setString(1, masv);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // Quản lý học phí
    
}
