package sinensia.modelo;

import java.io.Serializable;
import sinensia.model.persistence.IUserDAO;
import sinensia.model.persistence.UserDAO_DerbyDB;

/** Clase que define los campos de usuario
 *
 * @author alumno
 */
public class User implements Serializable{
    
    private Integer id;
    private String email;
    private String password;
    private String name;
    private int age;

    IUserDAO daoUsers;
    
    public User(UserDAO_DerbyDB daoUsers) {
        this.daoUsers = new UserDAO_DerbyDB();
    }

    public User(String email, String password, String name, int age) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        this.daoUsers = daoUsers;
    }

    
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Integer getId() {
        return id;
    }
    /**
     * Set the value of id
     *
     * @param id new value of name
     */
    public void setId(Integer id) {
        this.id = id;
    }    
    
    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }    
    
    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }  
}
