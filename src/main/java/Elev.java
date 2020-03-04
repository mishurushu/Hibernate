import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "elevi")

public class Elev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idElev")
    public int idElev;

    @Column(name = "numeElev")
    public String numeElev;

    @ManyToOne
    @JoinColumn(name = "idClasa")
    public Clasa clasaDeCareApartine;

    @OneToMany(mappedBy = "elevulCuNota")
    List<Nota> notaPrimita;

}
