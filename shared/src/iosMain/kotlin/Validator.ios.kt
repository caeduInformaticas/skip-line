package com.skipline.shared

actual class Validator {
    actual fun validateEmail(email: String): Boolean {
        val regex = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        return email.matches(regex.toRegex())
    }

    actual fun validatePassword(password: String): Boolean {
        return password.length >= 6
    }
}
