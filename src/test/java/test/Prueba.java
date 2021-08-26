package test;

import entities.Persona;
import entities.reacciones.LlamarPolicia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Prueba {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setReaccionIncidente(new LlamarPolicia());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");

        EntityManager em = emf.createEntityManager();

        if(!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        em.persist(p);

        em.getTransaction().commit();

        Persona p2 = em.find(Persona.class, 1);

        System.out.println(p2.getReaccionIncidente());

        em.close();
        emf.close();

        System.out.println("Finalizado");
    }
}
