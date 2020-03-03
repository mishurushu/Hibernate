import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "materii")

public class Materie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaterie")
    public int idMaterie;

    @Column(name = "numeMaterie")
    public String numeMaterie;

    @OneToMany(mappedBy = "idMaterie")
    List<Materie> materii;

    @Override
    public String toString() {
        return "Materie{" +
                "idMaterie=" + idMaterie +
                ", numeMaterie='" + numeMaterie + '\'' +
                ", materii=" + materii +
                '}';
    }
}
