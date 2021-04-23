package ma.springboot.jpa.pagination.service;

import ma.springboot.jpa.pagination.constant.PageSize;
import ma.springboot.jpa.pagination.domain.DomainElement1;
import ma.springboot.jpa.pagination.entity.EntityElement1;
import ma.springboot.jpa.pagination.repository.RepoElement1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SrvcElement1 {
    private RepoElement1 repoElement1;

    @Autowired
    public SrvcElement1(RepoElement1 repoElement1){
        this.repoElement1 = repoElement1;
    }

    public List<DomainElement1> findAll(int page){
        Pageable pageable = PageRequest.of(page, PageSize.element1PageSize);
        Function<EntityElement1, DomainElement1> convertEntityToDomain = e -> new DomainElement1(e.getAttr1(), e.getAttr2(), e.getAttr3());
        return repoElement1.findAll(pageable).map(convertEntityToDomain).stream().collect(Collectors.toList());
    }
}
