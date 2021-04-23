package ma.springboot.jpa.pagination.service;

import ma.springboot.jpa.pagination.constant.PageSize;
import ma.springboot.jpa.pagination.domain.DomainElement3;
import ma.springboot.jpa.pagination.entity.EntityElement3;
import ma.springboot.jpa.pagination.repository.RepoElement3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SrvcElement3 {
    private RepoElement3 repoElement3;

    @Autowired
    public SrvcElement3(RepoElement3 repoElement3){
        this.repoElement3 = repoElement3;
    }

    public List<DomainElement3> findAll(int page){
        Pageable pageable = PageRequest.of(page, PageSize.element3PageSize);
        Function<EntityElement3, DomainElement3> convertEntityToDomain = e -> new DomainElement3(e.getAttr8(), e.getAttr9());
        return repoElement3.findAll(pageable).map(convertEntityToDomain).stream().collect(Collectors.toList());
    }
}
