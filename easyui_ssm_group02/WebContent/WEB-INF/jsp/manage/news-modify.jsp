<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理 - 易买网</title>
</head>
<body>
<%@include file="../include/adminNavigation.jsp"%>	
<div id="main" class="wrap">
	<%@include file="../include/adminMain.jsp"%>
	<div class="main">
		<h2>修改新闻</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/news.do" method="post">
				<input type="hidden" name="_method" value="PUT"/>
				<input type="hidden" name="enId" value="${news.enId }"/>
				<input type="hidden" name="enCreateTime" value="${news.enCreateTime}"/>
				<table class="form">
					<tr>
						<td class="field">新闻标题：</td>
						<td><input type="text" class="text" name=enTitle value="${news.enTitle }" /></td>
					</tr>
					<tr>
						<td class="field">新闻内容：</td>
						<td><textarea name="enContent" >${news.enContent }</textarea></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="修改" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</div>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>