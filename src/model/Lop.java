package model;

public class Lop {

    private String MaLop, TenLop, MaKhoa;

    public Lop() {
    }

    public Lop(String MaLop, String TenLop, String MaKhoa) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.MaKhoa = MaKhoa;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public String getMaLop() {
        return MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }
    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

}
