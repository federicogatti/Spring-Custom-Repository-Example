package it.gattifederico.customrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The type Custom repository application.
 */
@SpringBootApplication
//@EnableScheduling
public class CustomRepositoryApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(CustomRepositoryApplication.class, args);
	}
}
