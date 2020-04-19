-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versione server:              5.5.16 - MySQL Community Server (GPL)
-- S.O. server:                  Win64
-- HeidiSQL Versione:            8.3.0.4738
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dump della struttura del database dizionario
CREATE DATABASE IF NOT EXISTS `dizionario` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dizionario`;


-- Dump della struttura di tabella dizionario.parola
CREATE TABLE IF NOT EXISTS `parola` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=720886 DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella dizionario.parola: ~710.043 rows (circa)
DELETE FROM `parola`;
/*!40000 ALTER TABLE `parola` DISABLE KEYS */;
INSERT INTO `parola` (`id`, `nome`) VALUES
	(1, 'caso'),
	(2, 'cosa'),
	(3, 'caos'),
	(4, 'ab'),
	(5, 'abaca'),
	(6, 'abache'),
	(7, 'abachi'),
	(8, 'abachista'),
	(9, 'abachiste'),
	(10, 'abachisti'),
	(11, 'abacista'),
	(12, 'abaciste'),
	(13, 'abacisti'),
	(14, 'abaco'),
	(15, 'abadessa'),
	(16, 'abadesse'),
	(17, 'abadia'),
	(18, 'abadie'),
	(19, 'abaliena'),
	(20, 'abalienando'),
	(21, 'abalienano'),
	(22, 'abalienare'),
	(23, 'abalienarono'),
	(24, 'abalienato'),
	(25, 'abalienava'),
	(26, 'abalienavano'),
	(27, 'abalienazione'),
	(28, 'abalieno'),
	(29, 'abalieta');
/*!40000 ALTER TABLE `parola` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
