
    create table dishes (
       id integer not null auto_increment,
        course ENUM('Antipasto','Primo','Secondo','Controrno','Dolce','Altro') default 'Altro' not null,
        ingredients JSON default "[]" not null,
        meal ENUM('Pranzo','Cena') default 'Cena' not null,
        name varchar(60) not null,
        price float(23) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tables (
       id integer not null auto_increment,
        num TINYINT UNSIGNED,
        seats TINYINT UNSIGNED,
        primary key (id)
    ) engine=InnoDB;

    create table dishes (
       id integer not null auto_increment,
        course ENUM('Antipasto','Primo','Secondo','Controrno','Dolce','Altro') default 'Altro' not null,
        ingredients JSON default "[]" not null,
        meal ENUM('Pranzo','Cena') default 'Cena' not null,
        name varchar(60) not null,
        price float(23) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tables (
       id integer not null auto_increment,
        num TINYINT UNSIGNED,
        seats TINYINT UNSIGNED,
        primary key (id)
    ) engine=InnoDB;

    create table dishes (
       id integer not null auto_increment,
        course ENUM('Antipasto','Primo','Secondo','Controrno','Dolce','Altro') default 'Altro' not null,
        ingredients JSON default "[]" not null,
        meal ENUM('Pranzo','Cena') default 'Cena' not null,
        name varchar(60) not null,
        price float(23) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tables (
       id integer not null auto_increment,
        num TINYINT UNSIGNED,
        seats TINYINT UNSIGNED,
        primary key (id)
    ) engine=InnoDB;
