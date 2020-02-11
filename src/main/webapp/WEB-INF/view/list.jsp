<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/index3.css"/>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="list" method="post">
		<table>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
			</tr>
			<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.id }</td>
				<td>${s.name }</td>
				<td>${s.gender }</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>