package br.com.upinterativo.dao;

public class ListaChamadaAluno {
	public static final String CREATE_TABLE = "create table ListaChamadaAluno (idListaChamadaAluno int primary key autoincrement, idListaChamada int not null FOREIGN KEY REFERENCES ListaChamada (idListaChamada), idAluno int not null FOREIGN KEY REFERENCES Aluno (idAluno), Data datetime default current_timestamp";
}
