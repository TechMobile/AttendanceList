package br.com.upinterativo.dao;

public class Aluno {
	public static final String CREATE_TABLE = "create table Aluno (idAluno int primary key autoincrement, Nome text not null, Imagem BLOB);";
}
