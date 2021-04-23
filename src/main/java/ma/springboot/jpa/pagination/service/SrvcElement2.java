package ma.springboot.jpa.pagination.service;

import ma.springboot.jpa.pagination.constant.PageSize;
import ma.springboot.jpa.pagination.domain.DomainElement2;
import ma.springboot.jpa.pagination.entity.EntityElement2;
import ma.springboot.jpa.pagination.repository.RepoElement2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SrvcElement2 {
    private RepoElement2 repoElement2;

    @Autowired
    public SrvcElement2(RepoElement2 repoElement2){
        this.repoElement2 = repoElement2;
    }

    public List<DomainElement2> findAll(int page){
        Pageable pageable = PageRequest.of(page, PageSize.element2PageSize);
        Function<EntityElement2, DomainElement2> convertEntityToDomain = e -> new DomainElement2(e.getAttr4(), e.getAttr5(), e.getAttr6(), e.getAttr7());
        return repoElement2.findAll(pageable).map(convertEntityToDomain).stream().collect(Collectors.toList());
    }
}
