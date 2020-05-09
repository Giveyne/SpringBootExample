<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title></title>
</head>
<body>

<!--jsp:useBean id="UserServiceImpl" class="ru.igor.system.service.UserServiceImpl"> /jsp:useBean>-->

<table>
    <tr>
        <th> ID </th>
        <th> ELVL </th>
        <th> ISIN </th>
    </tr>

    <c:forEach var="elvl" items="${elvls}" >
        <tr>
            <td> <a href = "/quot/${elvl.id}"><c:out  value="${elvl.id}"/> </a></td>
            <td> <c:out value="${elvl.elvl}" /></td>
            <td> <c:out value="${elvl.isin}" /></td>
        </tr>
    </c:forEach>

    <a href = "/quot"> Add user </a>
</table>
</body>
</html>