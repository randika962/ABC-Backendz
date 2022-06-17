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
-- Table structure for table `bankusers`
--

DROP TABLE IF EXISTS `bankusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankusers` (
  `uId` int NOT NULL AUTO_INCREMENT,
  `fName` varchar(45) NOT NULL,
  `lName` varchar(45) NOT NULL,
  `addres` varchar(45) NOT NULL,
  `UserEmail` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `type` varchar(1) NOT NULL,
  PRIMARY KEY (`uId`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankusers`
--

LOCK TABLES `bankusers` WRITE;
/*!40000 ALTER TABLE `bankusers` DISABLE KEYS */;
INSERT INTO `bankusers` VALUES (1,'Srimal','Herath','890/Watapuluwa','sri@gmail.com','1234uiyt','A'),(2,'Sulakshana','Gunathilakke','567/Alawathugoda','sula@gmail.com','0987cvbn','C'),(3,'Abdulla','Izer','456/Kegalle','abba@gmail.com','5678lmnb','E'),(4,'Dananjalee','Kaushalya','567/Digana','dana@gmail.com','3456cdfg','E'),(5,'Nikeshala','Madubhashini','876/Mawanella','niki@gmail.com','0985hyre','E'),(6,'Deshan','Wickramaarchchi','345/Polonnaruwa','desh@gmail.com','2843kutr','C'),(7,'Jithmi','Dassanayake','785/Galle','jimmy@gmail.com','2479kofd','C'),(8,'Dilki','Watthethnna','367/Kurunagala','dilki@gmail.com','3790lpok','E');
/*!40000 ALTER TABLE `bankusers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-17 19:33:26
