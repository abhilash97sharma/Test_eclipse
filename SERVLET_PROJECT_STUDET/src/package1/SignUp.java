package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection ct;
   public void init(){
	    ct=DBUtil.getDBConnection();
   }
	/**
	 * @throws Exception 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    /* protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
			doPost(request,response);
     }*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        try {
			PreparedStatement ps=ct.prepareStatement("insert into signup values(?,?)");
			String s1=request.getParameter("email");
			String s2=request.getParameter("psw");
			String s3=request.getParameter("psw-repeat");
			if(s2.equals(s3)){
			ps.setString(1,s1);
			ps.setString(2,s2);
			ps.executeUpdate();
			out.println("You have successfully registered");
			}
			else
				out.println("password do not match");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void destroy(){
		try {
			ct.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch blo
			System.out.println("Error in closing the database connection");
		}
	}

}
