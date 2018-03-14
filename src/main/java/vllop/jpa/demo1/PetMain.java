package vllop.jpa.demo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PetMain {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Demo1PU");
        EntityManager em = factory.createEntityManager();
        factory.close();


    }
}
