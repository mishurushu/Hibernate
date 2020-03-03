import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        Elev elev = session.find(Elev.class , 2);
        Elev altElev = session.find(Elev.class, 5);


        System.out.println(elev.toString());
        System.out.println(altElev.toString());

        Elev elevNou = new Elev();
        elevNou.setIdClasa(2);
        elevNou.setNumeElev("PetreMArin");

       Elev elevDeSters = session.find(Elev.class, 34);
        //session.delete(elevDeSters);

       // session.save(elevNou);


        Clasa clasa = session.find(Clasa.class, 2);
        Clasa altaClasa = session.find(Clasa.class , 3);

        System.out.println(clasa.toString());
        System.out.println(altaClasa.toString());

        Clasa clasaAdaugata = new Clasa();
        clasaAdaugata.setNumeClasa("Clasa9");

        //session.save(clasaAdaugata);

        Clasa clasaNumarulCinci = session.find(Clasa.class, 10);
        //session.delete(clasaNumarulCinci);

        Materie materie = session.find(Materie.class, 2);

        Materie materieAdaugata = new Materie();
        materieAdaugata.setNumeMaterie("Injughiat oameni");

        //session.save(materieAdaugata);

        Nota nota = session.find(Nota.class ,2);
        Nota altaNota = session.find(Nota.class, 3);

        System.out.println(nota);
        System.out.println(altaNota);

        Nota notaAdaugata = new Nota();
        notaAdaugata.setIdElev(13);
        notaAdaugata.setIdPredare(7);
        notaAdaugata.setValoareNota(10);

        //session.save(notaAdaugata);

        Profesor profesor = session.find(Profesor.class , 1);

        Profesor profesorAdaugat = new Profesor();
        profesorAdaugat.setNumeProfesor("Penes Curcanul");
        // session.save(profesorAdaugat);

        Profesor altProfesor = session.find(Profesor.class, 6);
        System.out.println(altProfesor);

        ProfesoriMaterie profesoriMaterie = session.find(ProfesoriMaterie.class, 4);
        System.out.println(profesoriMaterie);

        transaction.commit();


        HibernateUtil.shutdown();

    }
}