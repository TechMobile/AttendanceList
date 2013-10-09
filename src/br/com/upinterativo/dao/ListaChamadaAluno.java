package br.com.upinterativo.dao;

public class ListaChamadaAluno {
	public static final String TABELA_LISTACHAMADAALUNO = "ListaChamadaAluno";
	
	public static final String COLUNA_ID = "idListaChamadaAluno";
	public static final String COLUNA_IDLISTACHAMADA = "idListaChamada";
	public static final String COLUNA_IDALUNO = "idAluno";
	public static final String COLUNA_DATA = "Data";
	
	public static final String CREATE_TABLE = "create table " + TABELA_LISTACHAMADAALUNO + " ( " + COLUNA_ID + " int primary key autoincrement, " + COLUNA_IDLISTACHAMADA + " int not null FOREIGN KEY REFERENCES ListaChamada (idListaChamada), " + COLUNA_IDALUNO + " int not null FOREIGN KEY REFERENCES Aluno (idAluno), " + COLUNA_DATA + " datetime default current_timestamp";
}
