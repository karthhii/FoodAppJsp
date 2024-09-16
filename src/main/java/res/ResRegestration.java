package res;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ResRegestration
 */
public class ResRegestration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResRegestration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		int resId=Integer.parseInt(request.getParameter("resId"));
		String resName=request.getParameter("resName");
		String address=request.getParameter("address");
		String location=request.getParameter("location");
		String openTime=request.getParameter("openTime");
		String closeTime=request.getParameter("closeTime");
		int gstNumber=Integer.parseInt(request.getParameter("gstNumber"));
		int contactNumber=Integer.parseInt(request.getParameter("contactNumber"));
		String email=request.getParameter("email");
		float avgRating=Float.parseFloat(request.getParameter("avgRating"));
		int password=Integer.parseInt(request.getParameter("password"));
		int sucess=ResDa.AddRestaurant(resId,resName,address,location,openTime,closeTime,gstNumber,contactNumber,email,avgRating,password);
		if(sucess>0) {
			p.println("<h1>Restaurant has been added succesfully</h1>");
		}
		else {
			p.println("<h1>Not Success</h1>");

			
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
