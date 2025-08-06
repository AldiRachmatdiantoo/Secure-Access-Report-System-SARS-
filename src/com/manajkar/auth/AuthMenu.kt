package com.manajkar.auth
import checkList
class AuthMenu {
    val listMenu = listOf("LOGIN", "REGISTRATION")
    fun menu(){
        println("=====SARS=====")
        val displayMenu = checkList("Pilih: ", listMenu)
        when(displayMenu){
            "LOGIN" -> AuthLogin()
            "REGISTRATION" -> AuthRegistration().regist()
        }
    }
}