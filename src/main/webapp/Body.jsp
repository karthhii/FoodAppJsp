<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="res.ResDa, java.util.ArrayList,java.util.List, res.ResDt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    .res_container {
        display: flex; 
        flex-wrap: wrap;
        gap: 20px;
     }
     .restaurant{
     border: 1px solid #ddd; 
     padding: 10px; 
     margin-bottom: 10px; 
     cursor: pointer;"
     
     }
     
</style>
<body>
<%@ include file="Header.jsp" %>
<div class="body">
<h2>Restaurants list</h2>
<%
    
    ArrayList<ResDt> r1 = ResDa.getAllDetails();
   
%>

<div class="res_container">
<% 
    for(ResDt r:r1)
    {
    	int resid=r.getResId();
    	
    	
%>
	<div class="restaurant" onclick="navigate(<% r.getResId(); %>)">
		
		
    	 <p>ID: <%=r.getResId() %></p>
    	 <p>Name: <%=r.getResName()%></p>
    	 <p>Location: <%=r.getLocation() %></p>
    	 <p>Rating: <%=r.getAvgRating() %></p>
    	 
    </div>
 
    <% } %>
    </div>
    <script>
    function navigate(resId){
    	window.location.href="Menu.jsp?id=" + resId;
    }
    </script>
    
</div>
<%@ include file="Footer.jsp" %>
</body>
</html>