package br.umc.iod.rmi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.umc.iod.jpa.User;

/**
 *
 * @author vandercy
 */
public interface  UserInterface  extends Remote {
    //public void sendMessage(String data, String destinatario, String remetente, String message) throws RemoteException;
    //public String receiveMessage() throws RemoteException;
    //public void setMessage(Message message) throws RemoteException;
    //public Message getMessage() throws RemoteException;
	
	public void remover(User user)throws RemoteException;
	
	public void salvar(User user)throws RemoteException;
		
	public User consultar(Long id)throws RemoteException;
		
	public void atualizar(User user)throws RemoteException;
    
	public List<User> listar()throws RemoteException;
}

