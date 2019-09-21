package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str=request.getParameter("txt1").toUpperCase();
	//	String str="A";
		try {
			PrintWriter pw=response.getWriter();
		//	pw.println(str);
			Class.forName("oracle.jdbc.OracleDriver");
		//	pw.println("after forname method");
			Connection ct=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","abhilash","sharma25");
	//		pw.println("Connection established");
			Statement ps=ct.createStatement();
			ResultSet rs=ps.executeQuery("select ename from emp where ename like '"+str+"%' ");
			while(rs.next()){
				pw.println(rs.getString("ename")+"<br>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			PrintWriter pw=response.getWriter();
			pw.println("Some error");
		}
		//
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//	pw.println("Hello Abhilash Sharma");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
