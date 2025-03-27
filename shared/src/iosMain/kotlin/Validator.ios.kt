package com.skipline.shared

actual class Validator {
    actual fun validateEmail(email: String): Boolean {
        return email.contains("@") && email.contains(".")
    }

    actual fun validatePassword(password: String): Boolean {
        return password.length >= 6
    }
}
