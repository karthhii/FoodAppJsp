<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="res.Operations, java.util.ArrayList,java.util.List, res.ResObject" %>
    
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
</style>
<body>
<%@ include file="Header.jsp" %>
<div class="body">
<h2>Restaurants list</h2>
<%
    Operations o1 = new Operations();
    ArrayList<ResObject> r1 = o1.getAllDetails();
   
%>

<div class="res_container">
<% 
    for(ResObject r:r1)
    {
%>
	<div class="restaurant">
    	 <p>ID: <%=r.getResId() %></p>
    	 <p>Name: <%=r.getResName() %></p>
    	 <p>Location: <%=r.getLocation() %></p>
    	 <p>Rating: <%=r.getAvgRating() %></p>
    </div>
 
    <% } %>
    </div>
    
</div>
<%@ include file="Footer.jsp" %>
</body>
</html>