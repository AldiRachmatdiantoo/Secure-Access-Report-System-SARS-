package com.manajkar.auth
import  checkNullOrBlank
import checkYesOrNo
import com.manajkar.user.OrganizeProcess
import handle
import checkList
import com.manajkar.Admin.ListUser
import com.manajkar.user.Role
import com.manajkar.user.User


class AuthRegistration {
    val saveUser = ListUser()
    val roles = Role.entries.toList()
    fun regist(){
        while (true) {
            println("\n")
            val role = checkList("Masukkan Role: ", roles)
            val username = checkNullOrBlank("Masukkan username: ")
            val password = checkNullOrBlank("Masukkan password: ")
            val email = checkNullOrBlank("Masukkan email: ")
            val tglGabung = checkNullOrBlank("Tanggal Gabung: ")

            val makeSure = checkYesOrNo("Buat Akun?")
            if (!makeSure) {
                println("")
                handle(OrganizeProcess.Loading("Membuat ulang..\n"))

                repeat(5) {
                    Thread.sleep(1000)
                    print(".")
                }

            } else {
                val user = User(username, password, email, tglGabung, Role.valueOf(role))
                saveUser.listUser.add(user)
                for (i in saveUser.listUser){
                    println(i)
                }
                handle(OrganizeProcess.Success("berhasil membuat akun!"))


                return
            }
        }
    }
}