package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @SpringBootApplication
 * 스프링 부트의 자동 설정, 스프링 빈 읽기와 생성을 모두 자동으로 설정
 * 위 코드가 있는 위치부터 설정을 읽어가기 떄문에 프로젝트의 최상단에 위치해야한다.
 */
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //SpringApplication.run() 함수를 쓰게되면서 내장 톰켓을 사용할 수 있게 됨.
    }
}
