
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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

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

    create table users (
       id bigint not null auto_increment,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        email varchar(50) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(64) not null,
        role ENUM('user','admin') DEFAULT 'user',
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        verified_at DATETIME,
        verify_code varchar(64),
        primary key (id)
    ) engine=InnoDB;

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);
