package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.TinChi;
import model.MonHoc;
import controller.TinChiModify;
import controller.SinhVienModify;
import controller.MonHocModify;

public class DangKyTinChi extends javax.swing.JFrame {

    private static String username = "";
    private TinChiModify tcModify = new TinChiModify();
    private ArrayList<TinChi> list;
    private SinhVienModify svModify = new SinhVienModify();
    private MonHocModify mhModify = new MonHocModify();
    private ArrayList<MonHoc> listMH;
    private DefaultTableModel model;

    public DangKyTinChi(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        if (svModify.getName(username).equalsIgnoreCase("")) {
            lblUsername.setText("Xin chào " + user);
        } else {
            lblUsername.setText("Xin chào " + svModify.getName(username));
        }
        model = (DefaultTableModel) tblTinChi.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã môn học", "Tên môn học", "Mã khoa", "Số tín chỉ", "Học phí (1 tín)", "Tổng tiền", "Trạng thâi"
        });
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGioiTinh = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTinChi = new javax.swing.JTable();
        canvas1 = new java.awt.Canvas();
        jLabel5 = new javax.swing.JLabel();
        cboMaKhoa = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDoiMK = new javax.swing.JMenuItem();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        btnNopHP = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký tín chỉ");

        tblTinChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn học", "Tên môn học", "Mã khoa", "Số tín chỉ", "Học phí/tín", "Tổng tiền", "Trạng thái"
            }
        ));
        tblTinChi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblTinChi);
        if (tblTinChi.getColumnModel().getColumnCount() > 0) {
            tblTinChi.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTinChi.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setText("Lựa chọn");

        cboMaKhoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bắt buộc", "Tự chọn", "Tất cả" }));
        cboMaKhoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaKhoaItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("ĐĂNG KÝ TÍN CHỈ");

        lblUsername.setText("Xin chào");

        lblTong.setText("Tổng:");

        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy đăng ký");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
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

        btnNopHP.setText("Nộp học phí");
        btnNopHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopHPActionPerformed(evt);
            }
        });
        jMenu1.add(btnNopHP);

        mnbMenu.add(jMenu1);

        jMenu7.setText("Liên hệ");
        mnbMenu.add(jMenu7);
        mnbMenu.add(mnUser);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnTimKiem)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(lblTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(114, 114, 114)
                                .addComponent(btnDangKy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHuy))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(894, 894, 894)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTong)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangKy)
                            .addComponent(btnTimKiem)
                            .addComponent(btnHuy))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnNopHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopHPActionPerformed
        NopHocPhi frmHP = new NopHocPhi(username);
        frmHP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNopHPActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        TrangChu frmTrangChu = new TrangChu(username);
        frmTrangChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn muốn đăng ký môn học này?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                int row = tblTinChi.getSelectedRow();
                TinChi tc = new TinChi();
                tc.setMaSV(tcModify.getMaSV(username));
                tc.setMaMH(tblTinChi.getValueAt(row, 0).toString());
                tc.setSoTC((int) tblTinChi.getValueAt(row, 3));
                tc.setHocPhi((int) tblTinChi.getValueAt(row, 4));
                if (tcModify.addTinChi(tc)) {
                    JOptionPane.showMessageDialog(null, "Đăng ký thành công");
                    showTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Môn học đã được đăng ký");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn môn học");
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void cboMaKhoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaKhoaItemStateChanged
        if (cboMaKhoa.getSelectedItem().toString().equalsIgnoreCase("Bắt buộc")) {
            listMH = mhModify.getListBB(svModify.getKhoa(username));
        } else if (cboMaKhoa.getSelectedItem().toString().equalsIgnoreCase("Tự chọn")) {
            listMH = mhModify.getListTC(svModify.getKhoa(username));
        } else {
            listMH = mhModify.getListMH();
        }
        model.setRowCount(0);
        listMH.forEach((mh) -> {
            model.addRow(new Object[]{mh.getMaMH(), mh.getTenMH(),
                mh.getMaKhoa(), mh.getSoTC(), mh.getHocPhi(),
                mh.getSoTC() * mh.getHocPhi(), tcModify.checkTinChi(tcModify.getMaSV(username), mh.getMaMH())});
        });
    }//GEN-LAST:event_cboMaKhoaItemStateChanged

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (!txtTimKiem.getText().equalsIgnoreCase("")) {
            listMH = mhModify.getListTK(txtTimKiem.getText().trim());
            model.setRowCount(0);
            listMH.forEach((mh) -> {
                model.addRow(new Object[]{mh.getMaMH(), mh.getTenMH(),
                    mh.getMaKhoa(), mh.getSoTC(), mh.getHocPhi(),
                    mh.getSoTC() * mh.getHocPhi(), tcModify.checkTinChi(tcModify.getMaSV(username), mh.getMaMH())});
            });
        } else {
            showTable();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn muốn hủy đăng ký môn học này?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                int row = tblTinChi.getSelectedRow();
                String masv = svModify.getMaSV(username);
                String mamh = tblTinChi.getValueAt(row, 0).toString();
                if (tblTinChi.getValueAt(row, 6).toString().equalsIgnoreCase("Chưa đăng ký")) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa đăng ký môn học này");
                } else if (tcModify.xoaTinChi(masv, mamh)) {
                    JOptionPane.showMessageDialog(null, "Hủy đăng ký thành công");
                    showTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Môn học chưa đăng ký");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn môn học");
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyTinChi(username).setVisible(true);
            }
        });
    }

    private void showTable() {
        listMH = mhModify.getListMH();
        model.setRowCount(0);
        listMH.forEach((mh) -> {
            model.addRow(new Object[]{mh.getMaMH(), mh.getTenMH(),
                mh.getMaKhoa(), mh.getSoTC(), mh.getHocPhi(),
                mh.getSoTC() * mh.getHocPhi(), tcModify.checkTinChi(tcModify.getMaSV(username), mh.getMaMH())});
        });
        lblTong.setText("Phải đóng: " + tcModify.getHocPhi(tcModify.getMaSV(username)) + " đ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JMenuItem btnDoiMK;
    private javax.swing.JButton btnHuy;
    private javax.swing.JMenuItem btnNopHP;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JMenuItem btnTrangChu;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox cboMaKhoa;
    private javax.swing.ButtonGroup grGioiTinh;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTong;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JTable tblTinChi;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
