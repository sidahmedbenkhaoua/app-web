package dz.sbenkhaoua.roadtraffic.module.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sbenkhaoua on 01/05/15.
 */


public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Subject subject = SecurityUtils.getSubject();

        req.setAttribute("username", subject.getPrincipal());

        req.getRequestDispatcher("/pages/d/home/home.jsp").forward(req, resp);
    }

}