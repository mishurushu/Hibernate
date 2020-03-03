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


    @ManyToOne
    @JoinColumn(name = "idElev")
    public Elev elevulCuNota;

    @ManyToOne
    @JoinColumn(name = "idPredare")
    public ProfesoriMaterie profesoriMaterie;

   /* @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", elevulCuNota=" + elevulCuNota.numeElev +
                ", profesoriMaterie=" + profesoriMaterie.idPredare +
                '}';
    }*/
}
