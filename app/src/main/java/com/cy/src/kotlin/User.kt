package com.cy.src.kotlin

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

/**
 * @author CY 2018/5/28
 */
class User @Inject constructor() {
    fun hello(context: Context) {
        print("hello")
        Toast.makeText(context, "Hello Dagger2 Kotlin", Toast.LENGTH_SHORT).show()
    }
}