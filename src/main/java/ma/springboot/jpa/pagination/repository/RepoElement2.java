package ma.springboot.jpa.pagination.repository;

import ma.springboot.jpa.pagination.entity.EntityElement2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoElement2 extends PagingAndSortingRepository<EntityElement2, Long> {
    Page<EntityElement2> findAll(Pageable pageable);
}
