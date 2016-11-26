package br.umc.iod.webservice;

import java.util.List;

import javax.jws.WebMethod;

import ws.hello.User;

public interface UserWSInterface {
	
	@WebMethod String sayHello();

	@WebMethod String sayHelloTo(String to);

	@WebMethod String sayHelloToUser(User user);

	@WebMethod User getUserFromEmail(String email);

	@WebMethod List<User> getAllUsers();

}
