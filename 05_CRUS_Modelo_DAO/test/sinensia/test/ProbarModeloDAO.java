/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.test;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sinensia.model.logic.UserService;
import sinensia.model.persistence.IUserDAO;
import sinensia.model.persistence.UserDAO_DerbyDB;
import sinensia.modelo.User;

/**
 *
 * @author alumno
 */
public class ProbarModeloDAO {
    
    UserService userService;
    
    public ProbarModeloDAO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        IUserDAO daoUser = new UserDAO_DerbyDB();
        userService = new UserService(daoUser);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void createAndListUsersFail() {
        try {
            
            List<User> allUsers = userService.getAll();
            int totalUserBefore = allUsers.size();
            User u1 = userService.create(null, null, null, 0);
            User u2 = userService.create("", "pass", "prueba1", 20);
            User u3 = userService.create("correo@prueba.es", "pass", "", 20);
            User u4 = userService.create("correo@prueba.es", null, "prueba1", 20);
            User u5 = userService.create("correo@prueba.es", "pass", "prueba1", 0);
            
            assertNull(u1);
            assertNull(u2);
            assertNull(u3);
            assertNull(u4);
            assertNull(u5);
            
            assertEquals(totalUserBefore, userService.getAll().size()); //Compara el tamaño de la lista antes y despues
        } catch (SQLException ex) {
            Logger.getLogger(ProbarModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
            fail("Error en SQL: "+ex.getMessage());
        }
    }
    
    @Test
    public void createAndListUsersOK() {
        try {
            int totalUserBefore = userService.getAll().size();
            User u1 = userService.create("aaa@aaa.com", "1234", "Aaaa", 1);
            User u2 = userService.create("pepe@mail.com", "pass", "Pepe", 53);
            User u3 = userService.create("bbb@prueba.es", "pass", "Mr. Bbbb", 20);
            User u4 = userService.create("cccc@prueba.es", "0000", "Sr. Ccc", 25);
            
            assertNotNull(u1);
            assertEquals("Pepe", u2.getName());
            assertTrue(u2.getName().length() > 3);
            assertNotEquals(u4.getEmail(), u3.getEmail());
            
            //User u5 = userService.create("cccc@prueba.es", "0123", "Mr. Ccc", 25);
            
            List<User> allUser = userService.getAll();
            assertEquals(totalUserBefore + 4, allUser.size());
            userService.remove(u1.getId());
            userService.remove(u2);
            assertEquals(totalUserBefore + 2, userService.getAll().size());
            
        } catch (SQLException ex) {
            Logger.getLogger(ProbarModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
            fail("Error en SQL: "+ex.getMessage());        }
    }    
}
