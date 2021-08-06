CREATE DATABASE animes_db;
-- DROP DATABASE animes_db;
USE animes_db;
CREATE TABLE animes (
id bigint NOT NULL auto_increment,
nombre varchar(40) NOT NULL,
genero varchar(40) NOT NULL,
fecha_creacion varchar(40) NOT NULL , 
CONSTRAINT pk_anime primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `animes` WRITE;
/*!40000 ALTER TABLE `animes` DISABLE KEYS */;
INSERT INTO `animes` VALUES (1, 'Shingeky no Kyojin','Shonnen','2021-03-03 00:49:07.725897')
,(2,'Boruto','Shonnen','2021-03-03 09:17:27.211612'),
(3,'Saint Seiya','Shonnen','2021-03-03 09:23:56.202319');
/*!40000 ALTER TABLE `animes` ENABLE KEYS */;
UNLOCK TABLES;

SELECT * FROM animes;

DROP TABLE IF EXISTS `personajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE personajes (
  id bigint NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
actor varchar(45) DEFAULT NULL,
  fecha_creacion datetime NOT NULL,
  id_anime bigint DEFAULT NULL,
  PRIMARY KEY (id),
  KEY idAnime_idx (id_anime),
  CONSTRAINT idAnime FOREIGN KEY (id_anime) REFERENCES animes (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT * FROM personajes;