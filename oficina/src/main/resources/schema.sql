DROP TABLE IF EXISTS TB_DEFEITOS;
DROP TABLE IF EXISTS TB_PECAS;
DROP TABLE IF EXISTS TB_VEICULOS;

-- DEFEITOS --
CREATE TABLE TB_DEFEITOS (
  nome VARCHAR(250) NOT NULL
);

INSERT INTO TB_DEFEITOS (nome) VALUES
  ('Ferrugem');