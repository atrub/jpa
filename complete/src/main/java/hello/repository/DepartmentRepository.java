package hello.repository;

import hello.domain.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
/**
 * Spring Data  repository for the Department entity.
 */

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {
    List<Department> findByLastName(@Param("name") String name);
    List<Department> findByFirstName(@Param("name") String name);
}
