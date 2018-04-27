package com.example.administrator.dagger2demo.practiseone;

import dagger.Component;

@Component
public interface UserComponent {

    void inject(MainActivity mMainActivity);
}
