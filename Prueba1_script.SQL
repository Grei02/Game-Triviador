/*
Created: 15/5/2024
Modified: 1/6/2024
Model: DB_TRIVIADOS
Database: Oracle 19c
*/




-- Create sequences section -------------------------------------------------

CREATE SEQUENCE triv_game_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_players_categories_game_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_players_game_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_players_wildcard_game_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_wildcard_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_players_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_questions_categories_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_achievements_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_categories_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_questions_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

CREATE SEQUENCE triv_answers_seq01
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 MINVALUE 1
 NOCACHE
/

-- Create tables section -------------------------------------------------

-- Table triv_players

CREATE TABLE triv_players(
  pla_id Number NOT NULL,
  pla_name Varchar2(20 ) NOT NULL,
  pla_description Varchar2(100 ),
  pla_countergamewin Number,
  pla_countergamelose Number,
  pla_counterconsecutivequestion Number,
  pla_favoritecategory Varchar2(20 ),
  pla_version Number DEFAULT 1 NOT NULL
)
/

-- Add keys for table triv_players

ALTER TABLE triv_players ADD CONSTRAINT PK_triv_players PRIMARY KEY (pla_id)
/

-- Table triv_categories

CREATE TABLE triv_categories(
  cat_id Number NOT NULL,
  cat_name Varchar2(20 ) NOT NULL,
  cat_nameimage Varchar2(30 ),
  cat_version Number DEFAULT 1 NOT NULL
)
/

-- Add keys for table triv_categories

ALTER TABLE triv_categories ADD CONSTRAINT PK_triv_categories PRIMARY KEY (cat_id)
/

-- Table triv_wildcard

CREATE TABLE triv_wildcard(
  wild_id Number NOT NULL,
  wild_name Varchar2(20 ) NOT NULL,
  wild_version Number DEFAULT 1 NOT NULL
)
/

-- Add keys for table triv_wildcard

ALTER TABLE triv_wildcard ADD CONSTRAINT PK_triv_wildcard PRIMARY KEY (wild_id)
/

-- Table triv_questions_categories

CREATE TABLE triv_questions_categories(
  qcat_id Number NOT NULL,
  qcat_countanswer Number,
  qcat_counthit Number,
  qcat_version Number DEFAULT 1 NOT NULL,
  cxqc_cat_id Number,
  pxqc_pla_id Number
)
/

-- Add keys for table triv_questions_categories

ALTER TABLE triv_questions_categories ADD CONSTRAINT PK_triv_questions_categories PRIMARY KEY (qcat_id)
/

-- Table and Columns comments section

COMMENT ON COLUMN triv_questions_categories.qcat_countanswer IS 'contador de preguntas contestadas'
/
COMMENT ON COLUMN triv_questions_categories.qcat_counthit IS 'almacena la información de la cantidad de aciertos'
/

-- Table triv_players_categories_game

CREATE TABLE triv_players_categories_game(
  pxcxg_id Number NOT NULL,
  pxcxg_version Number DEFAULT 1 NOT NULL,
  pxcxg_pla_id Number NOT NULL,
  pxcxg_cat_id Number NOT NULL,
  pxcxg_gam_id Number NOT NULL
)
/

-- Add keys for table triv_players_categories_game

ALTER TABLE triv_players_categories_game ADD CONSTRAINT PK_triv_players_categories_game PRIMARY KEY (pxcxg_id)
/

-- Table triv_game

CREATE TABLE triv_game(
  gam_id Number NOT NULL,
  gam_name Varchar2(30 ) NOT NULL,
  gam_time Number,
  gam_is_time Varchar2(1 ) NOT NULL
        CONSTRAINT triv_gam_chk_is_time CHECK (gam_is_time IN ('0','1')),
  gam_difficulty Varchar2(20 ) NOT NULL,
  gam_numberplayer Number NOT NULL,
  gam_is_duel Varchar2(1 ) NOT NULL
        CONSTRAINT triv_gam_chk_is_duel CHECK (gam_is_duel IN ('0','1')),
  gam_turn Number NOT NULL,
  gam_counterround Number,
  gam_version Number DEFAULT 1 NOT NULL
)
/

-- Add keys for table triv_game

ALTER TABLE triv_game ADD CONSTRAINT PK_triv_game PRIMARY KEY (gam_id)
/

-- Table triv_questions

