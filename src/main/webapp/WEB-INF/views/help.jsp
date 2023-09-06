<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page isELIgnored="false" %>
 
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- for getting values from the controller -->
<%-- <% 
  String name= (String)request.getAttribute("name");
  Integer roll= (Integer)request.getAttribute("roll_no");

%> --%>


<h1>hello this is the /help page</h1>

<p> name is <%-- <%=name%>  --%> ${name} </p>
<p> roll no is <%-- <%=roll %> --%> ${roll_no}   </p>
<p> number is  <c:forEach var="item" items="${number}">
              <h1> ${item} </h1>
</c:forEach>
</p>
</body>
</html>