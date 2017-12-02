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
		<h2>商品管理</h2>
		<div class="manage">
			<div class="search">
				<input id="productSearchUrl" type="hidden" value="${pageContext.request.contextPath }/product/1/${pageInfo.pageSize}/"/>
					ID：<input type="text" class="text" name="epId" value="${epId}"/> 
					商品名称：<input type="text" class="text" name="epName" value="${epName}"/> 
					<label class="ui-blue">
						<input type="button" name="submit" id="btn" value="查询" />
					</label>
				
			</div>
			<div class="spacer"></div>
			<table class="list">
				<tr>
					<th>ID</th>
					<th>商品名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list}" var="product">
					<tr>
						<td class="first w4 c">${product.epId}</td>
						<td class="thumb"><img src="../images/product/0_tiny.gif" />
							<a href="../product-view.html" target="_blank">${product.epName}</a>
						</td>
						<td class="w1 c">
							<a href="${pageContext.request.contextPath }/product/${product.epId}.do">修改</a> 
							<form action="${pageContext.request.contextPath }/product.do" method="post" id="delProduct${product.epId}">
								<input type="hidden" name="_method" value="DELETE" /> 
								<input type="hidden" name="epId" value="${product.epId}" />
								<a href="javascript:document.getElementById('delProduct${product.epId}').submit();">删除</a>
							</form>
						</td>
					</tr>
				</c:forEach>
			</table>
			<!-- 分页导航 -->
			<div class="pager">
				<ul class="clearfix">
					<li><a href="${pageContext.request.contextPath }/product/${pageInfo.prePage}/${pageInfo.pageSize}/${epId}/${epName}.do">上一页</a></li>
					<c:forEach begin="1" end="${pageInfo.pages }" var="i">
						<c:if test="${i eq pageInfo.pageNum }">
							<li class="current">${i}</li>
						</c:if>
						<c:if test="${i ne pageInfo.pageNum }">
						 	<li><a href="${pageContext.request.contextPath }/product/${i}/${pageInfo.pageSize}/${epId}/${epName}.do">${i }</a></li>
						</c:if>
					</c:forEach>
					<li><a href="${pageContext.request.contextPath }/product/${pageInfo.nextPage}/${pageInfo.pageSize}/${epId}/${epName}.do">下一页</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/product-list.js"></script>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>