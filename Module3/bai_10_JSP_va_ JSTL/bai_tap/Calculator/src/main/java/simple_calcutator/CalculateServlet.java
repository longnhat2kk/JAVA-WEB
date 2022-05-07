package simple_calcutator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculateServlet", value = "/CalculateServlet")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher rd =  request.getRequestDispatcher("/webapp/result.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher rd =  request.getRequestDispatcher("/webapp/index.jsp");
//
//        rd.forward(request,response);

        String f = request.getParameter("a");
        String s = request.getParameter("c");

    }}
