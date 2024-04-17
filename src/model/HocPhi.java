package model;

public class HocPhi {

    private String MaSV;
    private int DaDong;

    public HocPhi() {

    }

    public HocPhi(String MaSV, int DaDong) {
        this.MaSV = MaSV;
        this.DaDong = DaDong;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public int getDaDong() {
        return DaDong;
    }

    public void setDaDong(int DaDong) {
        this.DaDong = DaDong;
    }
}
