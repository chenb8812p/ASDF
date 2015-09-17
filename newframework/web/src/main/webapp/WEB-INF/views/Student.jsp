<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: chenyaosakai
  Date: 15/9/14
  Time: 上午11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1>Student</h1>
<form action="${website}queryStu" method="post">
  <input type="text" name="stuName">
  <input type="submit" value="search"><br/>
</form>
<table border="1">
  <thead>
  <tr>
    <th>序号</th>
    <th>姓名</th>
    <th>年级</th>
    <th>班级</th>
    <th>操作</th>
  </tr>
  </thead>
  <c:forEach items="${list}" var="student" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>${student.stuName}</td>
      <td>${student.grade}</td>
      <td>${student.classId}</td>
      <td><button><a href="${website}delStu?studentName=${student.stuName}">删除</a></button>      </td>
    </tr>
  </c:forEach>
</table>
New Student:
  <form action="${website}newStu" method="post">
    Student's name: <input type="text" name="studName">
    Grade:<input type="text" name="grade">
    Class:<input type="text" name="classid">
    <input type="submit" value="Add"><br/>
  </form>

<a href="${website}toindex">返回首页</a>
</body>
</html>
