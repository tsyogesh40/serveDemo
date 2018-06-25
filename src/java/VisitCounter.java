
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns={"/VisitCounter"})
public class VisitCounter extends HttpServlet
{
    int i=0;
    public void init()
    {
     i=1;   
    }
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out=res.getWriter();
        out.println(i);
        i++;
    }
    
}