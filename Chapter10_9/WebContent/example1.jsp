<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="mine" uri="MyTagLib" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Classic Tag Nesting Example 1</title>
</head>
<body>
	<mine:NestedLevel>
		<mine:NestedLevel>
			<mine:NestedLevel>
				<mine:NestedLevel></mine:NestedLevel>
			</mine:NestedLevel>
		</mine:NestedLevel>
	</mine:NestedLevel>
</body>
</html>