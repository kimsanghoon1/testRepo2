package course.operation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="instructors", path="instructors")
public interface InstructorRepository extends PagingAndSortingRepository<Instructor, Long>{


}
