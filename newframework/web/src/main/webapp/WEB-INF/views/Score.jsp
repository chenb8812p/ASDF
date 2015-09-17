<%@ page import="com.pandawork.service.StudentService" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page import="com.pandawork.common.entity.Student" %>
<%@ page import="com.pandawork.service.impl.StudentServiceImpl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: chenyaosakai
  Date: 15/9/14
  Time: 上午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Score</title>
</head>
<body>
<h1>Score</h1>
<table border="1">
  <thead>
  <tr>
    <th>序号</th>
    <th>姓名</th>
    <th>课程</th>
    <th>成绩</th>
  </tr>
  </thead>
  <c:forEach items="${scoreList}" var="score" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>${score.studentName}</td>
      <td>${score.leasonName}</td>
      <td>${score.score}</td>
    </tr>
  </c:forEach>
</table>
<hr/>
<h3>添加分数</h3>
<form action="${website}newScore" method="post">
  学生姓名：<input type="text" name="StudName">
  课程名：<input type="text" name="LeasName">
  分数：<input type="text" name="Score">
  <input type="submit" value="添加">
</form>
<a href="${website}toindex">返回首页</a>

</body>
</html>
