-- DATABASE postgres
-- HOSTNAME:	localhost
-- PUERTO:		5432
-- USER NAME:	postgres
-- PASSWORD:	ABC+-*xyz123

-- Consulta
select id,  nombre_vacuna, aplicada,  id_hijo
 from public.vacunas;

select dosis, fecha, observacion
 from public.vacunas;

--insertar
INSERT INTO "public".vacunas (id,nombre_vacuna, fecha)
VALUES (11,'otros','14/05/2017' );



-- Modificar
UPDATE "public".vacunas set fecha = '14/05/2017'
WHERE id = 7;

UPDATE "public".vacunas set peso = '15/05/2016'
WHERE id = 8;

-- Eliminar
DELETE FROM "public".vacunas WHERE id= 1;
DELETE FROM "public".vacunas WHERE id= 3;
