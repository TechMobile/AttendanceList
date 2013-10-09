package br.com.upinterativo.dao;

public class Classe {
	public static final String TABELA_CLASSE = "Classe";
	
	public static final String COLUNA_ID = "idClasse";
	public static final String COLUNA_DESCRICAO = "Descricao";
	public static final String COLUNA_DATA = "Data";
	
	public static final String CREATE_TABLE = "create table " + TABELA_CLASSE + " ( " + COLUNA_ID + " int primary key autoincrement, " + COLUNA_DESCRICAO + " text not null, " + COLUNA_DATA + " datetime default current_timestamp)";
}
