package com.cafe24.springex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//콘솔 프로그래밍
/**
 * 얘 자체가 Configuration 파일이 되는 거다
 */
//@SpringBootConfiguration
//@EnableAutoConfiguration // 스캐닝 해야 하니까.
//@ComponentScan("com.cafe24.springex.controller")
@SpringBootApplication//위의 세개와 같음
public class BootApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
