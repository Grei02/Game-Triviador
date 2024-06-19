
INSERT INTO triv_categories (cat_name, cat_nameimage)
VALUES ('Geografia', 'geografia');

INSERT INTO triv_categories (cat_name, cat_nameimage)
VALUES ('Historia', 'historia');

INSERT INTO triv_categories (cat_name, cat_nameimage)
VALUES ('Arte', 'arte');

INSERT INTO triv_categories (cat_name, cat_nameimage)
VALUES ('Ciencia', 'ciencia');

INSERT INTO triv_categories (cat_name, cat_nameimage)
VALUES ('Entretenimiento', 'entretenimiento');

INSERT INTO triv_categories (cat_name, cat_nameimage)
VALUES ('Deportes', 'deportes');

-- Ayuda: Doble Oportunidad
INSERT INTO triv_wildcard ( wild_name)
VALUES ( 'Doble Oportunidad');

-- Ayuda: Pasar
INSERT INTO triv_wildcard ( wild_name)
VALUES ('Pasar');

-- Ayuda: Bomba
INSERT INTO triv_wildcard ( wild_name)
VALUES ( 'Bomba');

-- Ayuda: Tiro Extra
INSERT INTO triv_wildcard ( wild_name)
VALUES ( 'Tiro Extra');

select t.*, t.rowid from triv_categories t

--Pregunta
 
--Geografia
-- Pregunta 1: ¿Cual es la capital de Francia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la capital de Francia?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Paris', '1',1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Londres', '0',1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Berlin', '0', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Madrid', '0', 1);

-- Pregunta 2: ¿En que continente se encuentra Egipto?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que continente se encuentra Egipto?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Africa', '1',2);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Asia', '0', 2);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Europa', '0', 2);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('America', '0', 2);

-- Pregunta 3: ¿Cual es el rio mas largo del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el rio mas largo del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Amazonas', '1', 3);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nilo', '0', 3);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Misisipi', '0', 3);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Yangtse', '0', 3);

-- Pregunta 4: ¿Cual es el pais mas grande del mundo por área?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el pais mas grande del mundo por area?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Rusia', '1', 4);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('China', '0', 4);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Canada', '0', 4);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Estados Unidos', '0', 4);

-- Pregunta 5: ¿Cual es el desierto mas grande del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el desierto mas grande del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Antartico', '1', 5);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Sahara', '0', 5);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Gobi', '0', 5);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Arabigo', '0', 5);

-- Pregunta 6: ¿Cual es el lago mas profundo del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el lago mas profundo del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Baikal', '1', 6);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Titicaca', '0', 6);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Victoria', '0', 6);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Great Slave', '0', 6);

-- Pregunta 7: ¿Cual es el rio mas largo del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el rio mas largo del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Amazonas', '1', 7);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nilo', '0', 7);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Misisipi', '0', 7);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Yangtse', '0', 7);

-- Pregunta 8: ¿Cual es el pais mas grande del mundo por area?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el pais mas grande del mundo por area?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Rusia', '1', 8);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('China', '0', 8);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Canada', '0', 8);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Estados Unidos', '0', 8);

-- Pregunta 9: ¿Cuál es el punto más alto de la Tierra?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el punto mas alto de la Tierra?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Everest', '1', 9);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('K2', '0', 9);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Kangchenjunga', '0', 9);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Lhotse', '0', 9);

-- Pregunta 10: ¿Cuál es la capital de Australia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la capital de Australia?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Canberra', '1', 10);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Sydney', '0', 10);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Melbourne', '0', 10);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Brisbane', '0', 10);

-- Pregunta 11: ¿Cuál es el país más poblado del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el pais mas poblado del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('China', '1', 11);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('India', '0', 11);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Estados Unidos', '0', 11);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Indonesia', '0', 11);

-- Pregunta 12: ¿Cuál es el continente más pequeño del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el continente mas pequeno del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Australia', '1', 12);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Europa', '0', 12);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('America', '0', 12);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Asia', '0', 12);

-- Pregunta 13: ¿Cuál es el océano más grande del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el oceano mas grande del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pacifico', '1', 13);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Atlantico', '0', 13);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Indico', '0', 13);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Artico', '0', 13);

-- Pregunta 14: ¿Cuál es la montaña más alta de América?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la montana mas alta de America?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Aconcagua', '1', 14);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Monte McKinley', '0', 14);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Monte Logan', '0', 14);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pico de Orizaba', '0', 14);

-- Pregunta 15: ¿Cuál es el río más caudaloso del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el rio mas caudaloso del mundo?', '1',1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Amazonas', '1', 15);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nilo', '0', 15);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Yangtse', '0', 15);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Misisipi', '0', 15);

-- Pregunta 16: ¿Cuál es el país más pequeño del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el pais mas pequeno del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vaticano', '1', 16);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Monaco', '0', 16);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nauru', '0', 16);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tuvalu', '0', 16);

