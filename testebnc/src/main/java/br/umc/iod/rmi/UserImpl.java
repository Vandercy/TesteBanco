package br.umc.iod.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import br.umc.iod.jpa.User;
import br.umc.iod.jpa.UserDAO;

public class UserImpl implements UserInterface {
      UserDAO dao = new UserDAO();
	
    public UserImpl() throws RemoteException {
		UnicastRemoteObject.exportObject(this,1099);	
	} 
    
	@Override
	public void remover(User user) {
	 dao.open();
	 dao.remover(user);
	 dao.close();
		
	}

	@Override
	public void salvar(User user) {
		 dao.open();
		 dao.salvar(user);
		 dao.close();
		
	}

	  

	@Override
	public User consultar(Long id) {		 
		return dao.consultar(id);
	}

	@Override
	public void atualizar(User user) {
		dao.salvar(user);
		
	}

	@Override
	public List<User> listar() {		
		return dao.listar();
	}

}
