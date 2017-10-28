create table mensajito(id integer primary key auto_increment,titulo varchar(50),cuerpo varchar(250));

create table usuario(cuenta integer primary key ,nombre varchar(40),email varchar(40));

create table direccion(id_dir integer primary key auto_increment,cuenta integer,
calle varchar(100), cp integer, municipio varchar(40), foreign key (cuenta) references usuario(cuenta));


describe mensajito;
describe usuario;
describe direccion;

select *from mensajito;

