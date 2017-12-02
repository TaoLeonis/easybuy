<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理 - 易买网-留言</title>
</head>
<body>
<%@include file="../include/adminNavigation.jsp"%>	
<div id="main" class="wrap">
	<%@include file="../include/adminMain.jsp"%>
	<div class="main">
		<h2>留言管理</h2>
		<div class="manage">
			<div class="search">
			
				<input id="commentSearchUrl" type="hidden" value="${pageContext.request.contextPath }/comment/1/${pageInfo.pageSize}/"/>
				姓名：<input type="text" class="text" name="ecNickName" value="${ecNickName }"/> 
				<label class="ui-blue"><input type="button" name="submit" id="btn" value="查询" /></label>
			
				<!-- <form method="get">
					ID：<input type="text" class="text" name="ecId" /> 姓名：<input type="text" class="text" name="ecNickName" /> <label class="ui-blue"><input type="submit" name="submit" value="查询" /></label>
				</form> -->
			</div>
			<div class="spacer"></div>
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>留言内容</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list  }" var="comment">
					<tr>
						<td class="first w4 c">${comment.ecId}</td>
						<td class="w1 c">${comment.ecNickName}</td>
						<td>${comment.ecContent}</td>
						<c:if test="${comment.ecReply!=null}">
						<td class="w1 c">已回复</td>
						</c:if>
						<c:if test="${comment.ecReply==null}">
						<td class="w1 c"> </td>
						</c:if>
						<td class="w1 c">
							<a href="${pageContext.request.contextPath }/comment/${comment.ecId}.do">回复</a>
						<form action="${pageContext.request.contextPath }/comment.do" method="post" id="delForm${comment.ecId }">
							<input type="hidden" name="_method" value="DELETE"/>
							<input type="hidden" name="ecId" value="${comment.ecId }"/>
							<!-- <input type="submit" value="删除"/> -->
							<a href="javascript:document.getElementById('delForm${comment.ecId }').submit();">删除</a>
						</form>
							
						</td>
					</tr>
				</c:forEach>
			</table>
			<!-- 分页导航 -->
				<div class="pager">
					<ul class="clearfix">
						<li><a href="${pageContext.request.contextPath }/comment/${pageInfo.prePage}/${pageInfo.pageSize}/${ecNickName}.do">上一页</a></li>
						<c:forEach begin="1" end="${pageInfo.pages }" var="i">
							<c:if test="${i eq pageInfo.pageNum }">
								<li class="current">${i}</li>
							</c:if>
							<c:if test="${i ne pageInfo.pageNum }">
							 	<li><a href="${pageContext.request.contextPath }/comment/${i}/${pageInfo.pageSize}/${ecNickName}.do">${i }</a></li>
							</c:if>
						</c:forEach>
						<li><a href="${pageContext.request.contextPath }/comment/${pageInfo.nextPage}/${pageInfo.pageSize}/${ecNickName}.do">下一页</a></li>
					</ul>
				</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/comment-list.js"></script>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>