<!-- 这段是管理员用来创建学生用户的界面 -->
<!DOCTYPE html>
<html>
<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8"%>
<head>
<meta charset="UTF-8">
<title>Personal Information</title>
<link rel="stylesheet" href="HUI/css/H-ui.css" />
<style>
body {
	background: #F0F0F0;
}

a:hover {
	text-decoration: none;
	color: black;
}

li {
	list-style: none;
}

.One {
	width: 600px;
	height: 600px;
	margin: auto;
	margin-top: 30px;
	background: white;
}

.Two_nav {
	width: 540px;
	height: 60px;
	margin: auto;
	border-bottom: 2px solid #222222;
}

.qqq {
	padding-top: 14px;
	padding-bottom: 14px;
	margin-left: 0px;
	border-bottom: 2px solid red;
	width: 80px;
}

.qqq a {
	font-size: 20px;
	font-family: "微软雅黑";
}

.Three_Information {
	width: 750px;
	height: 400px;
	margin: auto;
	margin-top: 20px;
}

.HeadPic {
	width: 500px;
	height: 120px;
	margin: auto;
}

.HeadPic img {
	width: 120px;
	height: 120px;
	margin-left: -30px;
}

.HeadPic button {
	margin-bottom: -100px;
	margin-left: 20px;
	width: 70px;
}

.touxiang {
	position: relative;
	bottom: 50px;
	left: -40px;
	font-weight: bold;
	font-size: 16px;
}

.infor {
	width: 500px;
	height: 260px;
	margin: auto;
	margin-top: 20px;
}

.infor ul li {
	margin-left: -20px;
	margin-bottom: 10px;
	font-size: 16px;
}

.infor ul li a {
	font-family: arial;
	font-size: 14px;
}

.infor ul li span {
	font-weight: bold;
}

.right {
	position: relative;
	top: -109%;
	left: 50%;
}

#create {
	position: absolute;
	bottom: -110%;
	left: -15%;
	width: 100px
}

.span {
	letter-spacing: 10px;
}
</style>

</head>
<form action="xueshengController" method="post">

	<div class="One">
		<div class="Two_nav">
			<ul>
				<li class="qqq"><a>个人信息</a>
				</li>
			</ul>
		</div>

		<div class="infor">
			<ul>
				<li><span class="span">姓名：</span><a><input name="realname">
				</a>
				</li>
				<li><span class="span">学号：</span><a><input name="username">
				</a>
				</li>
				<li><span class="span">密码：</span><a><input name="password"
						value="123456">
						<li><span class="span">性别：</span><a><input name="sex">
						</a>
					</li>
						<li><span>出生日期：</span><a><input name="chushengTime">
						</a>
					</li>
						<li><span>家庭住址：</span><a><input name="address">
						</a>
					</li>
						<li><span class="span">学院：</span><a><input
								name="professional">
						</a>
					</li>
						<li><span class="span">年级：</span><a><input name="grade">
						</a>
					</li>
			</ul>
			<ul class="right">
				<li><span class="span">专业：</span><a><input name="zhuanye">
				</a>
				</li>
				<li><span class="span">班级：</span><a><input name="banji">
				</a>
				</li>
				<li><span>专业代号：</span><a><input name="zhuanyedaihao">
				</a>
				</li>
				<li><span>联系电话：</span><a><input name="phone">
				</a>
				</li>
				<li><span>入学时间：</span><a><input name="ruxueIime">
				</a>
				</li>
				<li><span><input type="submit" id="create" value="生成">
				</span>
				<li>
			</ul>
		</div>
	</div>
	</div>

</form>
</html>
