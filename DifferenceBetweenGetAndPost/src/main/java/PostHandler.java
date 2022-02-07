import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PostHandler", value = "/PostHandler")
public class PostHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<HTML><BODY><h2>doPost</h2>");

        String name = request.getParameter("name");
        String address = request.getParameter("address");

        out.println("Name=" + name + "<br>Address=" + address);
        out.println("</body></html>");

    }
}
