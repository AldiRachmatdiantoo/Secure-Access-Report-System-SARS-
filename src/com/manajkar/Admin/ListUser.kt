package com.manajkar.Admin

import com.manajkar.user.Role
import com.manajkar.user.User

class ListUser {
    val listUser = mutableListOf(
        User("aldi", "232006", "aldirmdnto@gmail.com", "10 september 2023", Role.ADMIN),
        User("ardi", "ardigaming123", "ardikurnianto@gmail.com", "13 januari 2025", Role.EMPLOYEE)
    )
}