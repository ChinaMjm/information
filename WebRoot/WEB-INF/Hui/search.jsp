<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>search class</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<style>
			.row {
				position: absolute;
				top: 20%;
				left: 35%;
			}
			.row button{margin-top: -10px;}
			p{font-size: 24px;margin-bottom: 20px;}
		</style>
	</head>

	<body>
	<form action="SysCourseController" method="post">
		<div class="row">
			<p>请输入需要查询的班级号</p>
			<div class="col-lg-6">
				<div class="input-group">
					<input type="text" name="banji" class="form-control" placeholder="Search for...">
					<span class="input-group-btn">
        				<button class="btn btn-default" type="submit">Search!</button>
      				</span>
				</div>
				<!-- /input-group -->
			</div>
			<!-- /.col-lg-6 -->
		</div>
		<!-- /.row -->
		</form>
	</body>


</html>
