import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ClasaService {
    private static ClasaService clasaService;

    public static ClasaService getClasaService() {
        if(clasaService == null){
            clasaService = new ClasaService();
        }
        return clasaService;
    }

    private ClasaService() {
    }

    public List<Elev> showElevs(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare = "from Clasa c where c.numeClasa like : nume";
        Query query = session.createQuery(intrebare);
        query.setParameter("nume","%" + name + "%");
        List<Elev> elevi = query.list();
        return elevi;
    }

    public List<Clasa> showClassByElevName (String nameElev){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare = "select e.clasaDeCareApartine.numeClasa from Elev e where e.numeElev like : nume ";
        Query query = session.createQuery(intrebare);
        query.setParameter("nume","%" + nameElev + "%");
        List clasa = query.list();
        return clasa;
    }

}
