import javax.persistence.*;

@Entity
@Table(name = "note")

public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNota")
    public int idNota;

    @Column(name = "valoareNota")
    public int valoareNota;

    @Column(name = "idElev")
    public int idElev;

    @Column(name = "idPredare")
    public int idPredare;

    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + idElev +
                ", idPredare=" + idPredare +
                '}';
    }

    public void setValoareNota(int valoareNota) {
        this.valoareNota = valoareNota;
    }

    public void setIdElev(int idElev) {
        this.idElev = idElev;
    }

    public void setIdPredare(int idPredare) {
        this.idPredare = idPredare;
    }
}
