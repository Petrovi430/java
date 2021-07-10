package Task3;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@Data
public class Subject {

    @GeneratedValue
    @Id
    private Long id;

}
