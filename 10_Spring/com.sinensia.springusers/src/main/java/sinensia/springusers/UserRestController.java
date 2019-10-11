/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.springusers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Singleton porque sólo queremos un servicio por aplicación/servidor
 *
 * @author alumno
 */
@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@Autowired
	UsersRepository miRepo;

	@RequestMapping(method = RequestMethod.POST)
    public User addPersonas(@RequestBody User user)
            throws NumberFormatException, IOException, IllegalArgumentException {
        
		if (user.getAge() <= 12) { 
			throw new IllegalArgumentException("La edad debe ser mayor que 12");
        } else {
           	user = miRepo.save(user);
            return user;
        }
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {

    	return miRepo.findAll();
    }
    
}
