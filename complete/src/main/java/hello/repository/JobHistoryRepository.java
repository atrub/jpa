package hello.repository;

import hello.domain.JobHistory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
/**
 * Spring Data  repository for the JobHistory entity.
 */

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface JobHistoryRepository extends PagingAndSortingRepository<JobHistory, Long> {

}
