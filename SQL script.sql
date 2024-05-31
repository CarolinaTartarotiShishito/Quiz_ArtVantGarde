create database quizArtVantGarde;
use quizArtVantGarde;


create table tbLogins(
	idLogin int PRIMARY KEY auto_increment NOT NULL,
	email varchar(200) NOT NULL,
	senha varchar(200) NOT NULL);

create table tbAlunos(
	idAluno int PRIMARY KEY NOT NULL auto_increment,
	nomeCompleto varchar(200) NOT NULL,
	serie varchar(200) NOT NULL,
	codMatricula varchar(80) NOT NULL,
	idLogin int NOT NULL,
	FOREIGN KEY (idLogin) REFERENCES tbLogins(idLogin));

create table tbProfessores(
	idProfessor int PRIMARY KEY NOT NULL auto_increment,
	nomeCompleto varchar(200) NOT NULL,
	materiaLecionada varchar(200) NOT NULL,
	idLogin int NOT NULL,
	FOREIGN KEY (idLogin) REFERENCES tbLogins(idLogin));
    
create table tbVanguardas(
	idVanguarda int PRIMARY KEY auto_increment,
	vanguarda varchar(80));
    
create table tbGrupos(
	idGrupo int PRIMARY KEY NOT NULL auto_increment, 
	nomeGrupo varchar(200) NOT NULL, 
	qtdeAcertos int NOT NULL DEFAULT 0, 
	qtdeErros int NOT NULL DEFAULT 0,
	tempoResolucaoVanguarda TIME NOT NULL DEFAULT '00:00:00',
	idVanguarda int,
	FOREIGN KEY (idVanguarda) REFERENCES tbVanguardas(idVanguarda));

create table integrantesGrupo(
	idIG int PRIMARY KEY NOT NULL,
 	idLogin int NOT NULL,
	idGrupo int NOT NULL,
	FOREIGN KEY (idLogin) REFERENCES tbLogins(idLogin),
	FOREIGN KEY (idGrupo) REFERENCES tbGrupos(idGrupo));

create table tbResumos(
	idResumo int PRIMARY KEY NOT NULL auto_increment, 
	resumo mediumtext,
	idVanguarda int NOT NULL, 
	FOREIGN KEY (idVanguarda) REFERENCES tbVanguardas(idVanguarda));

create table tbQuestoes(
	codQuestao int PRIMARY KEY NOT NULL auto_increment,
	pergunta mediumtext NOT NULL,
    	urlImagem mediumtext,
	respostaCorreta mediumtext NOT NULL, 
    	respostaIncorreta1 mediumtext NOT NULL, 
    	respostaIncorreta2 mediumtext NOT NULL, 
    	respostaIncorreta3 mediumtext NOT NULL,
    	qtdeAcertos int NOT NULL default 0,
	qtdeErros int NOT NULL default 0,
    	idVanguarda int NOT NULL, 
	FOREIGN KEY (idVanguarda) REFERENCES tbVanguardas(idVanguarda));
    
create table tbPecas(
	idPecas int PRIMARY KEY NOT NULL auto_increment,
    	urlImagem mediumtext NOT NULL,
    	localPeca varchar(200) NOT NULL,
    	idVanguarda int NOT NULL,
    	FOREIGN KEY (idVanguarda) REFERENCES tbVanguardas(idVanguarda));
