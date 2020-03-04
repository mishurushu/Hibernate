import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesorimaterie")

public class ProfesoriMaterie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPredare")
    public int idPredare;

    @OneToMany(mappedBy = "profesoriMaterieExacta")
    List<Nota> note;

    @ManyToOne
    @JoinColumn(name = "idProfesor")
    public Profesor profesorExact;

    @ManyToOne
    @JoinColumn(name = "idMaterie")
    public Materie materieExacta;


}
