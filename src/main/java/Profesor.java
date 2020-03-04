import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesori")

public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfesor")
    public int idProfesor;

    @Column(name = "numeProfesor")
    public String numeProfesor;

    @OneToMany(mappedBy = "profesorExact")
    List<ProfesoriMaterie> profesoriMaterieList;

}
