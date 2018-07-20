package com.example.administrator.dagger2demo.scopeDagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Creater: liguoying
 * Time: 2018/7/17 0017 12:58
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
