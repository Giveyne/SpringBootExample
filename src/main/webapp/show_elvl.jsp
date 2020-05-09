<jsp:useBean id="elvl" scope="request" type="com.example.demo.model.Elvl"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td> Id </td>
        <td> ${elvl.id}</td>
    </tr>
    <tr>
        <td> Ask </td>
        <td> ${elvl.elvl}</td>
    </tr>
    <tr>
        <td> ISIN </td>
        <td> ${elvl.isin}</td>
    </tr>


    <br>
    <a href="/elvls">Back</a>
</table>
</body>
</html>
</body>
</html>