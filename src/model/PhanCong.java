package model;

public class PhanCong {

    private String MaGV, MaMH;

    public PhanCong() {

    }

    public PhanCong(String MaGV, String MaMH) {
        this.MaGV = MaGV;
        this.MaMH = MaMH;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

}
