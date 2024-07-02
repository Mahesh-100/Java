# Java
create table users (
        user_id bigint not null,
        address varchar(255),
        email varchar(255) unique,
        full_name varchar(255),
        password varchar(255),
        phone_number varchar(255),
        primary key (user_id)
    );
