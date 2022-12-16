package com.example.convidados.repository

import android.content.ContentValues
import android.content.Context
import com.example.convidados.model.GuestModel

//Manipulação de dados

class GuestRepository private constructor(context: Context){ // criando repositório para salvar os dados

    private val guestDataBase = GuestDataBase(context)

    //Singleton - padrão de projeto para lidar com os dados
    companion object{
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if(!Companion::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(guest: GuestModel) { //inserção do dado no banco de dados
       val db = guestDataBase.writableDatabase //escrevendo dentro do banco

        val presence = if(guest.presence) 1 else 0 //validação da presença

        val values = ContentValues() //preparando values para inserir tabela
        values.put("name", guest.name)
        values.put("presence", presence)

       db.insert("Guest", null, values) //inserindo values na tabela
    }

    fun update(){

    }
}