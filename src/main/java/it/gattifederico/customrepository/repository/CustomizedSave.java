package it.gattifederico.customrepository.repository;


import org.springframework.data.repository.NoRepositoryBean;

/**
 * The interface Customized save.
 *
 * @param <T> the type parameter
 */
@NoRepositoryBean
public interface CustomizedSave<T> {

    /**
     * Save s.
     *
     * @param <S>    the type parameter
     * @param entity the entity
     * @return the s
     */
    <S extends T> S save(S entity);
}
