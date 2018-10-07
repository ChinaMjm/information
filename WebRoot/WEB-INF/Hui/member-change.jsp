<%@page import="main.java.login.bean.User"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="HUI/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="HUI/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="HUI/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="HUI/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="HUI/static/h-ui.admin/css/style.css" />
<%
	HttpSession session3 = request.getSession();
	User user = (User) session3.getAttribute("user");
%>
<base href="<%=basePath%>">

<title>信息修改</title>

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
	<form action="ChangeController" method="post">
		<div class="pd-10">
			<table class="table" border="1" width="50%">
				<tbody>
					<tr>
						<th class="text-r">密码：</th>
						<td><input name="password" value="${user.password }"
							style="border-style: none" type="password"></td>
					</tr>
					<tr>
						<th class="text-r">地址：</th>
						<td><input name="address" value="${user.address }"
							style="border-style: none"></td>
					</tr>
					<tr>
						<th class="text-r">电话：</th>
						<td><input name="phone" value="${user.phone }"
							style="border-style: none"></td>
					</tr>
					<tr>
						<th class="text-r" width="80">出生日期：</th>
						<td><input name="chushengTime" value="${user.chushengTime }"
							style="border-style: none"></td>
					</tr>
					
				</tbody>

			</table>
		</div>
		 <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;&nbsp;提&nbsp;交&nbsp;&nbsp;">
	</form>
</body>
</html>
