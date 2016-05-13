-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2016 at 10:53 AM
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
-- Table structure for table `tbfreepassing`
--

DROP TABLE IF EXISTS `tbfreepassing`;
CREATE TABLE `tbfreepassing` (
  `idTransaksi` bigint(6) NOT NULL,
  `idKaryawan` varchar(30) NOT NULL,
  `jmTiket` int(11) NOT NULL,
  `tgAmbil` date NOT NULL
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
  `JamKerja` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbkaryawan`
--

INSERT INTO `tbkaryawan` (`idKaryawan`, `Nama`, `Alamat`, `No_Telp`, `Jabatan`, `Gender`, `JamKerja`) VALUES
('NP002', 'Azizah Erma S.', 'Pandaan', '+6285821287928', 'B05', 'P', ''),
('NP003', 'M. Syaiful Arif', 'Bangil Pasuruan', '+6282817928391', 'C02', 'L', ''),
('NP004', 'M. Riyadlul Lutfi', 'Pandaan', '+6285778609220', 'B03', 'L', '1'),
('NP005', 'Malihatun Nisa', 'Karangrejo', '+6285860254963', 'C03', 'P', 'D'),
('NP006', 'Nisaul Hasanah', 'Purwodadi', '+6285617972761', 'B02', 'P', ''),
('NP007', 'Hibatin Wafiroh', 'Purwosari', '+6285719459064', 'C02', 'P', ''),
('NP008', 'Firmansyah Syamsul A.', 'Purwosari', '+6285706527115', 'C01', 'L', ''),
('NP009', 'Siti Aisyah', 'Bakalan', '+6285789254684', 'C02', 'P', ''),
('WT002', 'Ulfatun N.', 'Pati Jateng', '+6285844860641', 'B04', 'P', ''),
('WT003', 'Maulidah', 'Bakalan', '+6285618917140', 'B04', 'P', ''),
('WT004', 'Athoillah', 'Kejayan', '+6285818509971', 'B04', 'L', ''),
('WT005', 'Muhammad Nufail', 'Krajan Karangrejo Purwosari Pasuruan', '+62 85646597876', 'C05', 'L', ''),
('WT006', 'Risyandi Anugerah H.', 'Pasuruan', '+6285847449858', 'B03', 'L', ''),
('WT007', 'M. Yunus', 'Tutur', '+6285678437739', 'B02', 'L', ''),
('WT008', 'Amiruddin Fadli', 'Sidoarjo Jawa Timur Indonesia', '+628593489053', 'C04', 'L', ''),
('WT009', 'Lilis Trisnawati', 'Sukorejo', '+6285806395374', 'C04', 'P', ''),
('WT010', 'Novian Budi D.', 'Karangtengah', '+6285791046362', 'C03', 'L', '');

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
-- Stand-in structure for view `vwdatakaryawan`
--
DROP VIEW IF EXISTS `vwdatakaryawan`;
CREATE TABLE `vwdatakaryawan` (
`NIP` varchar(30)
,`Nama` varchar(50)
,`Jabatan` varchar(30)
,`Jam Kerja` varchar(2)
,`Gender` char(1)
,`No.Telp` varchar(16)
,`Alamat` text
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `vwrekapabsen`
--
DROP VIEW IF EXISTS `vwrekapabsen`;
CREATE TABLE `vwrekapabsen` (
`Tanggal` date
,`NIP` varchar(30)
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

-- --------------------------------------------------------

--
-- Structure for view `vwdatakaryawan`
--
DROP TABLE IF EXISTS `vwdatakaryawan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwdatakaryawan`  AS  select `tbkaryawan`.`idKaryawan` AS `NIP`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkaryawan`.`JamKerja` AS `Jam Kerja`,`tbkaryawan`.`Gender` AS `Gender`,`tbkaryawan`.`No_Telp` AS `No.Telp`,`tbkaryawan`.`Alamat` AS `Alamat` from (`tbkaryawan` join `tbjabatan`) order by `tbkaryawan`.`idKaryawan` ;

-- --------------------------------------------------------

--
-- Structure for view `vwrekapabsen`
--
DROP TABLE IF EXISTS `vwrekapabsen`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwrekapabsen`  AS  select `tbkehadiran`.`tanggal` AS `Tanggal`,`tbkaryawan`.`idKaryawan` AS `NIP`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkehadiran`.`jmasuk` AS `Jam Masuk`,`tbkehadiran`.`jkeluar` AS `Jam Keluar` from ((`tbkaryawan` join `tbjabatan`) join `tbkehadiran`) where ((`tbkehadiran`.`idpegawai` = `tbkaryawan`.`idKaryawan`) and (`tbjabatan`.`idJabatan` = `tbkaryawan`.`Jabatan`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbfreepassing`
--
ALTER TABLE `tbfreepassing`
  ADD PRIMARY KEY (`idTransaksi`);

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
-- AUTO_INCREMENT for table `tbfreepassing`
--
ALTER TABLE `tbfreepassing`
  MODIFY `idTransaksi` bigint(6) NOT NULL AUTO_INCREMENT;
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
