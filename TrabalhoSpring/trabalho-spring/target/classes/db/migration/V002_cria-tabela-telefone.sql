create table telefone(
	id bigint not null auto_increment,
    cliente_id bigint not null,
    numero varchar(40) not null,
    constraint fk_telefone_cliente
		foreign key(cliente_id) references cliente(id),
	
    primary key(id)
);
