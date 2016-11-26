package br.umc.iod.webservice;

import java.util.Date;

import javax.jws.WebService;



public class UserWSipl {
	
	@WebService(endpointInterface = "ws.hello.Hello")
	public class UserWSipl implements User {

		public String sayHello() {
			return "Ola there! Now is: " + new Date();
		}

		public String sayHelloTo(String to) {
			return "Hi " + to + "! Now is: " + new Date();
		}

		public String sayHelloToUser(User user) {
			return "Hi " + user.getUsername() + "! Now is: " + new Date();
		}

		public User getUserFromEmail(String email) {
			// pretend you went to the database and found the user...
			return new User("Prof", email);
		}

}
