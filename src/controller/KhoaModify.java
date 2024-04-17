package controller;

import model.Khoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KhoaModify {
    private Connection conn;
    public KhoaModify() {
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
    public boolean addKhoa(Khoa k){
        
        String add = "insert into tblkhoa values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, k.getMaKhoa());
            ps.setString(2, k.getTenKhoa());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //sua
    public boolean updateKhoa(Khoa k){
        String update = "update tblkhoa set TenKhoa = ? where MaKhoa = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, k.getTenKhoa());
            ps.setString(2, k.getMaKhoa());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xoa
    public boolean deleteKhoa(String makhoa){
        
        String delete = "delete from tblkhoa where MaKhoa = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, makhoa);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // kiem tra trung ma khoa
    public boolean checkMaKhoa(String makhoa){
        String check = "select MaKhoa from tblkhoa where MaKhoa =?";
        try {
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setString(1, makhoa);
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
    public String getTenKhoa(String makhoa) {
        String tenkhoa = "";
        String get_tenkhoa = "select * from tblkhoa where MaKhoa = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get_tenkhoa);
            ps.setString(1, makhoa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenkhoa = rs.getString("TenKhoa");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenkhoa;
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
    public ArrayList<Khoa> getListKhoa(){
        ArrayList<Khoa> list = new ArrayList<>();
        String hienthi = "select * from tblkhoa";
         try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 Khoa k = new Khoa();
                 k.setMaKhoa(rs.getString("MaKhoa"));
                 k.setTenKhoa(rs.getString("TenKhoa"));
                 list.add(k);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    public static void main(String[] args) {
        new KhoaModify();
    }
}
