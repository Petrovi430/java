package Task3;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
@Data
public class Teacher implements Person {

    @Id
    @GeneratedValue
    private Long id;

    @Basic private String name;

    @OneToMany
    private List<Subject> subjects;

}
