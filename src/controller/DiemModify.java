package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Diem;
import model.Diem;
public class DiemModify {
    private Connection conn;
    public DiemModify(){
        try {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/quanlylophoc";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addDiem(Diem d) {

        String add = "insert into tbldiem values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, d.getMaSV());
            ps.setString(2, d.getMaMH());
            ps.setFloat(3, d.getDiemCC());
            ps.setFloat(4, d.getDiemGK());
            ps.setFloat(5, d.getDiemCK());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //sua

    public boolean updateDiem(Diem d) {
        String update = "update tbldiem set DiemCC = ?, DiemGK = ?, DiemCK = ?"
                + " where MaSV = ? and MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setFloat(1, d.getDiemCC());
            ps.setFloat(2, d.getDiemGK());
            ps.setFloat(3, d.getDiemCK());
            ps.setString(4, d.getMaSV());
            ps.setString(5, d.getMaMH());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //xoa

    public boolean deleteDiem(String mad, String mamh) {

        String delete = "delete from tbldiem where MaSV = ? and MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, mad);
            ps.setString(2, mamh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // kiem tra trung ma d

    public boolean checkID(String masv, String mamh) {
        String checkID = "select * from tbldiem where MaSV = ? and MaMH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(checkID);
            ps.setString(1, masv);
            ps.setString(2, mamh);
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

    public ArrayList<Diem> getListDiem() {
        ArrayList<Diem> list = new ArrayList<>();
        String hienthi = "select * from tbldiem";
        try {
            PreparedStatement ps = conn.prepareStatement(hienthi);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Diem d = new Diem();
                d.setMaSV(rs.getString("MaSV"));
                d.setMaMH(rs.getString("MaMH"));
                d.setDiemCC(rs.getFloat("DiemCC"));
                d.setDiemGK(rs.getFloat("DiemGK"));
                d.setDiemCK(rs.getFloat("DiemCK"));
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
