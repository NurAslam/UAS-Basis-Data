-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2019 at 11:49 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_user` varchar(50) NOT NULL,
  `password` char(32) NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_user`, `password`, `nama`) VALUES
('Aslam', '1a1dc91c907325c69271ddf0c944bc72', 'administrator');

-- --------------------------------------------------------

--
-- Table structure for table `log_login`
--

CREATE TABLE `log_login` (
  `id` bigint(18) NOT NULL,
  `id_user` varchar(50) NOT NULL,
  `waktu_login` timestamp NOT NULL DEFAULT current_timestamp(),
  `waktu_logout` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_pegawai` int(11) NOT NULL,
  `kode` bigint(30) NOT NULL,
  `nama_pegawai` varchar(20) NOT NULL,
  `no_hp` bigint(50) NOT NULL,
  `email` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_pegawai`, `kode`, `nama_pegawai`, `no_hp`, `email`) VALUES
(4, 218, 'Muh Nur Aslam', 8, 'hinuraslam@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tb_parkir`
--

CREATE TABLE `tb_parkir` (
  `no_tiket` int(15) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `no_pol` varchar(15) CHARACTER SET latin1 NOT NULL,
  `jenis` enum('Mobil','Motor') CHARACTER SET latin1 NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date DEFAULT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time DEFAULT NULL,
  `biaya` int(15) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_parkir`
--

INSERT INTO `tb_parkir` (`no_tiket`, `id_pegawai`, `no_pol`, `jenis`, `tgl_masuk`, `tgl_keluar`, `jam_masuk`, `jam_keluar`, `biaya`) VALUES
(23, 4, 'FF', 'Motor', '2019-12-01', '2019-12-01', '17:33:24', '17:34:20', 2000),
(24, 4, 'DDDDD', 'Mobil', '2019-12-01', '2019-12-02', '17:34:07', '07:55:49', 10000),
(25, 4, '1212', 'Motor', '2019-12-01', '2019-12-02', '17:36:18', '07:55:28', 7000),
(28, 4, 'DDAA', 'Motor', '2019-12-02', '2019-12-02', '07:55:16', '10:44:54', 5000),
(30, 4, 'AAA', 'Motor', '2019-12-02', '2019-12-02', '10:46:11', '17:41:46', 9000),
(40, 4, 'AAAA', 'Motor', '2019-12-02', '2019-12-02', '11:52:42', '11:55:09', 2000),
(41, 4, '181A', 'Motor', '2019-12-02', NULL, '11:55:00', NULL, 0),
(42, 4, '1122', 'Motor', '2019-12-02', '2019-12-02', '12:00:50', '12:01:26', 2000),
(43, 4, '1122', 'Motor', '2019-12-02', NULL, '17:41:32', NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `log_login`
--
ALTER TABLE `log_login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `tb_parkir`
--
ALTER TABLE `tb_parkir`
  ADD PRIMARY KEY (`no_tiket`),
  ADD KEY `tb_parkir_ibfk_1` (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `log_login`
--
ALTER TABLE `log_login`
  MODIFY `id` bigint(18) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id_pegawai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tb_parkir`
--
ALTER TABLE `tb_parkir`
  MODIFY `no_tiket` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_parkir`
--
ALTER TABLE `tb_parkir`
  ADD CONSTRAINT `tb_parkir_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `petugas` (`id_pegawai`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
