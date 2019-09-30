/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.test;

import java.util.List;
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
        
        List<User> allUser = userService.getAll();
        assertNull(allUser);
    }
    
    @Test
    public void createAndListUsersOK() {
        User u1 = userService.create("aaa@aaa.com", "1234", "Aaaa", 1);
        User u2 = userService.create("pepe@mail.com", "pass", "Pepe", 53);
        User u3 = userService.create("bbb@prueba.es", "pass", "Mr. Bbbb", 20);
        User u4 = userService.create("cccc@prueba.es", "0000", "Sr. Ccc", 25);
        
        assertNotNull(u1);
        assertEquals("Pepe", u2.getName());
        assertTrue(u2.getName().length()>3);
        assertNotEquals(u4.getEmail(),u3.getEmail());
        
        User u5 = userService.create("cccc@prueba.es", "pass", "prueba1", 11);

        assertNull(u5);
        List<User> allUser = userService.getAll();
        assertEquals(allUser.size(), 4);
    }
}
