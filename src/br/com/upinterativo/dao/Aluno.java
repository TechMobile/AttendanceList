package br.com.upinterativo.dao;

public class Aluno {
	public static final String TABELA_ALUNO = "Aluno";
	
	public static final String COLUNA_ID = "idAluno";
	public static final String COLUNA_NOME = "Nome";
	public static final String COLUNA_IMAGEM = "Imagem";
	public static final String COLUNA_DATA = "Data";
	
	public static final String CREATE_TABLE = "create table " + TABELA_ALUNO + " ( " + COLUNA_ID + " int primary key autoincrement, " + COLUNA_NOME + " text not null, " + COLUNA_IMAGEM + " BLOB, " + COLUNA_DATA + " datetime default current_timestamp);";
}
