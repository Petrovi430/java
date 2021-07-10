package Task3;

import Task3.Facultity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "university")
@Data  @EqualsAndHashCode
public class University {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String name;

    @OneToMany
    private List<Facultity> faculteties;

    @OneToMany
    private List<Subject> subjects;

}
