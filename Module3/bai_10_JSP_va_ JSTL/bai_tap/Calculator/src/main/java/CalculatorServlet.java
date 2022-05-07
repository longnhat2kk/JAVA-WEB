import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        String operator = request.getParameter("operator");
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        double result = 0;
        if (operator.equals("+")) {
            result = firstOperand + secondOperand;
        } else if (operator.equals("-")) {
            result = firstOperand - secondOperand;
        } else if (operator.equals("*")) {
            result = firstOperand * secondOperand;
        } else{
            result = firstOperand / secondOperand;
        }
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<h1>Result</h1>");
        writer.print("<h1>First operand: "+firstOperand+"</h1>");
        writer.print("<h1>Second operand: "+secondOperand+"</h1>");
        writer.print("<h1>Result: "+result+"</h1>");
        writer.print("</html>");

    }
}
