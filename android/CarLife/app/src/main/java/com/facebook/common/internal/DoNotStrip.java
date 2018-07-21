package com.facebook.common.internal;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface DoNotStrip {}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/facebook/common/internal/DoNotStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */