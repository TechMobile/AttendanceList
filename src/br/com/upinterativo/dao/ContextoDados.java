package br.com.upinterativo.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ContextoDados extends SQLiteOpenHelper {
	
	private static final String NOME_BD = "ListaChamada";
	private static final int VERSAO_BD = 1;
	//private final Context contexto;
	
	public ContextoDados(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
        //this.contexto = context;
    }

	
	@Override
	public void onCreate(SQLiteDatabase db) {
		//criar tabela ListaChamada
		db.execSQL(ListaChamada.CREATE_TABLE);
		
		//criar tabela Aluno
		db.execSQL(Aluno.CREATE_TABLE);
		
		//criar tabela ListaChamadaAluno
		db.execSQL(ListaChamada.CREATE_TABLE);
		
		//criar tabela Grupo
		db.execSQL(Grupo.CREATE_TABLE);
		
		//criar tabela Classe
		db.execSQL(Classe.CREATE_TABLE);
		
		//criar tabela GrupoClasse
		db.execSQL(GrupoClasse.CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//NOTHING TO DO
	}
}
