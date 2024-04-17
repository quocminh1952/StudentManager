package model;
public class TaiKhoan {
   private String TenTK, MK, Email;
   int PhanQuyen;
   public TaiKhoan(){
       
   }

    public TaiKhoan(String TenTK, String MK, String Email, int PhanQuyen) {
        this.TenTK = TenTK;
        this.MK = MK;
        this.Email = Email;
        this.PhanQuyen = PhanQuyen;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(int PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }
   
}
