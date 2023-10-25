-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.32 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for productattribute
CREATE DATABASE IF NOT EXISTS `productattribute` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `productattribute`;

-- Dumping structure for table productattribute.bienthe
CREATE TABLE IF NOT EXISTS `bienthe` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `gia` double DEFAULT NULL,
  `hinhanh` varchar(255) DEFAULT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `sanphamid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKe6mc0hwj8n1bdf7c73qdaso5u` (`sanphamid`),
  CONSTRAINT `FKe6mc0hwj8n1bdf7c73qdaso5u` FOREIGN KEY (`sanphamid`) REFERENCES `sanpham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.bienthe: ~0 rows (approximately)

-- Dumping structure for table productattribute.danhmuc
CREATE TABLE IF NOT EXISTS `danhmuc` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `isshowhomepage` int DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `danhmuccha` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_sulfov08aud7rmuh75nxqn4fj` (`slug`),
  KEY `FK26doqfh3lvxagh2o3mdurcs6v` (`danhmuccha`),
  CONSTRAINT `FK26doqfh3lvxagh2o3mdurcs6v` FOREIGN KEY (`danhmuccha`) REFERENCES `danhmuc` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.danhmuc: ~2 rows (approximately)
INSERT INTO `danhmuc` (`id`, `ngaysua`, `ngaytao`, `nguoisua`, `nguoitao`, `ordering`, `trangthai`, `isshowhomepage`, `slug`, `ten`, `danhmuccha`) VALUES
	(1, NULL, NULL, NULL, NULL, 1, 1, NULL, 'thoi-trang-tre-em', 'Thời trang trẻ em', NULL),
	(2, NULL, NULL, NULL, NULL, 1, 1, NULL, 'thoi-trang-nam', 'Thời trang nam', NULL);

-- Dumping structure for table productattribute.giatrithuoctinh
CREATE TABLE IF NOT EXISTS `giatrithuoctinh` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `giatri` varchar(255) DEFAULT NULL,
  `sanphamid` bigint DEFAULT NULL,
  `thuoctinhid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK10amq6k9hc2m208xv419hvk3d` (`sanphamid`),
  KEY `FKkwmi83d9i2cg9j6l61sw00w73` (`thuoctinhid`),
  CONSTRAINT `FK10amq6k9hc2m208xv419hvk3d` FOREIGN KEY (`sanphamid`) REFERENCES `sanpham` (`id`),
  CONSTRAINT `FKkwmi83d9i2cg9j6l61sw00w73` FOREIGN KEY (`thuoctinhid`) REFERENCES `thuoctinh` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.giatrithuoctinh: ~0 rows (approximately)

-- Dumping structure for table productattribute.giatrithuoctinhbienthe
CREATE TABLE IF NOT EXISTS `giatrithuoctinhbienthe` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `bientheid` bigint DEFAULT NULL,
  `giatrithuoctinhid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2wm4po04p6lg0qul6ypmrmuti` (`bientheid`),
  KEY `FK9ge8pwyfw1ypjrj5sn1vysqnc` (`giatrithuoctinhid`),
  CONSTRAINT `FK2wm4po04p6lg0qul6ypmrmuti` FOREIGN KEY (`bientheid`) REFERENCES `bienthe` (`id`),
  CONSTRAINT `FK9ge8pwyfw1ypjrj5sn1vysqnc` FOREIGN KEY (`giatrithuoctinhid`) REFERENCES `giatrithuoctinh` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.giatrithuoctinhbienthe: ~0 rows (approximately)

-- Dumping structure for table productattribute.sanpham
CREATE TABLE IF NOT EXISTS `sanpham` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `chitietsanpham` text,
  `gia` double NOT NULL,
  `isbestseller` int DEFAULT NULL,
  `ismostviewed` int DEFAULT NULL,
  `isnew` int DEFAULT NULL,
  `ispopular` int DEFAULT NULL,
  `motasanpham` text,
  `slug` varchar(255) DEFAULT NULL,
  `ten` varchar(255) NOT NULL,
  `danhmucid` bigint DEFAULT NULL,
  `thuonghieuid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_mucuvhos7dm6xtbpt6l03201w` (`slug`),
  KEY `FKiuqwat8x5gmalwsb6jemcombd` (`danhmucid`),
  KEY `FKm6q7u4wfeoeomtuce5nc5e3bl` (`thuonghieuid`),
  CONSTRAINT `FKiuqwat8x5gmalwsb6jemcombd` FOREIGN KEY (`danhmucid`) REFERENCES `danhmuc` (`id`),
  CONSTRAINT `FKm6q7u4wfeoeomtuce5nc5e3bl` FOREIGN KEY (`thuonghieuid`) REFERENCES `thuonghieu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.sanpham: ~0 rows (approximately)

-- Dumping structure for table productattribute.sanphamhinhanh
CREATE TABLE IF NOT EXISTS `sanphamhinhanh` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `hinhanh` varchar(255) DEFAULT NULL,
  `sanphamid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKm4kdigswp92q0qpuv8ash0xw1` (`sanphamid`),
  CONSTRAINT `FKm4kdigswp92q0qpuv8ash0xw1` FOREIGN KEY (`sanphamid`) REFERENCES `sanpham` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.sanphamhinhanh: ~0 rows (approximately)

-- Dumping structure for table productattribute.thuoctinh
CREATE TABLE IF NOT EXISTS `thuoctinh` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `slug` varchar(255) DEFAULT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `sanphamid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkvohiwy9mqg2yj0v3rnjb34dk` (`sanphamid`),
  CONSTRAINT `FKkvohiwy9mqg2yj0v3rnjb34dk` FOREIGN KEY (`sanphamid`) REFERENCES `sanpham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.thuoctinh: ~0 rows (approximately)

-- Dumping structure for table productattribute.thuonghieu
CREATE TABLE IF NOT EXISTS `thuonghieu` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngaysua` timestamp NULL DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `nguoisua` varchar(255) DEFAULT NULL,
  `nguoitao` varchar(255) DEFAULT NULL,
  `ordering` int DEFAULT '1',
  `trangthai` int DEFAULT '1',
  `slug` varchar(255) DEFAULT NULL,
  `ten` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_s0mvror9u635ragoc5rwiuueh` (`slug`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table productattribute.thuonghieu: ~2 rows (approximately)
INSERT INTO `thuonghieu` (`id`, `ngaysua`, `ngaytao`, `nguoisua`, `nguoitao`, `ordering`, `trangthai`, `slug`, `ten`) VALUES
	(1, NULL, NULL, NULL, NULL, 1, 1, 'adidas', 'Adidas'),
	(2, NULL, NULL, NULL, NULL, 1, 1, 'nike', 'Nike');

-- Dumping structure for trigger productattribute.bienthe_saukhi_insert
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `bienthe_saukhi_insert` AFTER INSERT ON `bienthe` FOR EACH ROW BEGIN
	INSERT INTO giatrithuoctinhbienthe (bientheid, giatrithuoctinhid) (SELECT 
						bienthe.id AS bientheid, 
						giatrithuoctinh.id AS giatrithuoctinhid
					FROM bienthe, giatrithuoctinh
					WHERE 
						bienthe.id = NEW.id
						AND giatrithuoctinh.sanphamid = NEW.sanphamid
						AND FIND_IN_SET(giatrithuoctinh.giatri, NEW.ten));
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
