DROP TABLE IF EXISTS almacenes;
DROP TABLE IF EXISTS cajas;

CREATE TABLE IF NOT EXISTS almacenes (
						codigo INT AUTO_INCREMENT,
						lugar VARCHAR(100) DEFAULT NULL,
                        capacidad INT DEFAULT NULL,
						PRIMARY KEY(codigo)
						);
                        
CREATE TABLE IF NOT EXISTS cajas (
                        numreferencia CHAR(5) NOT NULL,
						contenido VARCHAR(100) DEFAULT NULL,
						valor INT DEFAULT NULL,
                        almacen INT,
						PRIMARY KEY(numreferencia),
						CONSTRAINT almacen_fk FOREIGN KEY (almacen) REFERENCES almacenes (codigo)
                        ON DELETE CASCADE ON UPDATE CASCADE
						);
                        

INSERT INTO almacenes (lugar, capacidad) VALUES ('SEVILLA', 100000);
INSERT INTO almacenes (lugar, capacidad) VALUES ('BARCELONA', 50000);
INSERT INTO almacenes (lugar, capacidad) VALUES ('MADRID', 75000);
INSERT INTO almacenes (lugar, capacidad) VALUES ('GALICIA', 120000);
INSERT INTO almacenes (lugar, capacidad) VALUES ('VALENCIA', 175000);

INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('11112', 'Tornillos', 200, 1);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('11113', 'Tornavis', 300, 1);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('11114', 'Martillos', 400, 1);

INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('22223', 'Bisturi', 1000, 2);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('22224', 'Gasas', 1100, 2);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('22225', 'Mascaras', 1200, 2);

INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('33334', 'Lapices', 4000, 3);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('33335', 'Rotuladores', 4500, 3);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('33336', 'Papel', 5000, 3);

INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('44443', 'Muñecas', 200, 4);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('44442', 'Pelotas', 200, 4);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('44441', 'Puzzles', 200, 4);

INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('55553', 'Pasteles', 200, 5);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('55554', 'Fruta', 200, 5);
INSERT INTO cajas (numreferencia, contenido, valor, almacen) VALUES ('55555', 'Verdura', 200, 5);



