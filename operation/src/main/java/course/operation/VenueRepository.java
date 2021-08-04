package course.operation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="venues", path="venues")
public interface VenueRepository extends PagingAndSortingRepository<Venue, Long>{


}
