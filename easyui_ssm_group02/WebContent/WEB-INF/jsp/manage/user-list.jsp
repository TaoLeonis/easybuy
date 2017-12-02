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
		<h2>用户管理</h2>
		<div class="manage">
			<div class="search">
				<input id="userSearchUrl" type="hidden" value="${pageContext.request.contextPath }/user/1/${pageInfo.pageSize}/"/>
				姓名：<input type="text" class="text" name="EU_USER_NAME" value="${EU_USER_NAME }"/> 
				<label class="ui-blue">
					<input type="button" name="submit" id="btn" value="查询" />
				</label>
			</div>
			<div class="spacer"></div>
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>性别</th>
					<th>Email</th>
					<th>手机</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list }" var="user">
				<tr>
					<td class="first w4 c">${user.EU_USER_ID}</td>
					<td class="w1 c">${user.EU_USER_NAME}</td>				
					<td class="w2 c">${user.EU_SEX}</td>
					<td>${user.EU_EMAIL}</td>
					<td class="w4 c">${user.EU_MOBILE}</td>
					<td class="w1 c">
						<a href="${pageContext.request.contextPath }/user/${user.EU_USER_ID}.do">修改</a>
						<form action="${pageContext.request.contextPath }/user.do" method="post" id="delUser${user.EU_USER_ID}">
							<input type="hidden" name="_method" value="DELETE" /> 
							<input type="hidden" name="EU_USER_ID" value="${user.EU_USER_ID}" />
							<a href="javascript:document.getElementById('delUser${user.EU_USER_ID}').submit();">删除</a>
						</form>
					</td>
				</tr>
				</c:forEach>
			</table>
			<!-- 分页导航 -->
			<div class="pager">
				<ul class="clearfix">
					<li><a href="${pageContext.request.contextPath }/user/${pageInfo.prePage}/${pageInfo.pageSize}/${EU_USER_NAME}.do">上一页</a></li>
					<c:forEach begin="1" end="${pageInfo.pages }" var="i">
						<c:if test="${i eq pageInfo.pageNum }">
							<li class="current">${i}</li>
						</c:if>
						<c:if test="${i ne pageInfo.pageNum }">
						 	<li><a href="${pageContext.request.contextPath }/user/${i}/${pageInfo.pageSize}/${EU_USER_NAME}.do">${i }</a></li>
						</c:if>
					</c:forEach>
					<li><a href="${pageContext.request.contextPath }/user/${pageInfo.nextPage}/${pageInfo.pageSize}/${EU_USER_NAME}.do">下一页</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/user-list.js"></script>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>