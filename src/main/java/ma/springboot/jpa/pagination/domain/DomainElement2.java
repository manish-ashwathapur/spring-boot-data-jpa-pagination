package ma.springboot.jpa.pagination.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class DomainElement2 {
    private long attr4;
    private String attr5;
    private Date attr6;
    private long attr7;

    @SneakyThrows
    public String toString(){
        return new ObjectMapper().writeValueAsString(this);
    }
}
