package in.himtech.java.datarestdemo;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * This is a demo Spring Data Rest Project 
 */
@SpringBootApplication
public class DatarestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatarestdemoApplication.class, args);
	}

	@Bean
	@Primary
	public Validator getValidator() {
		return new LocalValidatorFactoryBean();
	}
}
