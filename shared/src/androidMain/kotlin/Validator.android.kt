package com.skipline.shared

import android.util.Patterns

actual class Validator {
    actual fun validateEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    actual fun validatePassword(password: String): Boolean {
        return password.length >= 6
    }
}
