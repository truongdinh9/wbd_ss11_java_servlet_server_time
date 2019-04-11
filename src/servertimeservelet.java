import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "servertimeservelet", urlPatterns = "/index")

public class servertimeservelet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setIntHeader("Refresh",1);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        Date today = new Date();

        writer.println("<h1>"+" Today is " + today + "</h1>");
        writer.println("</html>");

    }
}
