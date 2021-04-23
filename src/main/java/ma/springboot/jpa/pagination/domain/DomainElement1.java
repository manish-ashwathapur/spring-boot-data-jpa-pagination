package ma.springboot.jpa.pagination.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class DomainElement1 {
    private long attr1;
    private String attr2;
    private Date attr3;

    @SneakyThrows
    public String toString(){
        return new ObjectMapper().writeValueAsString(this);
    }
}
