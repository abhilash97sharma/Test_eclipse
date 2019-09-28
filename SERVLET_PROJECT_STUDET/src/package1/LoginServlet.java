package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection ct;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 ct=DBUtil.getDBConnection();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try{
		ct.close();
		}
		catch(SQLException e){
			System.out.println("Unable to close a database connection");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		try{
			PreparedStatement smt=ct.prepareStatement("select * from signup where email=? and password=?");
			smt.setString(1,username);
			smt.setString(2,pwd);
			ResultSet rs=smt.executeQuery();
			if(rs.next()){
				pw.println("You have successful loged in");
			}
			else{
				response.sendRedirect("SignUp.html");
			}
		}
		catch(SQLException e){
			pw.println("Unable to login");
		}
	}

}
