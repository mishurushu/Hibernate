import javax.persistence.*;

@Entity
@Table(name = "elevi")

public class Elev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idElev")
    public int idElev;

    @Column(name = "numeElev")
    public String numeElev;

    @Column(name = "idClasa")
    public int idClasa;

    @Override
    public String toString() {
        return "Elev{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", idClasa=" + idClasa +
                '}';
    }

    public void setNumeElev(String numeElev) {
        this.numeElev = numeElev;
    }

    public void setIdClasa(int idClasa) {
        this.idClasa = idClasa;
    }
}
