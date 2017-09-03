-- DATABASE postgres
-- HOSTNAME:	localhost
-- PUERTO:		5432
-- USER NAME:	postgres
-- PASSWORD:	ABC+-*xyz123

-- Consulta
select id, cedula, nombre, apellido, fecha_nacimiento, sexo, edad, id_padre
 from public.hijos;

select id, nombre, apellido, fecha_nacimiento, sexo, edad, talla, id_vacuna
 from public.hijos;

--insertar
INSERT INTO "public".hijos (id,cedula,nombre, apellido, fecha_nacimiento,sexo,peso)
VALUES (20,5698743,'Antonella','Gonzalez Gimenez','14/05/2017', 'F', 2.60 );


INSERT INTO "public".hijos (id,cedula,nombre, apellido, fecha_nacimiento,sexo,peso)
VALUES (21,5546987,'Juan','Ortiz','14/09/2016', 'M', 3.00 );


-- Modificar
UPDATE "public".hijos set peso = 3.5
WHERE id = 11;

UPDATE "public".hijos set peso = 4.0
WHERE id = 12;

-- Eliminar
DELETE FROM "public".hijos WHERE id= 12;
DELETE FROM "public".hijos WHERE id= 13;
