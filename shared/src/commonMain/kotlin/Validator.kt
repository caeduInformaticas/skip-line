package com.example.shared

expect class Validator {
    fun validate(input: String): Boolean
}