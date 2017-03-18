<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="mine" uri="MyTagLib" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Getting an arbitrary ancestor</title>
</head>
<body>
	<h1>Getting an arbitrary ancestor:</h1><br>
	<mine:Menu>
		<mine:MenuItem itemValue="Dogs"/>
		<mine:MenuItem itemValue="Cats"/>
		<mine:MenuItem itemValue="Horses"/>
		<mine:FindAncestor/>
	</mine:Menu>
</body>
</html>