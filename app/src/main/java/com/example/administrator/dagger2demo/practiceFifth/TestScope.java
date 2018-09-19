package com.example.administrator.dagger2demo.practiceFifth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 16:32
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface TestScope {
}
