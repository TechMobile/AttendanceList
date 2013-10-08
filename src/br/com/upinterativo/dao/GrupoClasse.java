package br.com.upinterativo.dao;

public class GrupoClasse {
	public static final String CREATE_TABLE = "create table GrupoClasse (idGrupoClasse int primary key autoincrement, idGrupo int not null FOREIGN KEY REFERENCES Grupo (idGrupo), idClasse int not null FOREIGN KEY REFERENCES Classe (idClasse), Data datetime default current_timestamp)";
}
