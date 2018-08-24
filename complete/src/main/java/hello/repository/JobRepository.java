package hello.repository;

import hello.domain.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;


/**
 * Spring Data  repository for the Job entity.
 */
@SuppressWarnings("unused")
@RepositoryRestResource(collectionResourceRel = "job", path = "job")
public interface JobRepository extends PagingAndSortingRepository<Job, Long> {

/*    @Query(value = "select distinct job from Job job left join fetch job.tasks",
        countQuery = "select count(distinct job) from Job job")
    Page<Job> findAllWithEagerRelationships(Pageable pageable);
*/

    @Query(value = "select distinct job from Job job left join fetch job.tasks")
    List<Job> findAllWithEagerRelationships();

    @Query("select job from Job job left join fetch job.tasks where job.id =:id")
    Optional<Job> findOneWithEagerRelationships(@Param("id") Long id);

}
