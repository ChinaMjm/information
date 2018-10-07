
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%> 
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Banzhuren.jsp' starting page</title>
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
  <div class="page-container">
  <p class="f-20 text-success">
			学生成绩单 <span class="f-14"></span>
		</p>
  <table border="1" class="table table-border table-bordered table-bg">
		<thead>
			<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>学生名字</th>
			<th>班级</th>
				<c:forEach var="listName" items="${listName}" begin="2">
					<th width="10%">${listName }</th>
				</c:forEach>
			</tr>
		</thead>
		<tbody>
		
				<c:forEach var="listTest2" items="${listTest}">
			<tr>
					<c:forEach var="listTest3" items="${listTest2}">
					<th width="10%">${listTest3}</th>
					</c:forEach>
			</tr>
				</c:forEach>
			
			
		</tbody>
	</table>
	</div>
  </body>
</html>
