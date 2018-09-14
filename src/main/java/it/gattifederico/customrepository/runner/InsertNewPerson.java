package it.gattifederico.customrepository.runner;


import it.gattifederico.customrepository.model.Person;
import it.gattifederico.customrepository.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

/**
 * The type Insert new person.
 */
@ComponentScan("it.gattifederico.customrepository")
public class InsertNewPerson implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("Insert new Person");
        Person person = new Person();
        person.setName("Max");
        person.setSurname("Power");
        this.personRepository.save(person);
    }
}
