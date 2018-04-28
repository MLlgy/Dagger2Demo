package com.example.administrator.dagger2demo.practiceThree;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Creater: liguoying
 * Time: 2018/4/28 0028 15:25
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface UserThirdQualifier {
    String value() default "";
}
