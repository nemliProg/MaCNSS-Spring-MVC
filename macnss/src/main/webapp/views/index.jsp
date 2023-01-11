<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach var="i" begin="0" end="10">
    <c:out value="${i}"/>
</c:forEach>
</body>
</html>
