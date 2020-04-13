package ics.ejb.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.eao.Person;
import org.ics.eao.PersonLocal;



/**
 * Servlet implementation class HevServlet
 */
@WebServlet("/HevServlet")
public class HevServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HevServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String beanInterface = "Local";
		String bean = Person.class.getCanonicalName();
		//See JNDI NAME I Server console
		String JNDIName = "java:app/HevProject/Person!" + bean + beanInterface;
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>Stateless Person</title>");
		out.println("<meta charset=\"ISO-8859-1\"></head>");
		out.println("<body>");
		
		out.println("<h3>Bean name: "+bean+"</h3>"+"<br>");
		out.println("<h3>Bean Interface: "+beanInterface+"</h3>"+"<br>");
		out.println("<h3>JNDI Name: "+JNDIName+"</h3>"+"<br>");
		
		try {
			Context context = new InitialContext();
			PersonLocal p =(PersonLocal)context.lookup(JNDIName);
			if(p != null){
				out.println("<h3>Person skapad!!</h3>"+"<br>");
					p.setFirstName("Axel");
					p.setLastName("Eriksson");
					out.println(p.getFirstName()+" "+ p.getLastName()+"<br>");
			}
		}catch(Exception e) {
				out.println("Exeption kastad."+e.getMessage());
		 }
		out.println("</body></html>");
		
	}
}


