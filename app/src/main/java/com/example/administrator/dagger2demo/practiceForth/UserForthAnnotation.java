package com.example.administrator.dagger2demo.practiceForth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Creater: liguoying
 * Time: 2018/4/28 0028 17:02
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface UserForthAnnotation {
    String value() default "";
}
