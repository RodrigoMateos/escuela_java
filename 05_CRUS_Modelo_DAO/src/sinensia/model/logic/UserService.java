package sinensia.model.logic;

import java.sql.SQLException;
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

    public User create(String email, String password, String name, int age) throws SQLException {
        User user = null;

        if (email != null && password != null && name != null && age != 0) {
            if (email.length() > 3 && !password.equals("") && !name.equals("") && age > 0) {
                user = new User(email, password, name, age);
                user = daoUser.create(user);
            }
        }
        //TODO: Crear objeto usuario y añadir a BBDD
        return user;
    }

    public List<User> getAll() throws SQLException {
        return daoUser.getAll();
    }

    public boolean remove(int id) throws SQLException {
        return daoUser.remove(id);
    }

    public boolean remove(User user) throws SQLException {
        return daoUser.remove(user);
    }

    public User update(int id, String email, String password, String name, int age) throws SQLException {
        User user = null;

        if (validation(id, email, password, name, age)) {
           // int age = Integer.parseInt(strAge);
            user = new User(email, password, name, age);
            user.setId(id);
            //user = daoUser.create(user);
        }
        return daoUser.update(user);
    }

    public User update(User user) throws SQLException {
        return update(user.getId(), user.getEmail(), user.getPassword(), user.getName(), user.getAge());
    }

    public boolean validation(int id, String email, String password, String name, int age) {
        if (email != null && password != null && name != null && age != 0) {
/*            if (!strAge.matches("[0-9]{1,3}")) {
                throw new IllegalArgumentException("La edad no es valida");
            } else {
                int age = Integer.parseInt(strAge);*/
                if (email.length() > 3 && !password.equals("") && !name.equals("") && age > 0) {
                    return true;
                }
//            }
        }
        return false;
    }
    
    public User validate(String email, String password) throws SQLException{
        return daoUser.validate(email, password);
    }


}
