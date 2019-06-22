<%--
  Created by IntelliJ IDEA.
  User: 23966
  Date: 2019/6/16
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询了所有账户</h3>

<c:forEach items="${list}" var="account">
    姓名${account.name}<br>
    金额${account.money}<br>
</c:forEach>
</body>
</html>
