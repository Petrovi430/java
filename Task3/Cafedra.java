package Task3;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cafedra")
@Data
public class Cafedra {
    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String name;

    @OneToMany
    private List<Group> groups;

    @OneToMany
    private List<Teacher> teachers;

}
