<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'teacherShow.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	学生成绩如下：
	<table border="1">
	<thead>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>${course }</td>
		</tr>
	</thead>
		<tbody>
			<c:forEach items="${showAllList }" var="showAllList2">
				<tr>
					<c:forEach var="list" items="${showAllList2}">
						<td>${list }</td>
					</c:forEach>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
