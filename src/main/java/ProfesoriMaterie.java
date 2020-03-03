import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesorimaterie")

public class ProfesoriMaterie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPredare")
    public int idPredare;

    @ManyToOne
    @JoinColumn(name = "idProfesor")
    public Profesor profesorDeLaClasa;
}
/*
    @ManyToOne
    @JoinColumn(name = "idMaterie")
    public Materie materie;
}*/

  /*  @OneToMany(mappedBy = "")
    List<Nota> notePrimite;*/


   /* @Override
    public String toString() {
        return "ProfesoriMaterie{" +
                "idPredare=" + idPredare +
                ", profesorDeLaClasa=" + profesorDeLaClasa.numeProfesor +
                ", materie=" + materie.numeMaterie +
                ", notePrimite=" + notePrimite +
                '}';
    }
}*/
