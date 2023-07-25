package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 1. 스프링 애플러케이션 부트스트래핑 역할: Bootstrap Class. 거의 main만 있다.
 * 2. 설정 클래스 역할: Configuration Class
 * 
 */
@SpringBootApplication
public class HelloWorldApplication {
	
	public static void main(String[] args) {
		/*
		 * SpringApplication.run(...) 안에서 일어나는 일(Bootstrap)
		 * 
		 * 1. 애플리케이션 컨텍스트(ApplicationContext, Spring Container) 생성
		 * 2. 만약, 웹 애플리케이션이라면 웹 어플리케이션의 타입(Spring MVC, Reactive)
		 * 3. 어노테이션 스캐닝(auto) + Configuration Class를 통한 
		 *    빈 생성/등록/와이어링 작업
		 * 4. 만약, Spring MVC이라면
		 * 		1. Auto Configuration
		 * 		2. 내장(embed) 서버(TomcatEmbeddedServiceServletContainer) 인스턴스 생성
		 * 		3. 서버 인스턴스에 웹 애플리케이션 배포
		 * 		4. 서버 인스턴스 실행
		 * 		5. ApplicationRunner 인터페이스를 구현한 빈을 ApplicationContext에서 찾는다.
		 */
//		ConfigurableApplicationContext ac = null;
//		
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			 ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}
		
		// try ~ with ~ resources 구문
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
	}
}
