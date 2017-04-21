package social_light.entity.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "test_table")
public class TestTable {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name="test_table_id_seq", sequenceName="test_table_id_seq",  allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="test_table_id_seq")
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;

    @Column(name = "data", columnDefinition = "VARCHAR(50)")
    private String data;

    public TestTable(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
