package ma.springboot.jpa.pagination.repository;

import ma.springboot.jpa.pagination.entity.EntityElement3;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoElement3 extends PagingAndSortingRepository<EntityElement3, Long> {
    Page<EntityElement3> findAll(Pageable pageable);
}
