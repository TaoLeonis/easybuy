<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理 - 易买网</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/news-list.js"></script>
</head>
<body>
	<input type="hidden" id="ctx" value="${pageContext.request.contextPath }" />
	<%@include file="../include/adminNavigation.jsp"%>	
	<div id="main" class="wrap">
		<%@include file="../include/adminMain.jsp"%>
		<div class="main">
			<h2>新闻管理</h2>
			<div class="manage">
				<div class="search">
					<input id="newsSearchUrl" type="hidden" value="${pageContext.request.contextPath }/news/1/${pageInfo.pageSize}/"/>
					新闻主题：<input type="text" class="text" name="enTitle" value="${enTitle }"/> 
					<label class="ui-blue"><input type="button" name="submit" id="btn" value="查询" /></label>
				</div>
				<div class="spacer"></div>
				<table class="list">
					<tr>
						<th>ID</th>
						<th>新闻标题</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${pageInfo.list  }" var="n">
						<tr>
							<td class="first w4 c">${n.enId }</td>
							<td>${n.enTitle}</td>
							<td class="w1 c"><a
								href="${pageContext.request.contextPath }/news/${n.enId }.do">修改</a>
								<form action="${pageContext.request.contextPath }/news.do" method="post" id="delForm${n.enId }">
									<input type="hidden" name="_method" value="DELETE" /> 
									<input type="hidden" name="enId" value="${n.enId }" />
									<a href="javascript:document.getElementById('delForm${n.enId }').submit();">删除</a>
								</form>
							</td>
						</tr>
					</c:forEach>
				</table>
				<!-- 分页导航 -->
				<div class="pager">
					<ul class="clearfix">
						<li><a href="${pageContext.request.contextPath }/news/${pageInfo.prePage}/${pageInfo.pageSize}/${enTitle}.do">上一页</a></li>
						<c:forEach begin="1" end="${pageInfo.pages }" var="i">
							<c:if test="${i eq pageInfo.pageNum }">
								<li class="current">${i}</li>
							</c:if>
							<c:if test="${i ne pageInfo.pageNum }">
							 	<li><a href="${pageContext.request.contextPath }/news/${i}/${pageInfo.pageSize}/${enTitle}.do">${i }</a></li>
							</c:if>
						</c:forEach>
						<li><a href="${pageContext.request.contextPath }/news/${pageInfo.nextPage}/${pageInfo.pageSize}/${enTitle}.do">下一页</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/news-list.js"></script>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>