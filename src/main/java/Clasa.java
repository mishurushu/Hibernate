import javax.persistence.*;

@Entity
@Table(name = "clasa")

public class Clasa {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idClasa")
    public int idClasa;

    @Column(name = "numeClasa", length = 10)
    public String numeClasa;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }

    public void setNumeClasa(String numeClasa) {
        this.numeClasa = numeClasa;
    }
}