CREATE TABLE triv_questions(
  que_id Number NOT NULL,
  que_questions Varchar2(300 ) NOT NULL,
  que_is_enabled Varchar2(1 ) NOT NULL
        CONSTRAINT que_questions_chk_is_enabled CHECK (que_is_enabled IN ('0','1')),
  que_version Number DEFAULT 1 NOT NULL,
  cxq_cat_id Number
)
/

-- Add keys for table triv_questions

ALTER TABLE triv_questions ADD CONSTRAINT PK_triv_questions PRIMARY KEY (que_id)
/

-- Table triv_players_game

CREATE TABLE triv_players_game(
  pxg_id Number NOT NULL,
  pxg_nameworker Varchar2(20 ),
  pxg_posboard Number NOT NULL,
  pxg_counterconsecutivequestion Number,
  pxg_numberturn Number,
  pxg_is_current Varchar2(1 ) NOT NULL
        CONSTRAINT triv_players_game_chk_is_current CHECK (pxg_is_current IN ('0','1')),
  pxg_gam_id Number NOT NULL,
  pxg_pla_id Number NOT NULL,
  pxg_version Number DEFAULT 1 NOT NULL
)
/

-- Add keys for table triv_players_game

ALTER TABLE triv_players_game ADD CONSTRAINT PK_triv_players_game PRIMARY KEY (pxg_id)
/

-- Table triv_game_questions

CREATE TABLE triv_game_questions(
  gxq_gam_id Number NOT NULL,
  gxq_que_id Number NOT NULL
)
/

-- Add keys for table triv_game_questions

ALTER TABLE triv_game_questions ADD CONSTRAINT PK_triv_game_questions PRIMARY KEY (gxq_gam_id,gxq_que_id)
/

-- Table triv_answers

CREATE TABLE triv_answers(
  ans_id Number NOT NULL,
  ans_version Number DEFAULT 1 NOT NULL,
  ans_answers Varchar2(100 ) NOT NULL,
  ans_is_correct Varchar2(1 ) NOT NULL
        CONSTRAINT triv_answers_chk_is_correct CHECK (ans_is_correct IN ('0','1')),
  ans_selectednumber Number,
  qxa_que_id Number
)
/

-- Add keys for table triv_answers

ALTER TABLE triv_answers ADD CONSTRAINT PK_triv_answers PRIMARY KEY (ans_id)
/

-- Table triv_players_wildcard_game

CREATE TABLE triv_players_wildcard_game(
  pxwxg_id Number NOT NULL,
  pxwxg_is_used Varchar2(1 ) NOT NULL
        CONSTRAINT pxwxg_chk_is_used CHECK (pxwxg_is_used IN ('0','1')),
  pxwxg_version Number DEFAULT 1 NOT NULL,
  pxwxg_wild_id Number NOT NULL,
  pxwxg_gam_id Number NOT NULL,
  pxwxg_pla_id Number NOT NULL
)
/

-- Add keys for table triv_players_wildcard_game

ALTER TABLE triv_players_wildcard_game ADD CONSTRAINT PK_triv_players_wildcard_game PRIMARY KEY (pxwxg_id)
/

-- Table triv_achievements

CREATE TABLE triv_achievements(
  ach_id Number NOT NULL,
  ach_name Varchar2(35 ) NOT NULL,
  ach_type Varchar2(30 ) NOT NULL,
  ach_amount Number NOT NULL,
  ach_description Varchar2(100 ),
  ach_version Number DEFAULT 1 NOT NULL,
  ach_nameimage Varchar2(20 )
)
/

-- Add keys for table triv_achievements

ALTER TABLE triv_achievements ADD CONSTRAINT PK_triv_achievements PRIMARY KEY (ach_id)
/

-- Table triv_players_achievements

CREATE TABLE triv_players_achievements(
  pxa_pla_id Number NOT NULL,
  pxa_ach_id Number NOT NULL
)
/

-- Add keys for table triv_players_achievements

ALTER TABLE triv_players_achievements ADD CONSTRAINT PK_triv_players_achievements PRIMARY KEY (pxa_pla_id,pxa_ach_id)
/

-- Trigger for sequence triv_players_seq01 for column pla_id in table triv_players ---------
CREATE OR REPLACE TRIGGER triv_players_tgr01 BEFORE INSERT
ON triv_players FOR EACH ROW
BEGIN
  if :new.pla_id is null or :new.pla_id <=0 then
     :new.pla_id := triv_players_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_players_tgr02 AFTER UPDATE OF pla_id
