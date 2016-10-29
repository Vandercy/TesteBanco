package ChatRMI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * rmic -classpath `pwd` br.umc.iod.ChatMessengerImpl
*/


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;


/**
 *
 * @author marcio
 */
public class ChatMessengerImpl implements ChatMessenger{

	
    
    HashMap<Long,Message>  messages = new HashMap<>();
    String messageText;
    Message message= new Message();
    
    public ChatMessengerImpl() throws RemoteException {
		UnicastRemoteObject.exportObject(this,1099);
	}   
    
    @Override
    public void sendMessage(String data, String destinatario, String remetente, String mensagem) {
        this.message = new Message(data, destinatario, remetente, mensagem);
    }

    @Override
    public String receiveMessage() {
        return this.messageText;
    }

    @Override
    public void setMessage(Message message) throws RemoteException {
       this.message = message;
    }

    @Override
    public Message getMessage() throws RemoteException {
       return this.message;
    }
    
}
