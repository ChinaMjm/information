<%@page import="main.java.login.bean.User"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8"%>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
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
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>用户查看</title>
<%
	HttpSession session3 = request.getSession();
	User user = (User) session3.getAttribute("user");
%>
</head>
<body>
	<div class="cl pd-20" style=" background-color:#5bacb6">
		<a href="image-get.jsp"> <img class="avatar size-XL l" width="10%"
			height="15%" src="http://localhost:8080/photo/${user.username}.jpg">
		</a>
		<dl style="margin-left:80px; color:#fff">
			<dt>
				<span class="f-18">${user.realname}</span> <span class="pl-10 f-12">sss</span>
			</dt>
			<dd class="pt-10 f-12" style="margin-left:0">备注功能待开发中</dd>
		</dl>
	</div>
	<div class="pd-5">
		<table class="table" border="1" width="10%">
			<tbody>
				<tr>
					<th class="text-r">身份：</th>
					<td>${user.role }</td>
				</tr>
				<tr>
					<th class="text-r">用户名：</th>
					<td>${user.username }</td>
				</tr>
				<tr>
					<th class="text-r" width="80">性别：</th>
					<td>${user.sex }</td>
				</tr>
				<tr>
					<th class="text-r">地址：</th>
					<td>${user.address }</td>
				</tr>
				<tr>
					<th class="text-r">电话：</th>
					<td>${user.phone }</td>
				</tr>
				<tr>
					<th class="text-r" width="80">出生日期：</th>
					<td>${user.chushengTime }</td>
				</tr>
				<%
					if (user.getRole().equals("学生")) {
				%>
				<tr>
					<th class="text-r">专业班级：</th>
					<td>${user.professional }</td>
				</tr>
				<tr>
					<th class="text-r" width="100">入学日期：</th>
					<td>${user.ruxueTime }</td>
				</tr>
				<tr>
					<th class="text-r">年级：</th>
					<td>${user.grade}</td>
				</tr>
				<%
					}
				%>
			</tbody>

		</table>
		<br>

		<form action="member-change.jsp">
			<input name="" type="submit" class="btn btn-success radius size-L"
				value="&nbsp;修&nbsp;改&nbsp;信&nbsp;息&nbsp;">
		</form>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
</body>
</html>