ON triv_players FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column pla_id in table triv_players as it uses sequence.');
END;
/

-- Trigger for sequence triv_categories_seq01 for column cat_id in table triv_categories ---------
CREATE OR REPLACE TRIGGER triv_categories_tgr01  BEFORE INSERT
ON triv_categories FOR EACH ROW
BEGIN
  if :new.cat_id is null or :new.cat_id <=0 then
     :new.cat_id := triv_categories_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_categories_tgr02 AFTER UPDATE OF cat_id
ON triv_categories FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column cat_id in table triv_categories as it uses sequence.');
END;
/

-- Trigger for sequence triv_wildcard_seq01 for column wild_id in table triv_wildcard ---------
CREATE OR REPLACE TRIGGER triv_wildcard_tgr01 BEFORE INSERT
ON triv_wildcard FOR EACH ROW
BEGIN
  if :new.wild_id is null or :new.wild_id <=0 then
     :new.wild_id := triv_wildcard_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_wildcard_tgr02 AFTER UPDATE OF wild_id
ON triv_wildcard FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column wild_id in table triv_wildcard as it uses sequence.');
END;
/

-- Trigger for sequence triv_questions_categories_seq01 for column qcat_id in table triv_questions_categories ---------
CREATE OR REPLACE TRIGGER triv_questions_categories_tgr01 BEFORE INSERT
ON triv_questions_categories FOR EACH ROW
BEGIN
  if :new.qcat_id is null or :new.qcat_id <=0 then
     :new.qcat_id := triv_questions_categories_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_questions_categories_tgr02 AFTER UPDATE OF qcat_id
ON triv_questions_categories FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column qcat_id in table triv_questions_categories as it uses sequence.');
END;
/

-- Trigger for sequence triv_players_categories_game_seq01 for column pxcxg_id in table triv_players_categories_game ---------
CREATE OR REPLACE TRIGGER triv_players_categories_game_tgr01  BEFORE INSERT
ON triv_players_categories_game FOR EACH ROW
BEGIN
  if :new.pxcxg_id is null or :new.pxcxg_id <=0 then
     :new.pxcxg_id := triv_players_categories_game_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_players_categories_game_tgr02 AFTER UPDATE OF pxcxg_id
ON triv_players_categories_game FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column pxcxg_id in table triv_players_categories_game as it uses sequence.');
END;
/

-- Trigger for sequence triv_game_seq01 for column gam_id in table triv_game ---------
CREATE OR REPLACE TRIGGER triv_game_tgr01 BEFORE INSERT
ON triv_game FOR EACH ROW
BEGIN
  if :new.gam_id is null or :new.gam_id <=0 then
     :new.gam_id := triv_game_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_game_tgr02 AFTER UPDATE OF gam_id
ON triv_game FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column gam_id in table triv_game as it uses sequence.');
END;
/

-- Trigger for sequence triv_questions_seq01 for column que_id in table triv_questions ---------
CREATE OR REPLACE TRIGGER triv_questions_tgr01  BEFORE INSERT
ON triv_questions FOR EACH ROW
BEGIN
  if :new.que_id is null or :new.que_id <=0 then
     :new.que_id := triv_questions_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_questions_tgr02 AFTER UPDATE OF que_id
ON triv_questions FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column que_id in table triv_questions as it uses sequence.');
END;
/

-- Trigger for sequence triv_players_game_seq01 for column pxg_id in table triv_players_game ---------
CREATE OR REPLACE TRIGGER triv_players_game_tgr01  BEFORE INSERT
ON triv_players_game FOR EACH ROW
BEGIN
  if :new.pxg_id is null or :new.pxg_id <=0 then
     :new.pxg_id := triv_players_game_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_players_game_tgr02 AFTER UPDATE OF pxg_id
ON triv_players_game FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column pxg_id in table triv_players_game as it uses sequence.');
END;
/

-- Trigger for sequence triv_answers_seq01 for column ans_id in table triv_answers ---------
CREATE OR REPLACE TRIGGER triv_answers_tgr01 BEFORE INSERT
ON triv_answers FOR EACH ROW
BEGIN
  if :new.ans_id is null or :new.ans_id <=0 then
     :new.ans_id := triv_answers_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_answers_tgr02 AFTER UPDATE OF ans_id
ON triv_answers FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column ans_id in table triv_answers as it uses sequence.');
END;
/

