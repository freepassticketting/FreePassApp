-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2016 at 05:08 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saygonfreepass`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin'),
('nufail', 'nufail');

-- --------------------------------------------------------

--
-- Table structure for table `tbabsen`
--

DROP TABLE IF EXISTS `tbabsen`;
CREATE TABLE `tbabsen` (
  `no` int(5) NOT NULL,
  `idpegawai` varchar(10) NOT NULL,
  `izin` varchar(4) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbjabatan`
--

DROP TABLE IF EXISTS `tbjabatan`;
CREATE TABLE `tbjabatan` (
  `idJabatan` varchar(3) NOT NULL,
  `namajabatan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbjabatan`
--

INSERT INTO `tbjabatan` (`idJabatan`, `namajabatan`) VALUES
('B01', 'Manajer Pemasaran'),
('B02', 'Manajer IT'),
('B03', 'Manajer Keuangan'),
('B04', 'Manajer HRD'),
('B05', 'Manajer Produksi'),
('C01', 'Staff IT'),
('C02', 'Staff Keuangan'),
('C03', 'Staff Pemasaran'),
('C04', 'Staff HRD'),
('C05', 'Staff Produksi'),
('D01', 'Office Boy'),
('D02', 'Office Girl');

-- --------------------------------------------------------

--
-- Table structure for table `tbjam`
--

DROP TABLE IF EXISTS `tbjam`;
CREATE TABLE `tbjam` (
  `id_jam` varchar(3) NOT NULL,
  `jam_masuk_mulai` time NOT NULL,
  `jam_kerja_mulai` time NOT NULL,
  `jam_kerja_selesai` time NOT NULL,
  `jam_keluar_selesai` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbjam`
--

INSERT INTO `tbjam` (`id_jam`, `jam_masuk_mulai`, `jam_kerja_mulai`, `jam_kerja_selesai`, `jam_keluar_selesai`) VALUES
('1', '07:30:00', '08:00:00', '15:30:00', '15:59:59'),
('2', '15:30:00', '16:00:00', '23:30:00', '23:59:59'),
('3', '23:30:00', '00:00:00', '07:30:00', '07:59:59'),
('D', '07:00:00', '08:00:00', '17:00:00', '17:59:59');

-- --------------------------------------------------------

--
-- Table structure for table `tbkaryawan`
--

DROP TABLE IF EXISTS `tbkaryawan`;
CREATE TABLE `tbkaryawan` (
  `idKaryawan` varchar(30) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` text NOT NULL,
  `No_Telp` varchar(16) NOT NULL,
  `Jabatan` varchar(20) NOT NULL,
  `Gender` char(1) NOT NULL,
  `NIK` bigint(20) NOT NULL,
  `JamKerja` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbkaryawan`
--

INSERT INTO `tbkaryawan` (`idKaryawan`, `Nama`, `Alamat`, `No_Telp`, `Jabatan`, `Gender`, `NIK`, `JamKerja`) VALUES
('WT005', 'Muhammad Nufail', 'Krajan Karangrejo Purwosari Pasuruan', '+62 85646597876', 'C05', 'L', 293840928342908, 'D'),
('WT008', 'Amiruddin Fadli', 'Sidoarjo Jawa Timur Indonesia', '+628593489053', 'C04', 'L', 2398409283, 'D');

-- --------------------------------------------------------

--
-- Table structure for table `tbkehadiran`
--

DROP TABLE IF EXISTS `tbkehadiran`;
CREATE TABLE `tbkehadiran` (
  `no_rec` mediumint(10) NOT NULL,
  `idpegawai` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jmasuk` time DEFAULT NULL,
  `jkeluar` time DEFAULT NULL,
  `id_jam` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbkehadiran`
--

INSERT INTO `tbkehadiran` (`no_rec`, `idpegawai`, `tanggal`, `jmasuk`, `jkeluar`, `id_jam`) VALUES
(73, 'WT005', '2016-05-10', '07:43:03', '17:48:36', 'D'),
(74, 'WT008', '2016-05-11', '07:34:27', '17:39:01', 'D');

-- --------------------------------------------------------

--
-- Stand-in structure for view `vwcekinsukses`
--
DROP VIEW IF EXISTS `vwcekinsukses`;
CREATE TABLE `vwcekinsukses` (
`ID` varchar(20)
,`Nama` varchar(50)
,`Jabatan` varchar(30)
,`Jam Masuk` time
,`Jam Keluar` time
);

-- --------------------------------------------------------

--
-- Structure for view `vwcekinsukses`
--
DROP TABLE IF EXISTS `vwcekinsukses`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwcekinsukses`  AS  select `tbkehadiran`.`idpegawai` AS `ID`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkehadiran`.`jmasuk` AS `Jam Masuk`,`tbkehadiran`.`jkeluar` AS `Jam Keluar` from ((`tbkehadiran` join `tbkaryawan`) join `tbjabatan`) where ((`tbkaryawan`.`idKaryawan` = `tbkehadiran`.`idpegawai`) and (`tbjabatan`.`idJabatan` = `tbkaryawan`.`Jabatan`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbabsen`
--
ALTER TABLE `tbabsen`
  ADD PRIMARY KEY (`no`),
  ADD KEY `idpegawai` (`idpegawai`);

--
-- Indexes for table `tbjabatan`
--
ALTER TABLE `tbjabatan`
  ADD PRIMARY KEY (`idJabatan`);

--
-- Indexes for table `tbjam`
--
ALTER TABLE `tbjam`
  ADD PRIMARY KEY (`id_jam`);

--
-- Indexes for table `tbkaryawan`
--
ALTER TABLE `tbkaryawan`
  ADD PRIMARY KEY (`idKaryawan`),
  ADD UNIQUE KEY `id_Karyawan` (`idKaryawan`);

--
-- Indexes for table `tbkehadiran`
--
ALTER TABLE `tbkehadiran`
  ADD PRIMARY KEY (`no_rec`),
  ADD KEY `id pegawai di tbl kehadiran` (`idpegawai`),
  ADD KEY `id_jam` (`id_jam`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbabsen`
--
ALTER TABLE `tbabsen`
  MODIFY `no` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `tbkehadiran`
--
ALTER TABLE `tbkehadiran`
  MODIFY `no_rec` mediumint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbkehadiran`
--
ALTER TABLE `tbkehadiran`
  ADD CONSTRAINT `jam di kehadiran` FOREIGN KEY (`id_jam`) REFERENCES `tbjam` (`id_jam`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
