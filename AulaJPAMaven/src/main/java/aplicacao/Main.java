package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        /*
        //cadastrar o objeto
        Pessoa pessoa1 = new Pessoa(null, "Pedro", "pedro@gmail.com");
        Pessoa pessoa2 = new Pessoa(null, "Augusto", "augusto@gmail.com");
        Pessoa pessoa3 = new Pessoa(null, "Paola", "paola@gmail.com");
        em.getTransaction().begin();
        em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(pessoa3);
        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println(pessoa1 + "\n" + pessoa2 + "\n" + pessoa3);

        //consultar o objeto
        Pessoa p = em.find(Pessoa.class, 3);
        em.close();
        emf.close();

        System.out.println(p);

        //remover um objeto
        Pessoa p = em.find(Pessoa.class, 3);
        em.getTransaction().begin(); //usar sempre que a transação não for uma consulta (insert, delete, update)
        em.remove(p);
        em.getTransaction().commit(); //usar sempre que a transação não for uma consulta (insert, delete, update)
        em.close();
        emf.close();
         */
    }
}
