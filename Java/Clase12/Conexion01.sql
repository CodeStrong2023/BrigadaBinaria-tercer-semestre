-- Comenzamos con el CRUD:create(insertar), read(mostrar), update(actualizar), delete(elimiar)
-- Listar estudaintes
SELECT * FROM estudiantes2024;
-- Insertar estudiantes
INSERT INTO estudiantes2024 (nombre,apellido,telefono,email) VALUES ("Juan","Perez","2614660298","jperez@gmail.com");
-- Update(modificar)
UPDATE estudiantes2024 SET nombre="Juan Carlos",apellido="Garcia" WHERE idestudiantes2024=1;
-- Delete(eliminar)
DELETE FROM estudiantes2024 WHERE idestudiantes2024=12;
-- para modificar el idestudiantes2024 y comience en 1
ALTER TABLE estudiantes2024 AUTO_INCREMENT = 1;






