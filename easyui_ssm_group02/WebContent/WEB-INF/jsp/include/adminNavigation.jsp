<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header" class="wrap">
		<div id="logo">
			<img src="${pageContext.request.contextPath }/images/logo.gif" />
		</div>
		<div class="help">
			<a href="${pageContext.request.contextPath }/">返回前台页面</a>
		</div>
		<div class="navbar">
			<ul class="clearfix">
				<li>
					<a href="${pageContext.request.contextPath }/">首页</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/user/1/3//.do">用户</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/product/1/3/1/.do">商品</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/order/1/3/1/.do">订单</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/comment/1/3//.do">留言</a>
				</li>
				<!-- <li class="current"> -->
				<li>
					<a href="${pageContext.request.contextPath }/news/1/3//.do">新闻</a>
				</li>
			</ul>
		</div>
	</div>
		<% Date date = new Date(); 
 		SimpleDateFormat t = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 		String time = t.format(date);
		%>
	<div id="childNav">
		<div class="welcome wrap">管理员pillys您好，今天是<%= time %>，欢迎回到管理后台。</div>
	</div>
	<div id="position" class="wrap">
		您现在的位置：<a href="index.html">易买网</a> &gt; 管理后台
	</div>
</body>
</html>