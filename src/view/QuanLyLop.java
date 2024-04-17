package view;

import controller.LopModify;
import controller.KhoaModify;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Lop;
import model.Khoa;

public class QuanLyLop extends javax.swing.JFrame {

    private String State = "";
    static String username = "";
    private LopModify lopModify = new LopModify();
    private ArrayList<Lop> list;
    private KhoaModify khoaModify = new KhoaModify();
    private ArrayList<Khoa> listKhoa;
    private DefaultTableModel model;

    public QuanLyLop(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        lblUsername.setText("Xin chào " + user);
        model = (DefaultTableModel) tblLop.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã lớp", "Tên lớp", "Mã khoa"
        });
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblLop = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        cboMaKhoa = new javax.swing.JComboBox();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDoiMK = new javax.swing.JMenuItem();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        btnTaiKhoan = new javax.swing.JMenuItem();
        btnQLSV = new javax.swing.JMenuItem();
        btnQLGV = new javax.swing.JMenuItem();
        btnQLK = new javax.swing.JMenuItem();
        btnQLMH = new javax.swing.JMenuItem();
        btnQLHP = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý lớp");

        tblLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lớp", "Tên lớp", "Mã khoa"
            }
        ));
        tblLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLopMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLop);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnBoQua.setText("Bỏ qua");
        btnBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoQuaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("DANH SÁCH LỚP");

        jLabel1.setText("Mã lớp:");

        jLabel2.setText("Tên lớp:");

        jLabel3.setText("Khoa:");

        lblUsername.setText("Xin chao");

        jMenu2.setText("Tài khoản");

        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });
        jMenu2.add(btnDoiMK);

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

        btnQLMH.setText("Quản lý môn học");
        btnQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMHActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLMH);

        btnQLHP.setText("Quản lý học phí");
        btnQLHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHPActionPerformed(evt);
            }
        });
        jMenu1.add(btnQLHP);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenLop)
                                        .addComponent(txtMaLop, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnThem)
                .addGap(29, 29, 29)
                .addComponent(btnSua)
                .addGap(34, 34, 34)
                .addComponent(btnXoa)
                .addGap(43, 43, 43)
                .addComponent(btnGhi)
                .addGap(36, 36, 36)
                .addComponent(btnBoQua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnBoQua)
                    .addComponent(btnXoa))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopMouseClicked
        int row = tblLop.getSelectedRow();
        txtMaLop.setText(tblLop.getValueAt(row, 0).toString());
        txtTenLop.setText(tblLop.getValueAt(row, 1).toString());
        cboMaKhoa.setSelectedItem(tblLop.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblLopMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        State = "Insert";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaLop.setText("");
        txtTenLop.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        State = "Update";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaLop.setEditable(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                String malop = model.getValueAt(tblLop.getSelectedRow(), 0).toString();
                if (lopModify.deleteLop(malop)) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showTable();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn lớp");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if (State == "Insert") {
            if (txtMaLop.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập mã lớp");
            } else if (lopModify.checkMaLop(txtMaLop.getText())) {
                JOptionPane.showMessageDialog(null, "Trùng mã lớp");
            } else if (txtTenLop.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên lớp");
            } else {
                try {
                    Lop l = new Lop();
                    l.setMaLop(txtMaLop.getText());
                    l.setTenLop(txtTenLop.getText());
                    l.setMaKhoa(cboMaKhoa.getSelectedItem().toString());
                    if (lopModify.addLop(l)) {
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                        showTable();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
                }
            }
        } else if (State == "Update") {
            if (txtTenLop.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên lop");
            } else {
                try {
                    Lop l = new Lop();
                    l.setMaLop(txtMaLop.getText());
                    l.setTenLop(txtTenLop.getText());
                    l.setMaKhoa(cboMaKhoa.getSelectedItem().toString());
                    if (lopModify.updateLop(l)) {
                        JOptionPane.showMessageDialog(null, "Sửa thành công");
                        showTable();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
                }
            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoQuaActionPerformed
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
        btnThem.setEnabled(true);

        txtMaLop.setEditable(true);

        showTable();
    }//GEN-LAST:event_btnBoQuaActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
        DoiMatKhau frmDoiMK = new DoiMatKhau(username);
        frmDoiMK.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDoiMKActionPerformed

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
        ThongTinSinhVien frmSinhVien = new ThongTinSinhVien(username);
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

    private void btnQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMHActionPerformed
        QuanLyMonHoc frmMH = new QuanLyMonHoc(username);
        frmMH.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLMHActionPerformed

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
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyLop(username).setVisible(true);
            }
        });
    }

    private void showTable() {
        list = lopModify.getListLop();
        model.setRowCount(0);
        list.forEach((l) -> {
            model.addRow(new Object[]{l.getMaLop(), l.getTenLop(), l.getMaKhoa()});
        });
        getMaKhoa();
        if (list.size() > 0) {
            txtMaLop.setText(tblLop.getValueAt(0, 0).toString());
            txtTenLop.setText(tblLop.getValueAt(0, 1).toString());
            cboMaKhoa.setSelectedItem(tblLop.getValueAt(0, 2).toString());
        }
        btnGhi.setEnabled(false);
    }

    void getMaKhoa() {
        cboMaKhoa.removeAllItems();
        listKhoa = khoaModify.getListKhoa();
        for (Khoa k : listKhoa) {
            cboMaKhoa.addItem(k.getMaKhoa());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoQua;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JMenuItem btnDoiMK;
    private javax.swing.JButton btnGhi;
    private javax.swing.JMenuItem btnQLGV;
    private javax.swing.JMenuItem btnQLHP;
    private javax.swing.JMenuItem btnQLK;
    private javax.swing.JMenuItem btnQLMH;
    private javax.swing.JMenuItem btnQLSV;
    private javax.swing.JButton btnSua;
    private javax.swing.JMenuItem btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cboMaKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JTable tblLop;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
