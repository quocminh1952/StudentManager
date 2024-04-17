package view;

import controller.SinhVienModify;
import controller.GiangVienModify;
import controller.TaiKhoanModify;
import javax.swing.JOptionPane;

public class DoiMatKhau extends javax.swing.JFrame {

    static String username = "";
    private TaiKhoanModify tkModify = new TaiKhoanModify();
    private SinhVienModify svModify = new SinhVienModify();
    private GiangVienModify gvModify = new GiangVienModify();

    public DoiMatKhau(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        txtTaiKhoan.setText(user);
        if (tkModify.getPQ(username) == 0) {
            lblUsername.setText("Xin chào " + svModify.getName(username));
        } else if (tkModify.getPQ(username) == 1) {
            lblUsername.setText("Xin chào " + gvModify.getName(username));
        } else {
            lblUsername.setText("Xin chào " + user);
        }
        getMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        btnDoi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNhapLai = new javax.swing.JPasswordField();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        btnTaiKhoan = new javax.swing.JMenuItem();
        btnQLSV = new javax.swing.JMenuItem();
        btnQLGV = new javax.swing.JMenuItem();
        btnQLK = new javax.swing.JMenuItem();
        btnQLL = new javax.swing.JMenuItem();
        btnQLMH = new javax.swing.JMenuItem();
        btnQLD = new javax.swing.JMenuItem();
        btnNopHP = new javax.swing.JMenuItem();
        btnDangKiTinChi = new javax.swing.JMenuItem();
        btnQLHP = new javax.swing.JMenuItem();
        btnQLPC = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi mật khẩu");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("ĐỔI MẬT KHẨU");

        lblUsername.setText("Xin chào");

        jLabel1.setText("Tài khoản");

        txtTaiKhoan.setEditable(false);

        jLabel2.setText("Mật khẩu cũ");

        jLabel3.setText("Nhập lại mật khẩu mới");

        btnDoi.setText("Đổi");
        btnDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiActionPerformed(evt);
            }
        });

        jLabel4.setText("Mật khẩu mới");

        jMenu2.setText("Tài khoản");

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jMenu2.add(btnDangXuat);

        mnbMenu.add(jMenu2);

        jMenu1.setText("Hệ thống");

        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        jMenu1.add(btnTrangChu);

        btnTaiKhoan.setText("Quản lý tài khoản");
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });
        jMenu1.add(btnTaiKhoan);

        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLSV);

        btnQLGV.setText("Quản lý giảng viên");
        btnQLGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLGVActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLGV);

        btnQLK.setText("Quản lý khoa");
        btnQLK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLK);

        btnQLL.setText("Quản lý lớp");
        btnQLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLLActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLL);

        btnQLMH.setText("Quản lý môn học");
        btnQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMHActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLMH);

        btnQLD.setText("Quản lý điểm");
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLD);

        btnNopHP.setText("Nộp học phí");
        btnNopHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopHPActionPerformed(evt);
            }
        });
        jMenu1.add(btnNopHP);

        btnDangKiTinChi.setText("Đăng ký tín chỉ");
        btnDangKiTinChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiTinChiActionPerformed(evt);
            }
        });
        jMenu1.add(btnDangKiTinChi);

        btnQLHP.setText("Quản lý học phí");
        btnQLHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHPActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLHP);

        btnQLPC.setText("Quản lý phân công");
        btnQLPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLPCActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLPC);

        mnbMenu.add(jMenu1);

        jMenu7.setText("Liên hệ");
        mnbMenu.add(jMenu7);
        mnbMenu.add(mnUser);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txtNhapLai, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTaiKhoan))
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(54, 54, 54)
                .addComponent(btnDoi)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất?", null, JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Login frmLogin = new Login();
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        QuanLyTaiKhoan frmTaiKhoan = new QuanLyTaiKhoan(username);
        frmTaiKhoan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        TrangChu frmSinhVien = new TrangChu(username);
        frmSinhVien.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnQLGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLGVActionPerformed
        ThongTinGiangVien frmGiangVien = new ThongTinGiangVien(username);
        frmGiangVien.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLGVActionPerformed

    private void btnQLKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKActionPerformed
        QuanLyKhoa frmKhoa = new QuanLyKhoa(username);
        frmKhoa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLKActionPerformed

    private void btnQLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLLActionPerformed
        QuanLyLop frmLop = new QuanLyLop(username);
        frmLop.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLLActionPerformed

    private void btnQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMHActionPerformed
        QuanLyMonHoc frmMH = new QuanLyMonHoc(username);
        frmMH.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLMHActionPerformed

    private void btnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDActionPerformed
        QuanLyDiem frmDiem = new QuanLyDiem(username);
        frmDiem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLDActionPerformed

    private void btnNopHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopHPActionPerformed
        NopHocPhi frmHP = new NopHocPhi(username);
        frmHP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNopHPActionPerformed

    private void btnDangKiTinChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiTinChiActionPerformed
        DangKyTinChi frmDKTC = new DangKyTinChi(username);
        frmDKTC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangKiTinChiActionPerformed

    private void btnQLHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHPActionPerformed
        QuanLyHocPhi frmQLHP = new QuanLyHocPhi(username);
        frmQLHP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLHPActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        TrangChu frmTrangChu = new TrangChu(username);
        frmTrangChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiActionPerformed
        System.out.println("Mat khau cu" + txtMatKhau.getText());
        System.out.println("Mat khau moi" + txtMatKhauMoi.getText());
        System.out.println("Mat khau nhap lai" + txtNhapLai.getText());
        try {
            if (txtMatKhau.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập mật khẩu cũ");
            } else if (!tkModify.checkAcc(username, txtMatKhau.getText())) {
                JOptionPane.showMessageDialog(null, "Sai mật khẩu");
            } else if (txtMatKhauMoi.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập mật khẩu mới");
            } else if (txtNhapLai.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa xác nhận mật khẩu mới");
            } else if (!txtMatKhauMoi.getText().equals(txtNhapLai.getText())) {
                JOptionPane.showMessageDialog(null, "Mật khẩu không trùng khớp");
            } else {
                if (tkModify.doiMK(username, txtNhapLai.getText())) {
                    JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Đổi mật khẩu không thành công");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
        }
    }//GEN-LAST:event_btnDoiActionPerformed

    private void btnQLPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPCActionPerformed
        QuanLyPhanCong frmPC = new QuanLyPhanCong(username);
        frmPC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLPCActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau(username).setVisible(true);
            }
        });
    }

    void getMenu() {
        if (tkModify.getPQ(username) == 0) {
            btnTaiKhoan.setVisible(false);
            btnQLD.setVisible(false);
            btnQLGV.setVisible(false);
            btnQLHP.setVisible(false);
            btnQLGV.setVisible(false);;
            btnQLK.setVisible(false);
            btnQLL.setVisible(false);;
            btnQLMH.setVisible(false);
            btnQLSV.setVisible(false);
            btnQLPC.setVisible(false);
        } else if (tkModify.getPQ(username) == 1) {
            btnTaiKhoan.setVisible(false);
            btnQLGV.setVisible(false);
            btnQLHP.setVisible(false);
            btnQLGV.setVisible(false);;
            btnQLK.setVisible(false);
            btnQLL.setVisible(false);;
            btnQLMH.setVisible(false);
            btnQLSV.setVisible(false);
            btnNopHP.setVisible(false);
            btnDangKiTinChi.setVisible(false);
            btnQLPC.setVisible(false);
        } else {
            btnDangKiTinChi.setVisible(false);
            btnNopHP.setVisible(false);
            btnQLD.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnDangKiTinChi;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JButton btnDoi;
    private javax.swing.JMenuItem btnNopHP;
    private javax.swing.JMenuItem btnQLD;
    private javax.swing.JMenuItem btnQLGV;
    private javax.swing.JMenuItem btnQLHP;
    private javax.swing.JMenuItem btnQLK;
    private javax.swing.JMenuItem btnQLL;
    private javax.swing.JMenuItem btnQLMH;
    private javax.swing.JMenuItem btnQLPC;
    private javax.swing.JMenuItem btnQLSV;
    private javax.swing.JMenuItem btnTaiKhoan;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLai;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
