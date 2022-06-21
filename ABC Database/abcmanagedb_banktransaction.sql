-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: abcmanagedb
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `banktransaction`
--

DROP TABLE IF EXISTS `banktransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banktransaction` (
  `tId` int NOT NULL AUTO_INCREMENT,
  `transacAmount` float NOT NULL,
  `transacDecription` varchar(100) NOT NULL,
  `transacType` varchar(1) DEFAULT NULL,
  `transacTime` datetime NOT NULL,
  `aId` int DEFAULT NULL,
  `sourceAccId` int NOT NULL,
  `destinationAccId` int DEFAULT NULL,
  PRIMARY KEY (`tId`),
  KEY `FKimx7nea82ngbq8txq8euyrqb2` (`sourceAccId`),
  CONSTRAINT `FKimx7nea82ngbq8txq8euyrqb2` FOREIGN KEY (`sourceAccId`) REFERENCES `bankaccount` (`aId`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banktransaction`
--

LOCK TABLES `banktransaction` WRITE;
/*!40000 ALTER TABLE `banktransaction` DISABLE KEYS */;
INSERT INTO `banktransaction` VALUES (1,500000,'Welcome withdraw','w','2022-04-29 15:07:00',1,1,1),(2,600000,'Welcome withdraw','w','2022-04-29 15:07:00',1,1,1),(3,230000,'Welcome deposite','d','2022-04-29 15:07:00',1,3,1),(4,542380,'Welcome deposite','d','2022-04-29 15:07:00',2,3,1),(5,450000,'Welcome deposite','d','2022-04-29 15:07:00',2,3,2),(6,350000,'Welcome deposite','d','2022-04-29 15:07:00',2,2,2),(7,125000,'Welcome deposite','d','2022-04-29 15:07:00',3,2,2),(8,906000,'Welcome deposite','d','2022-04-29 15:07:00',3,2,2),(9,805000,'Welcome deposite','d','2022-04-29 15:07:00',3,4,4),(10,765400,'Welcome deposite','d','2022-04-29 15:07:00',4,4,4),(12,328900,'Welcome deposite','d','2022-04-29 15:07:00',4,4,4),(13,390000,'Welcome deposite','d','2022-04-29 15:07:00',4,4,3),(14,456900,'Welcome deposite','d','2022-04-29 15:07:00',5,4,3),(15,976500,'Welcome deposite','d','2022-04-29 15:07:00',5,5,5),(16,160000,'Welcome deposite','d','2022-04-29 15:07:00',5,5,5),(17,550000,'Welcome deposite','d','2022-04-29 15:07:00',6,6,6),(18,710000,'Welcome deposite','d','2022-04-29 15:07:00',6,6,6),(19,423000,'Welcome deposite','d','2022-04-29 15:07:00',6,6,6),(20,760000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(21,680000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(22,900000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(23,350000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(24,250000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(25,520000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(26,890000,'Welcome deposite ','d','2022-04-29 15:07:00',2,5,0),(27,800000,'Welcome deposite','d','1999-03-22 10:06:07',6,6,0),(28,900000,'Welcome deposite','d','1999-03-22 10:06:07',6,6,0),(29,200000,'Welcome withdraw','w','1999-03-22 10:06:07',6,6,0),(30,245000,'Welcome transfer','t','1997-03-22 10:06:07',4,1,0),(31,560000,'Welcome transfer','t','1997-03-22 10:06:07',4,4,0),(32,200000,'Welcome withdraw','w','2022-05-20 12:08:09',5,4,2),(33,300000,'Welcome deposit','d','2022-05-20 13:08:09',5,4,2),(34,600000,'Welcome transfer','t','2022-05-20 14:08:09',5,4,2),(35,80000,'Welcome deposit','d','1999-03-22 10:06:07',0,7,5),(36,80000,'Welcome deposit','d','1999-03-22 10:06:07',0,7,5),(37,80000,'Welcome depositss','d','1999-03-22 10:06:07',0,7,5),(38,90000,'Welcome Deposit','d','2022-05-22 09:36:07',0,7,6),(39,80000,'Welcome depositss','d','1999-03-22 10:06:07',0,7,6),(40,80000,'Welcome depositss','d','1999-03-22 10:06:07',0,7,6),(41,80000,'Welcome depositss','d','1999-03-22 10:06:07',0,6,7),(42,80000,'Welcome depositss','d','1999-03-22 10:06:07',0,5,7),(43,80000,'Welcome depositss','d','1999-03-22 10:06:07',0,8,7),(44,500000,'Welcome withdraw','w','2022-06-10 09:36:07',0,7,7),(45,40000,'Welcome Deposit','d','2022-06-11 10:37:05',0,7,8),(46,70000,'welcome deposit','d','2022-06-11 20:17:00',0,7,8),(48,9000000,'Welcome deposit','d','2022-06-13 04:44:00',0,7,8),(49,9000000,'Welcome deposit','d','2022-06-13 04:44:00',0,7,8),(50,9000000,'Welcome deposit','d','2022-06-13 04:44:00',0,7,8),(51,9000000,'Welcome deposit','d','2022-06-13 04:44:00',0,7,8),(52,9000000,'Welcome deposit','d','2022-06-13 04:44:00',0,7,3),(53,30000,'welcome withdraw','w','2022-06-13 05:11:00',0,7,3),(54,500000,'welcome withdraw','w','2022-06-13 05:34:00',0,5,3),(55,9000000,'welcome withdraw','w','2022-06-13 14:44:00',0,7,4),(56,9000000,'welcome withdraw','w','2022-06-13 14:44:00',0,7,4),(57,9000000,'welcome withdraw','w','2022-06-13 14:44:00',0,7,5),(58,50000,'Welcome Withdraw','w','2022-06-13 16:39:00',0,6,5),(59,30000,'Welcome Deposit','d','2022-06-13 16:40:00',0,6,5),(60,6000,'welcome withdraw','w','1999-03-22 10:06:07',6,6,6),(61,3000000,'welcome transfer','t','1999-03-22 10:06:07',6,6,6),(62,200000,'welcome deposit','d','1999-03-22 10:06:07',8,8,8),(63,5000000,'welcome deposit','d','2022-06-18 00:53:00',8,8,8),(64,600000,'Welcome Withdraw','w','2022-06-18 02:09:00',7,7,7),(65,560000,'Welcome withdraw','w','2022-06-18 00:33:00',6,6,6);
/*!40000 ALTER TABLE `banktransaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-22  0:49:12
