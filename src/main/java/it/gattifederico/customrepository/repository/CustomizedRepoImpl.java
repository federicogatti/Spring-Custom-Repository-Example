package it.gattifederico.customrepository.repository;

import it.gattifederico.customrepository.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


class CustomizedRepoImpl implements CustomizedRepo {

    private MongoTemplate mongoTemplate;

    @Autowired
    CustomizedRepoImpl(final MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public <S extends Person> S save(S entity) {
        entity.setName("pppp");
        mongoTemplate.save(entity);
        return entity;
    }

    public Person someCustomMethod() {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").regex("^f", "i"));
        return mongoTemplate.find(query, Person.class, "person").get(1);
    }

    @Override
    public void someVoidMethod() {
        System.out.println("Implement method here");
    }
}
