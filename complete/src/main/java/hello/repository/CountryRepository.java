package hello.repository;

import hello.domain.Country;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

/**
 * Spring Data  repository for the Country entity.
 */

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
    List<Country> findByLastName(@Param("name") String name);
    List<Country> findByFirstName(@Param("name") String name);
}
