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
-- Table structure for table `photo`
--

DROP TABLE IF EXISTS `photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photo`
--

LOCK TABLES `photo` WRITE;
/*!40000 ALTER TABLE `photo` DISABLE KEYS */;
INSERT INTO `photo` VALUES (1,'1','1.jpg'),(2,'2','2.jpg'),(3,'3','3.jpg'),(4,'4','4.jpg'),(5,'5','5.jpg'),(6,'6','6.jpg'),(7,'7','7.jpg'),(8,'8','8.jpg'),(9,'9','9.jpg'),(10,'10','10.jpg'),(11,'11','11.jpg'),(12,'12','12.jpg'),(13,'13','13.jpg'),(14,'14','14.jpg'),(15,'15','15.jpg'),(16,'16','16.jpg'),(17,'17','17.jpg'),(18,'18','18.jpg'),(19,'1d1','1/1d1.png'),(20,'1d2','1/1d2.png'),(21,'1d3','1/1d3.png'),(22,'1d4','1/1d4.png'),(23,'1d5','1/1d5.png'),(24,'1d6','1/1d6.png'),(25,'1d7','1/1d7.png'),(26,'1d8','1/1d8.png'),(27,'1d9','1/1d9.png'),(28,'1d10','1/1d10.png'),(29,'3d1','3/3d1.png'),(30,'3d2','3/3d2.png'),(31,'3d3','3/3d3.png'),(32,'4d1','4/4d1.jpg'),(33,'4d2','4/4d2.jpg'),(34,'4d3','4/4d3.jpg'),(35,'4d4','4/4d4.jpg'),(36,'4d5','4/4d5.png'),(37,'6d1','6/6d1.png'),(38,'6d2','6/6d2.png'),(40,'42','42.jpg'),(41,'43','43.jpg'),(42,'44','44.jpg'),(43,'45','45.jpg'),(44,'46','46.jpg'),(45,'47','47.jpg'),(46,'48','48.jpg'),(47,'49','49.jpg'),(48,'50','50.jpg'),(49,'51','51.jpg'),(50,'52','52.jpg'),(51,'53','53.jpg'),(52,'42d1','42/42d1.jpg'),(53,'42d2','42/42d2.jpg'),(54,'42d3','42/42d3.jpg'),(55,'42d4','42/42d4.jpg'),(56,'42d5','42/42d5.jpg'),(57,'42d6','42/42d6.jpg'),(58,'42d7','42/42d7.jpg'),(59,'42d8','42/42d8.jpg'),(60,'42d9','42/42d9.jpg'),(61,'42d10','42/42d10.jpg'),(62,'43d1','43/43d1.jpg'),(63,'43d2','43/43d2.jpg'),(64,'43d3','43/43d3.jpg'),(65,'43d4','43/43d4.jpg'),(66,'43d5','43/43d5.jpg'),(67,'43d6','43/43d6.jpg'),(68,'43d7','43/43d7.jpg'),(69,'44d1','44/44d1.jpg'),(70,'44d2','44/44d2.jpg'),(71,'44d3','44/44d3.jpg'),(72,'44d4','44/44d4.jpg'),(73,'44d5','44/44d5.jpg'),(74,'44d6','44/44d6.jpg'),(75,'44d7','44/44d7.jpg'),(76,'44d8','44/44d8.jpg'),(77,'44d9','44/44d9.jpg'),(78,'44d10','44/44d10.jpg'),(79,'45d1','45/45d1.jpg'),(80,'45d2','45/45d2.jpg'),(81,'45d3','45/45d3.jpg'),(82,'45d4','45/45d4.jpg'),(83,'45d5','45/45d5.jpg'),(84,'45d6','45/45d6.jpg'),(85,'45d7','45/45d7.jpg'),(86,'45d8','45/45d8.jpg'),(87,'45d9','45/45d9.jpg'),(88,'45d10','45/45d10.jpg'),(89,'45d11','45/45d11.jpg'),(90,'45d12','45/45d12.jpg'),(91,'46d1','46/46d1.jpg'),(92,'46d2','46/46d2.jpg'),(93,'46d3','46/46d3.jpg'),(94,'46d4','46/46d4.jpg'),(95,'47d1','47/47d1.jpg'),(96,'47d2','47/47d2.jpg'),(97,'47d3','47/47d3.jpg'),(98,'47d4','47/47d4.jpg'),(99,'47d5','47/47d5.jpg'),(100,'47d6','47/47d6.jpg'),(101,'47d7','47/47d7.jpg'),(102,'47d8','47/47d8.jpg'),(103,'48d1','48/48d1.jpg'),(104,'48d2','48/48d2.jpg'),(105,'48d3','48/48d3.jpg'),(106,'48d4','48/48d4.jpg'),(107,'48d5','48/48d5.jpg'),(108,'49d1','49/49d1.jpg'),(109,'49d2','49/49d2.jpg'),(110,'49d3','49/49d3.jpg'),(111,'49d4','49/49d4.jpg'),(112,'49d5','49/49d5.jpg'),(113,'49d6','49/49d6.jpg'),(114,'49d7','49/49d7.jpg'),(115,'50d1','50/50d1.jpg'),(116,'50d2','50/50d2.jpg'),(117,'50d3','50/50d3.jpg'),(118,'50d4','50/50d4.jpg'),(119,'50d5','50/50d5.jpg'),(120,'50d6','50/50d6.jpg'),(121,'50d7','50/50d7.jpg'),(122,'50d8','50/50d8.jpg'),(123,'51d1','51/51d1.jpg'),(124,'51d2','51/51d2.jpg'),(125,'51d3','51/51d3.jpg'),(126,'51d4','51/51d4.jpg'),(127,'51d5','51/51d5.jpg'),(128,'51d6','51/51d6.jpg'),(129,'51d7','51/51d7.jpg'),(130,'51d8','51/51d8.jpg'),(131,'52d1','52/52d1.jpg'),(132,'52d2','52/52d2.jpg'),(133,'52d3','52/52d3.jpg'),(134,'52d4','52/52d4.jpg'),(135,'52d5','52/52d5.jpg'),(136,'52d6','52/52d6.jpg'),(137,'52d7','52/52d7.jpg'),(138,'52d8','52/52d8.jpg'),(139,'52d9','52/52d9.jpg'),(140,'53d1','53/53d1.jpg'),(141,'53d2','53/53d2.jpg'),(142,'53d3','53/53d3.jpg'),(143,'53d4','53/53d4.jpg'),(144,'53d5','53/53d5.jpg'),(145,'53d6','53/53d6.jpg'),(146,'53d7','53/53d7.jpg'),(147,'53d8','53/53d8.jpg'),(148,'53d9','53/53d9.jpg'),(149,'53d10','53/53d10.jpg'),(150,'53d11','53/53d11.jpg'),(151,'53d12','53/53d12.jpg');
/*!40000 ALTER TABLE `photo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-21 12:03:39
