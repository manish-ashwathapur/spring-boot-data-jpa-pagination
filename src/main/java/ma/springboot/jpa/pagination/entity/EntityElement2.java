package ma.springboot.jpa.pagination.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ELEMENT2")
@Getter
@Setter
@NoArgsConstructor
public class EntityElement2 {
    @Id
    @Column(name = "ATTR4")
    private long attr4;

    @Column(name = "ATTR5")
    private String attr5;

    @Column(name = "ATTR6")
    private Date attr6;

    @Column(name = "ATTR7")
    private long attr7;
}
