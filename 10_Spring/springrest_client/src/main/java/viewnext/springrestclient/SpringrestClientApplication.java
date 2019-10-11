package viewnext.springrestclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringrestClientApplication {

	private static final String URL_SRV_87 = "http://172.16.4.61:8087/users";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringrestClientApplication.class, args);

		System.out.println(">> Recogiendo usuarios");
		
		System.out.println(">> Usuarios recogidos");
	}
	/*public List<User> getTodosUsuarios() {
		
	}*/
}
