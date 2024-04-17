package model;
public class MonHoc {
    private String MaMH, TenMH, MaKhoa;
    private int SoTC, HocPhi;
    public MonHoc(){
        
    }

    public MonHoc(String MaMH, String TenMH, String MaKhoa,int SoTC, int HocPhi) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.MaKhoa = MaKhoa;
        this.SoTC = SoTC;
        this.HocPhi = HocPhi;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
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
