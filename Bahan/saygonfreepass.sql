/*
Navicat MySQL Data Transfer

Source Server         : MyConnection
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : saygonfreepass

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2016-05-19 13:17:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');
INSERT INTO `admin` VALUES ('nufail', 'nufail');

-- ----------------------------
-- Table structure for tbabsen
-- ----------------------------
DROP TABLE IF EXISTS `tbabsen`;
CREATE TABLE `tbabsen` (
  `no` mediumint(10) NOT NULL AUTO_INCREMENT,
  `idpegawai` varchar(10) NOT NULL,
  `izin` varchar(4) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  PRIMARY KEY (`no`),
  UNIQUE KEY `no` (`no`),
  KEY `FK005` (`idpegawai`),
  CONSTRAINT `FK005` FOREIGN KEY (`idpegawai`) REFERENCES `tbkaryawan` (`idKaryawan`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbabsen
-- ----------------------------
INSERT INTO `tbabsen` VALUES ('75', 'WT006', 'Cuti', '2016-05-12', 'Pulkam');

-- ----------------------------
-- Table structure for tbambiltiket
-- ----------------------------
DROP TABLE IF EXISTS `tbambiltiket`;
CREATE TABLE `tbambiltiket` (
  `idTransaksi` bigint(20) NOT NULL AUTO_INCREMENT,
  `idKaryawan` varchar(30) NOT NULL,
  `jmlAmbil` int(11) NOT NULL DEFAULT '0',
  `tglAmbil` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idTransaksi`),
  UNIQUE KEY `idTransaksi_UNIQUE` (`idTransaksi`),
  KEY `FK001_idx` (`idKaryawan`),
  CONSTRAINT `fk003` FOREIGN KEY (`idKaryawan`) REFERENCES `tbkaryawan` (`idKaryawan`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbambiltiket
-- ----------------------------
INSERT INTO `tbambiltiket` VALUES ('1', 'NP005', '1', '2016-05-19 12:47:27');

-- ----------------------------
-- Table structure for tbjabatan
-- ----------------------------
DROP TABLE IF EXISTS `tbjabatan`;
CREATE TABLE `tbjabatan` (
  `idJabatan` varchar(5) NOT NULL,
  `namajabatan` varchar(30) NOT NULL,
  PRIMARY KEY (`idJabatan`),
  UNIQUE KEY `idJabatan_UNIQUE` (`idJabatan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbjabatan
-- ----------------------------
INSERT INTO `tbjabatan` VALUES ('B01', 'Manajer Pemasaran');
INSERT INTO `tbjabatan` VALUES ('B02', 'Manajer IT');
INSERT INTO `tbjabatan` VALUES ('B03', 'Manajer Keuangan');
INSERT INTO `tbjabatan` VALUES ('B04', 'Manajer HRD');
INSERT INTO `tbjabatan` VALUES ('B05', 'Manajer Produksi');
INSERT INTO `tbjabatan` VALUES ('C01', 'Staff IT');
INSERT INTO `tbjabatan` VALUES ('C02', 'Staff Keuangan');
INSERT INTO `tbjabatan` VALUES ('C03', 'Staff Pemasaran');
INSERT INTO `tbjabatan` VALUES ('C04', 'Staff HRD');
INSERT INTO `tbjabatan` VALUES ('C05', 'Staff Produksi');
INSERT INTO `tbjabatan` VALUES ('D01', 'Office Boy');
INSERT INTO `tbjabatan` VALUES ('D02', 'Office Girl');

-- ----------------------------
-- Table structure for tbjam
-- ----------------------------
DROP TABLE IF EXISTS `tbjam`;
CREATE TABLE `tbjam` (
  `id_jam` varchar(3) NOT NULL,
  `jam_masuk_mulai` time NOT NULL,
  `jam_kerja_mulai` time NOT NULL,
  `jam_kerja_selesai` time NOT NULL,
  `jam_keluar_selesai` time NOT NULL,
  PRIMARY KEY (`id_jam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbjam
-- ----------------------------
INSERT INTO `tbjam` VALUES ('1', '07:30:00', '08:00:00', '15:30:00', '15:59:59');
INSERT INTO `tbjam` VALUES ('2', '15:30:00', '16:00:00', '23:30:00', '23:59:59');
INSERT INTO `tbjam` VALUES ('3', '23:30:00', '00:00:00', '07:30:00', '07:59:59');
INSERT INTO `tbjam` VALUES ('D', '07:00:00', '08:00:00', '17:00:00', '17:59:59');

-- ----------------------------
-- Table structure for tbkaryawan
-- ----------------------------
DROP TABLE IF EXISTS `tbkaryawan`;
CREATE TABLE `tbkaryawan` (
  `idKaryawan` varchar(30) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` text NOT NULL,
  `No_Telp` varchar(16) NOT NULL,
  `Jabatan` varchar(5) NOT NULL,
  `Gender` char(1) NOT NULL,
  `JamKerja` varchar(1) NOT NULL,
  `totTiket` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idKaryawan`),
  UNIQUE KEY `id_Karyawan` (`idKaryawan`),
  KEY `FK_001_idx` (`Jabatan`),
  KEY `FK002_idx` (`JamKerja`),
  CONSTRAINT `FK001` FOREIGN KEY (`Jabatan`) REFERENCES `tbjabatan` (`idJabatan`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK002` FOREIGN KEY (`JamKerja`) REFERENCES `tbjam` (`id_jam`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbkaryawan
-- ----------------------------
INSERT INTO `tbkaryawan` VALUES ('NP002', 'Azizah Erma S.', 'Pandaan', '+6285821287928', 'B05', 'P', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('NP003', 'M. Syaiful Arif', 'Bangil Pasuruan', '+6282817928391', 'C02', 'L', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('NP004', 'M. Riyadlul Lutfi', 'Pandaan', '+6285778609220', 'B03', 'L', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('NP005', 'Malihatun Nisa', 'Karangrejo', '+6285860254963', 'C03', 'P', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('NP006', 'Nisaul Hasanah', 'Purwodadi', '+6285617972761', 'B02', 'P', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('NP007', 'Hibatin Wafiroh', 'Purwosari', '+6285719459064', 'C02', 'P', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('NP008', 'Firmansyah Syamsul A.', 'Purwosari', '+6285706527115', 'C01', 'L', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('NP009', 'Siti Aisyah', 'Bakalan', '+6285789254684', 'C02', 'P', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('WT001', 'Iip Ramadhani', 'Nongkojajar', '+6285791046362', 'B01', 'P', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('WT002', 'Ulfatun N.', 'Pati Jateng', '+6285844860641', 'B04', 'P', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('WT003', 'Maulidah', 'Bakalan', '+6285618917140', 'B04', 'P', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('WT004', 'Athoillah', 'Kejayan', '+6285818509971', 'B04', 'L', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('WT005', 'Muhammad Nufail', 'Krajan Karangrejo Purwosari Pasuruan', '+62 85646597876', 'C05', 'L', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('WT006', 'Risyandi Anugerah H.', 'Pasuruan', '+6285847449858', 'B03', 'L', '2', '0');
INSERT INTO `tbkaryawan` VALUES ('WT007', 'M. Yunus', 'Tutur', '+6285678437739', 'B02', 'L', '2', '0');
INSERT INTO `tbkaryawan` VALUES ('WT008', 'Amiruddin Fadli', 'Sidoarjo Jawa Timur Indonesia', '+628593489053', 'C04', 'L', '3', '0');
INSERT INTO `tbkaryawan` VALUES ('WT009', 'Lilis Trisnawati', 'Sukorejo', '+6285806395374', 'C04', 'P', 'D', '0');
INSERT INTO `tbkaryawan` VALUES ('WT010', 'Novian Budi D.', 'Karangtengah', '+6285791046362', 'C03', 'L', 'D', '0');

-- ----------------------------
-- Table structure for tbkehadiran
-- ----------------------------
DROP TABLE IF EXISTS `tbkehadiran`;
CREATE TABLE `tbkehadiran` (
  `no_rec` mediumint(10) NOT NULL AUTO_INCREMENT,
  `idpegawai` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jmasuk` time DEFAULT NULL,
  `jkeluar` time DEFAULT NULL,
  `id_jam` varchar(3) NOT NULL,
  PRIMARY KEY (`no_rec`),
  KEY `id pegawai di tbl kehadiran` (`idpegawai`),
  KEY `id_jam` (`id_jam`),
  CONSTRAINT `FK004` FOREIGN KEY (`idpegawai`) REFERENCES `tbkaryawan` (`idKaryawan`),
  CONSTRAINT `jam di kehadiran` FOREIGN KEY (`id_jam`) REFERENCES `tbjam` (`id_jam`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbkehadiran
-- ----------------------------
INSERT INTO `tbkehadiran` VALUES ('73', 'WT005', '2016-05-10', '07:43:03', '17:48:36', 'D');
INSERT INTO `tbkehadiran` VALUES ('74', 'WT008', '2016-05-11', '07:34:27', '17:39:01', 'D');

-- ----------------------------
-- Table structure for tbtambahtiket
-- ----------------------------
DROP TABLE IF EXISTS `tbtambahtiket`;
CREATE TABLE `tbtambahtiket` (
  `idTransaksi` bigint(20) NOT NULL AUTO_INCREMENT,
  `idKaryawan` varchar(30) NOT NULL,
  `jmlTambah` int(11) NOT NULL DEFAULT '0',
  `tglTambah` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idTransaksi`),
  UNIQUE KEY `idTransaksi_UNIQUE` (`idTransaksi`),
  KEY `FK001_idx` (`idKaryawan`),
  CONSTRAINT `tbtambahtiket_ibfk_1` FOREIGN KEY (`idKaryawan`) REFERENCES `tbkaryawan` (`idKaryawan`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbtambahtiket
-- ----------------------------
INSERT INTO `tbtambahtiket` VALUES ('76', 'NP002', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('77', 'NP003', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('78', 'NP004', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('79', 'NP005', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('80', 'NP006', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('81', 'NP007', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('82', 'NP008', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('83', 'NP009', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('84', 'WT001', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('85', 'WT002', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('86', 'WT003', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('87', 'WT004', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('88', 'WT005', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('89', 'WT006', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('90', 'WT007', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('91', 'WT008', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('92', 'WT009', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('93', 'WT010', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('94', 'NP002', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('95', 'NP003', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('96', 'NP004', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('97', 'NP005', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('98', 'NP006', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('99', 'NP007', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('100', 'NP008', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('101', 'NP009', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('102', 'WT001', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('103', 'WT002', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('104', 'WT003', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('105', 'WT004', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('106', 'WT005', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('107', 'WT006', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('108', 'WT007', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('109', 'WT008', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('110', 'WT009', '2', '2016-05-19 12:39:00');
INSERT INTO `tbtambahtiket` VALUES ('111', 'WT010', '2', '2016-05-19 12:39:00');

-- ----------------------------
-- View structure for vwcekinsukses
-- ----------------------------
DROP VIEW IF EXISTS `vwcekinsukses`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwcekinsukses` AS select `tbkehadiran`.`idpegawai` AS `ID`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkehadiran`.`jmasuk` AS `Jam Masuk`,`tbkehadiran`.`jkeluar` AS `Jam Keluar` from ((`tbkehadiran` join `tbkaryawan`) join `tbjabatan`) where ((`tbkaryawan`.`idKaryawan` = `tbkehadiran`.`idpegawai`) and (`tbjabatan`.`idJabatan` = `tbkaryawan`.`Jabatan`)) ;

-- ----------------------------
-- View structure for vwdatakaryawan
-- ----------------------------
DROP VIEW IF EXISTS `vwdatakaryawan`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwdatakaryawan` AS select `tbkaryawan`.`idKaryawan` AS `NIP`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkaryawan`.`JamKerja` AS `Jam Kerja`,`tbkaryawan`.`Gender` AS `Gender`,`tbkaryawan`.`No_Telp` AS `No.Telp`,`tbkaryawan`.`Alamat` AS `Alamat` from (`tbkaryawan` join `tbjabatan`) order by `tbkaryawan`.`idKaryawan` ;

-- ----------------------------
-- View structure for vwdetailtiket
-- ----------------------------
DROP VIEW IF EXISTS `vwdetailtiket`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwdetailtiket` AS select `tbkaryawan`.`idKaryawan` AS `NIP`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkaryawan`.`totTiket` AS `Jml.Tiket` from (`tbkaryawan` join `tbjabatan`) where (`tbkaryawan`.`Jabatan` = `tbjabatan`.`idJabatan`) ;

-- ----------------------------
-- View structure for vwrekapabsen
-- ----------------------------
DROP VIEW IF EXISTS `vwrekapabsen`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vwrekapabsen` AS select `tbkehadiran`.`tanggal` AS `Tanggal`,`tbkaryawan`.`idKaryawan` AS `NIP`,`tbkaryawan`.`Nama` AS `Nama`,`tbjabatan`.`namajabatan` AS `Jabatan`,`tbkehadiran`.`jmasuk` AS `Jam Masuk`,`tbkehadiran`.`jkeluar` AS `Jam Keluar` from ((`tbkaryawan` join `tbjabatan`) join `tbkehadiran`) where ((`tbkehadiran`.`idpegawai` = `tbkaryawan`.`idKaryawan`) and (`tbjabatan`.`idJabatan` = `tbkaryawan`.`Jabatan`)) ;

-- ----------------------------
-- Event structure for auto_add_tiket
-- ----------------------------
DROP EVENT IF EXISTS `auto_add_tiket`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` EVENT `auto_add_tiket` ON SCHEDULE EVERY 1 MONTH STARTS '2016-05-28 07:00:00' ON COMPLETION NOT PRESERVE ENABLE DO UPDATE `tbtambahtiket` SET tglTambah = CURRENT_TIMESTAMP, `jmlTambah`='2' WHERE Month(tglTambah)<>Month(CURRENT_DATE())
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tbambiltiket_AFTER_INSERT`;
DELIMITER ;;
CREATE TRIGGER `tbambiltiket_AFTER_INSERT` AFTER INSERT ON `tbambiltiket` FOR EACH ROW BEGIN
	update tbkaryawan set totTiket=totTiket-NEW.jmlAmbil WHERE tbkaryawan.idKaryawan=NEW.idKaryawan;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tbkaryawan_AFTER_INSERT`;
DELIMITER ;;
CREATE TRIGGER `tbkaryawan_AFTER_INSERT` AFTER INSERT ON `tbkaryawan` FOR EACH ROW BEGIN
	insert into tbtambahtiket(idKaryawan,tglTambah) values(NEW.idKaryawan,CURRENT_TIMESTAMP);
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tbtambahtiket_AFTER_UPDATE`;
DELIMITER ;;
CREATE TRIGGER `tbtambahtiket_AFTER_UPDATE` AFTER UPDATE ON `tbtambahtiket` FOR EACH ROW BEGIN
	if NEW.jmlTambah <> '0' then
		update tbkaryawan set totTiket=totTiket+NEW.jmlTambah WHERE tbkaryawan.idKaryawan=NEW.idKaryawan;
    end if;
END
;;
DELIMITER ;
