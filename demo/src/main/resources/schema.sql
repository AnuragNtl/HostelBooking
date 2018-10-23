create table room(id int not null,name varchar(80),primary key(id));
create table user(id int not null,name varchar(80) not null,email varchar(80),phone varchar(20),
address varchar(80),contactDetails varchar(240),room_id int,primary key(id),foreign key (room_id) 
references room(id));
