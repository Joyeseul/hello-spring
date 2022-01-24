package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		/* run 할 시, localhost:8080 에 가면 Whitelabel error page 가 뜬다.
		* 그러면 성공! */
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