-- Pregunta 17: ¿Cuál es la ciudad más poblada del mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la ciudad mas poblada del mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tokio', '1', 17);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Shanghai', '0', 17);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Delhi', '0', 17);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Ciudad de México', '0', 17);

-- Pregunta 18: ¿Cuál es el río más largo de América del Sur?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el rio mas largo de America del Sur?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Amazonas', '1', 18);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Parana', '0', 18);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Orinoco', '0', 18);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Magdalena', '0', 18);

-- Pregunta 19: ¿Cuál es el país con más islas en el mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el pais con mas islas en el mundo?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Suecia', '1', 19);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Finlandia', '0', 19);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Filipinas', '0', 19);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Japón', '0', 19);

-- Pregunta 20: ¿Cuál es el lago más profundo de África?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el lago mas profundo de Africa?', '1', 1);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tanganica', '1', 20);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Malawi', '0', 20);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Victoria', '0', 20);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tana', '0', 20);

--HISTORIA

-- Pregunta 1: ¿Quién fue el primer presidente de Estados Unidos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el primer presidente de Estados Unidos?', '1', 2);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('George Washington', '1', 21);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Thomas Jefferson', '0', 21);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Abraham Lincoln', '0', 21);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('John Adams', '0', 21);

-- Pregunta 2: ¿Cuál fue el evento que marcó el inicio de la Revolución Francesa?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue el evento que marco el inicio de la Revolucion Francesa?', '1', 2);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La Toma de la Bastilla', '1', 22);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El Golpe de Estado', '0', 22);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La Declaracion de los Derechos del Hombre y del Ciudadano', '0', 22);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La Batalla de Waterloo', '0', 22);

-- Pregunta 3: ¿En qué año terminó la Segunda Guerra Mundial?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ano termino la Segunda Guerra Mundial?', '1', 2);

-- El número de pregunta será 23
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1945', '1', 23);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1939', '0', 23);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1941', '0', 23);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1950', '0', 23);

-- Pregunta 4: ¿Cuál fue el primer imperio en la historia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue el primer imperio en la historia?', '1', 2);

-- El número de pregunta será 24
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Imperio Acadio', '1', 24);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Imperio Romano', '0', 24);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Imperio Persa', '0', 24);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Imperio Egipcio', '0', 24);

-- Pregunta 5: ¿Cuál fue la batalla más sangrienta de la Guerra Civil Americana?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue la batalla mas sangrienta de la Guerra Civil Americana?', '1', 2);

-- El número de pregunta será 25
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Batalla de Gettysburg', '1', 25);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Batalla de Antietam', '0', 25);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Batalla de Bull Run', '0', 25);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Batalla de Shiloh', '0', 25);

-- Pregunta 6: ¿Quién fue el último emperador de Rusia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el ultimo emperador de Rusia?', '1', 2);

-- El número de pregunta será 26
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nicolas II', '1', 26);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Alejandro I', '0', 26);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pedro el Grande', '0', 26);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Iván IV', '0', 26);

-- Pregunta 7: ¿Quién fue el líder de la Revolución Rusa en 1917?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el lider de la Revolucion Rusa en 1917?', '1', 2);

-- El número de pregunta será 27
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vladimir Lenin', '1', 27);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('José Stalin', '0', 27);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('León Trotsky', '0', 27);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nicolás II', '0', 27);

-- Pregunta 8: ¿Cuál fue la primera democracia conocida en la historia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue la primera democracia conocida en la historia?', '1', 2);

-- El número de pregunta será 28
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Atenas', '1', 28);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Roma', '0', 28);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Esparta', '0', 28);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Egipto', '0', 28);

-- Pregunta 9: ¿En qué año comenzó la Revolución Industrial?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ano comenzo la Revolucion Industrial?', '1', 2);

-- El número de pregunta será 29
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Siglo XVIII', '1', 29);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Siglo XIX', '0', 29);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Siglo XVI', '0', 29);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Siglo XVII', '0', 29);

-- Pregunta 10: ¿Quién fue el líder de la Revolución Cubana en 1959?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el lider de la Revolucion Cubana en 1959?', '1', 2);

-- El número de pregunta será 30
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Fidel Castro', '1', 30);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Che Guevara', '0', 30);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Raul Castro', '0', 30);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Camilo Cienfuegos', '0', 30);

-- Pregunta 11: ¿Quién fue el primer presidente de México?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el primer presidente de Mexico?', '1', 2);

-- El número de pregunta será 31
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Guadalupe Victoria', '1', 31);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Miguel Hidalgo', '0', 31);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Benito Juarez', '0', 31);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vicente Guerrero', '0', 31);

-- Pregunta 12: ¿Quién fue el líder de la Revolución China en 1949?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el lider de la Revolucion China en 1949?', '1', 2);

-- El número de pregunta será 32
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mao Zedong', '1', 32);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chiang Kai-shek', '0', 32);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Sun Yat-sen', '0', 32);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Zhou Enlai', '0', 32);

