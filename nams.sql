-- MySQL dump 10.10
--
-- Host: localhost    Database: nams
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt

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
-- Table structure for table `add_cust`
--

DROP TABLE IF EXISTS `add_cust`;
CREATE TABLE `add_cust` (
  `cust_id` int(11) NOT NULL auto_increment,
  `cust_name` varchar(50) default NULL,
  `cust_addr` varchar(50) default NULL,
  `cust_cn` bigint(20) default NULL,
  `cust_email` varchar(50) default NULL,
  PRIMARY KEY  (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_cust`
--


/*!40000 ALTER TABLE `add_cust` DISABLE KEYS */;
LOCK TABLES `add_cust` WRITE;
INSERT INTO `add_cust` VALUES (1,'sanket','pune',9403750454,'abc@gmail.com'),(3,'dharma','hadapsar',7586498576,'xyz@gmail.com'),(7,'sarvesh','pune',4563521485,'fgh@gmail.com'),(8,'vrushal','pune',7588372260,'vrushal12@gmail.com'),(9,'dash','mumbai',9403750455,'k6'),(10,'shonya','nagar',2546869785,'vbn@gmail.com'),(11,'pravin','solapur',921456852,'nbn@gmail.com'),(12,'namo','delhi',9403750963,'iop@gmail.com'),(13,'arvind','hyderabad',8422364578,'jkl@gmail.com'),(14,'babu','coorg',7564897542,'ghj@gmail.com'),(17,'khaire','shivaji nagar',7546898546,'ckhaire@gmail.com'),(18,'balaji','vadgaon',7057572034,'r131402it@gmail.com');
UNLOCK TABLES;
/*!40000 ALTER TABLE `add_cust` ENABLE KEYS */;

--
-- Table structure for table `add_news`
--

DROP TABLE IF EXISTS `add_news`;
CREATE TABLE `add_news` (
  `news_id` int(11) NOT NULL auto_increment,
  `news_name` varchar(30) default NULL,
  `news_lang` varchar(30) default NULL,
  `news_price` int(11) default NULL,
  `news_quan` bigint(20) default NULL,
  PRIMARY KEY  (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_news`
--


/*!40000 ALTER TABLE `add_news` DISABLE KEYS */;
LOCK TABLES `add_news` WRITE;
INSERT INTO `add_news` VALUES (1,'Indian times','English',3,20),(2,'Deccan Chronicle','English',5,10),(3,'Times of India','English',4,15),(5,'Divya Marathi','Marathi',2,15),(6,'sakal','marathi',3,20),(7,'punya marathi','marathi',3,15);
UNLOCK TABLES;
/*!40000 ALTER TABLE `add_news` ENABLE KEYS */;

--
-- Table structure for table `add_supp`
--

DROP TABLE IF EXISTS `add_supp`;
CREATE TABLE `add_supp` (
  `supp_id` int(11) NOT NULL auto_increment,
  `supp_name` varchar(50) default NULL,
  `supp_cn` bigint(20) default NULL,
  PRIMARY KEY  (`supp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_supp`
--


/*!40000 ALTER TABLE `add_supp` DISABLE KEYS */;
LOCK TABLES `add_supp` WRITE;
INSERT INTO `add_supp` VALUES (6,'dharma',7588467895),(7,'devesh',9503068348),(8,'chaitanya',8557449654);
UNLOCK TABLES;
/*!40000 ALTER TABLE `add_supp` ENABLE KEYS */;

/*!50003 SET @OLD_SQL_MODE=@@SQL_MODE*/;
DELIMITER ;;
/*!50003 SET SESSION SQL_MODE="STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION" */;;
/*!50003 CREATE */ /*!50017 DEFINER=`root`@`localhost` */ /*!50003 TRIGGER `HISTORY` BEFORE DELETE ON `add_supp` FOR EACH ROW BEGIN
	INSERT INTO supp_hist SET supp_id=OLD.supp_id,supp_name=OLD.supp_name,supp_cn=OLD.supp_cn;
END */;;

DELIMITER ;
/*!50003 SET SESSION SQL_MODE=@OLD_SQL_MODE */;

--
-- Table structure for table `nams_login`
--

DROP TABLE IF EXISTS `nams_login`;
CREATE TABLE `nams_login` (
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nams_login`
--


/*!40000 ALTER TABLE `nams_login` DISABLE KEYS */;
LOCK TABLES `nams_login` WRITE;
INSERT INTO `nams_login` VALUES ('admin','admin123'),('sanket','sanket123'),('abc','abc123'),('vrushal','vrushal123'),('dash','dash123'),('namo','namo123'),('shalini','shalini123'),('dharma','dharma123'),('anant','anant123'),('rohit','rohit123'),('roopali','roopali123');
UNLOCK TABLES;
/*!40000 ALTER TABLE `nams_login` ENABLE KEYS */;

--
-- Table structure for table `supp_hist`
--

DROP TABLE IF EXISTS `supp_hist`;
CREATE TABLE `supp_hist` (
  `supp_id` int(11) default NULL,
  `supp_name` varchar(50) default NULL,
  `supp_cn` bigint(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supp_hist`
--


/*!40000 ALTER TABLE `supp_hist` DISABLE KEYS */;
LOCK TABLES `supp_hist` WRITE;
INSERT INTO `supp_hist` VALUES (1,'ram',7588372260),(5,'john',9689968952),(2,'nagesh',6582457962),(4,'sanket',2620469123),(9,'ramesh',9564234579);
UNLOCK TABLES;
/*!40000 ALTER TABLE `supp_hist` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

