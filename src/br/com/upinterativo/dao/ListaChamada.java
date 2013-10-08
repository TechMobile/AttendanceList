package br.com.upinterativo.dao;

public class ListaChamada {
	public static final String CREATE_TABLE = "create table ListaChamada (idListaChamada integer primary key autoincrement, Descricao text not null, Data datetime default current_timestamp);";
	
}