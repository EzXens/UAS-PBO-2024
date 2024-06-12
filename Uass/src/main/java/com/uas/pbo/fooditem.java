/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.pbo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ashadipermana
 */
public class fooditem {
    
     private DbKoneksi dbKoneksi;

    public fooditem() {
        dbKoneksi = new DbKoneksi();
    }
    
  public List<Gambar> getGambarList() throws Exception {
    List<Gambar> gambarList = new ArrayList<>();
    String query = "SELECT id_gambar, gambar, nama_gambar, deskripsi_gambar, jumlah, harga, " +
                   "(SELECT nama_tags FROM tags WHERE id_tags = gambar.id_tags) as nama_tags, " +
                   "(SELECT nama_kategori FROM kategori WHERE id_kategori = gambar.id_kategori) as nama_kategori " +
                   "FROM gambar";
    try (Connection conn = dbKoneksi.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            Gambar gambar = new Gambar(
                rs.getInt("id_gambar"),
                rs.getString("gambar"),
                rs.getString("nama_gambar"),
                rs.getString("deskripsi_gambar"),
                rs.getInt("jumlah"),
                rs.getInt("harga"),
                rs.getString("nama_tags"),
                rs.getString("nama_kategori")
            );
            gambarList.add(gambar);
        }
    }
    return gambarList;
}



}
