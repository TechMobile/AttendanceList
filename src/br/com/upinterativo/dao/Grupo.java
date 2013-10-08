package br.com.upinterativo.dao;

public class Grupo {
	public static final String CREATE_TABLE = "create table Grupo (idGrupo int primary key autoincrement, Descricao text not null, Data datetime default current_timestamp)";
}
