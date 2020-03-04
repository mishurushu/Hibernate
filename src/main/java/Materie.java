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

    @OneToMany(mappedBy = "materieExacta")
    List<ProfesoriMaterie> profesoriMaterieList;

}
