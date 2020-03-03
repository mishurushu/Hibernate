import javax.persistence.*;

@Entity
@Table(name = "materii")

public class Materie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaterie")
    public int idMaterie;

    @Column(name = "numeMaterie")
    public String numeMaterie;

    public void setNumeMaterie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    @Override
    public String toString() {
        return "Materie{" +
                "idMaterie='" + idMaterie + '\'' +
                ", numeMaterie='" + numeMaterie + '\'' +
                '}';
    }


}
