<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="utf-8" />
		<title>search class</title>
		<link rel="stylesheet" href="HUI/css/bootstrap.min.css" />
		<style>
			h1{position: relative;left: 89%;margin-bottom: 100px;}
			.row {
				position: absolute;
				top: 5%;
				left: 13%;
			}
			.row .col-lg-6{
				position: absolute;
				top: 55%;
				left: 33%;
			}
			.row button{margin-top: 10px;margin-left: 398px;}
			span{font-size: 24px;margin-bottom: 20px;margin-right: 5px;}
			.left1{margin-left: -48px;}
			.left2{margin-left: 48px;}
			.left3{margin-left: 24px;}
			.input-group-btn{margin-left: -145px;}
		</style>

<base href="<%=basePath%>">

<title>My JSP 'course-in.jsp' starting page</title>

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

	<table width="100%" aling="center" border="1">
		<tr>
			<td>
				<table border="1" align="left" >
				<tbody>
					<c:forEach var="teacherCourseOne" items="${courselist}">
						<tr>
							<td>${teacherCourseOne.teacherName }</td>
							<td>${teacherCourseOne.course }</td>
						</tr>
					</c:forEach>
					</tbody>
				</table></td>
		
			<td>
				<table border="1" align="left" >
				<tbody>
					<c:forEach var="classroom" items="${classlist}">
						<tr>
							<td>${classroom.address }</td>
						</tr>
					</c:forEach>
					</tbody>
				</table></td>
		</tr>
	</table>

	<form action="CourseInController" method="post">
		<div class="row" align="center">
			<h1>添加课程</h1>
			<div class="col-lg-6">
				<div class="input-group">
					<input name="grade" type="hidden" value="${grade }">
					<span>班级名称:</span><input name="banji" type="text" class="form-control" placeholder="计算机1501"><br />
					<span>学院名称:</span><input name="xueyuan" type="text" class="form-control" placeholder="计算机学院"><br />
					<span>教师名称:</span><input name="teacherName" type="text" class="form-control" placeholder="张飞"><br />
					<span>课程名称:</span><input name="course" type="text" class="form-control" placeholder="计算机组成原理"><br />
					<span>教室名称:</span><input name="classroom" type="text" class="form-control" placeholder="东一101"><br />
					<span class="left1">课程开始时间:</span><input name="startTime" type="text" class="form-control" placeholder="8：00"><br />
					<span class="left1">课程结束时间:</span><input name="endTime" type="text" class="form-control" placeholder="9：40"><br />
					<span class="left2">周几:</span><input name="week" type="text" class="form-control" placeholder="周一"><br />
					<span class="left3">第几讲:</span><input name="timeNumber" type="text" class="form-control" placeholder="第一讲"><br />
					<span class="input-group-btn">
        				<button class="btn btn-default" type="submit">&nbsp;创&nbsp;&nbsp;建&nbsp;!&nbsp;</button>
      				</span>
				</div>
				<!-- /input-group -->
			</div>
			<!-- /.col-lg-6 -->
		</div>
	</form>

	</element>
</body>
</html>
