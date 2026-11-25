-- V2: Migrations para add the RANK column to the ninja registration table

ALTER TABLE TB_NINJA_REGISTRATION
ADD COLUMN RANK VARCHAR(255);