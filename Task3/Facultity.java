package Task3;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "facultity")
@Data
public class Facultity {
    @Id
    @GeneratedValue
    private Long id;


    @Basic
    private String name;


    @OneToMany
    private List<Cafedra> cafedras;

}
