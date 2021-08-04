package course.operation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="추천시스템", path="추천시스템")
public interface 추천시스템Repository extends PagingAndSortingRepository<추천시스템, Long>{


}
