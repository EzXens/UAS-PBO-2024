-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Jun 2024 pada 02.06
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbuas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `uid` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(11) NOT NULL,
  `email` text NOT NULL,
  `role` varchar(11) NOT NULL,
  `saldo` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`uid`, `username`, `password`, `email`, `role`, `saldo`) VALUES
(1, 'admin', 'admin', 'admin@gmail.com', 'admin', 0),
(2, '123', '123', '123', 'user', 0),
(3, 'bima', 'bima', 'bima', 'user', 0),
(4, 'anjay', 'anhjay', 'anjay', 'user', 150000),
(5, 'anjay2', 'bima', 'bima', 'user', 0),
(6, 'tes', 'tes', 'tes@gmail.com', 'user', 0),
(7, 'aa', 'aa', 'aa', 'user', 0),
(8, 'growtopia', 'naga', 'growtopia@gmail.com', 'user', 0),
(9, 'nagakocak', 'naga', 'nagaberapi216@gmail.com', 'user', 0),
(10, 'naga', 'naga', 'nagas@gmail.com', 'user', 830000),
(11, 'naga bersayap 726', 'ayam', 'ayam@gmail.com', 'user', 0),
(12, 'asa', 'asa', 'asa', 'user', 0),
(13, 'naga', 'naga', 'naga', 'user', 830000),
(14, 'dame', 'dame', 'dame', 'user', 0),
(15, 'adi', 'adi', 'adi', 'user', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `gambar`
--

CREATE TABLE `gambar` (
  `id_gambar` int(15) NOT NULL,
  `gambar` varchar(255) NOT NULL,
  `nama_gambar` varchar(50) NOT NULL,
  `deskripsi_gambar` varchar(255) NOT NULL,
  `jumlah` int(50) NOT NULL,
  `harga` int(50) NOT NULL,
  `id_tags` int(12) NOT NULL,
  `likes` int(11) NOT NULL DEFAULT 0,
  `id_kategori` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `gambar`
--

INSERT INTO `gambar` (`id_gambar`, `gambar`, `nama_gambar`, `deskripsi_gambar`, `jumlah`, `harga`, `id_tags`, `likes`, `id_kategori`) VALUES
(102, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (6).png', 'bakso', 'wenak', 22, 0, 8, 0, 1),
(103, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (12).png', 'beef burger', 'with premium USA beef delicious', 34, 35000, 9, 0, 1),
(104, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (10).png', 'ayam chicken', 'fried chicken super crispy juicy', 24, 15000, 5, 0, 2),
(105, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (11).png', 'kentang goreng', 'deliciouse french fries', 35, 8000, 14, 0, 2),
(106, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (9).png', 'ayam kremes', 'ayam goreng lalapan dengan kremes kriukk', 55, 15000, 5, 0, 1),
(107, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (13).png', 'nasi goreng special', 'nasigoreng special dengan telor dan daging', 22, 18000, 9, 0, 1),
(108, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (7).png', 'Mie Ayam', 'Mie ayamm enak murah', 25, 10000, 8, 0, 1),
(109, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\png-transparent-gado-gado-indonesian-cuisine-thai-cuisine-peanut-sauce-satay-salad-food-recipe-peanut-thumbnail.png', 'gado gado', 'gado gado special lezat murah', 33, 12000, 10, 0, 1),
(110, 'C:\\Users\\ashad\\OneDrive\\Documents\\makanan uass\\pngwing.com (14).png', 'kebab', 'kebab asli turki', 32, 15000, 9, 0, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(10) NOT NULL,
  `nama_kategori` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
(1, 'street food\r\n'),
(2, 'fast food'),
(3, 'comfort food'),
(4, 'desserts'),
(8, 'seafood'),
(9, 'grill'),
(10, 'japanese food');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tags`
--

CREATE TABLE `tags` (
  `id_tags` int(15) NOT NULL,
  `nama_tags` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tags`
--

INSERT INTO `tags` (`id_tags`, `nama_tags`) VALUES
(5, 'ayam'),
(8, 'berkuah'),
(9, 'mewah'),
(10, 'Murah'),
(14, 'gorengan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `transaksi_id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `harga` int(50) NOT NULL,
  `nama_gambar` varchar(50) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`uid`),
  ADD KEY `idx_username` (`username`);

--
-- Indeks untuk tabel `gambar`
--
ALTER TABLE `gambar`
  ADD PRIMARY KEY (`id_gambar`),
  ADD KEY `fk_id_tags` (`id_tags`),
  ADD KEY `fk_id_kategori` (`id_kategori`);

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indeks untuk tabel `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`id_tags`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`transaksi_id`),
  ADD KEY `fk_transaksi_username` (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `akun`
--
ALTER TABLE `akun`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT untuk tabel `gambar`
--
ALTER TABLE `gambar`
  MODIFY `id_gambar` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;

--
-- AUTO_INCREMENT untuk tabel `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `tags`
--
ALTER TABLE `tags`
  MODIFY `id_tags` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `transaksi_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `gambar`
--
ALTER TABLE `gambar`
  ADD CONSTRAINT `fk_id_kategori` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `gambar_ibfk_2` FOREIGN KEY (`id_tags`) REFERENCES `tags` (`id_tags`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `fk_transaksi_username` FOREIGN KEY (`username`) REFERENCES `akun` (`username`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
