package view;

import controller.SinhVienModify;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import model.Lop;
import controller.LopModify;
import controller.TaiKhoanModify;
import model.DigitsDocument;

public class ThongTinSinhVien extends javax.swing.JFrame {

    String State = "";
    String FileName = "";
    static String username = "";
    private TaiKhoanModify tkModify = new TaiKhoanModify();
    private SinhVienModify svModify = new SinhVienModify();
    private ArrayList<SinhVien> list;
    private LopModify lopModify = new LopModify();
    private ArrayList<Lop> listLop;
    private DefaultTableModel model;

    public ThongTinSinhVien(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.username = user;
        lblUsername.setText("Xin chào " + user);
        model = (DefaultTableModel) tblSV.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sinh viên", "Tên sinh viên", "Mã lớp", "Giới tính",
            "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ", "Ảnh"
        });
        txtSDT.setDocument(new DigitsDocument());
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGioiTinh = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        txtMaSV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        pnAnh = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAnh = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        dcNgaySinh = new com.toedter.calendar.JDateChooser();
        cboMaLop = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        mnbMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnDoiMK = new javax.swing.JMenuItem();
        btnDangXuat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnTrangChu = new javax.swing.JMenuItem();
        btnTaiKhoan = new javax.swing.JMenuItem();
        btnQLGV = new javax.swing.JMenuItem();
        btnQLK = new javax.swing.JMenuItem();
        btnQLL = new javax.swing.JMenuItem();
        btnQLMH = new javax.swing.JMenuItem();
        btnQLHP = new javax.swing.JMenuItem();
        btnQLPC = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin sinh viên");

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Mã lớp", "Giới tính", "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ", "Ảnh"
            }
        ));
        tblSV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        tblSV.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblSVPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblSV);
        if (tblSV.getColumnModel().getColumnCount() > 0) {
            tblSV.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        jLabel1.setText("Mã sinh viên");

        jLabel2.setText("Giới tính");

        jLabel3.setText("Tên sinh viên");

        pnAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnAnhLayout = new javax.swing.GroupLayout(pnAnh);
        pnAnh.setLayout(pnAnhLayout);
        pnAnhLayout.setHorizontalGroup(
            pnAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        pnAnhLayout.setVerticalGroup(
            pnAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        jLabel4.setText("Ảnh");

        btnAnh.setText("...");
        btnAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnhActionPerformed(evt);
            }
        });

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

        jLabel5.setText("Mã lớp");

        jLabel6.setText("Số điện thoại");

        jLabel7.setText("Ngày sinh");

        jLabel8.setText("Email");

        jLabel10.setText("Địa chỉ");

        grGioiTinh.add(rdoNam);
        rdoNam.setText("Nam");

        grGioiTinh.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("DANH SÁCH SINH VIÊN");

        lblUsername.setText("Xin chào");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnTimKiem)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnThem)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnSua)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnXoa)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnGhi)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnBoQua)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(33, 33, 33)
                                        .addComponent(pnAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5))
                                                .addGap(73, 73, 73)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(rdoNam)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rdoNu))
                                                    .addComponent(cboMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtMaSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(123, 123, 123)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtEmail)
                                                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(dcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
                                        .addGap(140, 140, 140))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(540, 540, 540))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnAnh)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnBoQua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if (State == "Insert") {
            if (txtMaSV.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập mã sinh viên");
            } else if (svModify.checkID(txtMaSV.getText())) {
                JOptionPane.showMessageDialog(null, "Trùng mã sinh viên");
            } else if (txtTenSV.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên sinh viên");
            } else if (txtEmail.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập email");
            } else if (svModify.checkEmail(txtEmail.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Email đã có người dùng");
            } else if (txtSDT.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập số điện thoại");
            } else if (svModify.checkSDT(txtSDT.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Trùng số điện thoại");
            } else if (txtDiaChi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập địa chỉ");
            } else if (FileName.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa chọn ảnh");
            } else {
                try {
                    SinhVien sv = new SinhVien();
                    sv.setMaSV(txtMaSV.getText());
                    sv.setTenSV(txtTenSV.getText());
                    sv.setMaLop(cboMaLop.getSelectedItem().toString());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(dcNgaySinh.getDate());
                    sv.setNgaySinh(date);

                    if (rdoNam.isSelected()) {
                        sv.setGioiTinh("Nam");
                    } else {
                        sv.setGioiTinh("Nữ");
                    }
                    sv.setEmail(txtEmail.getText());
                    sv.setSDT(txtSDT.getText());
                    sv.setDiaChi(txtDiaChi.getText());
                    sv.setHinh(FileName);
                    if (svModify.addSV(sv)) {
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                        showTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm không thành công");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra dữ liệu đã nhập");
                }
            }
        } else if (State == "Update") {
            if (txtTenSV.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập tên sinh viên");
            } else if (txtEmail.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập email");
            } else if (txtSDT.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập số điện thoại");
            } else if (txtDiaChi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa nhập địa chỉ");
            } else if (FileName.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Chưa chọn ảnh");
            } else {
                try {

                    SinhVien sv = new SinhVien();
                    sv.setMaSV(txtMaSV.getText());
                    sv.setTenSV(txtTenSV.getText());
                    sv.setMaLop(cboMaLop.getSelectedItem().toString());

                    if (rdoNam.isSelected()) {
                        sv.setGioiTinh("Nam");
                    } else {
                        sv.setGioiTinh("Nữ");
                    }
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(dcNgaySinh.getDate());
                    sv.setNgaySinh(date);

                    sv.setEmail(txtEmail.getText());
                    sv.setSDT(txtSDT.getText());
                    sv.setDiaChi(txtDiaChi.getText());
                    sv.setHinh(FileName);
                    if (svModify.updateSV(sv)) {
                        JOptionPane.showMessageDialog(null, "Sửa thành công");
                        showTable();
                    }
                    else JOptionPane.showMessageDialog(null, "Sửa không thành công");
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

        txtMaSV.setEditable(true);

        rdoNam.setSelected(true);

        showTable();
    }//GEN-LAST:event_btnBoQuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        State = "Insert";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaSV.setText("");
        txtTenSV.setText("");
        cboMaLop.setSelectedIndex(0);
        txtEmail.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");

        rdoNam.isSelected();

        lblAnh.setIcon(null);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        State = "Update";
        btnGhi.setEnabled(true);
        btnBoQua.setEnabled(true);

        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(false);

        txtMaSV.setEditable(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", null, JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                String msv = model.getValueAt(tblSV.getSelectedRow(), 0).toString();
                if (svModify.deletedSV(msv)) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showTable();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn sinh viên");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblSVPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSVPropertyChange
    }//GEN-LAST:event_tblSVPropertyChange

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        int row = tblSV.getSelectedRow();
        txtMaSV.setText(tblSV.getValueAt(row, 0).toString());
        txtTenSV.setText(tblSV.getValueAt(row, 1).toString());
        cboMaLop.setSelectedItem(tblSV.getValueAt(row, 2).toString());
        if (tblSV.getValueAt(row, 3).toString().equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblSV.getValueAt(row, 4));
            dcNgaySinh.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtEmail.setText(tblSV.getValueAt(row, 5).toString());
        txtSDT.setText(tblSV.getValueAt(row, 6).toString());
        txtDiaChi.setText(tblSV.getValueAt(row, 7).toString());
        loadImage(tblSV.getValueAt(row, 8).toString());
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhActionPerformed
        JFileChooser c = new JFileChooser();
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String dir = c.getCurrentDirectory().toString();
            FileName = dir + "\\" + c.getSelectedFile().getName();
            loadImage(FileName);
        }
    }//GEN-LAST:event_btnAnhActionPerformed

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

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (txtTimKiem.getText().trim().equalsIgnoreCase("")) {
            showTable();
        } else {
            list = svModify.getListTK(txtTimKiem.getText().trim());
            model.setRowCount(0);
            list.forEach((sv) -> {
                model.addRow(new Object[]{sv.getMaSV(), sv.getTenSV(), sv.getMaLop(), sv.getGioiTinh(),
                    sv.getNgaySinh(), sv.getEmail(), sv.getSDT(), sv.getDiaChi(), sv.getHinh()});
            });
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnQLPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPCActionPerformed
        QuanLyPhanCong frmPC = new QuanLyPhanCong(username);
        frmPC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQLPCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinSinhVien(username).setVisible(true);
            }
        });
    }

    void loadImage(String link) {
        File file = new File(link);
        BufferedImage bi;
        try {
            bi = ImageIO.read(file);
            lblAnh.setIcon(new ImageIcon(bi));
        } catch (Exception e) {
        }
    }

    private void showTable() {
        list = svModify.getListSV();
        model.setRowCount(0);
        list.forEach((sv) -> {
            model.addRow(new Object[]{sv.getMaSV(), sv.getTenSV(), sv.getMaLop(), sv.getGioiTinh(),
                sv.getNgaySinh(), sv.getEmail(), sv.getSDT(), sv.getDiaChi(), sv.getHinh()});
        });
        getMaLop();
        //
        if (list.size() > 0) {
            txtMaSV.setText(tblSV.getValueAt(0, 0).toString());
            txtTenSV.setText(tblSV.getValueAt(0, 1).toString());
            cboMaLop.setSelectedItem(tblSV.getValueAt(0, 2).toString());
            if (tblSV.getValueAt(0, 3).toString().equalsIgnoreCase("Nam")) {
                rdoNam.setSelected(true);
            } else {
                rdoNu.setSelected(true);
            }
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblSV.getValueAt(0, 4));
                dcNgaySinh.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(ThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtEmail.setText(tblSV.getValueAt(0, 5).toString());
            txtSDT.setText(tblSV.getValueAt(0, 6).toString());
            txtDiaChi.setText(tblSV.getValueAt(0, 7).toString());
            loadImage(tblSV.getValueAt(0, 8).toString());
        }
        btnGhi.setEnabled(false);
    }

    void getMaLop() {
        cboMaLop.removeAllItems();
        listLop = lopModify.getListLop();
        for (Lop lop : listLop) {
            cboMaLop.addItem(lop.getMaLop());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnh;
    private javax.swing.JButton btnBoQua;
    private javax.swing.JMenuItem btnDangXuat;
    private javax.swing.JMenuItem btnDoiMK;
    private javax.swing.JButton btnGhi;
    private javax.swing.JMenuItem btnQLGV;
    private javax.swing.JMenuItem btnQLHP;
    private javax.swing.JMenuItem btnQLK;
    private javax.swing.JMenuItem btnQLL;
    private javax.swing.JMenuItem btnQLMH;
    private javax.swing.JMenuItem btnQLPC;
    private javax.swing.JButton btnSua;
    private javax.swing.JMenuItem btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JMenuItem btnTrangChu;
    private javax.swing.JButton btnXoa;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox cboMaLop;
    private com.toedter.calendar.JDateChooser dcNgaySinh;
    private javax.swing.ButtonGroup grGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JPanel pnAnh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
