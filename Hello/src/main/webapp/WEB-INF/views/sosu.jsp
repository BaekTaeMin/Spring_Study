<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>sosu</title>
</head>
<body>
<%
	for (int i=2; i<=1000; i++) {
		boolean bPrime = true;
		for(int a=2; a<i; a++) {
			if (i % a == 0) {
				bPrime = false;
				break;
			}
		}
		if (bPrime) {
			out.print(i + "<BR>");
		}
	}
%>
<p> </p>
</body>
</html>