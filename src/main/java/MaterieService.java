import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class MaterieService {
    private static MaterieService materie;

    public static MaterieService getMaterie() {
        if (materie == null){
            materie = new MaterieService();
        }
        return materie;
    }

    private MaterieService() {
    }

    public List<Materie> showMaterieByName(String numeMaterie){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String intrebare = "from Materie m where m.numeMaterie like : nume ";
        Query query = session.createQuery(intrebare);
        query.setParameter("nume","%" + numeMaterie + "%");
        List<Materie> lista = query.list();
        return lista;
    }

}
