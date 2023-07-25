package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * @SpringBooatApplication은 여러 어노테이션을 포함하고 있는 메타 어노테이션이다.
 * 
 * + @SpringBootConfiguration:	(ex01, ex02)	-> Test일 때 자동으로 찾는다.
 * + @ComponentScan:			(ex03)			-> ex04 패키지 하부를 스캐닝 한다.
 * + @EnableAutoConfiguration:
 * 		1. MVC, AOP, Security, JPA 등을 자동(default->꼭 미세설정을 참고하게 한다) 설정한다.
 * 		2. 발견된 Starter Dependency(Library) 기반으로 설정: 따라서 불필요한 라이브러리는 미리 제거
 */
@SpringBootConfiguration
public class MyApplication {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
	}
}