-- Trigger for sequence triv_players_wildcard_game_seq01 for column pxwxg_id in table triv_players_wildcard_game ---------
CREATE OR REPLACE TRIGGER triv_players_wildcard_game_tgr01 BEFORE INSERT
ON triv_players_wildcard_game FOR EACH ROW
BEGIN
  if :new.pxwxg_id is null or :new.pxwxg_id <=0 then
     :new.pxwxg_id := triv_players_wildcard_game_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_players_wildcard_game_tgr02 AFTER UPDATE OF pxwxg_id
ON triv_players_wildcard_game FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column pxwxg_id in table triv_players_wildcard_game as it uses sequence.');
END;
/

-- Trigger for sequence triv_achievements_seq01 for column ach_id in table triv_achievements ---------
CREATE OR REPLACE TRIGGER triv_achievements_tgr01 BEFORE INSERT
ON triv_achievements FOR EACH ROW
BEGIN
  if :new.ach_id is null or :new.ach_id <=0 then
     :new.ach_id := triv_achievements_seq01.nextval;
  end if;
END;
/
CREATE OR REPLACE TRIGGER triv_achievements_tgr02 AFTER UPDATE OF ach_id
ON triv_achievements FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column ach_id in table triv_achievements as it uses sequence.');
END;
/


-- Create foreign keys (relationships) section ------------------------------------------------- 

ALTER TABLE triv_questions_categories ADD CONSTRAINT triv_categories_questionscategories_fk01 FOREIGN KEY (cxqc_cat_id) REFERENCES triv_categories (cat_id)
/



ALTER TABLE triv_players_categories_game ADD CONSTRAINT triv_players_categories_game_fk01 FOREIGN KEY (pxcxg_pla_id) REFERENCES triv_players (pla_id)
/



ALTER TABLE triv_players_categories_game ADD CONSTRAINT triv_players_categories_game_fk02 FOREIGN KEY (pxcxg_cat_id) REFERENCES triv_categories (cat_id)
/



ALTER TABLE triv_players_game ADD CONSTRAINT triv_players_game_fk01 FOREIGN KEY (pxg_pla_id) REFERENCES triv_players (pla_id)
/



ALTER TABLE triv_players_game ADD CONSTRAINT triv_players_game_fk02 FOREIGN KEY (pxg_gam_id) REFERENCES triv_game (gam_id)
/



ALTER TABLE triv_game_questions ADD CONSTRAINT triv_game_questions_fk01 FOREIGN KEY (gxq_gam_id) REFERENCES triv_game (gam_id)
/



ALTER TABLE triv_game_questions ADD CONSTRAINT triv_game_questions_fk02 FOREIGN KEY (gxq_que_id) REFERENCES triv_questions (que_id)
/



ALTER TABLE triv_questions ADD CONSTRAINT triv_questions_categories_fk01 FOREIGN KEY (cxq_cat_id) REFERENCES triv_categories (cat_id)
/



ALTER TABLE triv_questions_categories ADD CONSTRAINT triv_players_questions_categories_fk01 FOREIGN KEY (pxqc_pla_id) REFERENCES triv_players (pla_id)
/



ALTER TABLE triv_players_categories_game ADD CONSTRAINT triv_players_categories_game_fk03 FOREIGN KEY (pxcxg_gam_id) REFERENCES triv_game (gam_id)
/



ALTER TABLE triv_answers ADD CONSTRAINT triv_questions_answers_fk01 FOREIGN KEY (qxa_que_id) REFERENCES triv_questions (que_id)
/



ALTER TABLE triv_players_wildcard_game ADD CONSTRAINT triv_players_wildcard_game_fk01 FOREIGN KEY (pxwxg_wild_id) REFERENCES triv_wildcard (wild_id)
/



ALTER TABLE triv_players_wildcard_game ADD CONSTRAINT triv_players_wildcard_game_fk03 FOREIGN KEY (pxwxg_gam_id) REFERENCES triv_game (gam_id)
/



ALTER TABLE triv_players_wildcard_game ADD CONSTRAINT triv_players_wildcard_game_fk02 FOREIGN KEY (pxwxg_pla_id) REFERENCES triv_players (pla_id)
/



ALTER TABLE triv_players_achievements ADD CONSTRAINT triv_players_achievements_fk01 FOREIGN KEY (pxa_pla_id) REFERENCES triv_players (pla_id)
/



ALTER TABLE triv_players_achievements ADD CONSTRAINT triv_players_achievements_fk02 FOREIGN KEY (pxa_ach_id) REFERENCES triv_achievements (ach_id)
/







