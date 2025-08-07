package com.manajkar.auth
import checkList
class AuthMenu {
    val listMenu = listOf("LOGIN", "REGISTRATION")
    fun menu(){
        while(true){
        println("=====SARS=====")
        val displayMenu = checkList("Pilih: ", listMenu)
        when(displayMenu){
            "LOGIN" -> AuthLogin().login()
            "REGISTRATION" -> AuthRegistration().regist()
        }
        }
    }
}