package ca.evanepio.boot.quotes.Quoter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class QuoterApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoterApplication.class, args);
	}

}
