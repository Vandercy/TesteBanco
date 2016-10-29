package testebnc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgramaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("minha-persistence-unit");
	
		EntityManager  em = emf.createEntityManager();
		
		List<MinhaEntidade> lista = em.createQuery("From MinhaEntidade", MinhaEntidade.class).getResultList();
		
		for (MinhaEntidade objeto : lista) {
			System.out.println("Objeto no banco: " + objeto.getNumero()+","+ objeto.getTexto());
		}
		MinhaEntidade objeto = new MinhaEntidade();
		objeto.setNumero(4532);
		objeto.setTexto("Texto zwy");
		
		em.getTransaction().begin();
		em.persist(objeto);
		em.getTransaction().commit();
		
		em.close();
		emf.close();		
	}

}
