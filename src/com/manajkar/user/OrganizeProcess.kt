package com.manajkar.user

sealed class OrganizeProcess {
    data class Success(val data: Any): OrganizeProcess()
    data class Error(val message: String) : OrganizeProcess()
    data class Loading(val message: String): OrganizeProcess()
}