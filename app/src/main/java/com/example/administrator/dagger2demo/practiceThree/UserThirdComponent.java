package com.example.administrator.dagger2demo.practiceThree;

import dagger.Component;

@Component(modules = UserThirdModule.class)
public interface UserThirdComponent {
    void injectToThirdActivity(ThirdActivity mThirdActivity);
}
