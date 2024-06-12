package com.uas.pbo;

public class Gambar {
    private int idGambar;
    private String gambar;
    private String namaGambar;
    private String deskripsiGambar;
    private int jumlah;
    private int harga;
    private String namaTags;
    private String namaKategori;

    public Gambar(int idGambar, String gambar, String namaGambar, String deskripsiGambar, int jumlah, int harga, String namaTags, String namaKategori) {
        this.idGambar = idGambar;
        this.gambar = gambar;
        this.namaGambar = namaGambar;
        this.deskripsiGambar = deskripsiGambar;
        this.jumlah = jumlah;
        this.harga = harga;
        this.namaTags = namaTags;
        this.namaKategori = namaKategori;
    }

    // Getter dan setter lainnya

    public int getIdGambar() {
        return idGambar;
    }

    public void setIdGambar(int idGambar) {
        this.idGambar = idGambar;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNamaGambar() {
        return namaGambar;
    }

    public void setNamaGambar(String namaGambar) {
        this.namaGambar = namaGambar;
    }

    public String getDeskripsiGambar() {
        return deskripsiGambar;
    }

    public void setDeskripsiGambar(String deskripsiGambar) {
        this.deskripsiGambar = deskripsiGambar;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNamaTags() {
        return namaTags;
    }

    public String getNamaKategori() {
        return namaKategori;
    }
}
