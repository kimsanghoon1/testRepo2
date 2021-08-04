package course.operation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="approvalSystems", path="approvalSystems")
public interface ApprovalSystemRepository extends PagingAndSortingRepository<ApprovalSystem, Long>{


}
