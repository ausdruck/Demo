package com.baidu.mapframework.nirvana.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface UrlEncode {

    public enum UrlEncodeType {
        NONE,
        JAVA,
        ENGINE
    }

    UrlEncodeType value() default UrlEncodeType.JAVA;
}
