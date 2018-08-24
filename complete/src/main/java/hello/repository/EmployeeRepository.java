package hello.repository;

import hello.domain.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Spring Data  repository for the Employee entity.
 */

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByLastName(@Param("name") String name);
    List<Employee> findByFirstName(@Param("name") String name);
}
