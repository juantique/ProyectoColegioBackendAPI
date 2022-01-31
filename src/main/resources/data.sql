--DROP TABLE IF EXISTS colegio;
--ALTER TABLE cursos DROP CONSTRAINT cursosColegioFk;
--DROP TABLE IF EXISTS cursos; 
--DROP TABLE IF EXISTS profesores;
--DROP TABLE IF EXISTS asignaturas;
--DROP TABLE IF EXISTS estudiantes;
--DROP TABLE IF EXISTS inscripciones;


--ALTER TABLE asignaturas DROP CONSTRAINT asignaturasCursoFk;
--ALTER TABLE asignaturas DROP CONSTRAINT asignaturaProfesorFk;
--ALTER TABLE inscripciones DROP CONSTRAINT estudianteInscripcionesFk;
--ALTER TABLE inscripciones DROP CONSTRAINT asignaturaInscripcionesFk;

--create table colegio(
	--id int identity (1,1),
	--nombre varchar (50) not null,
	--primary key(id)
--);

--create table cursos(
	--id int identity (1,1),
	--grado int not null,
	--salon varchar (20) not null,
	--colegioId int not null,
	--primary key(id)
--);

--create table profesores(
	--id int identity (1,1),
	--nombre varchar (250) not null,
	--primary key (id)
--);

--create table asignaturas(
	--id int identity (1,1),
	--nombre varchar (250) not null,
	--cursoId int not null,
	--profesorId int not null,
	--primary key(id)
--);

--create table estudiantes(
	--id int identity (1,1),
	--nombre varchar (250) not null,
	--primary key(id)
--);

--create table inscripciones(
	--estudianteId int,
	--asignaturaId int,
	--primary key(estudianteId, asignaturaId)
--);


-----------Alteracion y Relaciones-------------
--Curso 1:N Colegios
--alter table cursos add constraint cursosColegioFk FOREIGN KEY (colegioid) references colegio(id);

--Curso 1:N Asignatura
--alter table asignaturas add constraint asignaturasCursoFk FOREIGN KEY (cursoId) references cursos(id);

--Asignatura 1:N Profesores
--alter table asignaturas add constraint asignaturaProfesorFk FOREIGN KEY (profesorId) references profesores(id);

--Asignatura N:M Estudiantes = Estudiante - Inscripcion:
--alter table inscripciones add constraint estudianteInscripcionesFk FOREIGN KEY (estudianteId) references estudiantes(id);

--Asignatura N:M Estudiantes = Asignatura - Inscripcion:
--alter table inscripciones add Constraint asignaturaInscripcionesFk FOREIGN KEY(asignaturaId) references asignaturas(id);

--create table usuario(
	--id int identity (1,1),
	--nombre varchar (250) not null,
	--password varchar (250) not null,
	--primary key(id)
--);

--alter table asignaturas add cursoid int;
--alter table asignaturas drop curso_id;

insert into usuario (nombre, password) values ('jconde', 'jconde48'),
	('econde', 'ever48'),
	('erika', 'erika48'),
	('osiris', 'osiris48');

insert into colegio (nombre) values('Colegio del Olimpo'),
	('Colegio Parroquial San Andres'),
	('Colegio Santa Cecilia'),
	('Colegio Nuestra Señora Bogota');

insert into profesores (nombre) values('Juan Conde'),
	('Erika Hernandez'),
	('Tonny Albeto'),
	('Osiris Conde');
	
insert into estudiantes (nombre) values('Ever Tique'),
	('Monica Lopez'),
	('Miguel Lozano'),
	('Jeison Ramirez');
	
insert into cursos (grado, salon, colegio_id) values (10, 'A', 1),
	(10, 'B', 1),
	(11, 'A', 1),
	(11, 'B', 1);

insert into asignaturas(nombre, cursoid, profesor_id) values ('Español', 1,1),
	('Biologia', 2,1),
	('Matematicas', 3,2),
	('Sociales', 4,3);

insert into inscripciones values (1,1),
	(2,1),
	(3,1),
	(3,2);

--estudianteId int,
--asignaturaId int,


