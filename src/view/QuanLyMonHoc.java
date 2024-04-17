package view;

import controller.MonHocModify;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MonHoc;
import model.Khoa;
import controller.KhoaModify;
import javax.swing.JFrame;
import static view.ThongTinSinhVien.username;

public class QuanLyMonHoc extends javax.swing.JFrame {

    String State = "";
    static String username = "";
    private MonHocModify monModify = new MonHocModify();
    private ArrayList<MonHoc> list;
    private KhoaModify khoaModify = new KhoaModify();
    private ArrayList<Khoa> listKhoa;
    private DefaultTableModel model;

    public QuanLyMonHoc(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        lblUsername.setText("Xin chào " + user);
        model = (DefaultTableModel) tblMonHoc.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã môn học", "Tên môn học", "Mã khoa", "Số tín chỉ", "Học phí/tín"
        });
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGioiTinh = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMonHoc = new javax.swing.JTable();
        txtMaMH = new javax.swing.JTextField();
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
        txtHocPhi = new javax.swing.JTextField();
        txtSoTC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboMaKhoa = new javax.swing.JComboBox();
        txtTenMH = new javax.swing.JTextField();
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
        btnQLK = new javax.swing.JMenuItem();
        btnQLL = new javax.swing.JMenuItem();
        btnQLHP = new javax.swing.JMenuItem();
        btnQLPC = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý môn học");

        tblMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn học", "Tên môn học", "Mã khoa", "Số tín chỉ", "Học phí/tín"
            }
        ));
        tblMonHoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonHocMouseClicked(evt);
            }
        });
        tblMonHoc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblMonHocPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblMonHoc);
        if (tblMonHoc.getColumnModel().getColumnCount() > 0) {
            tblMonHoc.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblMonHoc.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Mã môn học");

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

        jLabel5.setText("Mã khoa");

        jLabel6.setText("Học phí");

        jLabel7.setText("Tên môn học");

        jLabel8.setText("Số tín chỉ");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("QUẢN LÝ MÔN HỌC");

        lblUsername.setText("Xin chào");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboMaKhoa, 0, 178, Short.MAX_VALUE)
                                    .addComponent(txtMaMH))
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(29, 29, 29)
                                .addComponent(btnSua)
                                .addGap(34, 34, 34)
                                .addComponent(btnXoa)
                                .addGap(43, 43, 43)
                                .addComponent(btnGhi)
                                .addGap(36, 36, 36)
                                .addComponent(btnBoQua)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenMH)
                            .addComponent(txtSoTC, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtHocPhi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(cboMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGhi)
                            .addComponent(btnSua)
                            .addComponent(btnThem)
                            .addComponent(btnBoQua)
                            .addComponent(btnXoa)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
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
            if (txtMaMH.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập mã môn học");
            } else if (monModify.checkMaMH(txtMaMH.getText())) {
                JOptionPane.showMessageDialog(null, "Trùng mã môn học");
            } else if (txtTenMH.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên môn học");
            } else if (txtSoTC.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập số tín chỉ");
            } else if (txtHocPhi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập học phí/tín");
            } else {
                try {
                    MonHoc m = new MonHoc();
                    m.setMaMH(txtMaMH.getText());
                    m.setTenMH(txtTenMH.getText());
                    m.setMaKhoa(cboMaKhoa.getSelectedItem().toString());
                    m.setSoTC(Integer.parseInt(txtSoTC.getText()));
                    m.setHocPhi(Integer.parseInt(txtHocPhi.getText()));
                    if (monModify.addMH(m)) {
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                        showTable();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
                }
            }
        } else if (State == "Update") {
            if (txtTenMH.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên môn học");
            } else if (txtSoTC.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập số tín chỉ");
            } else if (txtHocPhi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập học phí/tín");
            } else {
                try {
                    MonHoc m = new MonHoc();
                    m.setMaMH(txtMaMH.getText());
                    m.setTenMH(txtTenMH.getText());
                    m.setMaKhoa(cboMaKhoa.getSelectedItem().toString());
                    m.setSoTC(Integer.parseInt(txtSoTC.getText()));
                    m.setHocPhi(Integer.parseInt(txtHocPhi.getText()));
                    if (monModify.updateMH(m)) {
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

        txtMaMH.setEditable(true);
        showTable();
    }//GEN-LAST:event_btnBoQuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        State = "Insert";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaMH.setText("");
        txtTenMH.setText("");
        txtSoTC.setText("");
        txtHocPhi.setText("");

        cboMaKhoa.setSelectedIndex(0);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        State = "Update";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaMH.setEditable(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                String mamh = model.getValueAt(tblMonHoc.getSelectedRow(), 0).toString();
                if (monModify.deleteMH(mamh)) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showTable();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn môn học");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblMonHocPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblMonHocPropertyChange
    }//GEN-LAST:event_tblMonHocPropertyChange

    private void tblMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonHocMouseClicked
        int row = tblMonHoc.getSelectedRow();
        txtMaMH.setText(tblMonHoc.getValueAt(row, 0).toString());
        txtTenMH.setText(tblMonHoc.getValueAt(row, 1).toString());
        cboMaKhoa.setSelectedItem(tblMonHoc.getValueAt(row, 2).toString());
        txtSoTC.setText(tblMonHoc.getValueAt(row, 3).toString());
        txtHocPhi.setText(tblMonHoc.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblMonHocMouseClicked

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

    private void btnQLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLLActionPerformed
        QuanLyLop frmLop = new QuanLyLop(username);
        frmLop.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLLActionPerformed

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
                new QuanLyMonHoc(username).setVisible(true);
            }
        });
    }

    private void showTable() {
        list = monModify.getListMH();
        model.setRowCount(0);
        list.forEach((m) -> {
            model.addRow(new Object[]{m.getMaMH(), m.getTenMH(), m.getMaKhoa(), m.getSoTC(), m.getHocPhi()});
        });
        getMaKhoa();
        //
        if (list.size() > 0) {
            txtMaMH.setText(tblMonHoc.getValueAt(0, 0).toString());
            txtTenMH.setText(tblMonHoc.getValueAt(0, 1).toString());
            cboMaKhoa.setSelectedItem(tblMonHoc.getValueAt(0, 2).toString());
            txtSoTC.setText(tblMonHoc.getValueAt(0, 3).toString());
            txtHocPhi.setText(tblMonHoc.getValueAt(0, 4).toString());
        }
        btnGhi.setEnabled(false);
    }

    void getMaKhoa() {
        cboMaKhoa.removeAllItems();
        listKhoa = khoaModify.getListKhoa();
        for (Khoa khoa : listKhoa) {
            cboMaKhoa.addItem(khoa.getMaKhoa());
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
    private javax.swing.JMenuItem btnQLPC;
    private javax.swing.JMenuItem btnQLSV;
    private javax.swing.JButton btnSua;
    private javax.swing.JMenuItem btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JButton btnXoa;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox cboMaKhoa;
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
    private javax.swing.JTable tblMonHoc;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtSoTC;
    private javax.swing.JTextField txtTenMH;
    // End of variables declaration//GEN-END:variables

}
