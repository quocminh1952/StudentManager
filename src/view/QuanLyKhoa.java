package view;

import model.Khoa;
import controller.KhoaModify;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyKhoa extends javax.swing.JFrame {

    private String State = "";
    static String username = "";
    private KhoaModify khoaModify = new KhoaModify();
    private ArrayList<Khoa> list;
    private DefaultTableModel model;

    public QuanLyKhoa(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        lblUsername.setText("Xin chào " + user);
        model = (DefaultTableModel) tblKhoa.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã khoa", "Tên khoa"
        });
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaKhoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhoa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhoa = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDoiMK = new javax.swing.JMenuItem();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        btnTaiKhoan = new javax.swing.JMenuItem();
        btnQLSV = new javax.swing.JMenuItem();
        btnQLGV = new javax.swing.JMenuItem();
        btnQLL = new javax.swing.JMenuItem();
        btnQLMH = new javax.swing.JMenuItem();
        btnQLHP = new javax.swing.JMenuItem();
        btnQLPC = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý khoa");

        jLabel1.setText("Mã khoa:");

        jLabel2.setText("Tên khoa:");

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

        tblKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khoa", "Tên khoa"
            }
        ));
        tblKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhoa);
        if (tblKhoa.getColumnModel().getColumnCount() > 0) {
            tblKhoa.getColumnModel().getColumn(0).setResizable(false);
            tblKhoa.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("DANH SÁCH KHOA");

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
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKhoa)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(29, 29, 29)
                .addComponent(btnSua)
                .addGap(34, 34, 34)
                .addComponent(btnXoa)
                .addGap(43, 43, 43)
                .addComponent(btnGhi)
                .addGap(36, 36, 36)
                .addComponent(btnBoQua)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnBoQua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        State = "Insert";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaKhoa.setText("");
        txtTenKhoa.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        State = "Update";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaKhoa.setEditable(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                String mk = model.getValueAt(tblKhoa.getSelectedRow(), 0).toString();
                if (khoaModify.deleteKhoa(mk)) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showTable();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn khoa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if (State == "Insert") {
            if (txtMaKhoa.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập mã khoa");
            } else if (khoaModify.checkMaKhoa(txtMaKhoa.getText())) {
                JOptionPane.showMessageDialog(null, "Trùng mã khoa");
            } else if (txtTenKhoa.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên khoa");
            } else {
                try {
                    Khoa k = new Khoa();
                    k.setMaKhoa(txtMaKhoa.getText());
                    k.setTenKhoa(txtTenKhoa.getText());
                    if (khoaModify.addKhoa(k)) {
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                        showTable();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
                }
            }
        } else if (State == "Update") {
            if (txtTenKhoa.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên khoa");
            } else {
                try {
                    Khoa k = new Khoa();
                    k.setMaKhoa(txtMaKhoa.getText());
                    k.setTenKhoa(txtTenKhoa.getText());
                    if (khoaModify.updateKhoa(k)) {
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

        txtMaKhoa.setEditable(true);

        showTable();
    }//GEN-LAST:event_btnBoQuaActionPerformed

    private void tblKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaMouseClicked
        int row = tblKhoa.getSelectedRow();
        txtMaKhoa.setText(tblKhoa.getValueAt(row, 0).toString());
        txtTenKhoa.setText(tblKhoa.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblKhoaMouseClicked

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

    private void btnQLPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPCActionPerformed
        QuanLyPhanCong frmPC = new QuanLyPhanCong(username);
        frmPC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLPCActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoa(username).setVisible(true);
            }
        });
    }

    private void showTable() {
        list = khoaModify.getListKhoa();
        model.setRowCount(0);
        list.forEach((k) -> {
            model.addRow(new Object[]{k.getMaKhoa(), k.getTenKhoa()});
        });
        if (list.size() > 0) {
            txtMaKhoa.setText(tblKhoa.getValueAt(0, 0).toString());
            txtTenKhoa.setText(tblKhoa.getValueAt(0, 1).toString());
        }
        btnGhi.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoQua;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JMenuItem btnDoiMK;
    private javax.swing.JButton btnGhi;
    private javax.swing.JMenuItem btnQLGV;
    private javax.swing.JMenuItem btnQLHP;
    private javax.swing.JMenuItem btnQLL;
    private javax.swing.JMenuItem btnQLMH;
    private javax.swing.JMenuItem btnQLPC;
    private javax.swing.JMenuItem btnQLSV;
    private javax.swing.JButton btnSua;
    private javax.swing.JMenuItem btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JTable tblKhoa;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtTenKhoa;
    // End of variables declaration//GEN-END:variables
}
