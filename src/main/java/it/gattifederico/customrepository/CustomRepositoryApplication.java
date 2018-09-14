package it.gattifederico.customrepository;

import it.gattifederico.customrepository.runner.InsertNewPerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Custom repository application.
 */
@SpringBootApplication
public class CustomRepositoryApplication {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(final String[] args) {
		final Class<?>[] runner = new Class<?>[] {CustomRepositoryApplication.class, InsertNewPerson.class};
		SpringApplication.run(runner, args);
	}
}
