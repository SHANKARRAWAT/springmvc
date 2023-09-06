<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>after signup page</title>
</head>
<body>
<h1>Name = ${name}</h1>
<h1>${degree} graduated</h1>
<hr>
  <p> email of user is ${user.email}</p>
  <p> name of user is  ${user.name}  </p>
  <p>password of user is ${user.password} </p>
  
</body>
</html>