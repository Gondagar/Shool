DROP DATABASE IF EXISTS SPRINGBOOT;
CREATE DATABASE SPRINGBOOT;


USE SPRINGBOOT;


CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `email` varchar(45),
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;


INSERT INTO `student` (`id`, `name`, `lastname`, `email`,`login`, `password`) VALUES ('a.feshchuk@gmail.com','feshchuk','123123'),










  (2, 'Wasia','Bubkin','w.bubkin@gmail.com','bubkin','123123'),
  (3, 'Misha','Lukash','m.lukash@gmail.com','feshchuk','123123'),
  (4, 'Tom','Trawolta','t.Trawolta@gmail.com','bubkin','123123')

