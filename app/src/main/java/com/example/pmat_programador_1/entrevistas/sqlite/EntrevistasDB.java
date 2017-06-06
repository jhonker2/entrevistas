package com.example.pmat_programador_1.entrevistas.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by PMAT-PROGRAMADOR_1 on 06/06/2017.
 */

public class EntrevistasDB extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Portobd.db";

    public EntrevistasDB(Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    public static class DatosEntrevistas  implements BaseColumns{
        public static final String TABLA_LIDER ="lideres";
        public static final String TABLA_ENTREVISTA="entrevistas";
        public static final String TABLA_MIEMBRO ="miembros";

        public static final String ID="id";
        public static final String LLAMAMIENTO="llamamiento";

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
