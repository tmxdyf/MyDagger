package com.cy.src.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

/**
 * http://www.jb51.net/article/136390.htm
 */
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainActivityComponent.builder().build().inject(this)
//        Dagger
        user.hello(this)
    }
}
