package com.uas.pbo;

import javax.swing.JPanel;
import java.sql.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Image;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author ashadipermana
 */
public class PanelAdmin extends javax.swing.JPanel {

    private DbKoneksi dbKoneksi;

    public PanelAdmin() {
        initComponents();
        dbKoneksi = new DbKoneksi();
        populateComboBoxes();
        tampildata();
        addNumberInputRestriction(txtjumlah);
        addNumberInputRestriction(txtharga);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdeskripsi = new javax.swing.JTextArea();
        cbkategori = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        lblgambar = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        txtjumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelfood = new javax.swing.JPanel();

        jLabel5.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FOOD DATA");

        txtdeskripsi.setColumns(20);
        txtdeskripsi.setRows(5);
        jScrollPane1.setViewportView(txtdeskripsi);

        cbkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnbrowse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbrowse.setText("Browse");
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Deskripsi");

        jLabel6.setText("Kategori");

        jLabel7.setText("Jumlah");

        jLabel8.setText("Jenis");

        btntambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        jLabel9.setText("Harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtjumlah)
                            .addComponent(txtnama)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(cbkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbjenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtharga, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblgambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(lblgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbrowse)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Manajemen Data", jPanel1);

        javax.swing.GroupLayout panelfoodLayout = new javax.swing.GroupLayout(panelfood);
        panelfood.setLayout(panelfoodLayout);
        panelfoodLayout.setHorizontalGroup(
            panelfoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panelfoodLayout.setVerticalGroup(
            panelfoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panelfood);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lihat Data", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        String nama = txtnama.getText().trim();
        Integer jumlah = Integer.parseInt(txtjumlah.getText().trim());
        String deskripsi = txtdeskripsi.getText().trim();
        Integer Harga = Integer.parseInt(txtharga.getText().trim());
        String kategori = (String) cbkategori.getSelectedItem();
        String jenis = (String) cbjenis.getSelectedItem();

        // Validate input
        if (nama.isEmpty() || jumlah == null || deskripsi.isEmpty() || kategori == null || jenis == null || selectedFile == null) {
            // Show error message if any input is empty
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection conn = dbKoneksi.getConnection();
            String sql = "INSERT INTO gambar (gambar, nama_gambar, deskripsi_gambar, jumlah, harga, id_tags, id_kategori) VALUES (?, ?, ?, ?, ?, (SELECT id_tags FROM tags WHERE nama_tags = ?), (SELECT id_kategori FROM kategori WHERE nama_kategori = ?))";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, selectedFile.getAbsolutePath());
            pst.setString(2, nama);
            pst.setString(3, deskripsi);
            pst.setInt(4, jumlah);
            pst.setInt(5, Harga);
            pst.setString(6, jenis);
            pst.setString(7, kategori);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "DataBerhasil Ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            tampildata();

            txtnama.setText("");
            txtjumlah.setText("");
            txtharga.setText("");
            txtdeskripsi.setText("");
            cbjenis.setSelectedIndex(0);
            cbkategori.setSelectedIndex(0);
            lblgambar.setIcon(null);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btntambahActionPerformed

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Browse Image");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage image = ImageIO.read(selectedFile);

                // Mengambil ukuran label gambar
                int labelWidth = lblgambar.getWidth();
                int labelHeight = lblgambar.getHeight();

                // Mengubah ukuran gambar sesuai dengan ukuran label
                Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

                // Mengkonversi Image ke ImageIcon agar bisa ditampilkan di JLabel
                ImageIcon icon = new ImageIcon(scaledImage);

                // Menampilkan gambar di JLabel
                lblgambar.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnbrowseActionPerformed

    private void populateComboBoxes() {
        try {
            Connection conn = dbKoneksi.getConnection();
            DefaultComboBoxModel<String> kategoriModel = new DefaultComboBoxModel<>();
            ResultSet kategoriSet = conn.createStatement().executeQuery("SELECT nama_kategori FROM kategori");
            while (kategoriSet.next()) {
                kategoriModel.addElement(kategoriSet.getString("nama_kategori"));
            }
            cbkategori.setModel(kategoriModel);

            DefaultComboBoxModel<String> tagsModel = new DefaultComboBoxModel<>();
            ResultSet tagsSet = conn.createStatement().executeQuery("SELECT nama_tags FROM tags");
            while (tagsSet.next()) {
                tagsModel.addElement(tagsSet.getString("nama_tags"));
            }
            cbjenis.setModel(tagsModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private File selectedFile;

    private void addNumberInputRestriction(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
    }

    public void tampildata() {
        panelfood.removeAll();
        panelfood.setLayout(new GridLayout(0, 3, 10, 10));  // 3 columns, with gaps

        try {
            Connection conn = dbKoneksi.getConnection();
            String sql = "SELECT id_gambar ,gambar, nama_gambar, deskripsi_gambar, jumlah, harga, (SELECT nama_tags FROM tags WHERE id_tags = gambar.id_tags) as nama_tags, (SELECT nama_kategori FROM kategori WHERE id_kategori = gambar.id_kategori) as nama_kategori FROM gambar";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int idGambar = rs.getInt("id_gambar");
                String gambarPath = rs.getString("gambar");
                String nama = rs.getString("nama_gambar");
                String deskripsi = rs.getString("deskripsi_gambar");
                int jumlah = rs.getInt("jumlah");
                int harga = rs.getInt("harga");
                String tags = rs.getString("nama_tags");
                String kategori = rs.getString("nama_kategori");

                JPanel panel = createFoodPanel(idGambar, gambarPath, nama, deskripsi, jumlah, harga, tags, kategori);
                panelfood.add(panel);
            }

            panelfood.revalidate();
            panelfood.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public JPanel createFoodPanel(int idGambar, String gambarPath, String nama, String deskripsi, int jumlah, int harga, String tags, String kategori) {
        JPanel panel = new JPanel();
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));

        JLabel lblGambar = new JLabel();
        try {
            BufferedImage image = ImageIO.read(new File(gambarPath));
            Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblGambar.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel lblNama = new JLabel("Nama: " + nama);
        JLabel lblDeskripsi = new JLabel("Deskripsi: " + deskripsi);
        JLabel lblJumlah = new JLabel("Jumlah: " + jumlah);
        JLabel lblharga = new JLabel("Harga: "+ harga);
        JLabel lblKategori = new JLabel("Kategori: " + kategori);
        JLabel lblTags = new JLabel("Jenis: " + tags);

        JButton btnHapus = new JButton("Hapus");
        JButton btnUbah = new JButton("Ubah");

        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusData(idGambar);
            }
        });

        btnUbah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ubahData(idGambar, nama, deskripsi, jumlah, harga, kategori, tags);
            }
        });

        panel.add(lblGambar);
        panel.add(lblNama);
        panel.add(lblDeskripsi);
        panel.add(lblJumlah);
        panel.add(lblharga);
        panel.add(lblKategori);
        panel.add(lblTags);
        panel.add(btnHapus);
        panel.add(btnUbah);

        return panel;
    }

    private void hapusData(int idGambar) {
        int response = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Penghapusan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                Connection conn = dbKoneksi.getConnection();
                String sql = "DELETE FROM gambar WHERE id_gambar = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, idGambar);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
                tampildata(); // Refresh data
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void ubahData(int idGambar, String nama, String deskripsi, int jumlah, int harga, String kategori, String tags) {
        fromedit fromedit = new fromedit();
        fromedit.setIdGambar(idGambar); // Tambahkan metode ini untuk mengatur idGambar
        fromedit.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblgambar;
    private javax.swing.JPanel panelfood;
    private javax.swing.JTextArea txtdeskripsi;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
