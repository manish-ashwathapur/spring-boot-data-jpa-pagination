package ma.springboot.jpa.pagination.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class DomainElement3 {
    private long attr8;
    private long attr9;

    @SneakyThrows
    public String toString(){
        return new ObjectMapper().writeValueAsString(this);
    }
}
