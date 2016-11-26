package br.umc.iod.jpa;

 

public class ProgramaTeste {

	public static void main(String[] args) {

		
		UserDAO mUser = new UserDAO();
		User u = new User();
	//	u.setId(1l);
		u.setCpf(00000l);
		u.setNome("Vanderci");
		
	 	mUser.salvar(u);
	for(User u2 :	mUser.listar()){
		System.out.println(u2.getNome());
		
	}
		 
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("minha-persistence-unit");
	
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
		emf.close();		*/
	}

}