-- Pregunta 13: ¿Cuál fue la primera guerra mundial en la que participó Estados Unidos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue la primera guerra mundial en la que participo Estados Unidos?', '1', 2);

-- El número de pregunta será 33
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Primera Guerra Mundial', '1', 33);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Segunda Guerra Mundial', '0', 33);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Guerra de Vietnam', '0', 33);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Guerra de Corea', '0', 33);

-- Pregunta 14: ¿En qué año se firmó el Tratado de Versalles?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ano se firmo el Tratado de Versalles?', '1', 2);

-- El número de pregunta será 34
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1919', '1', 34);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1918', '0', 34);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1920', '0', 34);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1921', '0', 34);

-- Pregunta 15: ¿Cuál fue el primer presidente de la Unión Soviética?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue el primer presidente de la Union Sovietica?', '1', 2);

-- El número de pregunta será 35
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mijail Gorbachov', '1', 35);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Lenin', '0', 35);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Stalin', '0', 35);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nikita Jrushchov', '0', 35);

-- Pregunta 16: ¿Cuál fue el último zar de Rusia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue el ultimo zar de Rusia?', '1', 2);

-- El número de pregunta será 36
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nicolas II', '1', 36);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Alejandro I', '0', 36);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pedro el Grande', '0', 36);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Ivan IV', '0', 36);

-- Pregunta 17: ¿Quién fue el primer emperador de China?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el primer emperador de China?', '1', 2);

-- El número de pregunta será 37
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Qin Shi Huang', '1', 37);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Confucio', '0', 37);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Sun Tzu', '0', 37);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mao Zedong', '0', 37);

-- Pregunta 18: ¿Cuál fue la primera capital de Estados Unidos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual fue la primera capital de Estados Unidos?', '1', 2);

-- El número de pregunta será 38
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nueva York', '1', 38);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Washington D.C.', '0', 38);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Boston', '0', 38);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Filadelfia', '0', 38);

-- Pregunta 19: ¿En qué año se fundó la ciudad de Roma?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ano se fundo la ciudad de Roma?', '1', 2);

-- El número de pregunta será 39
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('753 a.C.', '1', 39);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('500 a.C.', '0', 39);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('200 a.C.', '0', 39);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('100 a.C.', '0', 39);

-- Pregunta 20: ¿Quién fue el primer presidente de Colombia?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien fue el primer presidente de Colombia?', '1', 2);

-- El número de pregunta será 40
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Simon Bolivar', '1', 40);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Santander', '0', 40);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Narino', '0', 40);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mosquera', '0', 40);

--Arte

-- Pregunta 1: ¿Quién pintó la Mona Lisa?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien pinto la Mona Lisa?', '1', 3);

-- El número de pregunta será 41
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '1', 41);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 41);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '0', 41);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Michelangelo', '0', 41);

-- Pregunta 2: ¿Quién es conocido como el padre del impresionismo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es conocido como el padre del impresionismo?', '1', 3);

-- El número de pregunta será 42
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Claude Monet', '1', 42);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pierre-Auguste Renoir', '0', 42);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Edgar Degas', '0', 42);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Camille Pissarro', '0', 42);

-- Pregunta 3: ¿En qué ciudad se encuentra la famosa Torre Eiffel?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ciudad se encuentra la famosa Torre Eiffel?', '1', 3);

-- El número de pregunta será 43
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Paris', '1', 43);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Londres', '0', 43);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nueva York', '0', 43);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Roma', '0', 43);

-- Pregunta 4: ¿Quién es el autor de la obra "La noche estrellada"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el autor de la obra "La noche estrellada"?', '1', 3);

-- El número de pregunta será 44
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '1', 44);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Salvador Dalí', '0', 44);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 44);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 44);

-- Pregunta 5: ¿Cuál de estas obras no fue pintada por Pablo Picasso?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual de estas obras no fue pintada por Pablo Picasso?', '1', 3);

-- El número de pregunta será 45
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La persistencia de la memoria', '1', 45);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Guernica', '0', 45);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Las señoritas de Avignon', '0', 45);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La lectura', '0', 45);

-- Pregunta 6: ¿Qué pintor es famoso por su serie de pinturas de lirios?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que pintor es famoso por su serie de pinturas de lirios?', '1', 3);

-- El número de pregunta será 46
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Claude Monet', '1', 46);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '0', 46);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 46);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Salvador Dali', '0', 46);

-- Pregunta 7: ¿Quién pintó "Los girasoles"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien pinto "Los girasoles"?', '1', 3);

-- El número de pregunta será 47
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '1', 47);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 47);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 47);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Salvador Dali', '0', 47);

-- Pregunta 8: ¿Qué movimiento artístico se caracteriza por la representación de imágenes distorsionadas y fragmentadas?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que movimiento artistico se caracteriza por la representacion de imagenes distorsionadas y fragmentadas?', '1', 3);

