<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><%--
  Created by IntelliJ IDEA.
  User: chenyaosakai
  Date: 15/9/14
  Time: 上午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Leason</title>
</head>
<body>
<h1>Leason</h1>
<table border="1">
  <thead>
  <tr>
    <th>序号</th>
    <th>课程名</th>
    <th>任课教师</th>
  </tr>
  </thead>
  <c:forEach items="${leasonList}" var="leason" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>${leason.leasonName}</td>
      <td>${leason.teacher}</td>
    </tr>
  </c:forEach>
</table>
<a href="${website}toindex">返回首页</a>

</body>
</html>
