package it.gattifederico.customrepository.configuration;

import it.gattifederico.customrepository.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * The type Repository config.
 */
@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    /**
     * Public method.
     *
     * @param config the RepositoryRestConfiguration.
     */
    @Override
    public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
        config.exposeIdsFor(
                Person.class
        );
    }
}