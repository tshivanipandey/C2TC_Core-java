package mypro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {

	String os() default "samsung";// u can declare attributes
	//String os(); u can try without default value 
	int version() default 7;
}
