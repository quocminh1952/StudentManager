package view;

import controller.SinhVienModify;
import controller.TinChiModify;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.TinChi;
import controller.MonHocModify;

public class NopHocPhi extends javax.swing.JFrame {

    private static String username = "";
    private static int money = 0;
    private TinChiModify tcModify = new TinChiModify();
    private ArrayList<TinChi> list;
    private SinhVienModify svModify = new SinhVienModify();
    private MonHocModify mhModify = new MonHocModify();
    private DefaultTableModel model;

    public NopHocPhi(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        if (svModify.getName(username).equalsIgnoreCase("")) {
            lblUsername.setText("Xin chào " + user);
        } else {
            lblUsername.setText("Xin chào " + svModify.getName(username));
        }
        model = (DefaultTableModel) tblNopHP.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Tên môn học", "Số tín chỉ", "Tổng tiền"});
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnNop = new javax.swing.JButton();
        lblTong = new javax.swing.JLabel();
        lblConLai = new javax.swing.JLabel();
        lblDaDong = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNopHP = new javax.swing.JTable();
        lblTong1 = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDoiMK = new javax.swing.JMenuItem();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        btnDKTC = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nộp học phí");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("NỘP HỌC PHÍ");

        lblUsername.setText("Xin chào");

        btnNop.setText("Nộp học phí");
        btnNop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopActionPerformed(evt);
            }
        });

        lblTong.setText("Tổng:");

        lblConLai.setText("Còn lại:");

        lblDaDong.setText("Đã đóng:");

        tblNopHP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên môn học", "Số tín chỉ", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblNopHP);

        lblTong1.setText("(Số dư sẽ được trừ vào học phí kì tiếp theo)");

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

        btnDKTC.setText("Đăng ký tín chỉ");
        btnDKTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDKTCActionPerformed(evt);
            }
        });
        jMenu1.add(btnDKTC);

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
                        .addContainerGap(509, Short.MAX_VALUE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConLai, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDaDong)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lblTong1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btnNop)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDaDong)
                        .addGap(55, 55, 55)
                        .addComponent(lblConLai)
                        .addGap(56, 56, 56)
                        .addComponent(lblTong)
                        .addGap(39, 39, 39)
                        .addComponent(lblTong1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNop)
                        .addGap(49, 49, 49))))
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

    private void btnDKTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDKTCActionPerformed
        DangKyTinChi frmDKTC = new DangKyTinChi(username);
        frmDKTC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDKTCActionPerformed

    private void btnNopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopActionPerformed
        try {
            JTextField txtHP = new JTextField();
            int choose = JOptionPane.showConfirmDialog(null, txtHP, "Nhập số tiền muốn nộp", JOptionPane.OK_CANCEL_OPTION);
            if (choose == JOptionPane.OK_OPTION) {
                if (txtHP.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Chưa nhập số tiền");
                } else if (list.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa đăng ký môn học nào");
                } else {
                    money += Integer.parseInt(txtHP.getText());
                    if (tcModify.nopHP(svModify.getMaSV(username), money)) {
                        JOptionPane.showMessageDialog(null, "Nộp học phí thành công");
                        showTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Nộp học phí không thành công");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
        }
    }//GEN-LAST:event_btnNopActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NopHocPhi(username).setVisible(true);
            }
        });
    }

    private void showTable() {
        list = tcModify.getListTC(tcModify.getMaSV(username));
        model.setRowCount(0);
        list.forEach((tc) -> {
            model.addRow(new Object[]{mhModify.getTenMH(tc.getMaMH()), tc.getSoTC(),
                tc.getSoTC() * tc.getHocPhi()});
        });
        money = tcModify.getDaDong(tcModify.getMaSV(username));
        int conlai = (tcModify.getHocPhi(tcModify.getMaSV(username)) - tcModify.getDaDong(tcModify.getMaSV(username)));
        if (conlai >= 0) {
            lblConLai.setText("Còn nợ: " + conlai + " đ");
        } else {
            lblConLai.setText("Còn dư: " + -1 * conlai + " đ");
        }
        lblDaDong.setText("Đã đóng: " + money + " đ");
        lblTong.setText("Phải đóng: " + tcModify.getHocPhi(tcModify.getMaSV(username)) + " đ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnDKTC;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JMenuItem btnDoiMK;
    private javax.swing.JButton btnNop;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConLai;
    private javax.swing.JLabel lblDaDong;
    private javax.swing.JLabel lblTong;
    private javax.swing.JLabel lblTong1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JTable tblNopHP;
    // End of variables declaration//GEN-END:variables
}
