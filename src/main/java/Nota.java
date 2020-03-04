import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "note")

public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNota")
    public int idNota;

    @Column(name = "valoareNota")
    public int valoareNota;


    @ManyToOne
    @JoinColumn(name = "idElev")
    public Elev elevulCuNota;

    @ManyToOne
    @JoinColumn(name = "idPredare")
    public ProfesoriMaterie profesoriMaterieExacta;


}
