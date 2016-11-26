package jpaermi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.umc.iod.jpa.User;
import br.umc.iod.rmi.UserInterface;

public class TestRMI {

	public static void main(String vanderci[]){
		try {
			UserInterface   user= (UserInterface)Naming.lookup("rmi://127.1.1.1/user");
			for(User u2 :	user.listar()){
				System.out.println(u2.getNome());
				
			}
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//2 passo
			
	}
}
