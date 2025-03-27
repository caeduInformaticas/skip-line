package com.skipline.shared

expect class Validator {
    fun validateEmail(email: String): Boolean
    fun validatePassword(password: String): Boolean
}
