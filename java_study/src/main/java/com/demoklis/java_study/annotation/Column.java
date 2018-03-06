package com.demoklis.java_study.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
	public String name() default "fieldName";
	public String setFuncName() default "getField";
	public String getFuncName() default "getField";
	public boolean defaultDBValue() default false;
}
