package com.cy.src.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author chenyong
 */

public class MainActivity extends AppCompatActivity {

    //加入注解，标注这个test3是需要注入的
    @javax.inject.Inject
    Test3 test3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //使用组件进行构造，注入
        DaggerMainActivityComponent.builder().build().inject(this);
        test3.main(this);
    }
}
