package sinensia.model.logic;

import java.util.List;
import sinensia.model.persistence.IUserDAO;
import sinensia.modelo.User;

/**
 *
 * @author alumno
 */
public class UserService {
    
    IUserDAO daoUser;

    public UserService(IUserDAO daoUser) {
        this.daoUser = daoUser;
    }

    public IUserDAO getDaoUser() {
        return daoUser;
    }

    public void setDaoUser(IUserDAO daoUser) {
        this.daoUser = daoUser;
    }
    
    public User create(String email, String password, String name, int age){
        User user=null;
        
        if(email != null && password != null && name != null && age != 0){
            if(email.length()>3 && !password.equals("") && !name.equals("") && age>0){
                user = new User(email, password, name, age);
                user = daoUser.create(user);
            }
        }
            //TODO: Crear objeto usuario y añadir a BBDD
        return user;
    }
    
    public List<User> getAll(){
        return daoUser.getAll();
    }
}
