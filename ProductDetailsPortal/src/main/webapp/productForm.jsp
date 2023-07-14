<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<form action="ProductServlet" method="post">
        <label for="productId">Product ID:</label>
        <input type="text" id="productId" name="productId"><br>
        
        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName"><br>
        
        <label for="productPrice">Product Price:</label>
        <input type="text" id="productPrice" name="productPrice"><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>