/*
 Navicat MySQL Data Transfer

 Source Server         : jsp_Project
 Source Server Version : 50624
 Source Host           : localhost
 Source Database       : StudentManager

 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 09/16/2015 10:38:27 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_leason`
-- ----------------------------
DROP TABLE IF EXISTS `t_leason`;
CREATE TABLE `t_leason` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leason_name` varchar(255) NOT NULL,
  `teacher` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `t_leason`
-- ----------------------------
BEGIN;
INSERT INTO `t_leason` VALUES ('1', 'math', 'zhang');
COMMIT;

-- ----------------------------
--  Table structure for `t_score`
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `leason_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `student_id` (`student_id`),
  KEY `leason_id` (`leason_id`),
  KEY `student_id_2` (`student_id`),
  KEY `leason_id_2` (`leason_id`),
  CONSTRAINT `leaId` FOREIGN KEY (`leason_id`) REFERENCES `t_leason` (`id`),
  CONSTRAINT `stuId` FOREIGN KEY (`student_id`) REFERENCES `t_student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `t_score`
-- ----------------------------
BEGIN;
INSERT INTO `t_score` VALUES ('1', '1', '1', '1'), ('4', '3', '1', '1'), ('6', '5', '1', '12');
COMMIT;

-- ----------------------------
--  Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(110) NOT NULL,
  `grade` varchar(11) NOT NULL,
  `class_id` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `t_student`
-- ----------------------------
BEGIN;
INSERT INTO `t_student` VALUES ('1', 'chen', '3', '12'), ('3', 'wang', '2', '11'), ('5', 'chang', '3', '1');
COMMIT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', '18', '8d80b65575cd4cb92dc15c6fcc269f43'), ('2', 'gggg', 'd10906c3dac1172d4f60bd41f224ae75'), ('5', 'admin', 'e10adc3949ba59abbe56e057f20f883e'), ('6', 'nncnan', 'd10906c3dac1172d4f60bd41f224ae75'), ('10', 'nancnan', 'd10906c3dac1172d4f60bd41f224ae75');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
