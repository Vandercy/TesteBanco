package br.umc.iod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author marcio
 */
public interface ChatMessenger extends Remote {
    //public void sendMessage(String data, String destinatario, String remetente, String messagem) throws RemoteException;
    //public String receiveMessage() throws RemoteException;
    //public void setMessage(Message message) throws RemoteException;
    //public Message getMessage() throws RemoteException;
	
	public void remover();
	
	public void salvar();
	
	public void consultar();
	
	public void atualizar();
    
}
