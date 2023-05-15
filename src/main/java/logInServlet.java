import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "logInServlet", value = "/login")
public class logInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usename = req.getParameter("usename");
        String password = req.getParameter("password");

        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        if("admin".equals(usename) && "admin".equals(password)){
            writer.println("<h1> Wellcome "+usename+" to website</h1>");
        }
        else {
           resp.sendRedirect("index.jsp");
        }
        writer.println("</html>");
    }
}
