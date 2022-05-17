package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext
 */
@WebServlet("/servletcontext")
public class ServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		  
		//creating ServletContext object  
		
		
		
		
//		ServletContext context = getServletContext();
//		context.setAttribute("dbName", "mySQL");
//		context.setAttribute("dbVersion", "8.0.28");
//		
//		request .setAttribute("jdk ", "17.1");
//		request .setAttribute("os ", "Windows 10");
//		RequestDispatcher dispatcher =   context.getRequestDispatcher("/readattributes");
//		dispatcher.forward(request, response);
//		
//	    int p1 = Integer.parseInt(context.getInitParameter("p1")); 
//	    int p2 = Integer.parseInt(context.getInitParameter("p2"));
//	    int p3 = Integer.parseInt(context.getInitParameter("p3"));
//	    int p4 = Integer.parseInt(context.getInitParameter("p4"));
//		  
		//Getting the value of the initialization parameter and printing it  
//		String driverName=context.getInitParameter("dname");  
//		pw.println("driver name is="+driverName);  
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
