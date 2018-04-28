package com.example.administrator.dagger2demo.practicetwo;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: liguoying
 * Time: 2018/4/27 0027 19:07
 */

@Module
public class UserTwoModule {

    /**
     * 两个方法都存在的话，报错信息如下：
     * E:\Git\PGit\Dagger2Demo\app\src\main\java\com\example\administrator\dagger2demo\practicetwo\UserTwoComponent.java:7: 错误: com.example.administrator.dagger2demo.practicetwo.UserTwo is bound multiple times:
     void injectToSecondActivity(SecondActivity mSecondActivity);
     ^
     @Provides com.example.administrator.dagger2demo.practicetwo.UserTwo com.example.administrator.dagger2demo.practicetwo.UserTwoModule.provideUserTwo()
     @Provides com.example.administrator.dagger2demo.practicetwo.UserTwo com.example.administrator.dagger2demo.practicetwo.UserTwoModule.provideUserTwoWithoutParams()
     1 个错误
     :app:compil
     * @return
     */
    // TODO: 2018/4/28 0028 思考： 难道 module 方法不能提供两个返回值为同一个类的方法

    @Provides
    UserTwo provideUserTwo(){
        return new UserTwo("男",1243);
    }

//    @Provides
//    UserTwo provideUserTwoWithoutParams(){
//        return new UserTwo();
//    }


}
