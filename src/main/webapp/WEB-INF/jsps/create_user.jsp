<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cart	</title>
</head>
<body>
<h2>shopping cart</h2>
<hr>
<form action="save" method="post">
<pre>
Product Name<input type="text" name="productName"/>
prize<input type="text" name="prize"/>
quantity<input type="text" name="quantity"/>
total<input type="text" name="total"/>
action<input type="text" name="action"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>