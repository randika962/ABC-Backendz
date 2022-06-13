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
  `transacType` varchar(1) NOT NULL,
  `transacTime` datetime NOT NULL,
  `aId` int NOT NULL,
  `sourceAccId` int NOT NULL,
  `destinationAccId` int NOT NULL,
  PRIMARY KEY (`tId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banktransaction`
--

LOCK TABLES `banktransaction` WRITE;
/*!40000 ALTER TABLE `banktransaction` DISABLE KEYS */;
INSERT INTO `banktransaction` VALUES (1,500000,'Welcome withdraw','w','2022-04-29 15:07:00',1,1,1),(2,600000,'Welcome withdraw','w','2022-04-29 15:07:00',1,1,1),(3,230000,'Welcome deposite','d','2022-04-29 15:07:00',1,3,1),(4,542380,'Welcome deposite','d','2022-04-29 15:07:00',2,3,1),(5,450000,'Welcome deposite','d','2022-04-29 15:07:00',2,3,2),(6,350000,'Welcome deposite','d','2022-04-29 15:07:00',2,2,2),(7,125000,'Welcome deposite','d','2022-04-29 15:07:00',3,2,2),(8,906000,'Welcome deposite','d','2022-04-29 15:07:00',3,2,2),(9,805000,'Welcome deposite','d','2022-04-29 15:07:00',3,4,4),(10,765400,'Welcome deposite','d','2022-04-29 15:07:00',4,4,4),(12,328900,'Welcome deposite','d','2022-04-29 15:07:00',4,4,4),(13,390000,'Welcome deposite','d','2022-04-29 15:07:00',4,4,3),(14,456900,'Welcome deposite','d','2022-04-29 15:07:00',5,4,3),(15,976500,'Welcome deposite','d','2022-04-29 15:07:00',5,5,5),(16,160000,'Welcome deposite','d','2022-04-29 15:07:00',5,5,5),(17,550000,'Welcome deposite','d','2022-04-29 15:07:00',6,6,6),(18,710000,'Welcome deposite','d','2022-04-29 15:07:00',6,6,6),(19,423000,'Welcome deposite','d','2022-04-29 15:07:00',6,6,6),(20,760000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(21,680000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(22,900000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(23,350000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(24,250000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(25,520000,'Welcome deposite','d','2022-04-29 15:07:00',2,5,0),(26,890000,'Welcome deposite ','d','2022-04-29 15:07:00',2,5,0),(27,800000,'Welcome deposite','d','1999-03-22 10:06:07',6,6,0),(28,900000,'Welcome deposite','d','1999-03-22 10:06:07',6,6,0),(29,200000,'Welcome withdraw','w','1999-03-22 10:06:07',6,6,0),(30,245000,'Welcome transfer','t','1997-03-22 10:06:07',4,1,0),(31,560000,'Welcome transfer','t','1997-03-22 10:06:07',4,4,0),(32,200000,'Welcome withdraw','w','2022-05-20 12:08:09',5,4,2),(33,300000,'Welcome deposit','d','2022-05-20 13:08:09',5,4,2),(34,600000,'Welcome transfer','t','2022-05-20 14:08:09',5,4,2);
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

-- Dump completed on 2022-06-08  9:57:31
