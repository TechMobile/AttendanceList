package br.com.upinterativo.dao;

public class ListaChamada {
	public static final String TABELA_LISTACHAMADA = "ListaChamada";
	
	public static final String COLUNA_ID = "idListaChamada";
	public static final String COLUNA_DESCRICAO = "Descricao";
	public static final String COLUNA_DATA = "Data";
	
	public static final String CREATE_TABLE = "create table " + TABELA_LISTACHAMADA + " ( " + COLUNA_ID + " integer primary key autoincrement, " + COLUNA_DESCRICAO + " text not null, " + COLUNA_DATA + " datetime default current_timestamp);";
	
}