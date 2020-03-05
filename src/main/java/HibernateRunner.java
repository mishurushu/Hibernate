import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

      /*  Elev elev = session.find(Elev.class , 2);
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
        System.out.println(profesoriMaterie);*/

       /* Elev elevDeCautat = session.find(Elev.class, 5);

        System.out.println(elevDeCautat);

        Nota notaDeCautat = session.find(Nota.class, 3);

        System.out.println(notaDeCautat);
*/
        /*Elev elevCautat = session.find(Elev.class, 10);
        System.out.println(elevCautat);
        Nota notaDeCautat = session.find(Nota.class, 5);
        System.out.println(notaDeCautat);

*/

       /* Query query = session.createQuery("from Elev");
        List<Elev> elevi = query.list();
        for (Elev e : elevi){
            System.out.println(e);
        }

        query = session.createQuery("from Elev e where e.idElev = 10" + " group by e.notaPrimita");
         List results = query.list();
        System.out.println(results);



*/



      /* String intrebare = "From Elev";
       Query query = session.createQuery(intrebare);
       List lista = query.list();
        System.out.println(lista);

        String intrebare1 = "Select e.numeElev from Elev e";
        query=session.createQuery(intrebare1);
        List lista1 = query.list();
        System.out.println(lista1);

        String intrebare2 = "Select e.idElev from Elev e where idElev = 3";
        query = session.createQuery(intrebare2);
        List lista2 = query.list();
        System.out.println(lista2);

        String intrebare3 = "from ProfesoriMaterie pm " + "Order by pm.idPredare";
        query = session.createQuery(intrebare3);
        List lista3 = query.list();
        System.out.println(lista3);
*/
        String intrebareaMea = "from Elev where idElev = 10";
        Query query = session.createQuery(intrebareaMea);
        List listaMea = query.list();
        System.out.println(listaMea);

        String intrebareMea2 = "select n.idNota from Nota n where n.elevulCuNota = 10 ";
        query = session.createQuery(intrebareMea2);



        HibernateUtil.shutdown();
    }
}