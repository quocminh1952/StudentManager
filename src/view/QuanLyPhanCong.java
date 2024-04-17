package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PhanCong;
import controller.MonHocModify;
import controller.PhanCongModify;
import controller.GiangVienModify;
import model.GiangVien;
import model.MonHoc;

public class QuanLyPhanCong extends javax.swing.JFrame {

    private String State = "";
    private static String username = "";
    private PhanCongModify pcModify = new PhanCongModify();
    private ArrayList<PhanCong> listPC;
    private GiangVienModify gvModify = new GiangVienModify();
    private ArrayList<GiangVien> listGV;
    private MonHocModify mhModify = new MonHocModify();
    private ArrayList<MonHoc> listMH;
    private DefaultTableModel model;

    public QuanLyPhanCong(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        lblUsername.setText("Xin chào " + user);
        model = (DefaultTableModel) tblPhanCong.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã giảng viên", "Tên giảng viên", "Mã môn học", "Tên môn học"
        });
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGioiTinh = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhanCong = new javax.swing.JTable();
        canvas1 = new java.awt.Canvas();
        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        cboMaMon = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        cboMaGV = new javax.swing.JComboBox();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
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
        btnQLL = new javax.swing.JMenuItem();
        btnQLMH = new javax.swing.JMenuItem();
        btnQLHP = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý học phí");

        tblPhanCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã giảng viên", "Tên giảng viên", "Mã môn học", "Tên môn học"
            }
        ));
        tblPhanCong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPhanCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhanCongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhanCong);
        if (tblPhanCong.getColumnModel().getColumnCount() > 0) {
            tblPhanCong.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblPhanCong.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("QUẢN LÝ PHÂN CÔNG");

        lblUsername.setText("Xin chào");

        jLabel1.setText("Mã môn");

        jLabel2.setText("Mã giảng viên");

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

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

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

        mnbMenu.add(jMenu1);

        jMenu7.setText("Liên hệ");
        mnbMenu.add(jMenu7);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(894, 894, 894)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnThem)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnSua)
                                    .addGap(34, 34, 34)
                                    .addComponent(btnXoa)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnGhi)
                                    .addGap(36, 36, 36)
                                    .addComponent(btnBoQua))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnTimKiem)
                                            .addGap(28, 28, 28)
                                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(cboMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(87, 87, 87)
                                            .addComponent(jLabel1)
                                            .addGap(28, 28, 28)
                                            .addComponent(cboMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnBoQua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        TrangChu frmTrangChu = new TrangChu(username);
        frmTrangChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        QuanLyTaiKhoan frmTaiKhoan = new QuanLyTaiKhoan(username);
        frmTaiKhoan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

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

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        ThongTinSinhVien frmSinhVien = new ThongTinSinhVien(username);
        frmSinhVien.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        State = "Insert";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        cboMaGV.setSelectedIndex(0);
        cboMaMon.setSelectedIndex(0);

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        State = "Update";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        cboMaGV.setEnabled(false);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                String magv = model.getValueAt(tblPhanCong.getSelectedRow(), 0).toString();
                String mamh = model.getValueAt(tblPhanCong.getSelectedRow(), 2).toString();
                if (pcModify.deletePC(magv, mamh)) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showTable();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn phân công");
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if (State == "Insert") {
            if (pcModify.checkPC(cboMaMon.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, "Môn học đã có người giảng dạy");
            } else {
                PhanCong p = new PhanCong();
                p.setMaGV(cboMaGV.getSelectedItem().toString());
                p.setMaMH(cboMaMon.getSelectedItem().toString());
                if (pcModify.addPC(p)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                    showTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Mỗi giảng viên dạy một môn");
                }
            }
        } else if (State == "Update") {
            try {
                PhanCong p = new PhanCong();
                p.setMaGV(cboMaGV.getSelectedItem().toString());
                p.setMaMH(cboMaMon.getSelectedItem().toString());
                if (pcModify.updatePC(p)) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công");
                    showTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Môn học đã có người giảng dạy");
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoQuaActionPerformed
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
        btnThem.setEnabled(true);

        cboMaGV.setEnabled(true);
        showTable();
    }//GEN-LAST:event_btnBoQuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (!txtTimKiem.getText().equalsIgnoreCase("")) {
            listPC = pcModify.getListTK(txtTimKiem.getText().trim());
            model.setRowCount(0);
            listPC.forEach((p) -> {
                model.addRow(new Object[]{p.getMaGV(), gvModify.getTenGV(p.getMaGV()), p.getMaMH(),
                    mhModify.getTenMH(p.getMaMH())});
            });
            //
            getMaGV();
            getMaMH();
        } else {
            showTable();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblPhanCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanCongMouseClicked
        try {
            int row = tblPhanCong.getSelectedRow();
            cboMaGV.setSelectedItem(tblPhanCong.getValueAt(row, 0));
            cboMaMon.setSelectedItem(tblPhanCong.getValueAt(row, 2));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblPhanCongMouseClicked

    private void btnQLHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHPActionPerformed
        QuanLyHocPhi frmQLHP = new QuanLyHocPhi(username);
        frmQLHP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLHPActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhanCong(username).setVisible(true);
            }
        });
    }

    private void showTable() {
        listPC = pcModify.getListPC();
        model.setRowCount(0);
        listPC.forEach((p) -> {
            model.addRow(new Object[]{p.getMaGV(), gvModify.getTenGV(p.getMaGV()), p.getMaMH(),
                mhModify.getTenMH(p.getMaMH())});
        });
        //
        getMaGV();
        getMaMH();
        try {
            cboMaGV.setSelectedItem(tblPhanCong.getValueAt(0, 0));
            cboMaMon.setSelectedItem(tblPhanCong.getValueAt(0, 2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không có dữ liệu");
        }
        btnGhi.setEnabled(false);
    }

    void getMaMH() {
        cboMaMon.removeAllItems();
        listMH = mhModify.getListMH();
        for (MonHoc m : listMH) {
            cboMaMon.addItem(m.getMaMH());
        }
    }

    void getMaGV() {
        cboMaGV.removeAllItems();
        listGV = gvModify.getListGV();
        for (GiangVien g : listGV) {
            cboMaGV.addItem(g.getMaGV());
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
    private javax.swing.JMenuItem btnQLL;
    private javax.swing.JMenuItem btnQLMH;
    private javax.swing.JMenuItem btnQLSV;
    private javax.swing.JButton btnSua;
    private javax.swing.JMenuItem btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JButton btnXoa;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox cboMaGV;
    private javax.swing.JComboBox cboMaMon;
    private javax.swing.ButtonGroup grGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JTable tblPhanCong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
