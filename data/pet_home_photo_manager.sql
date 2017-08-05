-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 59.110.173.114    Database: pet_home
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `photo_manager`
--

DROP TABLE IF EXISTS `photo_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photo_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photo_manager`
--

LOCK TABLES `photo_manager` WRITE;
/*!40000 ALTER TABLE `photo_manager` DISABLE KEYS */;
INSERT INTO `photo_manager` VALUES (1,1,1,'标题图'),(2,2,2,'标题图'),(3,3,3,'标题图'),(4,4,4,'标题图'),(5,5,5,'标题图'),(6,6,6,'标题图'),(7,7,7,'标题图'),(8,8,8,'标题图'),(9,9,9,'标题图'),(10,10,10,'标题图'),(11,11,11,'标题图'),(12,12,12,'标题图'),(13,13,13,'标题图'),(14,14,14,'标题图'),(15,15,15,'标题图'),(16,16,16,'标题图'),(17,17,17,'标题图'),(18,18,18,'标题图'),(19,19,1,'展示图'),(20,20,1,'展示图'),(21,21,1,'展示图'),(22,22,1,'展示图'),(23,23,1,'展示图'),(24,24,1,'展示图'),(25,25,1,'展示图'),(26,26,1,'展示图'),(27,27,1,'展示图'),(28,28,1,'展示图'),(29,29,3,'展示图'),(30,30,3,'展示图'),(31,31,3,'展示图'),(32,32,4,'展示图'),(33,33,4,'展示图'),(34,34,4,'展示图'),(35,35,4,'展示图'),(36,36,4,'展示图'),(37,37,6,'展示图'),(38,38,6,'展示图'),(39,40,42,'标题图'),(40,41,43,'标题图'),(41,42,44,'标题图'),(42,43,45,'标题图'),(43,44,46,'标题图'),(44,45,47,'标题图'),(45,46,48,'标题图'),(46,47,49,'标题图'),(47,48,50,'标题图'),(48,49,51,'标题图'),(49,50,52,'标题图'),(50,51,53,'标题图'),(51,52,42,'展示图'),(52,53,42,'展示图'),(53,54,42,'展示图'),(54,55,42,'展示图'),(55,56,42,'展示图'),(56,57,42,'展示图'),(57,58,42,'展示图'),(58,59,42,'展示图'),(59,60,42,'展示图'),(60,61,42,'展示图'),(61,62,43,'展示图'),(62,63,43,'展示图'),(63,64,43,'展示图'),(64,65,43,'展示图'),(65,66,43,'展示图'),(66,67,43,'展示图'),(67,68,43,'展示图'),(68,69,44,'展示图'),(69,70,44,'展示图'),(70,71,44,'展示图'),(71,72,44,'展示图'),(72,73,44,'展示图'),(73,74,44,'展示图'),(74,75,44,'展示图'),(75,76,44,'展示图'),(76,77,44,'展示图'),(77,78,44,'展示图'),(78,79,45,'展示图'),(79,80,45,'展示图'),(80,81,45,'展示图'),(81,82,45,'展示图'),(82,83,45,'展示图'),(83,84,45,'展示图'),(84,85,45,'展示图'),(85,86,45,'展示图'),(86,87,45,'展示图'),(87,88,45,'展示图'),(88,89,45,'展示图'),(89,90,45,'展示图'),(90,91,46,'展示图'),(91,92,46,'展示图'),(92,93,46,'展示图'),(93,94,46,'展示图'),(94,95,47,'展示图'),(95,96,47,'展示图'),(96,97,47,'展示图'),(97,98,47,'展示图'),(98,99,47,'展示图'),(99,100,47,'展示图'),(100,101,47,'展示图'),(101,102,47,'展示图'),(102,103,48,'展示图'),(103,104,48,'展示图'),(104,105,48,'展示图'),(105,106,48,'展示图'),(106,107,48,'展示图'),(107,108,49,'展示图'),(108,109,49,'展示图'),(109,110,49,'展示图'),(110,111,49,'展示图'),(111,112,49,'展示图'),(112,113,49,'展示图'),(113,114,49,'展示图'),(114,115,50,'展示图'),(115,116,50,'展示图'),(116,117,50,'展示图'),(117,118,50,'展示图'),(118,119,50,'展示图'),(119,120,50,'展示图'),(120,121,50,'展示图'),(121,122,50,'展示图'),(122,123,51,'展示图'),(123,124,51,'展示图'),(124,125,51,'展示图'),(125,126,51,'展示图'),(126,127,51,'展示图'),(127,128,51,'展示图'),(128,129,51,'展示图'),(129,130,51,'展示图'),(130,131,52,'展示图'),(131,132,52,'展示图'),(132,133,52,'展示图'),(133,134,52,'展示图'),(134,135,52,'展示图'),(135,136,52,'展示图'),(136,137,52,'展示图'),(137,138,52,'展示图'),(138,139,52,'展示图'),(139,140,53,'展示图'),(140,141,53,'展示图'),(141,142,53,'展示图'),(142,143,53,'展示图'),(143,144,53,'展示图'),(144,145,53,'展示图'),(145,146,53,'展示图'),(146,147,53,'展示图'),(147,148,53,'展示图'),(148,149,53,'展示图'),(149,150,53,'展示图'),(150,151,53,'展示图');
/*!40000 ALTER TABLE `photo_manager` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-21 12:03:40