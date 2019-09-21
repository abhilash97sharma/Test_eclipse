package package1;

import java.io.IOException;
import java.util.List;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import au.com.bytecode.opencsv.CSVReader;

/**
 * Servlet implementation class Second_Servlet
 */
public class Second_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		String path = "C:/Users/Abhilash Sharma/Desktop/desktop3/R_notes/employee.csv";
		try {
			FileReader filereader = new FileReader(path);
			CSVReader csvreader = new CSVReader(filereader);
			List<String[]> lst = csvreader.readAll();
			PrintWriter pw = response.getWriter();
			String final_out = "";
			for (String[] row : lst) {
				String out = "";
				for (String cell : row) {
					// System.out.print(cell + "\t");
					// pw.print(cell+",");
					out += cell + ",";
				}
				final_out += (out + "\n");
				// System.out.println();
			}
			pw.print(final_out);
		} catch (Exception e) {

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
