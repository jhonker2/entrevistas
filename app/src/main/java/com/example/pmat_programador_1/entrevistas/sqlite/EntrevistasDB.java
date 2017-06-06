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
    public static final String DATABASE_NAME = "entrevistas.db";

    public EntrevistasDB(Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    public static class DatosEntrevistas  implements BaseColumns{
        public static final String TABLA_LIDER ="lideres";
        public static final String TABLA_ENTREVISTA="entrevistas";
        public static final String TABLA_MIEMBRO ="miembros";

        public static final String ID="id";
        public static final String LLAMAMIENTO="llamamiento";
        public static final String NOMBRES="nombres";
        public static final String APELLIDOS="apellidos";
        public static final String ID_LIDER="id_lider";
        public static final String ID_MIEMBRO="id_miembro";
        public static final String FECHA_ENTREVISTA="fecha_entrevista";
        public static final String HORA_ENTREVISTA="hora_entrevista";
        public static final String ESTADO="estado";
        public static final String CONTACTO="contacto";
        public static final String LUGAR="lugar";


        private static final String TEXT_TYPE=" TEXT";
        private static final String INTEGER_TYPE=" INTEGER";
        private static final String REAL_TYPE=" REAL";

        private static final String COMMA_SEP=",";

        private static final String CREAR_TABLA_LIDER=
                "CREATE TABLE "+ DatosEntrevistas.TABLA_LIDER+" ("+
                        DatosEntrevistas.ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                        DatosEntrevistas.LLAMAMIENTO+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.NOMBRES+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.APELLIDOS+TEXT_TYPE+" )";
        private static final String CREAR_TABLA_MIEMBRO=
                "CREATE TABLE "+ DatosEntrevistas.TABLA_MIEMBRO+" ("+
                        DatosEntrevistas.ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                        DatosEntrevistas.NOMBRES+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.APELLIDOS+TEXT_TYPE+" )";

        private static final String CREAR_TABLA_ENTREVISTA=
                "CREATE TABLE "+ DatosEntrevistas.TABLA_ENTREVISTA+" ("+
                        DatosEntrevistas.ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                        DatosEntrevistas.ID_LIDER+INTEGER_TYPE+COMMA_SEP+
                        DatosEntrevistas.ID_MIEMBRO+INTEGER_TYPE+COMMA_SEP+
                        DatosEntrevistas.FECHA_ENTREVISTA+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.HORA_ENTREVISTA+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.ESTADO+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.CONTACTO+TEXT_TYPE+COMMA_SEP+
                        DatosEntrevistas.LUGAR+TEXT_TYPE+" )";

        private static final String SQL_ELIMINAR_TABLA_LIDER=
                "DROP TABLE IF EXISTS" + DatosEntrevistas.TABLA_LIDER;
        private static final String SQL_ELIMINAR_TABLA_MIEMBRO=
                "DROP TABLE IF EXISTS" + DatosEntrevistas.TABLA_MIEMBRO;
        private static final String SQL_ELIMINAR_TABLA_ENTREVISTA=
                "DROP TABLE IF EXISTS" + DatosEntrevistas.TABLA_ENTREVISTA;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DatosEntrevistas.CREAR_TABLA_LIDER);
        db.execSQL(DatosEntrevistas.CREAR_TABLA_MIEMBRO);
        db.execSQL(DatosEntrevistas.CREAR_TABLA_ENTREVISTA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatosEntrevistas.SQL_ELIMINAR_TABLA_LIDER);
        db.execSQL(DatosEntrevistas.SQL_ELIMINAR_TABLA_MIEMBRO);
        db.execSQL(DatosEntrevistas.SQL_ELIMINAR_TABLA_ENTREVISTA);

    }
}
