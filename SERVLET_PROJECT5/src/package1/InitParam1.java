package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParam1
 */

public class InitParam1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		ServletContext sdf=super.getServletContext();
		String s1=sdf.getInitParameter("name");
		String s2=sdf.getInitParameter("phoneno");
		PrintWriter pw=response.getWriter();
		pw.println(s1+"    "+s2+"<br>");
		ServletConfig sfg=super.getServletConfig();
		String s3=sfg.getInitParameter("Address");
		pw.println("Address:"+s3);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
