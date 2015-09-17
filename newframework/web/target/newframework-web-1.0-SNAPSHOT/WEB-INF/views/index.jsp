<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Hello</title>
</head>
<body>
Hello, ${currentUser.userName}<br/>
<a href="${website}tostudent">查看学生</a><br/>
<a href="${website}toleason">查看课程</a><br/>
<a href="${website}toscore">查看成绩</a><br/>
</body>
</html>