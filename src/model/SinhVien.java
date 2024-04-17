package model;
public class SinhVien {

    private String MaSV, TenSV, MaLop, GioiTinh, NgaySinh, SDT, Email, DiaChi, Hinh;

    public  SinhVien(){
    }
    public SinhVien(String MaSV, String TenSV, String MaLop, String GioiTinh, String NgaySinh, String SDT, String Email, String DiaChi, String Hinh) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.MaLop = MaLop;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Hinh = Hinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getTenSV() {
        return TenSV;
    }

    public String getMaLop() {
        return MaLop;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getHinh() {
        return Hinh;
    }

    

}
