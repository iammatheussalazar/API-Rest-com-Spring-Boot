create table Cliente(
	id bigint not null auto_increment,
    nome varchar(40) not null,
    email varchar(255) not null,
    
    primary key(id)
);