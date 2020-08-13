/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.19 : Database - shuaichen_manage
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shuaichen_manage` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shuaichen_manage`;

/*Table structure for table `bill` */

DROP TABLE IF EXISTS `bill`;

CREATE TABLE `bill` (
  `billId` varchar(20) NOT NULL COMMENT '账单编码',
  `money` varchar(20) NOT NULL COMMENT '账单金额',
  `checked` varchar(10) NOT NULL COMMENT '是否付款',
  `date` varchar(20) NOT NULL COMMENT '创建时间',
  `userId` varchar(20) NOT NULL COMMENT '外键，关联user表',
  `deviceId` varchar(20) NOT NULL COMMENT '外建，关联device表死亡deviceId',
  PRIMARY KEY (`billId`),
  KEY `userId` (`userId`),
  KEY `deviceName` (`deviceId`),
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`),
  CONSTRAINT `bill_ibfk_3` FOREIGN KEY (`deviceId`) REFERENCES `device` (`deviceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bill` */

insert  into `bill`(`billId`,`money`,`checked`,`date`,`userId`,`deviceId`) values ('b00000001','1000','是','2020-03-03','u00000001','d00000001'),('b00000002','210000','是','2020-02-28','u00000002','d00000002'),('b00000003','1120','是','2020-01-01','u00000003','d00000003');

/*Table structure for table `date` */

DROP TABLE IF EXISTS `date`;

CREATE TABLE `date` (
  `dateId` varchar(20) NOT NULL COMMENT '登陆时间编码',
  `userId` varchar(20) NOT NULL COMMENT '用户id',
  `date` date NOT NULL COMMENT '登陆时间',
  PRIMARY KEY (`dateId`),
  KEY `userId` (`userId`),
  CONSTRAINT `date_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `date` */

/*Table structure for table `device` */

DROP TABLE IF EXISTS `device`;

CREATE TABLE `device` (
  `deviceId` varchar(20) NOT NULL COMMENT '设备编码',
  `deviceName` varchar(20) NOT NULL COMMENT '设备名称',
  `providerId` varchar(20) NOT NULL COMMENT '外建，关联provider表',
  `deviceNum` bigint(20) NOT NULL COMMENT '设备数量',
  `deviceMoney` varchar(10) NOT NULL COMMENT '单价',
  `deviceType` varchar(10) NOT NULL COMMENT '设备类型',
  PRIMARY KEY (`deviceId`),
  KEY `providerId` (`providerId`),
  CONSTRAINT `device_ibfk_1` FOREIGN KEY (`providerId`) REFERENCES `provider` (`providerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `device` */

insert  into `device`(`deviceId`,`deviceName`,`providerId`,`deviceNum`,`deviceMoney`,`deviceType`) values ('d00000001','推土车','p00000001',15,'600','中型'),('d00000002','拖拉机','p00000001',5,'300','中型'),('d00000003','脚手架','p00000002',8,'300','大型'),('d00000004','蹦蹦车','p00000002',20,'200','小型');

/*Table structure for table `provider` */

DROP TABLE IF EXISTS `provider`;

CREATE TABLE `provider` (
  `providerId` varchar(50) NOT NULL COMMENT '供应商编号',
  `providerName` varchar(20) NOT NULL COMMENT '供应商名称',
  `contact` varchar(100) NOT NULL COMMENT '联系人',
  `contactTelephone` varchar(20) NOT NULL COMMENT '联系电话',
  `contactAddress` varchar(200) NOT NULL COMMENT '联系地址',
  `fax` varchar(20) NOT NULL COMMENT '传真',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `creationTime` varchar(200) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`providerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `provider` */

insert  into `provider`(`providerId`,`providerName`,`contact`,`contactTelephone`,`contactAddress`,`fax`,`description`,`creationTime`) values ('p00000001','测试供应商001','王总','13999999999','陕西省西安市雁塔区西安邮电大学','13999999999','供应商描述1','2020-03-04'),('p00000002','测试供应商002','李总','13566666666','陕西省西安市雁塔区西安电子科技大学','13566666666','供应商描述2','2020-03-03');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `userId` varchar(20) NOT NULL COMMENT '用户id',
  `userRole` varchar(10) NOT NULL COMMENT '用户角色',
  `roleId` varchar(20) NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`roleId`),
  KEY `userId` (`userId`),
  CONSTRAINT `role_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `userCode` varchar(20) NOT NULL COMMENT '用户名',
  `passWord` varchar(20) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`userCode`,`passWord`) values (1,'xiaoming','123456');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` varchar(50) NOT NULL COMMENT '用户编号',
  `userName` varchar(20) NOT NULL COMMENT '用户姓名',
  `password` varchar(100) NOT NULL COMMENT '用户密码',
  `sex` varchar(10) NOT NULL COMMENT '用户性别',
  `birthday` varchar(100) NOT NULL COMMENT '出生日期',
  `userTelephone` varchar(20) NOT NULL COMMENT '用户电话',
  `userAddress` varchar(200) NOT NULL COMMENT '用户地址',
  `userType` varchar(20) NOT NULL COMMENT '用户类型',
  `age` int(10) NOT NULL COMMENT '用户年龄',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`password`,`sex`,`birthday`,`userTelephone`,`userAddress`,`userType`,`age`) values ('u00000001','张三','123456','男','2000-01-02','12587878788','陕西省西安市长安区西安邮电大学','管理员',20),('u00000002','李四','777777','男','1998-08-15','18766666666','陕西省西安市长安区西北政法大学','普通用户',22),('u00000003','王五','888888','女','1999-05-18','15899999999','陕西省西安市雁塔区西安邮电大学','管理员',21);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
