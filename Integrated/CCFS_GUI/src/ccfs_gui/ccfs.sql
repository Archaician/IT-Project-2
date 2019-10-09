-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 11, 2019 at 06:38 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ccfs`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
CREATE TABLE IF NOT EXISTS `accounts` (
  `accid` int(11) NOT NULL AUTO_INCREMENT,
  `empid` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(16) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `contact` varchar(21) NOT NULL,
  `type` varchar(15) NOT NULL,
  `accstatus` text,
  PRIMARY KEY (`accid`),
  UNIQUE KEY `empID` (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`accid`, `empid`, `username`, `password`, `fname`, `lname`, `address`, `contact`, `type`, `accstatus`) VALUES
(1, '1', 'Paul', 'Imran', 'Paul', 'Imran', 'Adljkhawghhjk', '09955635694', 'R', NULL),
(2, '2', 'Perez', 'Imran', 'Perez', 'Imran', 'KDJkjhawww', '09560959161', 'R', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `attid` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `attType` varchar(45) DEFAULT NULL,
  `studid` int(11) NOT NULL,
  PRIMARY KEY (`attid`),
  KEY `studid_idx` (`studid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `checklist`
--

DROP TABLE IF EXISTS `checklist`;
CREATE TABLE IF NOT EXISTS `checklist` (
  `checkid` int(11) NOT NULL AUTO_INCREMENT,
  `checkdesc` varchar(45) DEFAULT NULL,
  `checkvalues` varchar(45) DEFAULT NULL,
  `corevalues` varchar(45) DEFAULT NULL,
  `valuedesc` varchar(45) DEFAULT NULL,
  `firstrating` varchar(3) NOT NULL,
  `secondrating` varchar(3) NOT NULL,
  `thirdrating` varchar(3) NOT NULL,
  `fourthrating` varchar(3) NOT NULL,
  `studatt` int(11) NOT NULL,
  PRIMARY KEY (`checkid`),
  KEY `studid_idx` (`studatt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `curriculum`
--

DROP TABLE IF EXISTS `curriculum`;
CREATE TABLE IF NOT EXISTS `curriculum` (
  `curid` int(45) NOT NULL,
  `subject` varchar(11) NOT NULL,
  `grade` varchar(11) NOT NULL,
  PRIMARY KEY (`curid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `curstudent`
--

DROP TABLE IF EXISTS `curstudent`;
CREATE TABLE IF NOT EXISTS `curstudent` (
  `studentid` int(11) NOT NULL COMMENT 'ID FOR TABLE',
  `stuid` int(11) NOT NULL COMMENT 'ID OF THE STUDENT',
  `studfirst` varchar(45) NOT NULL,
  `studlast` varchar(45) NOT NULL,
  `gradelvl` varchar(45) NOT NULL,
  `section` varchar(11) DEFAULT NULL,
  `teacher` varchar(45) NOT NULL,
  `totalpayment` int(11) NOT NULL,
  `dateenrolled` date NOT NULL,
  `scyearstart` year(4) NOT NULL,
  `scyearend` year(4) NOT NULL,
  PRIMARY KEY (`studentid`),
  KEY `studid_idx` (`stuid`),
  KEY `studid_idx1` (`stuid`,`studfirst`),
  KEY `stufname_idx` (`studfirst`),
  KEY `stulname_idx` (`studlast`),
  KEY `gradlvl_idx` (`gradelvl`),
  KEY `schoolyear_idx` (`scyearstart`,`scyearend`),
  KEY `scyearstart_idx` (`scyearstart`),
  KEY `scyeared_idx` (`scyearend`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

DROP TABLE IF EXISTS `discount`;
CREATE TABLE IF NOT EXISTS `discount` (
  `disid` int(11) NOT NULL,
  `type` text NOT NULL,
  `disamount` float DEFAULT NULL,
  PRIMARY KEY (`disid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `enstudent`
--

DROP TABLE IF EXISTS `enstudent`;
CREATE TABLE IF NOT EXISTS `enstudent` (
  `studid` int(11) NOT NULL AUTO_INCREMENT,
  `studFname` varchar(45) NOT NULL,
  `studMname` varchar(45) DEFAULT NULL,
  `studLname` varchar(45) NOT NULL,
  `gradelvl` varchar(45) NOT NULL,
  `birthdate` date NOT NULL,
  `birthplace` varchar(45) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `homeTelnum` varchar(45) DEFAULT NULL,
  `mobilenum` varchar(45) NOT NULL,
  `studaddress` varchar(45) NOT NULL,
  `prevschoolattended` varchar(45) NOT NULL,
  `studstat` varchar(45) NOT NULL,
  `faFname` varchar(45) DEFAULT NULL,
  `falname` varchar(45) DEFAULT NULL,
  `faAdd` varchar(45) DEFAULT NULL,
  `faMobilenum` varchar(45) DEFAULT NULL,
  `faEmail` varchar(45) DEFAULT NULL,
  `faoccupation` varchar(45) NOT NULL,
  `moFname` varchar(45) DEFAULT NULL,
  `moLname` varchar(45) DEFAULT NULL,
  `momobilenum` varchar(45) DEFAULT NULL,
  `moEmail` varchar(45) DEFAULT NULL,
  `mooccupation` varchar(45) NOT NULL,
  `sibFname` varchar(60) DEFAULT NULL,
  `sibLname` varchar(60) DEFAULT NULL,
  `sibschoolname` varchar(45) DEFAULT NULL,
  `dateenrolled` date NOT NULL,
  PRIMARY KEY (`studid`),
  KEY `studFname` (`studFname`),
  KEY `studLname` (`studLname`),
  KEY `gradelvl` (`gradelvl`),
  KEY `dateenrolled` (`dateenrolled`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fees`
--

DROP TABLE IF EXISTS `fees`;
CREATE TABLE IF NOT EXISTS `fees` (
  `feeid` int(11) NOT NULL,
  `disctype` varchar(45) NOT NULL,
  `discpercetage` float NOT NULL,
  `feeamount` float NOT NULL,
  `feedate` date NOT NULL,
  `duedate` date NOT NULL,
  `feestatus` varchar(45) NOT NULL,
  `student` int(11) NOT NULL,
  PRIMARY KEY (`feeid`),
  KEY `studid_idx` (`student`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='	';

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

DROP TABLE IF EXISTS `grades`;
CREATE TABLE IF NOT EXISTS `grades` (
  `gradeid` int(11) NOT NULL AUTO_INCREMENT,
  `subjectdesc` varchar(45) DEFAULT NULL,
  `firstquartergrade` int(11) DEFAULT NULL,
  `secondquartergrade` int(11) DEFAULT NULL,
  `thirdquartergrade` int(11) DEFAULT NULL,
  `fourthquartergrade` int(11) DEFAULT NULL,
  `finalgrade` int(11) DEFAULT NULL,
  `remarks` varchar(45) DEFAULT NULL,
  `estudid` int(11) NOT NULL,
  PRIMARY KEY (`gradeid`),
  KEY `studid_idx` (`estudid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
CREATE TABLE IF NOT EXISTS `logs` (
  `logid` int(100) NOT NULL AUTO_INCREMENT,
  `accid` int(11) NOT NULL,
  `description` varchar(45) NOT NULL,
  `date` date NOT NULL,
  `time` timestamp NOT NULL,
  PRIMARY KEY (`logid`),
  KEY `accid_idx` (`accid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `payid` int(11) NOT NULL,
  `studeid` int(11) NOT NULL,
  `payfname` varchar(45) DEFAULT NULL,
  `paylname` varchar(45) DEFAULT NULL,
  `payamount` float DEFAULT NULL,
  `paydate` date DEFAULT NULL,
  PRIMARY KEY (`payid`),
  KEY `studeid_idx` (`studeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schooldays`
--

DROP TABLE IF EXISTS `schooldays`;
CREATE TABLE IF NOT EXISTS `schooldays` (
  `scid` int(11) NOT NULL,
  `month` date NOT NULL,
  `days` int(30) NOT NULL,
  `schyearstart` year(4) NOT NULL,
  `schyearend` year(4) NOT NULL,
  PRIMARY KEY (`scid`),
  KEY `schyearstart_idx` (`schyearstart`),
  KEY `schyearend_idx` (`schyearend`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolyear`
--

DROP TABLE IF EXISTS `schoolyear`;
CREATE TABLE IF NOT EXISTS `schoolyear` (
  `yearid` int(40) NOT NULL AUTO_INCREMENT,
  `yearstart` year(4) NOT NULL,
  `yearend` year(4) NOT NULL,
  PRIMARY KEY (`yearid`),
  KEY `yearstart` (`yearstart`),
  KEY `yearend` (`yearend`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sponsorhip`
--

DROP TABLE IF EXISTS `sponsorhip`;
CREATE TABLE IF NOT EXISTS `sponsorhip` (
  `sponsorid` int(45) NOT NULL AUTO_INCREMENT,
  `fname` varchar(11) DEFAULT NULL,
  `lname` varchar(11) DEFAULT NULL,
  `studentid` int(11) NOT NULL,
  PRIMARY KEY (`sponsorid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `surcharge`
--

DROP TABLE IF EXISTS `surcharge`;
CREATE TABLE IF NOT EXISTS `surcharge` (
  `surid` int(11) NOT NULL,
  `suramount` float DEFAULT NULL,
  PRIMARY KEY (`surid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `studid` FOREIGN KEY (`studid`) REFERENCES `enstudent` (`studid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `checklist`
--
ALTER TABLE `checklist`
  ADD CONSTRAINT `studatt` FOREIGN KEY (`studatt`) REFERENCES `enstudent` (`studid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `curstudent`
--
ALTER TABLE `curstudent`
  ADD CONSTRAINT `gradlvl` FOREIGN KEY (`gradelvl`) REFERENCES `enstudent` (`gradelvl`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `scyeared` FOREIGN KEY (`scyearend`) REFERENCES `schoolyear` (`yearend`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `scyearstart` FOREIGN KEY (`scyearstart`) REFERENCES `schoolyear` (`yearstart`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `stufname` FOREIGN KEY (`studfirst`) REFERENCES `enstudent` (`studFname`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `stuid` FOREIGN KEY (`stuid`) REFERENCES `enstudent` (`studid`),
  ADD CONSTRAINT `stulname` FOREIGN KEY (`studlast`) REFERENCES `enstudent` (`studLname`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `fees`
--
ALTER TABLE `fees`
  ADD CONSTRAINT `student` FOREIGN KEY (`student`) REFERENCES `enstudent` (`studid`) ON UPDATE CASCADE;

--
-- Constraints for table `grades`
--
ALTER TABLE `grades`
  ADD CONSTRAINT `estudid` FOREIGN KEY (`estudid`) REFERENCES `curstudent` (`studentid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `accid` FOREIGN KEY (`accid`) REFERENCES `accounts` (`accid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `studeid` FOREIGN KEY (`studeid`) REFERENCES `curstudent` (`studentid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `schooldays`
--
ALTER TABLE `schooldays`
  ADD CONSTRAINT `schyearend` FOREIGN KEY (`schyearend`) REFERENCES `schoolyear` (`yearend`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `schyearstart` FOREIGN KEY (`schyearstart`) REFERENCES `schoolyear` (`yearstart`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
