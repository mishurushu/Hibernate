import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clasa")

public class Clasa {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idClasa")
    public int idClasa;

    @Column(name = "numeClasa", length = 10)
    public String numeClasa;

    @OneToMany(mappedBy = "clasaDeCareApartine")
    public List<Elev> listaElevi;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                ", listaElevi=" + listaElevi +
                '}';
    }
}
