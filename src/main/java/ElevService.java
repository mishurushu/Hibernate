import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ElevService {
    private static ElevService elevService;

    private ElevService() {
    }

    public static ElevService getElevService() {
        if(elevService == null){
            elevService = new ElevService();
        }
        return elevService;
    }

    public List<Elev> searchByName(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare = "from Elev where numeElev like :numeCautat ";
        Query query = session.createQuery(intrebare);
        query.setParameter("numeCautat","%" + name + "%");
        List elev = query.list();
        return elev;
    }

    public List<Elev> getElevsByClass(String nameClass){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare1 = "from Elev e where " + "  clasaDeCareApartine.numeClasa = :numeClasa ";
        Query query = session.createQuery(intrebare1);
        query.setParameter("numeClasa", nameClass);
        List lista2 = query.list();
        return lista2;
    }

    public ArrayList<Object> searchForPremium(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare =
                "select  avg(n.valoareNota) as medieNote, e.numeElev, n.profesoriMaterieExacta.materieExacta.numeMaterie " +
                        "from Elev e" +
                        " join Nota n on e.idElev = n.elevulCuNota.idElev " +
                        "group by e.numeElev, n.profesoriMaterieExacta.materieExacta.numeMaterie " ;
        // daca scriu fara join imi da null pointer
        Query query = session.createQuery(intrebare);
        ArrayList<Object> lista = (ArrayList<Object>) query.list();
        return lista;
    }



}
