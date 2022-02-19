package mypro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {

	String os1() default "Window";
	int version1() default 11;
}
