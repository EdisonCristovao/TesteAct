CREATE TABLE questao (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	pergunta VARCHAR(200) NOT NULL,
	tema VARCHAR(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO questao (pergunta, tema) values ('Qual o nome do Junior?', 'pessoal');
INSERT INTO questao (pergunta, tema) values ('Qual o nome do Junior?', 'pessoal');
INSERT INTO questao (pergunta, tema) values ('Qual o nome do Junior?', 'pessoal');
INSERT INTO questao (pergunta, tema) values ('Qual o nome do Junior?', 'pessoal');
