package com.uas.pbo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author ashadipermana
 */
public class HomeForm extends javax.swing.JFrame {

    private PanelAdmin jPanelAdmin;
    private panelsaldo jpanelSaldo;
    private PanelTransaksi panelTransaksi;
    private JPanel jPanelHome;
    private Component[] homeComponents;
    private DbKoneksi dbKoneksi;
    private String fullname;

    /**
     * Creates new form HomeForm
     */
    public HomeForm(String fullname) {
        this.fullname = fullname;
        initComponents();
        additionalInitComponents();
        dbKoneksi = new DbKoneksi();
        setUserInfo(fullname);
        loadPanelItems();
        addHoverEffect(jLabel4);
        addHoverEffect(jLabel5);
        addHoverEffect(jLabel6);
        addClickListeners();
        PanelItem panelItem = new PanelItem();
        panelItem.updateImage();
        updateSaldoLabel(fullname);
        jpanelSaldo = new panelsaldo(fullname);
        panelTransaksi = new PanelTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        labelnama = new javax.swing.JLabel();
        btntambahsaldo = new javax.swing.JButton();
        lblsaldo = new javax.swing.JLabel();
        lblsaldo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EZFOOD");

        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 0, 255));
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        labelnama.setFont(new java.awt.Font("Poppins Black", 1, 14)); // NOI18N
        labelnama.setForeground(new java.awt.Color(255, 255, 255));
        labelnama.setText("jLabel2");

        btntambahsaldo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btntambahsaldo.setText("+");
        btntambahsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahsaldoActionPerformed(evt);
            }
        });

        lblsaldo.setFont(new java.awt.Font("Poppins Black", 1, 14)); // NOI18N
        lblsaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblsaldo.setText("jLabel2");

        lblsaldo1.setFont(new java.awt.Font("Poppins Black", 1, 14)); // NOI18N
        lblsaldo1.setForeground(new java.awt.Color(255, 255, 255));
        lblsaldo1.setText("Saldo Anda RP.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblsaldo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntambahsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlogout)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btntambahsaldo)
                    .addComponent(lblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaldo1))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HOME");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CHECKOUT");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additionalInitComponents() {
        jPanelAdmin = new PanelAdmin(); // Inisialisasi JPanelAdmin di luar initComponents
        jpanelSaldo = new panelsaldo(fullname);
        jPanelHome = new JPanel();
        jPanelHome.setLayout(jPanel3.getLayout());
        homeComponents = jPanel3.getComponents();
    }

   public int getSaldo(String fullname) {
    int saldo = 0;
    try (Connection conn = dbKoneksi.getConnection()) {
        String sql = "SELECT saldo FROM akun WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fullname);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    saldo = rs.getInt("saldo");
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return saldo;
}

    public String getFullname() {
        return fullname;
    }

    public void updateSaldo(String fullname, int newSaldo) {
    try (Connection conn = dbKoneksi.getConnection()) {
        String query = "UPDATE akun SET saldo = ? WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, newSaldo);
            stmt.setString(2, fullname);
            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    public void updateTransaksiPanel() {
        if (panelTransaksi != null) {
            panelTransaksi.loadTransaksi();
        }
    }


    public void addTransaksi(String username, String namaBarang, int hargaBarang) {
        try (Connection conn = dbKoneksi.getConnection()) {
            String query = "INSERT INTO transaksi (username, nama_gambar, harga, status) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, username);
                stmt.setString(2, namaBarang);
                stmt.setInt(3, hargaBarang);
                stmt.setString(4, "berhasil");
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadPanelItems() {
        try {
            jPanel3.removeAll();
            // Buat instance dari kelas fooditem
            fooditem foodItem = new fooditem();

            // Panggil metode getGambarList()
            List<Gambar> gambarList = foodItem.getGambarList();

            jPanel3.setLayout(new GridLayout(0, 3)); // Contoh grid layout dengan 3 kolom
            for (Gambar gambar : gambarList) {
                PanelItem panelItem = new PanelItem();
                panelItem.setLblNama(gambar.getNamaGambar());
                panelItem.setLblKategori(gambar.getNamaKategori()); // Menggunakan nama kategori
                panelItem.setLblJenis(gambar.getNamaTags()); // Menggunakan nama tags
                panelItem.setTxtDeskripsi(gambar.getDeskripsiGambar());
                panelItem.setLblJumlah(String.valueOf(gambar.getJumlah()));
                panelItem.setLblHarga(String.valueOf(gambar.getHarga()));

                // Set gambar
                ImageIcon icon = new ImageIcon(gambar.getGambar());
                panelItem.setLblGambar(icon);
                panelItem.updateImage();
                jPanel3.add(panelItem);
            }
            jPanel3.revalidate();
            jPanel3.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        new loginform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btntambahsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahsaldoActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(650, 450);
        panelsaldo panel = new panelsaldo(fullname);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }//GEN-LAST:event_btntambahsaldoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm("User Name").setVisible(true);
            }
        });
    }

    private void setUserInfo(String fullname) {
        try (Connection conn = dbKoneksi.getConnection()) {
            if (conn != null) {
                String query = "SELECT username, saldo FROM akun WHERE username = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, fullname);
                    try (ResultSet rs = stmt.executeQuery()) {
                        if (rs.next()) {
                            labelnama.setText(rs.getString("username"));
                            lblsaldo.setText(String.valueOf(rs.getInt("saldo")));
                        } else {
                            JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSaldoLabel(String fullname) {
        setUserInfo(fullname);
    }

    // Add hover effect to jLabel4
    private void addHoverEffect(JLabel label) {
        label.addMouseListener(new MouseAdapter() {
            Color originalColor = label.getForeground();

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setForeground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setForeground(originalColor);
            }
        });
    }

    private void addClickListeners() {
        jLabel6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showAdminPanel();
            }
        });

        jLabel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadPanelItems();
            }
        });
        jLabel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTransaksiPanel();
            }
        });
    }

    private void showAdminPanel() {
        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout()); // Set layout to BorderLayout
        jPanel3.add(jPanelAdmin, BorderLayout.CENTER); // Add jPanelAdmin with BorderLayout.CENTER
        revalidate();
        repaint();
    }

    private void showTsaldoPanel(String fullname) {
        jPanel3.removeAll();
        jpanelSaldo = new panelsaldo(fullname); // Pastikan username diteruskan ke panelsaldo
        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(jpanelSaldo, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void showTransaksiPanel() {
        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(panelTransaksi, BorderLayout.CENTER);
        jPanel3.revalidate();
        jPanel3.repaint();
    }

    public void hideAdminDashboard() {
        jLabel6.setVisible(false); // Assuming jLabel6 is the admin dashboard label
    }

    public void hidesaldoadmin() {
        btntambahsaldo.setVisible(false);
        lblsaldo.setVisible(false);
        lblsaldo1.setVisible(false);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btntambahsaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JLabel lblsaldo1;
    // End of variables declaration//GEN-END:variables
}
