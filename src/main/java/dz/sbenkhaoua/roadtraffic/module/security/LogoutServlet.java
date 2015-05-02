package dz.sbenkhaoua.roadtraffic.module.security;


import org.apache.shiro.SecurityUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sbenkhaoua on 01/05/15.
 */


public class LogoutServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SecurityUtils.getSubject().logout();

        resp.sendRedirect(req.getContextPath() + "/login");
    }
}