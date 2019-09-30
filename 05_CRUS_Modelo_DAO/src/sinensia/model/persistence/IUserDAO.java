package sinensia.model.persistence;

import java.sql.SQLException;
import java.util.List;
import sinensia.modelo.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author alumno
 */
public interface IUserDAO {
    User create(User user) throws SQLException;
    List<User> getAll() throws SQLException;
    boolean remove(int id) throws SQLException;
    boolean remove(User user) throws SQLException;
    User modify(User user) throws SQLException;
}
