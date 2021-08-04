package course.operation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="webSites", path="webSites")
public interface WebSiteRepository extends PagingAndSortingRepository<WebSite, Long>{


}
