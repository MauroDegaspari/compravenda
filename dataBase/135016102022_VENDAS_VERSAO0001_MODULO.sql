--<Ds_script>
-- DESCRI??O ...: 'VENDAS' - Criação da tabela de cadastro de vendas - CAD_EMPRESAS
-- RESPONSAVEL..: Mauro Degaspari
-- DATA.........: 16/10/2022
-- APLICA??O....:
-- </ds_script>

-- <USUARIO = DBASYTEM>


CREATE TABLE dbasystem.venda (

    cd_venda   NUMBER    NOT NULL,
    dt_venda   DATE      NULL       DEFAULT SYSDATE,
    qt_vistas  NUMBER    NULL,
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
