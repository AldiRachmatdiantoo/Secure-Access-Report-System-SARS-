package com.manajkar.auth
import checkNullOrBlank
import com.manajkar.Admin.ListUser
import com.manajkar.user.OrganizeProcess
import handle

class AuthLogin {
    val user = ListUser().listUser
    fun login(){
        while (true) {
            val username = checkNullOrBlank("Masukkan username: ")
            if (!user.any { it.username == username }) {
                println("User tidak ditemukan! Coba lagi!")
                continue
            } else break
            }
            while (true){
                val password = checkNullOrBlank("Masukkan password: ")
                if (!user.any { it.password == password }){
                    println("password salah! coba lagi!")
                    continue
                } else break
            }
        handle(OrganizeProcess.Success("Berhasil Login!"))


    }
}