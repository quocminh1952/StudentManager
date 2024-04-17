package model;

public class Khoa {

    private String MaKhoa, TenKhoa;

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public Khoa() {
    }

    public Khoa(String MaKhoa, String TenKhoa) {
        this.MaKhoa = MaKhoa;
        this.TenKhoa = TenKhoa;
    }

}
