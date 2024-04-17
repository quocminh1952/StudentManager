package controller;

import model.Lop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Khoa;

public class LopModify {
    private Connection conn;
    public LopModify() {
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
    public boolean addLop(Lop l){
        String add = "insert into tbllop values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, l.getMaLop());
            ps.setString(2, l.getTenLop());
            ps.setString(3, l.getMaKhoa());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //sua
    public boolean updateLop(Lop l){
        String update = "update tbllop set TenLop = ?, MaKhoa = ? where MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, l.getTenLop());
            ps.setString(2, l.getMaKhoa());
            ps.setString(3, l.getMaLop());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xoa
    public boolean deleteLop(String malop){
        
        String delete = "delete from tbllop where MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, malop);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // kiem tra trung ma sv
    public boolean checkMaLop(String malop){
        String check = "select MaLop from tbllop where MaLop =?";
        try {
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setString(1, malop);
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
    
    public String getTenLop(String malop) {
        String tenlop = "";
        String get_tenlop = "select * from tbllop where MaLop = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get_tenlop);
            ps.setString(1, malop);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	tenlop = rs.getString("TenLop");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenlop;
    }
    
    public ArrayList<Lop> getListLop(){
        ArrayList<Lop> list = new ArrayList<>();
        String hienthi = "select * from tbllop";
         try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 Lop l = new Lop();
                 l.setMaLop(rs.getString("MaLop"));
                 l.setTenLop(rs.getString("TenLop"));
                 l.setMaKhoa(rs.getString("MaKhoa"));
                 list.add(l);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        new LopModify();
    }
}
