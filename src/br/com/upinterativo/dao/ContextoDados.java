package br.com.upinterativo.dao;

import android.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ContextoDados extends SQLiteOpenHelper {
	
	private static final String NOME_BD = "ListaChamada";
	private static final int VERSAO_BD = 1;
	private static final String LOG_TAG = "ListaChamada";
	private final Context contexto;
	
	public ContextoDados(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
        this.contexto = context;
    }

	
	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "create table ListaChamada (idListaChamada integer primary key autoincrement, Descricao text not null, Data datetime default current_timestamp);";

		//criar tabela ListaChamada
		db.execSQL(sql);
		
		sql = "create table Aluno (idAluno int primary key autoincrement, Nome text not null, Imagem BLOB);";
		
		//criar tabela Aluno
		db.execSQL(sql);
		
		sql = "create table ListaChamadaAluno (idListaChamadaAluno int primary key autoincrement, idListaChamada int not null FOREIGN KEY REFERENCES ListaChamada (idListaChamada), idAluno int not null FOREIGN KEY REFERENCES Aluno (idAluno), Data datetime default current_timestamp";
		
		//criar tabela ListaChamadaAluno
		db.execSQL(sql);
		
		sql = "create table Grupo (idGrupo int primary key autoincrement, Descricao text not null, Data datetime default current_timestamp)";
		
		//criar tabela Grupo
		db.execSQL(sql);
		
		sql = "create table Classe (idClasse int primary key autoincrement, Descricao txt not null, Data datetime default current_timestamp)";
		
		//criar tabela Classe
		db.execSQL(sql);
		
		sql = "create table GrupoClasse (idGrupoClasse int primary key autoincrement, idGrupo int not null FOREIGN KEY REFERENCES Grupo (idGrupo), idClasse int not null FOREIGN KEY REFERENCES Classe (idClasse), Data datetime default current_timestamp)";
		
		//criar tabela GrupoClasse
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//NOTHING TO DO
	}
}
