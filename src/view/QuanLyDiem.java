package view;

import controller.DiemModify;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Diem;
import model.MonHoc;
import model.SinhVien;
import controller.SinhVienModify;
import controller.MonHocModify;
import controller.GiangVienModify;

public class QuanLyDiem extends javax.swing.JFrame {

    String State = "";
    private static String username = "";
    private DiemModify diemModify = new DiemModify();
    private ArrayList<Diem> list;
    private MonHocModify monModify = new MonHocModify();
    private ArrayList<MonHoc> listMon;
    private SinhVienModify svModify = new SinhVienModify();
    private ArrayList<SinhVien> listSV;
    private GiangVienModify gvModify = new GiangVienModify();
    private DefaultTableModel model;

    public QuanLyDiem(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        if (gvModify.getName(username).equalsIgnoreCase("")) {
            lblUsername.setText("Xin chào " + user);
        } else {
            lblUsername.setText("Xin chào " + gvModify.getName(username));
        }
        model = (DefaultTableModel) tblDiem.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sinh viên", "Mã môn học", "Điểm chuyên cần", "Điểm giữa kì",
            "Điểm cuối kì", "Điểm tổng"
        });
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGioiTinh = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDiemCK = new javax.swing.JTextField();
        txtDiemGK = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboMaSV = new javax.swing.JComboBox();
        txtDiemCC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cboMaMH = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDoiMK = new javax.swing.JMenuItem();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý điểm");

        tblDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Mã môn học", "Điểm chuyên cần", "Điểm giữa kì", "Điểm cuối kì", "Điểm tổng"
            }
        ));
        tblDiem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiemMouseClicked(evt);
            }
        });
        tblDiem.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblDiemPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiem);
        if (tblDiem.getColumnModel().getColumnCount() > 0) {
            tblDiem.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblDiem.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Mã sinh viên");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnBoQua.setText("Bỏ qua");
        btnBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoQuaActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã môn học");

        jLabel6.setText("Điểm cuối kì");

        jLabel7.setText("Điểm chuyên cần");

        jLabel8.setText("Điểm giữa kì");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("QUẢN LÝ ĐIỂM SINH VIÊN");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
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
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboMaSV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiemCK, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDiemCC)
                        .addComponent(txtDiemGK, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiemGK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(txtDiemCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnBoQua)
                    .addComponent(btnXoa)
                    .addComponent(jLabel6)
                    .addComponent(txtDiemCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if (State == "Insert") {
            if (diemModify.checkID(cboMaSV.getSelectedItem().toString(), cboMaMH.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, "Sinh viên đã có điểm");
            } else if (txtDiemCC.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập điểm chuyên cần");
            } else if (txtDiemGK.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập điểm giữa kì");
            } else if (txtDiemCK.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập điểm cuối kì");
            } else if (!checkDiem(txtDiemCC.getText()) | !checkDiem(txtDiemGK.getText()) | !checkDiem(txtDiemCK.getText())) {
                JOptionPane.showMessageDialog(null, "Điểm nhập không hợp lệ");
            } else {
                try {
                    Diem d = new Diem();
                    d.setMaSV(cboMaSV.getSelectedItem().toString());
                    d.setMaMH(cboMaMH.getSelectedItem().toString());
                    d.setDiemCC(Float.parseFloat(txtDiemCC.getText()));
                    d.setDiemGK(Float.parseFloat(txtDiemGK.getText()));
                    d.setDiemCK(Float.parseFloat(txtDiemCK.getText()));
                    if (diemModify.addDiem(d)) {
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                        showTable();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
                }
            }
        } else if (State == "Update") {
            if (txtDiemCC.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập điểm chuyên cần");
            } else if (txtDiemGK.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập điểm giữa kì");
            } else if (txtDiemCK.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập điểm cuối kì");
            } else if (!checkDiem(txtDiemCC.getText()) | !checkDiem(txtDiemGK.getText()) | !checkDiem(txtDiemCK.getText())) {
                JOptionPane.showMessageDialog(null, "Điểm nhập không hợp lệ");
            } else {
                try {
                    Diem d = new Diem();
                    d.setMaSV(cboMaSV.getSelectedItem().toString());
                    d.setMaMH(cboMaMH.getSelectedItem().toString());
                    d.setDiemCC(Float.parseFloat(txtDiemCC.getText()));
                    d.setDiemGK(Float.parseFloat(txtDiemGK.getText()));
                    d.setDiemCK(Float.parseFloat(txtDiemCK.getText()));
                    if (diemModify.updateDiem(d)) {
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

        cboMaMH.setEnabled(true);
        cboMaSV.setEnabled(true);

        showTable();
    }//GEN-LAST:event_btnBoQuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        State = "Insert";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtDiemCC.setText("");
        txtDiemGK.setText("");
        txtDiemCK.setText("");

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        State = "Update";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        cboMaSV.setEnabled(false);
        cboMaMH.setEnabled(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                String masv = model.getValueAt(tblDiem.getSelectedRow(), 0).toString();
                String mamh = model.getValueAt(tblDiem.getSelectedRow(), 1).toString();
                if (diemModify.deleteDiem(masv, mamh)) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showTable();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn điểm");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblDiemPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDiemPropertyChange
    }//GEN-LAST:event_tblDiemPropertyChange

    private void tblDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiemMouseClicked
        int row = tblDiem.getSelectedRow();
        cboMaSV.setSelectedItem(tblDiem.getValueAt(row, 0).toString());
        cboMaMH.setSelectedItem(tblDiem.getValueAt(row, 1).toString());
        txtDiemCC.setText(tblDiem.getValueAt(row, 2).toString());
        txtDiemGK.setText(tblDiem.getValueAt(row, 3).toString());
        txtDiemCK.setText(tblDiem.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblDiemMouseClicked

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiem(username).setVisible(true);
            }
        });
    }

    private void showTable() {

        list = diemModify.getListDiem();
        model.setRowCount(0);
        list.forEach((d) -> {
            model.addRow(new Object[]{d.getMaSV(), d.getMaMH(), d.getDiemCC(), d.getDiemGK(), d.getDiemCK(),
                String.format("%.2g%n", (d.getDiemCC() * 0.1 + d.getDiemGK() * 0.2 + d.getDiemCK() * 0.7))});
        });
        getMaMon();
        //
        if (list.size() > 0) {
            cboMaSV.setSelectedItem(tblDiem.getValueAt(0, 0).toString());
            cboMaMH.setSelectedItem(tblDiem.getValueAt(0, 1).toString());
            txtDiemCC.setText(tblDiem.getValueAt(0, 2).toString());
            txtDiemGK.setText(tblDiem.getValueAt(0, 3).toString());
            txtDiemCK.setText(tblDiem.getValueAt(0, 4).toString());
        }
        btnGhi.setEnabled(false);
    }

    void getMaMon() {
        cboMaMH.removeAllItems();
        listMon = monModify.getListMH();
        for (MonHoc m : listMon) {
            cboMaMH.addItem(m.getMaMH());
        }
        cboMaSV.removeAllItems();
        listSV = svModify.getListSV();
        for (SinhVien sv : listSV) {
            cboMaSV.addItem(sv.getMaSV());
        }
    }

    private boolean checkDiem(String d) {
        try {
            int diem = Integer.parseInt(d);
            if (diem < 0 | diem > 10) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoQua;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JMenuItem btnDoiMK;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JButton btnXoa;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox cboMaMH;
    private javax.swing.JComboBox cboMaSV;
    private javax.swing.ButtonGroup grGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JTable tblDiem;
    private javax.swing.JTextField txtDiemCC;
    private javax.swing.JTextField txtDiemCK;
    private javax.swing.JTextField txtDiemGK;
    // End of variables declaration//GEN-END:variables

}
