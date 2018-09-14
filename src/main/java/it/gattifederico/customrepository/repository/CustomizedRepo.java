package it.gattifederico.customrepository.repository;

import it.gattifederico.customrepository.model.Person;


/**
 * The interface Customized repo.
 */
public interface CustomizedRepo extends CustomizedSave<Person> {

    /**
     * Some custom method person.
     *
     * @return the person
     */
    Person someCustomMethod();

    /**
     * Some void method.
     */
    void someVoidMethod();

}
