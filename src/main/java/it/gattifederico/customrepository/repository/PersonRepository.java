package it.gattifederico.customrepository.repository;

import it.gattifederico.customrepository.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The interface Person repository.
 */
public interface PersonRepository extends MongoRepository<Person, String>, CustomizedRepo {
}
