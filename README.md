# Java
create table user_data (
        user_id integer not null,
        name varchar(255) not null,
        email varchar(255) unique not null,
        phone_number varchar(255),
	    address varchar(255),
        primary key (user_id)
    )
