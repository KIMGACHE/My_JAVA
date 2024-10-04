package C35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 애노테이션의 유지기간을 프로그램 동작중에만 실행하도록 설정한다는 의미

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface CustomAnnotation {
	// 추상 메서드를 애노테이션의 대상으로 삼는다는 의미
	String value() default "";
	int number() default 0;
}
