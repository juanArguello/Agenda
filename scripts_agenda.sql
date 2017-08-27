-- DATABASE postgres
-- HOSTNAME:	localhost
-- PUERTO:		5432
-- USER NAME:	postgres
-- PASSWORD:	ABC+-*xyz123

-- Consulta
select id, cedula, nombre, apellido, fecha_nacimiento, sexo, edad
 from public.hijos;

select id, cedula, nombre, apellido, direccion, telefono, correo_electronico
FROM "public".padres;

SELECT id, nombre_vacuna FROM "public".vacunas;

--insertar
INSERT INTO "public".padres (id,cedula,nombre, apellido,direccion)
VALUES (11,4658795,'Maria','Gonzalez Britez','San lorenzo');


INSERT INTO "public".padres (id,cedula,nombre, apellido,direccion)
VALUES (12,369875,'Noemi','Ortiz','Asuncion');


-- Modificar
UPDATE "public".padres set direccion = 'Capiata'
WHERE id = 11;

UPDATE "public".padres set direccion = 'Ciudad del Este'
WHERE id = 12;

-- Eliminar
DELETE FROM "public".padres WHERE id= 11;
DELETE FROM "public".padres WHERE id= 12;
