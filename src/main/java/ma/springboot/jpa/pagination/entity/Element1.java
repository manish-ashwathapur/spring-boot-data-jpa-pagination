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
@Table(name = "ELEMENT1")
@Getter
@Setter
@NoArgsConstructor
public class Element1 {
    @Id
    @Column(name = "ATTR1")
    private long attr1;

    @Column(name = "ATT2")
    private String attr2;

    @Column(name = "ATTR3")
    private Date attr3;
}
