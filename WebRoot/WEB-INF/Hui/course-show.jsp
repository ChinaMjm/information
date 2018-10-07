<%@page import="main.java.course.bean.PaikeOne"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
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
<title>我的桌面</title>
<%!//全局变量
	String week;
	int timeNumber;%>

</head>
<body>

		
	<div class="page-container">
		<p class="f-20 text-success">
			欢迎查看当前学期个人课表 <span class="f-14"></span>
		</p>
		<table class="table table-border table-bordered table-bg">
			<thead>
				<tr>
					<th colspan="8" scope="col">当前学年课程显示</th>
				</tr>
				<tr class="text-c">
					<th width="10%">星期一</th>
					<th width="10%">星期二</th>
					<th width="10%">星期三</th>
					<th width="10%">星期四</th>
					<th width="10%">星期五</th>
					<th width="10%">星期六</th>
					<th width="10%">星期日</th>
				</tr>
			</thead>
			<tbody>
			
			<%
				HttpSession session3 = request.getSession();
				PaikeOne [][]arr = (PaikeOne [][])session3.getAttribute("arr");
				for(int j=0;j<5;j++){
			 %>
				<tr class="text-c">
				<% 
					for(int i=0;i<7;i++){
						if(arr[j][i]!=null){	
				%>
					<td width="10%" height=70px>教师:<%=arr[j][i].getTeacher() %>  教室:<%=arr[j][i].getClassroom() %>
						课程:<%=arr[j][i].getCourse() %>
					</td>
			
				<% 
						}else{
				%>
					<td width="10%" height=70px></td>
				<% 							
						}
					}
				%>	
				</tr>
				<%
				}
				 %>
				
			</tbody>
		</table>
	</div>

	<footer class="footer mt-20">
		<div class="container">
			<p>个人课表</p>
		</div>
	</footer>
	<script type="text/javascript" src="HUI/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="HUI/static/h-ui/js/H-ui.min.js"></script>
	<!--此乃百度统计代码，请自行删除-->
	<script>
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>
	<!--/此乃百度统计代码，请自行删除-->
</body>
</html>