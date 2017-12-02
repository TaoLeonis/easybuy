<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>易买网 - 首页</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/function.js"></script>
<style type="text/css">
	#showProduct{
		width:200px;
		height:195px;
	}		
</style>
</head>
<body>
<input type="hidden" id="ctx" value="${pageContext.request.contextPath }"/>
<div id="header" class="wrap">
	<div id="logo"><img src="${pageContext.request.contextPath }/images/logo.gif" /></div>
	<div class="help"><a href="#" class="shopping">购物车</a><a href="login.html">登录</a><a href="register.html">注册</a><a href="guestbook.html">留言</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li class="current"><a href="#">首页</a></li>
			<li><a href="#">图书</a></li>
			<li><a href="#">百货</a></li>
			<li><a href="#">品牌</a></li>
			<li><a href="#">促销</a></li>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			<li class="first"><a href="#">音乐</a></li>
			<li><a href="#">影视</a></li>
			<li><a href="#">少儿</a></li>
			<li><a href="#">动漫</a></li>
			<li><a href="#">小说</a></li>
			<li><a href="#">外语</a></li>
			<li><a href="#">数码相机</a></li>
			<li><a href="#">笔记本</a></li>
			<li><a href="#">羽绒服</a></li>
			<li><a href="#">秋冬靴</a></li>
			<li><a href="#">运动鞋</a></li>
			<li><a href="#">美容护肤</a></li>
			<li><a href="#">家纺用品</a></li>
			<li><a href="#">婴幼奶粉</a></li>
			<li><a href="#">饰品</a></li>
			<li class="last"><a href="#">Investor Relations</a></li>
		</ul>
	</div>
</div>
</body>
</html>