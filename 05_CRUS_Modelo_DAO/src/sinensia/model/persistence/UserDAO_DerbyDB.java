package sinensia.model.persistence;

import com.sun.istack.internal.logging.Logger;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public User create(User user) throws SQLException{
        Connection c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);
        
        /*String sqlQuery = "INSERT INTO users(email, password, name, age) VALUES("
                + "'"+user.getEmail()+"', '"+user.getPassword()+"', '"+user.getName()+"', "+user.getAge()+")";
        Statement stmt = c.createStatement();
        stmt.executeUpdate(sqlQuery);*/

        //Forma para evitar el SQL injection, los ? son los parametros de sentencia SQL
        String sqlQuery = "INSERT INTO users (email, password, name ,age) VALUES (?,?,?,?)";
        PreparedStatement prep = c.prepareCall(sqlQuery);
        prep.setString(1, user.getEmail());
        prep.setString(2, user.getPassword());
        prep.setString(3, user.getName());
        prep.setInt(4, user.getAge());
        prep.executeUpdate();

        String sqlQueryId = "SELECT id FROM users WHERE email=?";
        PreparedStatement prep2 = c.prepareCall(sqlQueryId);
        prep2.setString(1, user.getEmail());
        ResultSet resultado = prep2.executeQuery(); //Conjunto de los resultados sql
        while(resultado.next())
            user.setId(resultado.getInt("id"));
        
        c.close();
        return user;
    }

    @Override
    public List<User> getAll() throws SQLException{
        
        try(Connection c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB)){ //El try cierra la conexion si todo ha ido bien
            List<User> userList = new ArrayList<>();
            String sqlQuery = "SELECT id, email, password, name, age FROM users";
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery(sqlQuery); //Conjunto de los resultados sql
            while(resultado.next()){
                User newUser = new User(resultado.getString("email"), resultado.getString("password"), resultado.getString("name"), resultado.getInt("age"));
                newUser.setId(resultado.getInt("id"));
                
                userList.add(newUser);
            }
            return userList;
        } 
    }

    @Override
    public boolean remove(int id) throws SQLException{
        try(Connection c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB)){ //El try cierra la conexion si todo ha ido bien

        String sqlQuery = "DELETE FROM users WHERE id=?";
        PreparedStatement prep = c.prepareCall(sqlQuery);
        prep.setInt(1, id);
        return prep.executeUpdate() == 1; //Conjunto de los resultados sql
        }
    }

    @Override
    public boolean remove(User user) throws SQLException{
        return remove(user.getId());
    }

    @Override
    public User modify(User user) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
