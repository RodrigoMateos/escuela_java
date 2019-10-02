package sinensia.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sinensia.model.logic.UserService;
import sinensia.model.persistence.IUserDAO;
import sinensia.model.persistence.UserDAO_DerbyDB;
import sinensia.modelo.User;

/**
 *
 * @author alumno
 */
@WebServlet(asyncSupported = true, urlPatterns = "/users.do") //Indica que la clase va a ser un servlet
public class UsersController extends HttpServlet {

    UserService userService;
    IUserDAO daoUsers;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        daoUsers = new UserDAO_DerbyDB();
        this.userService = new UserService(daoUsers);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String name = req.getParameter("name");
            String age = req.getParameter("age");
            String id = req.getParameter("id");
            String method = req.getParameter("method");

            if(method == null){
                User newUser = userService.create(email, password, name, Integer.parseInt(age));
                req.setAttribute("user", newUser);
            }
            else if (method.equalsIgnoreCase("delete")) 
                userService.remove(Integer.parseInt(id));
            else if (method.equalsIgnoreCase("modificar")){
                User newUser = new User(email, password, name, Integer.parseInt(age));
                newUser.setId(Integer.parseInt(id));
                userService.update(newUser);
                req.setAttribute("method", "update");
                req.setAttribute("user", newUser);
            }
        }
        catch (Exception ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
            req.setAttribute("errorMessage", ex.getMessage());
        }finally{
            req.getRequestDispatcher("result.jsp").forward(req, resp);
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String method = req.getParameter("method");
            
            if(method==null){
                List<User> listUsers = userService.getAll();
                req.setAttribute("userList", listUsers); //Añadimos informacion a la peticion, para que la vista pueda ver este atributo y recoger los datos
                req.getRequestDispatcher("listUsers.jsp").forward(req, resp);
            }
            else if(method.equals("Login")){
                if(!email.isEmpty() && !password.isEmpty()){
                    User user = userService.validate(email, password);
                    req.getSession().setAttribute("userLogged", user);
                    resp.addCookie(new Cookie("email", email));
                    req.getRequestDispatcher("result.jsp").forward(req, resp);
                }
            }
        }catch (Exception ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
