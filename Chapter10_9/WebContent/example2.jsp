<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="mine" uri="MyTagLib" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple tags can have Classic parents</title>
</head>
<body>
	<h1>Simple tags can have Classic parents:</h1><br><br>
	<mine:ClassicParent name="ClassicParentTag">
		<mine:SimpleInner/>
	</mine:ClassicParent>
</body>
</html>