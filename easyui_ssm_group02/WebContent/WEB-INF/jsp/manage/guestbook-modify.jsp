<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 -易买网-留言回复</title>
</head>
<body>
<%@include file="../include/adminNavigation.jsp"%>	
<div id="main" class="wrap">
	<%@include file="../include/adminMain.jsp"%>
	<div class="main">
		<h2>回复留言</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/comment.do" method="post">
			<input type="hidden" name="_method" value="PUT"/>
			<%-- <input type="hidden" name="ecReplyTime" value="${commment.ecReplyTime}"/> --%>
				<table class="form">
					<tr>
						<td class="field">留言ID：</td>
						<td><input type="text" class="text" name="ecId" value="${comment.ecId}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td class="field">留言姓名：</td>
						<td><input type="text" class="text" name="ecNickName" value="${comment.ecNickName}" /></td>
					</tr>
					<tr>
						<td class="field">留言内容：</td>
						<td><input type="text" class="text" name="ecContent" value="${comment.ecContent}" /></td>
					</tr>
					<tr>
						<td class="field">回复内容：</td>
						<td><textarea name="ecReply">${comment.ecReply}</textarea></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="更新" /></label></td>
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
