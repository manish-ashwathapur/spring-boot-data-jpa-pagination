package ma.springboot.jpa.pagination.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELEMENT3")
@Getter
@Setter
@NoArgsConstructor
public class EntityElement3 {
    @Id
    @Column(name = "ATTR8")
    private long attr8;

    @Column(name = "ATTR9")
    private long attr9;
}
