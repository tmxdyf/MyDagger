package com.cy.src.dagger;
@javax.inject.Singleton
//用这个标注标识是一个连接器
@dagger.Component()
public interface MainActivityComponent {
    //这个连接器要注入的对象。这个inject标注的意思是，我后面的参数对象里面有标注为@Inject的属性，这个标注的属性是需要这个连接器注入进来的。
    void inject(MainActivity activity);
}