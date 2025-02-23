package com.uas.pbo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author ashadipermana
 */
public class panelsaldo extends javax.swing.JPanel {
    
    private String fullname;
    private DbKoneksi dbKoneksi;
    
    public panelsaldo(String fullname) {
        this.fullname = fullname;
        dbKoneksi = new DbKoneksi();
        initComponents();
        addNumberInputRestriction(txttambahsaldo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txttambahsaldo = new javax.swing.JTextField();
        btntambahsaldo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TAMBAH SALDO");

        btntambahsaldo.setText("Tambah");
        btntambahsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahsaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttambahsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btntambahsaldo))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(txttambahsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntambahsaldo)
                .addContainerGap(267, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahsaldoActionPerformed
         String amountText = txttambahsaldo.getText();
        try {
            int amount = Integer.parseInt(amountText);
            int response = JOptionPane.showConfirmDialog(this, "Ingin menambah saldo sebesar " + amount + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                addSaldoToDatabase(amount);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah saldo yang valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btntambahsaldoActionPerformed
    
    private void addSaldoToDatabase(int amount) {
    System.out.println("Adding saldo for username: " + fullname); // Debug print
    try (Connection conn = dbKoneksi.getConnection()) {
        if (conn != null) {
            String query = "UPDATE akun SET saldo = saldo + ? WHERE username = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, amount);
                stmt.setString(2, fullname);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Saldo berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    updateSaldoLabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Saldo gagal ditambahkan, pengguna tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Koneksi ke database gagal", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menambah saldo", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

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


   private void updateSaldoLabel() {
        java.awt.Window windowAncestor = SwingUtilities.getWindowAncestor(this);
        if (windowAncestor instanceof HomeForm) {
            HomeForm homeForm = (HomeForm) windowAncestor;
            homeForm.updateSaldoLabel(fullname);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntambahsaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txttambahsaldo;
    // End of variables declaration//GEN-END:variables
}
