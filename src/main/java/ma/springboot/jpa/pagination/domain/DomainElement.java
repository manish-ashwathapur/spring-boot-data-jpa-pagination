package ma.springboot.jpa.pagination.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DomainElement {
    private List<DomainElement1> element1;
    private List<DomainElement2> element2;
    private List<DomainElement3> element3;
}
