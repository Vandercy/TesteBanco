/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.iod.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marciomendes
 */
public class Emissor implements Runnable{//1 passo
 ChatMessenger chat;
 Message message;
 private boolean stop=false;
 
    public Emissor() throws NotBoundException, MalformedURLException, RemoteException {
        chat= (ChatMessenger)Naming.lookup("rmi://127.1.1.1/chat");//2 passo
    }

  
    
    public void setMessage(Message message){
      this.message = message;
    }

    public void stop(){
        this.stop=true;    
    }

      @Override
    public void run() { //3 passo
     try {
         this.stop=false;
         while (!this.stop) {
             if (message != null) {
                 chat.salvar();//metodo remoto
             }
               Thread.sleep(500l);//500 milisegundos
         }
          
     } catch (RemoteException ex) {
         Logger.getLogger(Emissor.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InterruptedException ex) {
         Logger.getLogger(Emissor.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    
}
