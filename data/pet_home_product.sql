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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `animal` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `introduction` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `per_price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'cat','toy','SUPER休普心形猫抓盆蓝色','SUPER休普心形猫抓盆',98),(2,'cat','toy','伊丽Elite17孔木质益智型猫玩具边长25cm高6cm','伊丽Elite17孔木质益智型猫玩具',49),(3,'cat','toy','GiGwi韵律捕猎系列炫律猎物小鸟14*7*5.5cm','GiGwi韵律捕猎系列炫律猎物小鸟',32),(4,'cat','toy','美国PioneerPet9孔玄机盒猫咪玩具25.2*25.2*6.4cm','美国PioneerPet9孔玄机盒猫咪玩具',98),(5,'cat','toy','台湾Amycarol猫猫玩具猫草玩偶系列超柔棕色花花猫踏垫25cm*8.5cm','台湾Amycarol猫猫玩具猫草玩偶系列超柔棕色花花猫踏垫',12.8),(6,'cat','toy','CosmicCatnip天然猫草蝴蝶沙包猫玩具约9*10cm','CosmicCatnip天然猫草蝴蝶沙包猫玩具',28),(7,'cat','toy','经典猫猫玩具—打不倒的鼠坚强，不是你倒就是我倒','经典猫猫玩具—打不倒的鼠坚强',5),(8,'cat','toy','德国特瑞仕TRIXIE行动派系列猫用扑克寻宝机','德国特瑞仕TRIXIE行动派系列猫用扑克寻宝机',220),(9,'cat','toy','美国PETSTAGES玩乐玩具猫用旋转轨道球','美国PETSTAGES玩乐玩具猫用旋转轨道球',160),(10,'cat','toy','美国AFP智力系列猫咪羽毛陀螺逗猫棒杆长18cm','美国AFP智力系列猫咪羽毛陀螺逗猫棒杆',152),(11,'cat','toy','田田猫猫隧道颜色靓丽的螺旋式可收纳猫隧道90cm*25cm时尚玩乐逗趣为一体的猫玩具','田田猫猫隧道颜色靓丽的螺旋式可收纳猫隧道',38),(12,'cat','toy','美国PETSTAGES元气玩具猫用魔力猫草喷雾59ml','美国PETSTAGES元气玩具猫用魔力猫草喷雾',50),(13,'cat','toy','R2P猫咪系列猫草布谷鸟(咖啡)','R2P猫咪系列猫草布谷鸟',35),(14,'cat','toy','猫扑Mopo神奇双球木天蓼猫玩具','猫扑Mopo神奇双球木天蓼猫玩具',15),(15,'cat','toy','伊丽Elite小蜗牛生态猫玩具8cm','伊丽Elite小蜗牛生态猫玩具',10),(16,'cat','toy','多格漫逗猫可爱卡通猫抱枕小花15.5*40*6cm','多格漫逗猫可爱卡通猫抱枕',42),(17,'cat','toy','多格漫木制猫玩具碰球猫宽22.9*长9*高22.4cm','多格漫木制猫玩具碰球',106),(18,'cat','toy','美国AFP古董风系列猫玩具猫薄荷发声褶皱球2只装','美国AFP古董风系列猫玩具猫薄荷发声褶皱球',26),(42,'dog','food','全新升级的宝路中小型犬成犬粮针对中小型犬的特殊营养需求而设计。独特的小三角健齿颗粒包含着更浓缩的好营养，让小家伙们每天都健康有活力。5大健康活力表现，是宝路优质营养的好证明。','宝路中小型成犬粮牛肉肝蔬菜及谷物狗粮1.8kg',48),(43,'dog','food','法国皇家ROYALCANIN小型犬奶糕/怀孕/哺乳期母犬/离乳期幼犬奶糕1kg，针对繁殖期母犬各阶段以及幼犬设计了完整的新营养方案，确保母犬及幼犬的营养与能量需求。独特的营养配比，既是母犬怀孕及哺乳期的营养保证，也是幼犬理想的离乳期过渡食品。','法国皇家ROYALCANIN小型犬离乳期奶糕1kgMIS30',63),(44,'dog','food','宠优康多乐活力营养成犬粮，希望与您一起见证爱犬每时每刻的良好表现！均衡营养、高品质蛋白有助肌肉强健；维生素矿物质和抗氧化剂有助保护免疫系统；精选原料和天然纤维有助消化系统健康。','康多乐成犬粮牛肉肝蔬菜狗粮15kg',269),(45,'dog','daily','麦德氏红标超浓缩卵磷脂680g，改善皮肤过敏瘙痒，毛发浓密油亮，有如护发后一般！发情顺畅、胎数增加、奶水充足、犬乳体质强壮；对抗紧迫，刺激免疫力，强健骨骼，增进活力','麦德氏inplus红标超浓缩卵磷脂680g毛发浓密油亮',120),(46,'dog','daily','怡亲多可特三围网格狗狗厕所多规格','怡亲多可特三围网格狗狗厕所多规格',28),(47,'dog','daily','因此款狗碗销量较大，每次进货的颜色会有所不同，发放的颜色也是随机发放，若想要指定颜色狗碗，请在下订单前在备注框里备注或联系在线客服进行备注。','怡亲多可特经典狗爪脚印烤漆狗碗食盆水碗',5.9),(48,'fish','daily','材质：其它;附加配件：裸缸;鱼缸长度：60cm以下;规格：小型','森森（SUNSUN）鱼缸水族箱桌面鱼缸乌龟缸带晒台宠物龟专用缸蓝色Q3-封闭式大号33*24*17cm',32.6),(49,'fish','food','浮性：上浮型;适用对象：锦鲤/金鱼;饲料类型：颗粒;重量：100g-1kg','森森（SUNSUN）鱼食锦鲤金鱼小颗粒饲料鱼粮龟粮20g观赏鱼饲料',6),(50,'fish','daily','过滤器：水妖精;适用鱼缸长度：60cm以下;滤材：其它;滤材功率：1-10W;适用范围：淡水','森森（SUNSUN）水妖精鱼缸迷你小型生化棉过滤器反气举气动式过滤设备单个水妖精',13.8),(51,'fish','daily','过滤器：其它配件;适用鱼缸长度：60cm以下;滤材：陶瓷环;功率：1-10W;适用范围：淡水','森森（SUNSUN）鱼缸过滤材料细菌屋陶瓷环麦饭石活性炭生化球盒装生化球60颗(约230g)',15.8),(52,'fish','food','浮性：上浮型;适用对象：龙鱼，血鹦鹉，罗汉鱼，其它;饲料类型：颗粒;重量：100g-1kg','三友创美典藏血鹦鹉鱼饲料快速增红鱼粮虾红素招财银龙鱼上浮鱼食发财地图鱼增艳观赏鱼食1KG典藏版3MM',118),(53,'fish','food','浮性：上浮型;适用对象：血鹦鹉;饲料类型：颗粒;重量：100g-1kg','YEE意牌热带鱼发财鱼鱼食鱼食血鹦鹉增色鱼饲料正品增红鹦鹉鱼饲料简版袋装500g',32.9);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-21 12:03:36
