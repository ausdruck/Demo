package com.baidu.navisdk.logic;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface CommandDeclare
{
  Class<? extends CommandBase> value();
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/navisdk/logic/CommandDeclare.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */