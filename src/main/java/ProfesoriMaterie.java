import javax.persistence.*;

@Entity
@Table(name = "profesorimaterie")

public class ProfesoriMaterie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPredare")
    public int idPredare;

    @Column(name = "idProfesor")
    public int idProfesor;

    @Column(name = "idMaterie")
    public int idMaterie;

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void setIdMaterie(int idMaterie) {
        this.idMaterie = idMaterie;
    }

    @Override
    public String toString() {
        return "ProfesoriMaterie{" +
                "idPredare=" + idPredare +
                ", idProfesor=" + idProfesor +
                ", idMaterie=" + idMaterie +
                '}';
    }
}
