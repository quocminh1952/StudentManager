package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.HocPhi;
import model.HocPhi;

public class HocPhiModify {

    Connection conn;

    public HocPhiModify() {
        try {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/quanlylophoc";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HocPhi> getListHP() {
        ArrayList<HocPhi> list = new ArrayList<>();
        String hienthi = "select * from tblhocphi";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocPhi tc = new HocPhi();
                tc.setMaSV(rs.getString("MaSV"));
                tc.setDaDong(rs.getInt("DaDong"));
                list.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<HocPhi> getListTK(String s) {
        ArrayList<HocPhi> list = new ArrayList<>();
        String hienthi = "select * from tblhocphi hp, tblsinhvien sv "
                + "where hp.MaSV = sv.MaSV and (hp.MaSV like ? or TenSV like ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, "%" + s + "%");
            ps.setString(2, "%" + s + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HocPhi tc = new HocPhi();
                tc.setMaSV(rs.getString("MaSV"));
                tc.setDaDong(rs.getInt("DaDong"));
                list.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // số sv 
    public int getSoSV() {
        int sosv = 0;
        String hienthi = "select count(MaSV) SoSV from tblsinhvien";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
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
    // số sv đã đóng
    public int getSoSVDaDong() {
        int sosv = 0;
        String hienthi = "select count(MaSV) SoSV from tblhocphi where DaDong > 0";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
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
    public int getQuy() {
        int quy = 0;
        String hienthi = "select sum(DaDong) Quy from tblhocphi";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                quy = rs.getInt("Quy");
                return quy;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return quy;
    }
}
