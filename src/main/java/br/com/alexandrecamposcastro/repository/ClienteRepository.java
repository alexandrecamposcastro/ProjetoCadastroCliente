package br.com.alexandrecamposcastro.repository;

import br.com.alexandrecamposcastro.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ClienteRepository {

    private EntityManagerFactory emf;
    private EntityManager em;

    public ClienteRepository() {
        this.emf = Persistence.createEntityManagerFactory("projetoPU");
        this.em = emf.createEntityManager();
    }

    public void salvar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }
    
    public void fechar() {
        em.close();
        emf.close();
    }
}