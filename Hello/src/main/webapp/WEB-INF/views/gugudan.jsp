<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<table border="1">
<%	for (int a = 1; a<=9; a++) { %>
	<tr>
	<% for (int i=1; i<=9; i++) { %>
	<td>
		<% out.print(a + " X " + i + " = " + a*i); %>
	</td>
	<%	} %>
	</tr>
	<% } %>
</table>
<p> </p>
</body>
</html>
