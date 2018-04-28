package com.example.administrator.dagger2demo.practicetwo;

import dagger.Component;

@Component(modules = UserTwoModule.class)
public interface UserTwoComponent {
    void injectToSecondActivity(SecondActivity mSecondActivity);
}