-- El número de pregunta será 48
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Cubismo', '1', 48);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Renacimiento', '0', 48);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Barroco', '0', 48);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Impresionismo', '0', 48);

-- Pregunta 9: ¿Quién es el autor de "La joven de la perla"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el autor de "La joven de la perla"?', '1', 3);

-- El número de pregunta será 49
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Johannes Vermeer', '1', 49);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Rembrandt', '0', 49);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '0', 49);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 49);

-- Pregunta 10: ¿Qué artista es conocido por su estilo surrealista y sus relojes blandos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que artista es conocido por su estilo surrealista y sus relojes blandos?', '1', 3);

-- El número de pregunta será 50
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Salvador Dali', '1', 50);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 50);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '0', 50);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Claude Monet', '0', 50);

-- Pregunta 11: ¿Quién es el autor de la escultura "El pensador"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el autor de la escultura "El pensador"?', '1', 3);

-- El número de pregunta será 51
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Auguste Rodin', '1', 51);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Miguel Angel', '0', 51);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 51);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 51);

-- Pregunta 12: ¿En qué movimiento artístico se destaca la obra "Guernica"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que movimiento artistico se destaca la obra "Guernica"?', '1', 3);

-- El número de pregunta será 52
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Cubismo', '1', 52);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Renacimiento', '0', 52);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Barroco', '0', 52);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Impresionismo', '0', 52);

-- Pregunta 13: ¿Cuál es el autor de la famosa pintura "La noche estrellada"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el autor de la famosa pintura "La noche estrellada"?', '1', 3);

-- El número de pregunta será 53
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '1', 53);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 53);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 53);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Salvador Dali', '0', 53);

-- Pregunta 14: ¿Cuál de las siguientes pinturas fue creada por Leonardo da Vinci?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual de las siguientes pinturas fue creada por Leonardo da Vinci?', '1', 3);

-- El número de pregunta será 54
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La ultima cena', '1', 54);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Guernica', '0', 54);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La persistencia de la memoria', '0', 54);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Las senoritas de Avignon', '0', 54);

-- Pregunta 15: ¿Quién pintó la famosa obra "El grito"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien pinto la famosa obra "El grito"?', '1', 3);

-- El número de pregunta será 55
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Edvard Munch', '1', 55);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 55);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Salvador Dalí', '0', 55);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '0', 55);

-- Pregunta 16: ¿Quién es conocido por su escultura "El beso"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es conocido por su escultura "El beso"?', '1', 3);

-- El número de pregunta será 56
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Auguste Rodin', '1', 56);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Miguel Angel', '0', 56);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 56);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Donatello', '0', 56);

-- Pregunta 17: ¿Qué pintor es conocido por su estilo de "puntillismo"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que pintor es conocido por su estilo de "puntillismo"?', '1', 3);

-- El número de pregunta será 57
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Georges Seurat', '1', 57);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pablo Picasso', '0', 57);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vincent van Gogh', '0', 57);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Claude Monet', '0', 57);

-- Pregunta 18: ¿Quién es el autor de la escultura "El David"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el autor de la escultura "El David"?', '1', 3);

-- El número de pregunta será 58
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Miguel Angel', '1', 58);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo da Vinci', '0', 58);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Donatello', '0', 58);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Auguste Rodin', '0', 58);

-- Pregunta 19: ¿Cuál es el título de la obra maestra de Leonardo da Vinci que representa a una mujer misteriosa con una sonrisa enigmática?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el titulo de la obra maestra de Leonardo da Vinci que representa a una mujer misteriosa con una sonrisa enigmatica?', '1', 3);

-- El número de pregunta será 59
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La Mona Lisa', '1', 59);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La ultima cena', '0', 59);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La creacion de Adan', '0', 59);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La dama del armino', '0', 59);

-- Pregunta 20: ¿Quién es el autor de la pintura "Los jugadores de cartas"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el autor de la pintura "Los jugadores de cartas"?', '1', 3);

-- El número de pregunta será 60
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Paul Cezanne', '1', 60);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Edgar Degas', '0', 60);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Edouard Manet', '0', 60);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Henri Matisse', '0', 60);

--Ciencia

-- Pregunta 1: ¿Cual es el simbolo quimico del agua?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el simbolo quimico del agua?', '1', 4);

-- El número de pregunta será 61
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('H2O', '1', 61);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('O2', '0', 61);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('CO2', '0', 61);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('NaCl', '0', 61);

-- Pregunta 2: ¿Cual es la unidad basica de la vida?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la unidad basica de la vida?', '1', 4);

-- El número de pregunta será 62
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La celula', '1', 62);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El atomo', '0', 62);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El electron', '0', 62);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El ADN', '0', 62);

-- Pregunta 3: ¿Cual es la fuerza que mantiene a los objetos en la Tierra?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la fuerza que mantiene a los objetos en la Tierra?', '1', 4);

-- El número de pregunta será 63
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La gravedad', '1', 63);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La fuerza centrifuga', '0', 63);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La friccion', '0', 63);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La fuerza magnetica', '0', 63);

