package model;
public class Diem {
    private String MaMH, MaSV;
    private float DiemCC, DiemGK, DiemCK;
    public Diem(){
        
    }

    public Diem(String MaMH, String MaSV, float DiemCC, float DiemGK, float DiemCK) {
        this.MaMH = MaMH;
        this.MaSV = MaSV;
        this.DiemCC = DiemCC;
        this.DiemGK = DiemGK;
        this.DiemCK = DiemCK;
    }

    public String getMaMH() {
        return MaMH;
    }

    public String getMaSV() {
        return MaSV;
    }

    public float getDiemCC() {
        return DiemCC;
    }

    public float getDiemGK() {
        return DiemGK;
    }

    public float getDiemCK() {
        return DiemCK;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setDiemCC(float DiemCC) {
        this.DiemCC = DiemCC;
    }

    public void setDiemGK(float DiemGK) {
        this.DiemGK = DiemGK;
    }

    public void setDiemCK(float DiemCK) {
        this.DiemCK = DiemCK;
    }

    
}
