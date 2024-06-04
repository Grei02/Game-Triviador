package cr.ac.una.triviador.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerHelper {

    private static final EntityManagerHelper SINGLENTON = new EntityManagerHelper();
    private static EntityManagerFactory emf;
    private static EntityManager em;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("Triviador");
            em = emf.createEntityManager();
        } catch (ExceptionInInitializerError e) {
            throw e;
        }
    }
    
    public static EntityManagerHelper getInstance() {

        return SINGLENTON;
    }

    public static EntityManager getManager() {
        if (em == null) {
            emf = Persistence.createEntityManagerFactory("Triviador");
            em = emf.createEntityManager();
        }
        return em;
    }
}
