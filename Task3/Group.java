package Task3;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group")
@Data
public class Group extends Specialization {

    @GeneratedValue
    @Id
    private Long id;

    @Basic
    private String name;

    @OneToOne
    private Teacher curator;

    @OneToMany
    private List<Subject> subjects;

    @Override
    public void setCode(String code) {
        super.code = code;
    }
}
