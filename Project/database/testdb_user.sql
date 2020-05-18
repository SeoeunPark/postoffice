-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: testdb
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `address` varchar(255) NOT NULL,
  `addressee` varchar(45) NOT NULL,
  `addresser` varchar(45) NOT NULL,
  `phonenumber` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  `Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`addresser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('신림시금화로47길','권유빈','금동현','010-9210-3910','1263570894','택배'),('서대문구가좌로9길','최서연','김가수','010-4824-9913','0645123897','우편'),('서울시용마산로46길','손승희','김지연','010-5820-5920','9536174208','택배'),('용산구한강대로28길','김용산','김한강','010-4213-8912','7238650194','택배'),('서울시봉화산로56길','박서은','맹수연','010-8645-8643','4320895671','택배'),('금천구가나동','가나이','바냐아','010-4848-2929','6452073198','택배'),('서초구강남대로12길','김세이','박서빈','010-5320-2375','1956842730','우편'),('안산시단운로','최윤경','백민세','010-8520-5820','8425307196','우편'),('부천시성내로','김지율','서한나','010-5820-5302','7638940512','택배'),('금천구문성로8길','나현아','이승민','010-5482-8295','3892470561','택배'),('서울시상봉로74길','김미림','최미림','010-5382-5280','5971243680','택배'),('구리시교문17로','이수빈','함형연','010-4192-1093','9574018263','우편');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-08 15:06:39
