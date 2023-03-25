
    create table dish (
       id tinyint not null,
        ingredients varbinary(255),
        name varchar(255),
        price float(23) not null,
        restaurant_id tinyint not null,
        primary key (id)
    ) engine=InnoDB;

    create table dish_seq (
       next_val bigint
    ) engine=InnoDB;

    insert into dish_seq values ( 1 );

    create table restaurant (
       id tinyint not null,
        address varchar(255),
        city varchar(255),
        name varchar(255),
        province varchar(255),
        region varchar(255),
        state varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table restaurant_seq (
       next_val bigint
    ) engine=InnoDB;

    insert into restaurant_seq values ( 1 );
