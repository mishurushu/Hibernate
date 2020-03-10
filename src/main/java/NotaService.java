import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class NotaService {
   private static NotaService notaService;

    public static NotaService getNotaService() {
        if(notaService == null){
            notaService = new NotaService();
        }
        return notaService;
    }

    private NotaService() {
    }

    public List<Nota> findNotaByElevName (String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare = " from Nota n where n.elevulCuNota.numeElev like : nume";
        Query query = session.createQuery(intrebare);
        query.setParameter("nume","%" + name + "%");
        List<Nota> notas = query.list();
        return notas;

    }

}
