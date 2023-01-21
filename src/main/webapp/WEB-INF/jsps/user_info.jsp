<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info</title>
</head>
<body>
<h2>User Details</h2>
  Product Name:${user.productName}<br/>
  Prize:${user.prize}<br/>
  Quantity:${user.quantity}<br/>
  Total:${user.total}<br/>
  Action:${user.action }<br/>
  <input type="submit" value="Addnew"/>
</body>
</html>