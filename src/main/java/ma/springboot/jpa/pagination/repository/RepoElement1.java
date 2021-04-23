package ma.springboot.jpa.pagination.repository;

import ma.springboot.jpa.pagination.entity.EntityElement1;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoElement1 extends PagingAndSortingRepository<EntityElement1, Long> {
    Page<EntityElement1> findAll(Pageable pageable);
}
