--<Ds_script>
-- DESCRI??O ...: 'VENDAS' - Criação da tabela de cadastro de vendas - CAD_EMPRESAS
-- RESPONSAVEL..: Mauro Degaspari
-- DATA.........: 16/10/2022
-- APLICA??O....:
-- </ds_script>

-- <USUARIO = DBASYTEM>

CREATE TABLE dbasystem.venda (

    cd_usuario NUMBER    NOT NULL,
    cd_venda   NUMBER    NOT NULL,
    dt_venda   DATE      NULL,
    qt_visitas  NUMBER    NULL,
    qt_vendas  NUMBER    NULL,
    total      NUMBER    NULL

)

TABLESPACE tbs_compravenda

/

 ALTER TABLE dbasystem.venda
  ADD CONSTRAINT cnt_cd_venda_fk PRIMARY KEY (
    cd_venda
  )

  USING INDEX
  TABLESPACE tbs_compravenda
  compute STATISTICS
/

ALTER TABLE dbasystem.venda
  ADD CONSTRAINT cnt_cd_usuario_fg FOREIGN KEY(
  cd_usuario
) REFERENCES dbasystem.usuario (
  cd_usuario
)
/

COMMENT ON TABLE dbasystem.venda IS 'Table de vendas do sistema';
/

COMMENT ON COLUMN dbasystem.venda.cd_usuario IS 'Foreign Key ta tabela dbasystem.usuario';
/

COMMENT ON COLUMN dbasystem.venda.cd_venda IS 'Primary Key recebendo a sequence dbasystem.seq_vendas';
/

COMMENT ON COLUMN dbasystem.venda.dt_venda IS 'Data da venda';
/

COMMENT ON COLUMN dbasystem.venda.qt_visitas IS 'Quantidade de visitas';
/

COMMENT ON COLUMN dbasystem.venda.qt_vendas IS 'Quantidade de vendas';
/

COMMENT ON COLUMN dbasystem.venda.total IS 'total de vendas';
/


