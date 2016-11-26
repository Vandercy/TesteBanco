package br.umc.iod.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAO {
	
	private static final Class User = null;
	EntityManagerFactory emf;
	EntityManager em;
	
	public void open(){
		this.emf = Persistence.createEntityManagerFactory("minha-persistence-unit");
		this.em = emf.createEntityManager();
	}
	
	public void close(){
		
		this.em.close();
		this.emf.close();
	}
	
	public void salvar(User user){
//		MinhaEntidade entidade = new MinhaEntidade();
//		entidade.setNumero(numero);
//		entidade.setTexto(texto);
		open();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		close();
	}
	
	public void remover(User user){
		open();
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		close();
	}
	
	public List<User> listar(){
		
		open();
		em.getTransaction().begin();
		List<User> lista = em.createQuery("From User", User.class).getResultList();
		close();
		return lista;
		
	}
	
	public User consultar (Long id){
		open();
		em.getTransaction().begin();
		User user = em.find(User.class, id);
		close();
		return user;
	}

}
