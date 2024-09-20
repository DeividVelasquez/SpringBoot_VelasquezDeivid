-- Active: 1726747462947@@172.16.101.155@3306@explicacionJPA
create database explicacionJPA;

use explicacionJPA;

create table person(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(255) not null,
    age int not null
);



