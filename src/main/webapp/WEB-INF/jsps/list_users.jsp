<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>users</title>
</head>
<body>
<h2>All Users</h2>
<table>
<tr>
   <th>Product Name</th>
   <th>Prize</th>
   <th>Quantity</th>
   <th>Total</th>
   <th>Action</th>
</tr>
<c:forEach var="user" items="${users}">
<tr>
  <td>${user.productName}</td>
  <td>${user.prize}</td>
  <td>${user.quantity }</td>
  <td>${user.total}</td>
  <td>${user.action }</td>
  
</tr>


</c:forEach>

</table>
</body>
</html>