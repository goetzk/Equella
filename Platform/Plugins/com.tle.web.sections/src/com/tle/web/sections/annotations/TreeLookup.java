package com.tle.web.sections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TreeLookup
{
	String key() default "";

	boolean mandatory() default true;
}