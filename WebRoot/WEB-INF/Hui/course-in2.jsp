<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>


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
				left: 33%;
			}
			.row button{margin-top: 10px;margin-left: 398px;}
			span{font-size: 24px;margin-bottom: 20px;margin-right: 5px;}
		</style>
	</head>

	<body>
	<form action="CourseInSearcheController" method="post">
		<div class="row">
			
			<div class="col-lg-6">
				<div class="input-group">
					<span>请输入需要查询的年级:</span><input name="grade" type="text" class="form-control" placeholder="Search for..."><br />
					<span>请输入需要查询的课程:</span><input name="course" type="text" class="form-control" placeholder="Search for..."><br />
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
