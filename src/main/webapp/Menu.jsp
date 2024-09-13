<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="res.FoodItemsDao, java.util.ArrayList,java.util.List, res.FoodItemsDto" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Food Items List</h2>
<%
	int id=Integer.parseInt(request.getParameter("id"));
	ArrayList<FoodItemsDto> r1=FoodItemsDao.getAllItems();

	for(FoodItemsDto d:r1){
		if(id==d.getResId()){%>
		<div class="container">
		 <p>ID: <%=d.getFoodId() %></p>
    	 <p>Name: <%=d.getFoodItemName() %></p>
    	 <p>Location: <%=d.getAvgRating() %></p>
    	 <p>Rating: <%=d.getPrice() %></p>
		</div>
		
			
		<%}%>
	<%} %>
	

</body>
</html>