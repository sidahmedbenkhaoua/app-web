package dz.sbenkhaoua.roadtraffic.module.security;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sbenkhaoua on 01/05/15.
 */

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("sout !!");
        String username = req.getParameter("inputUsername");
        String password = req.getParameter("inputPassword");
        System.out.println(username +" "+ password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            SecurityUtils.getSubject().login(token);
            resp.sendRedirect(req.getContextPath() + "/home");
        } catch (AuthenticationException e) {
            req.setAttribute("errorMessage", e.getMessage());
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        if (SecurityUtils.getSubject().isAuthenticated()) {
            resp.sendRedirect(req.getContextPath() + "/home");
        } else {
            System.out.println("qsdqsdqsdqsd");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}