package res;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddedItems
 */
public class AddedItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddedItems() {
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
		int foodId=Integer.parseInt(request.getParameter("foodId"));
		String foodName=request.getParameter("foodName");
		int price=Integer.parseInt(request.getParameter("price"));
		String foodDes=request.getParameter("foodDes");
		String isNon=request.getParameter("isNon");
		String isVeg=request.getParameter("isVeg");
		float avgRating=Float.parseFloat(request.getParameter("avgRating"));
		int cuId=Integer.parseInt(request.getParameter("cuId"));
		int resId=Integer.parseInt(request.getParameter("resId"));
		int sucess=FoodItemsDao.AddItems(foodId,foodName,price,foodDes,isNon,isVeg,avgRating,cuId,resId);
		if(sucess>0) {
			p.println("<h1>Items been added</h1>");
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
