package res;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CredentialsValidation
 */
public class CredentialsValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CredentialsValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   response.setContentType("text/html");
		   PrintWriter pw=response.getWriter();
		   String resId=request.getParameter("id");
		   String pass=request.getParameter("password");
		   int c=Integer.parseInt(resId);
		   int d=Integer.parseInt(pass);
		   boolean f=false;
		   ArrayList<ResDt> r1 =ResDa.getIdPass();
		   for(ResDt r:r1){
			   if(c==r.getResId() && d==r.getLoginPassword()){
				   f=true;
			   }
		   }
		   if(f==true){
			   pw.println("<h2>Success</h2>");
			   pw.println("<a href='AddingItems.jsp?id=" + c + "'>Add Menu</a>");
		   }
		   else {
			   pw.println("<h1>Not Success</h1>");
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
