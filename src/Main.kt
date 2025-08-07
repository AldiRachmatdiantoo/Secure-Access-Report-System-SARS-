import com.manajkar.auth.AuthMenu
import com.manajkar.user.OrganizeProcess
import com.manajkar.user.User

fun main() {
    val toProgram = checkYesOrNo("Ingin masuk ke program SARS? ")
    if (!toProgram){
        println("Terima kasih!")
        return
    } else {
        AuthMenu().menu()
        return
    }
}
fun checkYesOrNo(text: String): Boolean{
    print(text)
    var choice = readln()
    while (!choice.equals("y", true) && !choice.equals("n", true)){
        println("error! tolong masukkan input dengan benar!")
        print(text)
        choice = readln()
    }
    return choice.equals("y", true)
}
    fun <T>checkList(text: String, list: List<T>): String{
        while (true) {
            for ((index, value) in list.withIndex()) {
                println("${index + 1}.$value")
            }
            print(text)
            val input = readln().uppercase()
            if (list.any { it.toString() == input }) {
                return input
            } else {
                println("tidak ada/salah! coba lagi")
                continue
            }
        }
    }
fun checkNullOrBlank(text: String): String{
    while (true) {
        print(text)
        val input = readln()
        if (input.isBlank()){
            println("error! tolong input dengan benar!")
            continue
        } else {
            return input
        }
    }
}
fun handle(output: OrganizeProcess){
    when(output){
        is OrganizeProcess.Success -> println("Success: ${output.data}")
        is OrganizeProcess.Error -> println("Error: ${output.message}")
        is OrganizeProcess.Loading -> println("Loading: ${output.message}")
    }
}