-- Pregunta 4: ¿Cual es la capa mas externa de la Tierra?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la capa mas externa de la Tierra?', '1', 4);

-- El número de pregunta será 64
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La corteza', '1', 64);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El nucleo', '0', 64);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El manto', '0', 64);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La litosfera', '0', 64);

-- Pregunta 5: ¿Cual es la velocidad de la luz en el vacio?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la velocidad de la luz en el vacio?', '1', 4);

-- El número de pregunta será 65
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('299,792,458 metros por segundo', '1', 65);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('300,000,000 metros por segundo', '0', 65);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('250,000,000 metros por segundo', '0', 65);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('350,000,000 metros por segundo', '0', 65);

-- Pregunta 6: ¿Cuál es el elemento más abundante en la corteza terrestre?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el elemento mas abundante en la corteza terrestre?', '1', 4);

-- El número de pregunta será 66
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Oxigeno', '1', 66);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hierro', '0', 66);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Silicio', '0', 66);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Carbono', '0', 66);

-- Pregunta 7: ¿Cuál es la unidad de medida de la energía en el sistema internacional?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la unidad de medida de la energia en el sistema internacional?', '1', 4);

-- El número de pregunta será 67
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Joule', '1', 67);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vatio', '0', 67);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Newton', '0', 67);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Watt', '0', 67);

-- Pregunta 8: ¿Cuál es la unidad básica de la herencia biológica?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la unidad basica de la herencia biologica?', '1', 4);

-- El número de pregunta será 68
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El gen', '1', 68);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El cromosoma', '0', 68);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El ADN', '0', 68);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El alelo', '0', 68);

-- Pregunta 9: ¿Cuál es la teoría que explica la evolución de las especies?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la teoria que explica la evolucion de las especies?', '1', 4);

-- El número de pregunta será 69
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La teoria de la evolucion de Darwin', '1', 69);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La teoria de la relatividad', '0', 69);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La teoria de la gravedad', '0', 69);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La teoria del Big Bang', '0', 69);

-- Pregunta 10: ¿Cuál es el órgano responsable de bombear sangre en el cuerpo humano?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el organo responsable de bombear sangre en el cuerpo humano?', '1', 4);

-- El número de pregunta será 70
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El corazon', '1', 70);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Los pulmones', '0', 70);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El higado', '0', 70);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El rinon', '0', 70);

-- Pregunta 11: ¿Que es el boson de Higgs?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que es el boson de Higgs?', '1', 4);

-- El numero de pregunta sera 71
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Una particula elemental', '1', 71);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Una estrella', '0', 71);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Un planeta', '0', 71);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Una galaxia', '0', 71);

-- Pregunta 12: ¿Que cientifico propuso la teoria de la relatividad?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que cientifico propuso la teoria de la relatividad?', '1', 4);

-- El numero de pregunta sera 72
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Albert Einstein', '1', 72);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Isaac Newton', '0', 72);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nikola Tesla', '0', 72);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Galileo Galilei', '0', 72);

-- Pregunta 13: ¿Cual es el gas mas abundante en la atmosfera terrestre?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el gas mas abundante en la atmosfera terrestre?', '1', 4);

-- El numero de pregunta sera 73
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nitrogeno', '1', 73);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Oxigeno', '0', 73);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Dioxido de carbono', '0', 73);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hidrogeno', '0', 73);

-- Pregunta 14: ¿Como se llama el proceso mediante el cual las plantas producen su alimento?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Como se llama el proceso mediante el cual las plantas producen su alimento?', '1', 4);

-- El numero de pregunta sera 74
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Fotosintesis', '1', 74);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Respiracion', '0', 74);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Fermentacion', '0', 74);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Digestion', '0', 74);

-- Pregunta 15: ¿Cual es el organo mas grande del cuerpo humano?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el organo mas grande del cuerpo humano?', '1', 4);

-- El numero de pregunta sera 75
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('La piel', '1', 75);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El higado', '0', 75);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El intestino', '0', 75);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El cerebro', '0', 75);

-- Pregunta 16: ¿Quien desarrollo la teoria de la relatividad?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien desarrollo la teoria de la relatividad?', '1', 4);

-- El numero de pregunta sera 76
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Albert Einstein', '1', 76);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Isaac Newton', '0', 76);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Galileo Galilei', '0', 76);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nikola Tesla', '0', 76);

-- Pregunta 17: ¿Que planeta es conocido como el planeta rojo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('¿Que planeta es conocido como el planeta rojo?', '1', 4);

-- El numero de pregunta sera 77
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Marte', '1', 77);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Venus', '0', 77);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Jupiter', '0', 77);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Saturno', '0', 77);

-- Pregunta 18: ¿Que instrumento se usa para medir la temperatura?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que instrumento se usa para medir la temperatura?', '1', 4);

-- El numero de pregunta sera 78
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Termometro', '1', 78);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Barometro', '0', 78);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Higrometro', '0', 78);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Anemometro', '0', 78);

