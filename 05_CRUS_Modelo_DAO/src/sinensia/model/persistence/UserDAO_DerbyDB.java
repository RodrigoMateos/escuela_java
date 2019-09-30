package sinensia.model.persistence;

import com.sun.istack.internal.logging.Logger;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import sinensia.modelo.User;

/**
 *
 * @author alumno
 */
public class UserDAO_DerbyDB implements IUserDAO{

    private static final String URL_DB="jdbc:derby://localhost:1527/db_users";
    private static final String USER_DB= "root";
    private static final String PASS_DB="1234"; 

    public UserDAO_DerbyDB() {
        //Cargamos el driver de la Dervy DB, esta basado en JDBC.
        //JDBC es un protocolo de acceso a BBDD para evitar las diferencias que hay en las distintas BBDD
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        } catch (Exception ex) {
        }
        
    }

    @Override
    public User create(User user) {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);
            String sqlQuery = "INSERT INTO users(email, password, name, age) VALUES("
                    + "'"+user.getEmail()+"', '"+user.getPassword()+"', '"+user.getName()+"', '"+user.getAge()+"')";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sqlQuery);
            c.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
