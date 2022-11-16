-- Cria tablespace p/ dados
--drop tablespace tbs_compravenda;

create tablespace tbs_compravenda
datafile 'C:\oraclexe\app\oracle\oradata\tbd_compravenda.dbf' size 100M reuse
autoextend on next 10M maxsize 200M
online;


-- Cria usuario (dono das tabelas)
create user dbasystem --usuario
identified by "123"  --senha
default tablespace tbs_compravenda
temporary tablespace temp;

-- Cria e define a "role" de privilegios (perfil)
create role perfil_desenv_dbasystem;

grant
create cluster,
create database link,
create procedure,
create session,
create sequence,
create synonym,
create table,
create any type,
create trigger,
create view
to perfil_desenv;


grant alter session to perfil_desenv_dbasystem;


grant create trigger to dbasystem;


grant perfil_desenv to dbasystem;

grant unlimited tablespace to dbasystem;