-- Pregunta 19: ¿Cual es el elemento quimico con el simbolo Au?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el elemento quimico con el simbolo Au?', '1', 4);

-- El numero de pregunta sera 79
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Oro', '1', 79);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Plata', '0', 79);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Cobre', '0', 79);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hierro', '0', 79);

-- Pregunta 20: ¿Cual es la unidad de medida de la fuerza en el Sistema Internacional?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es la unidad de medida de la fuerza en el Sistema Internacional?', '1', 4);

-- El numero de pregunta sera 80
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Newton', '1', 80);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Julio', '0', 80);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Vatio', '0', 80);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Amperio', '0', 80);

-- Pregunta 1: ¿Quien es el director de la pelicula "Titanic"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el director de la pelicula "Titanic"?', '1', 5);

-- El numero de pregunta sera 81
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('James Cameron', '1', 81);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Steven Spielberg', '0', 81);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Martin Scorsese', '0', 81);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Quentin Tarantino', '0', 81);

-- Pregunta 2: ¿En que año se estreno la serie "Friends"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que año se estreno la serie "Friends"?', '1', 5);

-- El numero de pregunta sera 82
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1994', '1', 82);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1996', '0', 82);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1998', '0', 82);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('2000', '0', 82);

-- Pregunta 3: ¿Cual es el nombre real de la cantante conocida como Lady Gaga?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre real de la cantante conocida como Lady Gaga?', '1', 5);

-- El numero de pregunta sera 83
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Stefani Joanne Angelina Germanotta', '1', 83);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Robyn Rihanna Fenty', '0', 83);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Alicia Beth Moore', '0', 83);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Katheryn Elizabeth Hudson', '0', 83);

-- Pregunta 4: ¿Quien interpreto a Jack Dawson en "Titanic"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien interpreto a Jack Dawson en "Titanic"?', '1', 5);

-- El numero de pregunta sera 84
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Leonardo DiCaprio', '1', 84);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Brad Pitt', '0', 84);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Johnny Depp', '0', 84);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tom Cruise', '0', 84);

-- Pregunta 5: ¿Que pelicula gano el Oscar a Mejor Pelicula en 2020?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que pelicula gano el Oscar a Mejor Pelicula en 2020?', '1', 5);

-- El numero de pregunta sera 85
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Parasite', '1', 85);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1917', '0', 85);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Once Upon a Time in Hollywood', '0', 85);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Joker', '0', 85);

-- Pregunta 6: ¿Quien es el creador de la serie "Los Simpsons"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el creador de la serie "Los Simpsons"?', '1', 5);

-- El numero de pregunta sera 86
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Matt Groening', '1', 86);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Seth MacFarlane', '0', 86);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Trey Parker', '0', 86);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mike Judge', '0', 86);

-- Pregunta 7: ¿Cual es el nombre del perro en "Padre de Familia"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre del perro en "Padre de Familia"?', '1', 5);

-- El numero de pregunta sera 87
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Brian', '1', 87);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Stewie', '0', 87);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chris', '0', 87);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Meg', '0', 87);

-- Pregunta 8: ¿Cual es el nombre de la escuela de magia en "Harry Potter"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre de la escuela de magia en "Harry Potter"?', '1', 5);

-- El numero de pregunta sera 88
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hogwarts', '1', 88);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Beauxbatons', '0', 88);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Durmstrang', '0', 88);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Ilvermorny', '0', 88);

-- Pregunta 9: ¿Quien interpreta a Iron Man en el Universo Cinematografico de Marvel?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien interpreta a Iron Man en el Universo Cinematografico de Marvel?', '1', 5);

-- El numero de pregunta sera 89
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Robert Downey Jr.', '1', 89);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chris Evans', '0', 89);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chris Hemsworth', '0', 89);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mark Ruffalo', '0', 89);

-- Pregunta 10: ¿Que banda lanzo el album "Abbey Road"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que banda lanzo el album "Abbey Road"?', '1', 5);

-- El numero de pregunta sera 90
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('The Beatles', '1', 90);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('The Rolling Stones', '0', 90);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pink Floyd', '0', 90);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Led Zeppelin', '0', 90);

-- Pregunta 11: ¿Cual es el nombre real del personaje de rap Eminem?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre real del personaje de rap Eminem?', '1', 5);

-- El numero de pregunta sera 91
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Marshall Mathers', '1', 91);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Curtis Jackson', '0', 91);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Calvin Broadus', '0', 91);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Shawn Carter', '0', 91);

-- Pregunta 12: ¿En que pelicula aparece el personaje Jack Sparrow?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que pelicula aparece el personaje Jack Sparrow?', '1', 5);

-- El numero de pregunta sera 92
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Piratas del Caribe', '1', 92);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Indiana Jones', '0', 92);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('El Señor de los Anillos', '0', 92);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Harry Potter', '0', 92);

