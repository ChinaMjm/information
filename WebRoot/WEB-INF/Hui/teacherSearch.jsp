<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="HUI/css/bootstrap.min.css" />
		<style>
			p{margin-left: 12%;font-size: 22px;font-weight: bold;}
			.row {
				position: absolute;
				top: 25%;
				left: 6%;
			}
			.row button{margin-top: 10px;margin-left: 446px;}
			span{font-size: 24px;margin-bottom: 20px;margin-right: 5px;}
		</style>
    
    <title>My JSP 'teacherSearch.jsp' starting page</title>
    
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
  	 
<p>目前所教班级和课程</P>
    <table  class="table table-hover table-condensed" align="left">
    	<thead>
    		<tr>
    			<td>学院代号</td>
    			<td>课程名称</td>
    			<td>课程代号</td>
    			<td>所属班级</td>
    		</tr>
    	</thead>
    	<tbody >
    		<c:forEach var="listAll2" items="${listAll}">
    		<tr>
    			<c:forEach var="list" items="${listAll2}">
    			<td>${list }</td>
    			</c:forEach>
    		</tr>	
    		</c:forEach>
    	</tbody>
    </table>
   <br><br><br><br><br>
    <form action="GradeShowController" method="post" >
    <div class="row" >
			<div class="col-lg-6">
				<div class="input-group">
					<span>请输入需要查询的学院代号:</span><input name="xueyuan" type="text" class="form-control" placeholder="Search for..."><br />
					<span style="letter-spacing: 5px;">请输入需要查询的班级:</span><input name="banji" type="text" class="form-control" style="margin-left: -6px;" placeholder="Search for..."><br />
					<span >请输入需要查询的课程代号:</span><input name="course" type="text" class="form-control" placeholder="Search for..."><br />
					<span class="input-group-btn">
        				<button class="btn btn-default" type="submit">Search!</button>
      				</span>
				</div>
				<!-- /input-group -->
			</div>
			<!-- /.col-lg-6 -->
		</div>
    </form>
   
  </body>
</html>
