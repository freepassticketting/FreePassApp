/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.tampilan;

import freepass.control.ControlAbsensi;
import freepass.model.ManajDashboard;
import freepass.model.ManajemenAbsensi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author nufail
 */
public class AbsensiAdmin extends javax.swing.JFrame {
    public boolean AbsenBaru;
    public AbsensiAdmin() {
        initComponents();
        loadDashboard();
        new ManajemenAbsensi().loadData2Tabel(jtabelabsen);
        setWaktu();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdBtnGroupIzin = new javax.swing.ButtonGroup();
        Dashboard = new javax.swing.JPanel();
        InfoAbsen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelRekap = new javax.swing.JTable();
        panelmakeOver2 = new komponenMakeOver.panelmakeOver();
        jLabel1 = new javax.swing.JLabel();
        panelmakeOver1 = new komponenMakeOver.panelmakeOver();
        jLabel10 = new javax.swing.JLabel();
        lblProsentaseKehadiran = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblJmPegawai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelIzin = new javax.swing.JPanel();
        panelmakeOver3 = new komponenMakeOver.panelmakeOver();
        jLabel4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtAbsen_nip = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtAbsen_tanggal = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        radAbsen_izin = new javax.swing.JRadioButton();
        radAbsen_cuti = new javax.swing.JRadioButton();
        txtAbsen_keterangan = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btnAbsen_tambah = new javax.swing.JButton();
        btnAbsen_ubah = new javax.swing.JButton();
        btnAbsen_hapus = new javax.swing.JButton();
        btnAbsen_simpan = new javax.swing.JButton();
        lblTanggal = new javax.swing.JLabel();
        lblJam = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtabelabsen = new javax.swing.JTable();
        PanelPegawai = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manajemen Karyawan");
        getContentPane().setLayout(new java.awt.CardLayout());

        InfoAbsen.setBorder(javax.swing.BorderFactory.createTitledBorder("Info Absen"));

        TabelRekap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "NIP", "Nama", "Jabatan", "Jam Masuk", "Jam Keluar"
            }
        ));
        jScrollPane1.setViewportView(TabelRekap);

        javax.swing.GroupLayout InfoAbsenLayout = new javax.swing.GroupLayout(InfoAbsen);
        InfoAbsen.setLayout(InfoAbsenLayout);
        InfoAbsenLayout.setHorizontalGroup(
            InfoAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        InfoAbsenLayout.setVerticalGroup(
            InfoAbsenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoAbsenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Swis721 WGL4 BT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freepass/img/customers.png"))); // NOI18N
        jLabel1.setText(" Rekapitulasi Presensi Karyawan");

        javax.swing.GroupLayout panelmakeOver2Layout = new javax.swing.GroupLayout(panelmakeOver2);
        panelmakeOver2.setLayout(panelmakeOver2Layout);
        panelmakeOver2Layout.setHorizontalGroup(
            panelmakeOver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmakeOver2Layout.setVerticalGroup(
            panelmakeOver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Persentase Kehadiran :");

        lblProsentaseKehadiran.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        lblProsentaseKehadiran.setForeground(new java.awt.Color(255, 255, 255));
        lblProsentaseKehadiran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProsentaseKehadiran.setText("100,00 %");
        lblProsentaseKehadiran.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jumlah Karyawan :");

        lblJmPegawai.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        lblJmPegawai.setForeground(new java.awt.Color(255, 255, 255));
        lblJmPegawai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJmPegawai.setText("2759");
        lblJmPegawai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Orang");

        javax.swing.GroupLayout panelmakeOver1Layout = new javax.swing.GroupLayout(panelmakeOver1);
        panelmakeOver1.setLayout(panelmakeOver1Layout);
        panelmakeOver1Layout.setHorizontalGroup(
            panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelmakeOver1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblJmPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProsentaseKehadiran, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmakeOver1Layout.setVerticalGroup(
            panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProsentaseKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJmPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoAbsen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelmakeOver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelmakeOver2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(panelmakeOver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InfoAbsen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelmakeOver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(Dashboard, "card2");

        jLabel4.setFont(new java.awt.Font("Swis721 WGL4 BT", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freepass/img/customers.png"))); // NOI18N
        jLabel4.setText("  Absen Izin/Cuti");

        javax.swing.GroupLayout panelmakeOver3Layout = new javax.swing.GroupLayout(panelmakeOver3);
        panelmakeOver3.setLayout(panelmakeOver3Layout);
        panelmakeOver3Layout.setHorizontalGroup(
            panelmakeOver3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmakeOver3Layout.setVerticalGroup(
            panelmakeOver3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel33.setText("NIP");

        txtAbsen_nip.setBackground(new java.awt.Color(249, 249, 249));
        txtAbsen_nip.setEnabled(false);
        txtAbsen_nip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbsen_nipActionPerformed(evt);
            }
        });

        jLabel34.setText("Tanggal");

        txtAbsen_tanggal.setBackground(new java.awt.Color(249, 249, 249));
        txtAbsen_tanggal.setToolTipText("");
        txtAbsen_tanggal.setDateFormatString("yyyy-MM-d");
        txtAbsen_tanggal.setEnabled(false);
        txtAbsen_tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtAbsen_tanggalPropertyChange(evt);
            }
        });

        jLabel35.setText("Jenis");

        radAbsen_izin.setBackground(new java.awt.Color(204, 204, 204));
        rdBtnGroupIzin.add(radAbsen_izin);
        radAbsen_izin.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        radAbsen_izin.setText("Izin");
        radAbsen_izin.setEnabled(false);
        radAbsen_izin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAbsen_izinActionPerformed(evt);
            }
        });

        radAbsen_cuti.setBackground(new java.awt.Color(204, 204, 204));
        rdBtnGroupIzin.add(radAbsen_cuti);
        radAbsen_cuti.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        radAbsen_cuti.setText("Cuti");
        radAbsen_cuti.setEnabled(false);

        txtAbsen_keterangan.setBackground(new java.awt.Color(249, 249, 249));
        txtAbsen_keterangan.setEnabled(false);
        txtAbsen_keterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbsen_keteranganActionPerformed(evt);
            }
        });

        jLabel32.setText("Keterangan");

        btnAbsen_tambah.setText("Tambah");
        btnAbsen_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsen_tambahActionPerformed(evt);
            }
        });

        btnAbsen_ubah.setText("Ubah");
        btnAbsen_ubah.setEnabled(false);
        btnAbsen_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsen_ubahActionPerformed(evt);
            }
        });

        btnAbsen_hapus.setText("Hapus");
        btnAbsen_hapus.setEnabled(false);
        btnAbsen_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsen_hapusActionPerformed(evt);
            }
        });

        btnAbsen_simpan.setText("Simpan");
        btnAbsen_simpan.setEnabled(false);
        btnAbsen_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsen_simpanActionPerformed(evt);
            }
        });

        lblTanggal.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblTanggal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freepass/img/IconDate.png"))); // NOI18N
        lblTanggal.setText("Sabtu, 21 Mei 2016");

        lblJam.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lblJam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freepass/img/IconClock.png"))); // NOI18N
        lblJam.setText("07 : 08 : 55");

        jLabel36.setText(":");

        jLabel37.setText(":");

        jLabel38.setText(":");

        jLabel39.setText(":");

        jtabelabsen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "NIP", "Nama", "Jabatan", "Cuti/Izin", "Keterangan", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabelabsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabelabsenMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtabelabsen);

        javax.swing.GroupLayout PanelIzinLayout = new javax.swing.GroupLayout(PanelIzin);
        PanelIzin.setLayout(PanelIzinLayout);
        PanelIzinLayout.setHorizontalGroup(
            PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmakeOver3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addGroup(PanelIzinLayout.createSequentialGroup()
                        .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelIzinLayout.createSequentialGroup()
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAbsen_nip)
                                    .addComponent(txtAbsen_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelIzinLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzinLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelIzinLayout.createSequentialGroup()
                                        .addComponent(radAbsen_izin)
                                        .addGap(18, 18, 18)
                                        .addComponent(radAbsen_cuti))
                                    .addComponent(txtAbsen_keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
                            .addGroup(PanelIzinLayout.createSequentialGroup()
                                .addComponent(btnAbsen_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbsen_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)
                                .addComponent(btnAbsen_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbsen_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43)))
                        .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblJam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelIzinLayout.setVerticalGroup(
            PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzinLayout.createSequentialGroup()
                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIzinLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJam))
                    .addGroup(PanelIzinLayout.createSequentialGroup()
                        .addComponent(panelmakeOver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAbsen_nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(radAbsen_izin)
                            .addComponent(radAbsen_cuti)
                            .addComponent(jLabel37)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAbsen_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtAbsen_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelIzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbsen_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbsen_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbsen_hapus)
                            .addComponent(btnAbsen_simpan))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelIzinLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAbsen_hapus, btnAbsen_simpan, btnAbsen_tambah, btnAbsen_ubah});

        PanelIzinLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAbsen_keterangan, txtAbsen_nip});

        getContentPane().add(PanelIzin, "card3");

        javax.swing.GroupLayout PanelPegawaiLayout = new javax.swing.GroupLayout(PanelPegawai);
        PanelPegawai.setLayout(PanelPegawaiLayout);
        PanelPegawaiLayout.setHorizontalGroup(
            PanelPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        PanelPegawaiLayout.setVerticalGroup(
            PanelPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );

        getContentPane().add(PanelPegawai, "card4");

        jMenu1.setText("File");

        jMenuItem1.setText("Rekap Absen All");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Report Absen Harian");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Panel Perizinan/Cuti");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Manajemen Pegawai");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAbsen_nipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbsen_nipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbsen_nipActionPerformed

    private void txtAbsen_tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtAbsen_tanggalPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAbsen_tanggalPropertyChange

    private void radAbsen_izinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAbsen_izinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radAbsen_izinActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Dashboard.setVisible(false);
        PanelPegawai.setVisible(false);
        PanelIzin.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PanelIzin.setVisible(false);
        PanelPegawai.setVisible(false);
        Dashboard.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAbsen_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsen_tambahActionPerformed
        AbsenBaru = true;
        setTextEnable();
        btnAbsen_ubah.setEnabled(false);
        btnAbsen_hapus.setEnabled(false);
    }//GEN-LAST:event_btnAbsen_tambahActionPerformed

    private void txtAbsen_keteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbsen_keteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbsen_keteranganActionPerformed

    private void btnAbsen_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsen_simpanActionPerformed
        String absen_nip = txtAbsen_nip.getText();
        String absen_tanggal = "";
        if(txtAbsen_tanggal.getDate() != null){
            SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd");
            absen_tanggal = Format.format(txtAbsen_tanggal.getDate());
        }
        String absen_izin = "";
        if(rdBtnGroupIzin.getSelection().equals(radAbsen_cuti.getModel()))
            absen_izin = "Cuti";
        else if(rdBtnGroupIzin.getSelection().equals(radAbsen_izin.getModel()))
            absen_izin = "Izin";
        else JOptionPane.showMessageDialog(rootPane, "Harap isi semua field");

        String absen_keterangan = txtAbsen_keterangan.getText();
        ControlAbsensi ctrAbs = new ControlAbsensi();
        ctrAbs.setNip(absen_nip);
        ctrAbs.setTanggal(absen_tanggal);
        ctrAbs.setAbsen(absen_izin);
        ctrAbs.setKeterangan(absen_keterangan);
        if(AbsenBaru==true){
            if( "".equals(absen_nip) | txtAbsen_tanggal.getDate()== null | rdBtnGroupIzin.getSelection() == null | "".equals(absen_keterangan) )
                JOptionPane.showMessageDialog(rootPane, "Harap isi semua field");               
            else{    
                int confirmSimpan = JOptionPane.showConfirmDialog(rootPane,"Apakah anda data tersebut sudah benar?","Mengimput data",JOptionPane.YES_NO_OPTION );
                if(confirmSimpan == JOptionPane.YES_OPTION){
                    try {
                        ManajemenAbsensi manaAbs = new ManajemenAbsensi();
                        if(manaAbs.cekPegawai(ctrAbs)==true){
                            if(manaAbs.cekDuplikasi(ctrAbs) == true){
                                int ubahData = JOptionPane.showConfirmDialog(this, 
                                    "Data tersebut sudah ada di database. \n"
                                    + "apakah anda yakin mau merubahnya?", "Ubah data absen", 
                                    JOptionPane.YES_NO_CANCEL_OPTION);
                                if(ubahData == JOptionPane.YES_OPTION){
                                    try{
                                        int no=manaAbs.getRec(ctrAbs);
                                        ctrAbs.setNo(no);
                                        manaAbs.ubahAbsen(ctrAbs);  
                                        JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah", "Data berhasil diubah",JOptionPane.INFORMATION_MESSAGE);
                                    }catch(SQLException ex){
                                       JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan mengubah data","Kesalahan Mengubah data",JOptionPane.ERROR_MESSAGE);
                                        Logger.getLogger(AbsensiAdmin.class.getName()).log(Level.SEVERE, null, ex); 
                                    }finally{
                                        new ManajemenAbsensi().loadData2Tabel(jtabelabsen);
                                    }
                                }else if(ubahData == JOptionPane.NO_OPTION) setTextDisable();
                            }else{
                                try{
                                    manaAbs.tambahAbsen(ctrAbs);
                                    JOptionPane.showMessageDialog(rootPane, "Data berhasil ditambah", "Data berhasil ditambah",JOptionPane.INFORMATION_MESSAGE);
                                }catch(SQLException ex){
                                    JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan menambahkan data","Kesalahan Menambah Data",JOptionPane.ERROR_MESSAGE);
                                    Logger.getLogger(AbsensiAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                }finally{
                                    manaAbs.loadData2Tabel(jtabelabsen);
                                }
                            }
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Pegawai dengan nip "+ctrAbs.getNip()+" tidak ditemukan","Tidak ditemukan",JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AbsensiAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }else{
            int row = jtabelabsen.getSelectedRow();
            int No = Integer.parseInt(jtabelabsen.getModel().getValueAt(row, 0).toString());
            ctrAbs.setNo(No);
            try{
                ManajemenAbsensi manaAbs = new ManajemenAbsensi();
                manaAbs.ubahAbsen(ctrAbs);  
                JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah", "Data berhasil diubah",JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
               JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan mengubah data","Kesalahan Mengubah data",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(AbsensiAdmin.class.getName()).log(Level.SEVERE, null, ex); 
            }finally{
                new ManajemenAbsensi().loadData2Tabel(jtabelabsen);
            }
        }
        setTextDisable();
        btnAbsen_tambah.setEnabled(true);
    }//GEN-LAST:event_btnAbsen_simpanActionPerformed

    private void btnAbsen_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsen_ubahActionPerformed
        AbsenBaru = false;
        int ubahData = JOptionPane.showConfirmDialog(this, 
            "Apakah anda yakin mau merubahnya?", "Ubah data absen", 
            JOptionPane.YES_NO_CANCEL_OPTION);
        if(ubahData == JOptionPane.YES_OPTION){
            setTextEnable();
            btnAbsen_tambah.setEnabled(false);
            btnAbsen_hapus.setEnabled(false);
            btnAbsen_ubah.setEnabled(false);
        }
    }//GEN-LAST:event_btnAbsen_ubahActionPerformed

    private void jtabelabsenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabelabsenMouseClicked
        setTextDisable();
        btnAbsen_hapus.setEnabled(true);
        btnAbsen_ubah.setEnabled(true);
        int row = jtabelabsen.getSelectedRow();
        Date tanggal = ( Date )jtabelabsen.getValueAt(row, 1);
        txtAbsen_tanggal.setDate(tanggal);
        
        String nip = (String) jtabelabsen.getValueAt(row, 2);
        txtAbsen_nip.setText(nip);

        String cuti_izin = (String) jtabelabsen.getValueAt(row, 5);
        if(cuti_izin.equals("Cuti")) radAbsen_cuti.setSelected(true);
        else radAbsen_izin.setSelected(true);
        
        String keterangan = (String) jtabelabsen.getValueAt(row, 6);
        txtAbsen_keterangan.setText(keterangan);
    }//GEN-LAST:event_jtabelabsenMouseClicked

    private void btnAbsen_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsen_hapusActionPerformed
        ControlAbsensi ctrAbs = new ControlAbsensi();
        int row = jtabelabsen.getSelectedRow();
        int No = Integer.parseInt(jtabelabsen.getModel().getValueAt(row, 0).toString());
        ctrAbs.setNo(No);
        int konfirmasiHapus = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin akan menghapus data absensi tersebut?", "Hapus Pegawai", JOptionPane.YES_NO_OPTION);
        if(konfirmasiHapus == JOptionPane.YES_OPTION){
            try{
                ManajemenAbsensi manAbs = new ManajemenAbsensi();
                manAbs.hapusPegawai(ctrAbs);
                JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus", "Berhasil Menghapus Data",JOptionPane.INFORMATION_MESSAGE);
                setTextDisable();
                btnAbsen_hapus.setEnabled(false);
                btnAbsen_ubah.setEnabled(false);
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan menghapus data","Kesalahan Menghapus Data",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(AbsensiAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                new ManajemenAbsensi().loadData2Tabel(jtabelabsen);
            }
        }
    }//GEN-LAST:event_btnAbsen_hapusActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Dashboard.setVisible(false);
        PanelIzin.setVisible(false);
        PanelPegawai.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbsensiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbsensiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbsensiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbsensiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbsensiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel InfoAbsen;
    private javax.swing.JPanel PanelIzin;
    private javax.swing.JPanel PanelPegawai;
    private javax.swing.JTable TabelRekap;
    private javax.swing.JButton btnAbsen_hapus;
    private javax.swing.JButton btnAbsen_simpan;
    private javax.swing.JButton btnAbsen_tambah;
    private javax.swing.JButton btnAbsen_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jtabelabsen;
    private javax.swing.JLabel lblJam;
    private javax.swing.JLabel lblJmPegawai;
    private javax.swing.JLabel lblProsentaseKehadiran;
    private javax.swing.JLabel lblTanggal;
    private komponenMakeOver.panelmakeOver panelmakeOver1;
    private komponenMakeOver.panelmakeOver panelmakeOver2;
    private komponenMakeOver.panelmakeOver panelmakeOver3;
    private javax.swing.JRadioButton radAbsen_cuti;
    private javax.swing.JRadioButton radAbsen_izin;
    private javax.swing.ButtonGroup rdBtnGroupIzin;
    private javax.swing.JTextField txtAbsen_keterangan;
    private javax.swing.JTextField txtAbsen_nip;
    private com.toedter.calendar.JDateChooser txtAbsen_tanggal;
    // End of variables declaration//GEN-END:variables

    private void loadDashboard() {
        ManajDashboard mnd = new ManajDashboard();
        mnd.loadData2Tabel(TabelRekap);
        try {
            int pegawai = mnd.getJmPegawai();
            lblJmPegawai.setText(String.valueOf(pegawai));
            int hadir = mnd.getTotalHadir();
            int hari = mnd.getTotalHari();
            double persentase = hadir / hari;
            double persentase2 = persentase / pegawai;
            
            double persentase3 = persentase2 * 100;
            DecimalFormat df = new DecimalFormat("##,##");
            lblProsentaseKehadiran.setText(String.valueOf(df.format(persentase3))+" %");
        } catch (SQLException ex) {
            Logger.getLogger(AbsensiAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setWaktu() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date date=new Date();
                lblTanggal.setText(DateFormat.getDateInstance(DateFormat.FULL,new Locale("in","ID")).format(date));
                lblJam.setText(new SimpleDateFormat("HH : mm : ss").format(date));
                repaint();
            }
        });
        timer.start();
    }

    private void setTextEnable() {
        txtAbsen_keterangan.setEnabled(true);
        txtAbsen_nip.setEnabled(true);
        txtAbsen_tanggal.setEnabled(true);
        radAbsen_cuti.setEnabled(true);
        radAbsen_izin.setEnabled(true);
        btnAbsen_simpan.setEnabled(true);
    }

    private void setTextDisable() {
        txtAbsen_nip.setText("");
        txtAbsen_keterangan.setText("");
        radAbsen_izin.setSelected(false);
        radAbsen_cuti.setSelected(false);
        txtAbsen_tanggal.setDate(null);
        
        txtAbsen_nip.setEnabled(false);
        txtAbsen_tanggal.setEnabled(false);
        radAbsen_izin.setEnabled(false);
        radAbsen_cuti.setEnabled(false);
        txtAbsen_keterangan.setEnabled(false);
        btnAbsen_simpan.setEnabled(false);
    }

}
