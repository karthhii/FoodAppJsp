<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="res.FoodItemsDao, java.util.ArrayList,java.util.List, res.FoodItemsDto" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .res_container {
     display: flex; 
     flex-wrap: wrap;
     gap: 20px;
     border: 1px solid #ddd; 
     padding: 10px; 
     margin-bottom: 10px; 
     cursor: pointer;"
     
     }
     
</style>
</head>
<body>
<h2>Food Items List</h2>
<%
	String id=request.getParameter("id");
	int resId=Integer.parseInt(id);
	ArrayList<FoodItemsDto> r1=FoodItemsDao.getAllItems();

	for(FoodItemsDto d:r1){
		if(resId==d.getResId()){%>
		<div class="container">
		 <p>ID: <%=d.getFoodId() %></p>
    	 <p>Name: <%=d.getFoodItemName() %></p>
    	 <p>Rating: <%=d.getAvgRating() %></p>
    	 <p>Price: <%=d.getPrice() %></p>
		</div>
		
			
		<%}%>
	<%} %>
	

</body>
</html>