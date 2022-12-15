package com.example.convidados.repository

class GuestRepository private constructor(){ // criando repositório para salvar os dados

    //Singleton - padrão de projeto para lidar com os dados
    companion object{
        private lateinit var repository: GuestRepository

        fun getInstance(): GuestRepository {
            if(!Companion::repository.isInitialized){
                repository = GuestRepository()
            }
            return repository
        }
    }

    fun save() {
        GuestDataBase(null)

    }

}