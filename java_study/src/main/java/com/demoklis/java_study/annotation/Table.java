package com.demoklis.java_study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Table {

	public String tableName() default "className";
}