-- Pregunta 13: ¿Quien es el creador del universo de Star Wars?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el creador del universo de Star Wars?', '1', 5);

-- El numero de pregunta sera 93
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('George Lucas', '1', 93);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Steven Spielberg', '0', 93);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('James Cameron', '0', 93);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Ridley Scott', '0', 93);

-- Pregunta 14: ¿En que serie de television aparece el personaje Sheldon Cooper?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que serie de television aparece el personaje Sheldon Cooper?', '1', 5);

-- El numero de pregunta sera 94
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('The Big Bang Theory', '1', 94);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Friends', '0', 94);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('How I Met Your Mother', '0', 94);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Modern Family', '0', 94);

-- Pregunta 15: ¿Cual es el nombre del parque de diversiones en la pelicula "Jurassic Park"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre del parque de diversiones en la pelicula "Jurassic Park"?', '1', 5);

-- El numero de pregunta sera 95
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Jurassic Park', '1', 95);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Dino World', '0', 95);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Dino Land', '0', 95);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Prehistoric Park', '0', 95);

-- Pregunta 16: ¿Quien dirigio la pelicula "El Padrino"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien dirigio la pelicula "El Padrino"?', '1', 5);

-- El numero de pregunta sera 96
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Francis Ford Coppola', '1', 96);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Martin Scorsese', '0', 96);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Steven Spielberg', '0', 96);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Stanley Kubrick', '0', 96);

-- Pregunta 17: ¿Cual es el nombre del actor que interpreta a Iron Man en el Universo Cinematografico de Marvel?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre del actor que interpreta a Iron Man en el Universo Cinematografico de Marvel?', '1', 5);

-- El numero de pregunta sera 97
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Robert Downey Jr.', '1', 97);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chris Evans', '0', 97);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mark Ruffalo', '0', 97);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chris Hemsworth', '0', 97);

-- Pregunta 18: ¿Cual es el nombre de la escuela de magia en la saga de Harry Potter?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el nombre de la escuela de magia en la saga de Harry Potter?', '1', 5);

-- El numero de pregunta sera 98
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hogwarts', '1', 98);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Beauxbatons', '0', 98);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Durmstrang', '0', 98);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Ilvermorny', '0', 98);

-- Pregunta 19: ¿Quien es el creador de la serie de television "Los Simpsons"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el creador de la serie de television "Los Simpsons"?', '1', 5);

-- El numero de pregunta sera 99
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Matt Groening', '1', 99);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Seth MacFarlane', '0', 99);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Trey Parker', '0', 99);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Mike Judge', '0', 99);

-- Pregunta 20: ¿En que año se estreno la primera pelicula de la saga "Star Wars"?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que año se estreno la primera pelicula de la saga "Star Wars"?', '1', 5);

-- El numero de pregunta sera 100
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1977', '1', 100);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1980', '0', 100);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1983', '0', 100);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1973', '0', 100);

--Deporte

-- Pregunta 1: ¿Quien ha ganado mas titulos de Grand Slam en el tenis masculino?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien ha ganado mas titulos de Grand Slam en el tenis masculino?', '1', 6);

-- El numero de pregunta sera 101
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Roger Federer', '1', 101);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Rafael Nadal', '0', 101);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Novak Djokovic', '0', 101);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pete Sampras', '0', 101);

-- Pregunta 2: ¿En que año se celebro la primera Copa Mundial de la FIFA?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que año se celebro la primera Copa Mundial de la FIFA?', '1', 6);

-- El numero de pregunta sera 102
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1930', '1', 102);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1924', '0', 102);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1934', '0', 102);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1940', '0', 102);

-- Pregunta 3: ¿Cual es el equipo de basquetbol con mas campeonatos de la NBA?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el equipo de basquetbol con mas campeonatos de la NBA?', '1', 6);

-- El numero de pregunta sera 103
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Boston Celtics', '1', 103);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Los Angeles Lakers', '0', 103);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Chicago Bulls', '0', 103);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Golden State Warriors', '0', 103);

-- Pregunta 4: ¿Quien ostenta el record de mas goles en la historia de los Mundiales de futbol?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien ostenta el record de mas goles en la historia de los Mundiales de futbol?', '1', 6);

-- El numero de pregunta sera 104
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Miroslav Klose', '1', 104);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Ronaldo', '0', 104);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pele', '0', 104);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Gerd Muller', '0', 104);

-- Pregunta 5: ¿En que deporte destacaba Michael Jordan?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que deporte destacaba Michael Jordan?', '1', 6);

-- El numero de pregunta sera 105
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Basquetbol', '1', 105);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Futbol Americano', '0', 105);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Beisbol', '0', 105);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Atletismo', '0', 105);

-- Pregunta 6: ¿Cuantos jugadores tiene un equipo de futbol en el campo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cuantos jugadores tiene un equipo de futbol en el campo?', '1', 6);

-- El número de pregunta será 106
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('11', '1', 106);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('10', '0', 106);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('9', '0', 106);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('12', '0', 106);

-- Pregunta 7: ¿En que año se fundó el Club Real Madrid?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ano se fundo el Club Real Madrid?', '1', 6);

-- El número de pregunta será 107
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1902', '1', 107);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1912', '0', 107);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1922', '0', 107);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1892', '0', 107);

-- Pregunta 8: ¿Quien es conocido como el Rey del Tenis?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es conocido como el Rey del Tenis?', '1', 6);

-- El número de pregunta será 108
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Roger Federer', '1', 108);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Rafael Nadal', '0', 108);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Novak Djokovic', '0', 108);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pete Sampras', '0', 108);

-- Pregunta 9: ¿Cual es el club de futbol más antiguo de España?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el club de futbol mas antiguo de Espana?', '1', 6);

-- El número de pregunta será 109
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Recreativo de Huelva', '1', 109);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Real Madrid', '0', 109);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Barcelona', '0', 109);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Athletic Bilbao', '0', 109);

-- Pregunta 10: ¿Quien es el máximo goleador en la historia de la Champions League?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Quien es el maximo goleador en la historia de la Champions League?', '1', 6);

-- El número de pregunta será 110
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Cristiano Ronaldo', '1', 110);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Lionel Messi', '0', 110);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Robert Lewandowski', '0', 110);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Raul', '0', 110);

-- Pregunta 11: ¿En qué país se inventó el deporte del rugby?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que pais se invento el deporte del rugby?', '1', 6);

-- El número de pregunta será 111
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Inglaterra', '1', 111);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Australia', '0', 111);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Nueva Zelanda', '0', 111);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Sudafrica', '0', 111);

-- Pregunta 12: ¿En qué deporte se juega la Copa Davis?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que deporte se juega la Copa Davis?', '1', 6);

-- El número de pregunta será 112
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tenis', '1', 112);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Futbol', '0', 112);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Baloncesto', '0', 112);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Golf', '0', 112);

-- Pregunta 13: ¿Cuál es el deporte más popular en Estados Unidos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el deporte mas popular en Estados Unidos?', '1', 6);

-- El número de pregunta será 113
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Futbol Americano', '1', 113);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Beisbol', '0', 113);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Baloncesto', '0', 113);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hockey sobre hielo', '0', 113);

-- Pregunta 14: ¿En qué año se disputó la primera edición de los Juegos Olímpicos modernos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que ano se disputo la primera edicion de los Juegos Olimpicos modernos?', '1', 6);

-- El número de pregunta será 114
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1896', '1', 114);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1900', '0', 114);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1912', '0', 114);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('1924', '0', 114);

-- Pregunta 15: ¿Cuál es el deporte más practicado en el mundo?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el deporte mas practicado en el mundo?', '1', 6);

-- El número de pregunta será 115
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Futbol', '1', 115);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Cricket', '0', 115);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Baloncesto', '0', 115);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Tenis', '0', 115);

-- Pregunta 16: ¿Cuál es el país que ha ganado más medallas en la historia de los Juegos Olímpicos de Verano?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el pais que ha ganado mas medallas en la historia de los Juegos Olimpicos de Verano?', '1', 6);

-- El número de pregunta será 116
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Estados Unidos', '1', 116);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('China', '0', 116);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Rusia', '0', 116);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Alemania', '0', 116);

-- Pregunta 17: ¿En qué deporte se juega el Trofeo de Campeones?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('En que deporte se juega el Trofeo de Campeones?', '1', 6);

-- El número de pregunta será 117
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Hockey sobre césped', '1', 117);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Fútbol', '0', 117);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Baloncesto', '0', 117);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Golf', '0', 117);

-- Pregunta 18: ¿Cuál es el único equipo que ha ganado cinco Super Bowls en la NFL?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el unico equipo que ha ganado cinco Super Bowls en la NFL?', '1', 6);

-- El número de pregunta será 118
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Pittsburgh Steelers', '1', 118);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Dallas Cowboys', '0', 118);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('New England Patriots', '0', 118);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('San Francisco 49ers', '0', 118);

-- Pregunta 19: ¿Qué país ganó la Copa Mundial de Fútbol en 2010?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Que pais gano la Copa Mundial de Futbol en 2010?', '1', 6);

-- El número de pregunta será 119
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Espana', '1', 119);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Alemania', '0', 119);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Argentina', '0', 119);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('Brasil', '0', 119);

-- Pregunta 20: ¿Cuál es el récord mundial en los 100 metros lisos masculinos?
INSERT INTO triv_questions (que_questions, que_is_enabled, cxq_cat_id)
VALUES ('Cual es el record mundial en los 100 metros lisos masculinos?', '1', 6);

-- El número de pregunta será 120
INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('9.58 segundos', '1', 120);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('9.63 segundos', '0', 120);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('9.69 segundos', '0', 120);

INSERT INTO triv_answers (ans_answers, ans_is_correct, qxa_que_id)
VALUES ('9.72 segundos', '0', 120);


