package br.com.upinterativo.dao;

public class GrupoClasse {
	public static final String TABELA_GrupoClasse = "GrupoClasse";
	
	public static final String COLUNA_ID = "idGrupoClasse";
	public static final String COLUNA_IDGRUPO = "idGrupo";
	public static final String COLUNA_IDCLASSE = "idClasse";
	public static final String COLUNA_DATA = "Data";
	
	public static final String CREATE_TABLE = "create table " + TABELA_GrupoClasse + " ( " + COLUNA_ID + "int primary key autoincrement, " + COLUNA_IDGRUPO + " int not null FOREIGN KEY REFERENCES Grupo (idGrupo), " + COLUNA_IDCLASSE + " int not null FOREIGN KEY REFERENCES Classe (idClasse), " + COLUNA_DATA + " datetime default current_timestamp)";
}
