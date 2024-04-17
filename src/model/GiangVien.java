package model;
public class GiangVien {

    private String MaGV, TenGV, MaKhoa, GioiTinh, NgaySinh, SDT, Email, DiaChi, Hinh;

    public  GiangVien(){
    }

    public GiangVien(String MaGV, String TenGV, String MaKhoa, String GioiTinh, String NgaySinh, String SDT, String Email, String DiaChi, String Hinh) {
        this.MaGV = MaGV;
        this.TenGV = TenGV;
        this.MaKhoa = MaKhoa;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Hinh = Hinh;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
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

    public String getMaGV() {
        return MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public String getMaKhoa() {
        return MaKhoa;
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
