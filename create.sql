
    create table if not exists dishes (
       id integer not null auto_increment,
        ingredients JSON default "[]" not null,
        name varchar(60) not null,
        price float(23) not null,
        restaurant_id integer,
        primary key (id)
    ) engine=InnoDB;

    create table restaurants (
       id integer not null auto_increment,
        address varchar(100) not null,
        city varchar(60) not null,
        name varchar(60) not null,
        province varchar(60) not null,
        region varchar(60) not null,
        state varchar(60) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table dishes 
       add constraint FKpslsa9mci7gsfhwukb3mx7s6n 
       foreign key (restaurant_id) 
       references restaurants (id);

    create table dishes (
       id integer not null auto_increment,
        ingredients JSON default "[]" not null,
        name varchar(60) not null,
        price float(23) not null,
        restaurant_id integer,
        primary key (id)
    ) engine=InnoDB;

    create table restaurants (
       id integer not null auto_increment,
        address varchar(100) not null,
        city varchar(60) not null,
        name varchar(60) not null,
        province varchar(60) not null,
        region varchar(60) not null,
        state varchar(60) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table dishes 
       add constraint FKpslsa9mci7gsfhwukb3mx7s6n 
       foreign key (restaurant_id) 
       references restaurants (id);

    create table dishes (
       id integer not null auto_increment,
        ingredients JSON default "[]" not null,
        name varchar(60) not null,
        price float(23) not null,
        restaurant_id integer,
        primary key (id)
    ) engine=InnoDB;

    create table restaurants (
       id integer not null auto_increment,
        address varchar(100) not null,
        city varchar(60) not null,
        name varchar(60) not null,
        province varchar(60) not null,
        region varchar(60) not null,
        state varchar(60) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table dishes 
       add constraint FKpslsa9mci7gsfhwukb3mx7s6n 
       foreign key (restaurant_id) 
       references restaurants (id);

    create table dishes (
       id integer not null auto_increment,
        ingredients JSON default "[]" not null,
        name varchar(60) not null,
        price float(23) not null,
        restaurant_id integer,
        primary key (id)
    ) engine=InnoDB;

    create table restaurants (
       id integer not null auto_increment,
        address varchar(100) not null,
        city varchar(60) not null,
        name varchar(60) not null,
        province varchar(60) not null,
        region varchar(60) not null,
        state varchar(60) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table dishes 
       add constraint FKpslsa9mci7gsfhwukb3mx7s6n 
       foreign key (restaurant_id) 
       references restaurants (id);
