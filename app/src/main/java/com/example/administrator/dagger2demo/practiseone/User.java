package com.example.administrator.dagger2demo.practiseone;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 构造函数被 @Inject 标记的 依赖类
 */

public class User {

    private String mName = "jack chen";
    private int mAge = 40;


    //    /**
//     * 这样写法报错信息如下：
//     * E:\Git\PGit\Dagger2Demo\app\src\main\java\com\example\administrator\dagger2demo\UserComponent.java:8: 错误: java.lang.String cannot be provided without an @Inject constructor or from an @Provides-annotated method.
//     void inject(MainActivity mMainActivity);
//     ^
//     com.example.administrator.dagger2demo.practiseone.MainActivity.mUser
//     [injected field of type: com.example.administrator.dagger2demo.practiseone.User mUser]
//     com.example.administrator.dagger2demo.practiseone.User.<init>(java.lang.String mName, int mAge)
//     [parameter: java.lang.String mName]
//     1 个错误

    // TODO: 2018/4/27 0027  思考 @inject 标注在有参数的构造函数为什么报错，什么情况下不报错
//     * @param mName
//     * @param mAge
//     */
//    @Inject
//    public User(String mName, int mAge) {
//        this.mName = mName;
//        this.mAge = mAge;
//    }
    @Inject
    public User() {
    }


    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        this.mAge = mAge;
    }
}
