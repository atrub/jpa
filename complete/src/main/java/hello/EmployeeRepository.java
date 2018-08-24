package hello;

import java.util.List;
import hello.domain.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findByLastName(@Param("name") String name);
	List<Employee> findByFirstName(@Param("name") String name);
}
