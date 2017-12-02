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
		<h2>订单管理</h2>
		<div class="manage">
			<div class="search">
			
				<input id="orderSearchUrl" type="hidden" value="${pageContext.request.contextPath }/order/1/${pageInfo.pageSize}/"/>
				订单号：<input type="text" class="text" name="eoId" value="${eoId}"/>
				姓名：<input type="text" class="text" name="eoUserName" value="${eoUserName }"/> 
				<label class="ui-blue"><input type="button" name="submit" id="btn" value="查询" /></label>
				
				<!-- <form method="get">
					订单号：<input type="text" class="text" name="eoId" /> 订货人：<input type="text" class="text" name="eoUserName" /> <label class="ui-blue"><input type="submit" name="submit" value="查询" /></label>
				</form> -->
			</div>
			<div class="spacer"></div>
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>发货地址</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list  }" var="order">
					<tr>
						<td class="first w4 c">${order.eoId }</td>
						<td class="w1 c">${order.eoUserName }</td>
						<td>${order.eoUserAddress }</td>
						<td class="w1 c">${order.eoStatus }</td>
						<td class="w1 c">
							<a href="${pageContext.request.contextPath }/order/${order.eoId }.do">修改</a> 
							<form action="${pageContext.request.contextPath }/order.do" method="post" id="delOrder${order.eoId }">
								<input type="hidden" name="_method" value="DELETE" /> 
								<input type="hidden" name="eoId" value="${order.eoId }" />
								<a href="javascript:document.getElementById('delOrder${order.eoId}').submit();">删除</a>
							</form>
						</td>
					</tr>				
				</c:forEach>
			</table>
			<!-- 分页导航 -->
				<div class="pager">
					<ul class="clearfix">
						<li><a href="${pageContext.request.contextPath }/order/${pageInfo.prePage}/${pageInfo.pageSize}/${eoId}/${eoUserName}.do">上一页</a></li>
						<c:forEach begin="1" end="${pageInfo.pages }" var="i">
							<c:if test="${i eq pageInfo.pageNum }">
								<li class="current">${i}</li>
							</c:if>
							<c:if test="${i ne pageInfo.pageNum }">
							 	<li><a href="${pageContext.request.contextPath }/order/${i}/${pageInfo.pageSize}/${eoId}/${eoUserName}.do">${i }</a></li>
							</c:if>
						</c:forEach>
						<li><a href="${pageContext.request.contextPath }/order/${pageInfo.nextPage}/${pageInfo.pageSize}/${eoId}/${eoUserName}.do">下一页</a></li>
					</ul>
				</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/order-list.js"></script>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>