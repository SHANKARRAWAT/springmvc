<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import = "java.util.*"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
 <h1>this is home page yeahh hoo </h1>
 <%
 
  String name=(String)request.getAttribute("name");
  List<String> friends=(ArrayList<String>) request.getAttribute("f");
 %>
 
 <h1> name is  <%= name %></h1>
 <h1>
 
 <%-- <%
   for(String s:friends){
	   out.println(s);
   }
 %> --%>
 <%out.print(friends); %>
 </h1>
</body>
</html>