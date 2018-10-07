<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<base href="<%=basePath%>">

<title>个人成绩</title>
<link rel="stylesheet" type="text/css" href="HUI/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="HUI/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="HUI/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="HUI/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="HUI/static/h-ui.admin/css/style.css" />
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

<font color="black" size="3" >已出成绩单:</font>
	<table border="1" class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
		<thead>
			<tr class="text-c">
					<th>班级</th>
				<c:forEach var="listName" items="${listName}" begin="2">
					<th width="10%">${listName }</th>
				</c:forEach>
			</tr>
		</thead>
		<tbody>
			<tr class="text-c">
				<c:forEach var="listValue" items="${listValue}" begin="3">

					<th width="10%">${listValue}</th>
				</c:forEach>
			</tr>
		</tbody>
	</table>

</body>
</html>
