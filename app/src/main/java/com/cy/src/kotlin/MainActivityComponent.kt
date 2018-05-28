package com.cy.src.kotlin

import dagger.Component

/**
 * @author CY 2018/5/28
 */
@Component
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}