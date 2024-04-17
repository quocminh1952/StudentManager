package controller;

import model.MonHoc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MonHocModify{
    private Connection conn;
    public MonHocModify() {
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
    public boolean addMH(MonHoc m){
        String add = "insert into tblmonhoc values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, m.getMaMH());
            ps.setString(2, m.getTenMH());
            ps.setString(3, m.getMaKhoa());
            ps.setInt(4, m.getSoTC());
            ps.setInt(5, m.getHocPhi());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //sua
    public boolean updateMH(MonHoc m){
        String update = "update tblmonhoc set TenMH = ?, MaKhoa = ?, SoTinChi = ?, HocPhi = ? where MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, m.getTenMH());
            ps.setString(2, m.getMaKhoa());
            ps.setInt(3, m.getSoTC());
            ps.setInt(4, m.getHocPhi());
            ps.setString(5, m.getMaMH());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xoa
    public boolean deleteMH(String mamh){
        
        String delete = "delete from tblmonhoc where MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, mamh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // kiem tra trung ma sv
    public boolean checkMaMH(String mamh){
        String check = "select MaMH from tblmonhoc where MaMH =?";
        try {
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setString(1, mamh);
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
    public  String getTenMH(String mamh){
        String tenmh = "";
        String get = "select * from tblmonhoc where MaMH =?";
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, mamh);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenmh = rs.getString("TenMH");
                return tenmh;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public ArrayList<MonHoc> getListMH(){
        ArrayList<MonHoc> list = new ArrayList<>();
        String hienthi = "select * from tblmonhoc";
         try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 MonHoc m = new MonHoc();
                 m.setMaMH(rs.getString("MaMH"));
                 m.setTenMH(rs.getString("TenMH"));
                 m.setMaKhoa(rs.getString("MaKhoa"));
                 m.setHocPhi(rs.getInt("HocPhi"));
                 m.setSoTC(rs.getInt("SoTinChi"));
                 list.add(m);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<MonHoc> getListBB(String s) {
        ArrayList<MonHoc> list = new ArrayList<>();
        String hienthi = "select * from tblmonhoc where MaKhoa = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonHoc m = new MonHoc();
                 m.setMaMH(rs.getString("MaMH"));
                 m.setTenMH(rs.getString("TenMH"));
                 m.setMaKhoa(rs.getString("MaKhoa"));
                 m.setHocPhi(rs.getInt("HocPhi"));
                 m.setSoTC(rs.getInt("SoTinChi"));
                 list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<MonHoc> getListTC(String s) {
        ArrayList<MonHoc> list = new ArrayList<>();
        String hienthi = "select * from tblmonhoc where MaKhoa != ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonHoc m = new MonHoc();
                 m.setMaMH(rs.getString("MaMH"));
                 m.setTenMH(rs.getString("TenMH"));
                 m.setMaKhoa(rs.getString("MaKhoa"));
                 m.setHocPhi(rs.getInt("HocPhi"));
                 m.setSoTC(rs.getInt("SoTinChi"));
                 list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public String getMaKhoa(String tenkhoa) {
        String makhoa = "";
        String get_makhoa = "select * from tblkhoa where TenKhoa = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get_makhoa);
            ps.setString(1, tenkhoa.trim());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                makhoa = rs.getString("MaKhoa");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return makhoa;
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

    public ArrayList<MonHoc> getListTK(String s) {
        ArrayList<MonHoc> list = new ArrayList<>();
        String hienthi = "select * from tblmonhoc where MaMH like ? or TenMH like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ps.setString(1, "%" + s + "%");
            ps.setString(2, "%" + s + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonHoc m = new MonHoc();
                 m.setMaMH(rs.getString("MaMH"));
                 m.setTenMH(rs.getString("TenMH"));
                 m.setMaKhoa(rs.getString("MaKhoa"));
                 m.setHocPhi(rs.getInt("HocPhi"));
                 m.setSoTC(rs.getInt("SoTinChi"));
                 list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        new MonHocModify();
    }
}
