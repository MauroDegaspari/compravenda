  --<Ds_script>
-- DESCRI??O ...: 'Usuario' - Criação da tabela de cadastro de Usuarios - "Nome da Tela"
-- RESPONSAVEL..: Mauro Degaspari
-- DATA.........: 23/11/2022
-- APLICA??O....:  Compra&Vendas
-- </ds_script>

-- <USUARIO = DBASYTEM>


CREATE TABLE dbasystem.usuario (

    cd_usuario NUMBER   NOT NULL,
    ds_senha   VARCHAR2 NOT null

)

TABLESPACE tbs_compravenda

/

 ALTER TABLE dbasystem.usuario
  ADD CONSTRAINT cnt_cd_usuario_fk PRIMARY KEY (
    cd_usuario
  )

  USING INDEX
  TABLESPACE tbs_compravenda
  compute STATISTICS
/

COMMENT ON TABLE dbasystem.usuario IS 'Table de Usuario do sistema';
/
COMMENT ON COLUMN dbasystem.usuario.cd_usuario IS 'Primary Key recebendo a sequence dbasystem.seq_usuario';
/
COMMENT ON COLUMN dbasystem.usuario.ds_senha IS 'senha de usuario';

/
