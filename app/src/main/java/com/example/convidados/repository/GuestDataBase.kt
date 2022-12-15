package com.example.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {


    companion object{
        private const val NAME = "guestdb"
        private const val VERSION = 1

    }

    override fun onCreate(db: SQLiteDatabase) {
        // Criação do banco
        db.execSQL("CREATE TABLE Guest("+
                    "id integer primary key autoincrement, " +  //id dos convidados
                    "name text, " + //nome dos convidados
                    "presence integer);") //presença dos convidados
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {



    }

}