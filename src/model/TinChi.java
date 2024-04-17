package model;

public class TinChi {

    private String MaMH, MaSV;
    private int SoTC, HocPhi;

    public TinChi() {

    }

    public TinChi(String MaMH, String MaSV, int SoTC, int HocPhi) {
        this.MaMH = MaMH;
        this.MaSV = MaSV;
        this.SoTC = SoTC;
        this.HocPhi = HocPhi;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public int getSoTC() {
        return SoTC;
    }

    public void setSoTC(int SoTC) {
        this.SoTC = SoTC;
    }

    public int getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(int HocPhi) {
        this.HocPhi = HocPhi;
    }

}
