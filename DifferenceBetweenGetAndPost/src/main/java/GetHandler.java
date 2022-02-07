import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetHandler", value = "/GetHandler")
public class GetHandler extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public GetHandler(){
        super();
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<HTML><BODY><h2>dogetNew2</h2>");
        out.println("name: " + request.getParameter("name")+ "</br>");
        out.println("address: " + request.getParameter("address")+ "</br>");
        out.println("</BODY></HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
