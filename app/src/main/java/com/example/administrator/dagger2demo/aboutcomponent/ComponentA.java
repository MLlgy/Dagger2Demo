package com.example.administrator.dagger2demo.aboutcomponent;


import dagger.Component;

@Component(modules = UseModule.class)
public interface ComponentA {
    SubComponentA plus(ModuleSubComponentA moduleSubComponentA);
    SubComponentB plus(ModuleSubComponentB moduleSubComponentB);
}
