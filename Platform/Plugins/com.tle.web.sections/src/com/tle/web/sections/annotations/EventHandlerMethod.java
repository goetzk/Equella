package com.tle.web.sections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.tle.web.sections.events.SectionEvent;

@Retention(RetentionPolicy.RUNTIME)
public @interface EventHandlerMethod
{
	String name() default "";

	int priority() default SectionEvent.PRIORITY_EVENTS;

	/**
	 * Protect this event against Cross-Site Request Forgery (XSRF).
	 */
	boolean preventXsrf() default true;
}