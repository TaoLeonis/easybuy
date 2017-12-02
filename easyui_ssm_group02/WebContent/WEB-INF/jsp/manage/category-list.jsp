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
		<h2>分类管理</h2>
		<div class="manage">
			<div class="search">
				<input id="categorySearchUrl" type="hidden" value="${pageContext.request.contextPath }/category/1/${pageInfo.pageSize}/"/>	
				   分类名称：<input type="text" class="text" name="epcName" />
				 <label class="ui-blue">
				 	<input type="button" name="submit" id="btn" value="查询" />
				 </label>
			</div>
			<div class="spacer"></div>
			<table class="list">
				<tr>
					<th>ID</th>
					<th>分类名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list}" var="category">
				<tr>
						<td class="first w4 c">${category.epcId}</td>
						<td>${category.epcName}</td>
						<td class="w1 c">
							<a href="${pageContext.request.contextPath }/category/${category.epcId}.do">修改</a> 
							<form action="${pageContext.request.contextPath }/category.do" method="post" id="delCategory${category.epcId}">
									<input type="hidden" name="_method" value="DELETE" /> 
									<input type="hidden" name="epcId" value="${category.epcId}" />
									<a href="javascript:document.getElementById('delCategory${category.epcId}').submit();">删除</a>
							</form>
						</td>
					</tr>
				<%-- <c:if test="${empty category.epcParentId || category.epcParentId==0}">
					<tr>
						<td class="first w4 c">${category.epcId}</td>
						<td>${category.epcName}</td>
						<td class="w1 c">
							<a href="${pageContext.request.contextPath }/category/${category.epcId}.do">修改</a> 
							<form action="${pageContext.request.contextPath }/category.do" method="post" id="delCategory${category.epcId}">
									<input type="hidden" name="_method" value="DELETE" /> 
									<input type="hidden" name="epcId" value="${category.epcId}" />
									<a href="javascript:document.getElementById('delCategory${category.epcId}').submit();">删除</a>
							</form>
						</td>
					</tr>
					
				
				<c:forEach items="${pageInfo.list}" var="category2">
					<c:if test="${category2.epcParentId!=null}">
						<tr>
								<td class="first w4 c">${category2.epcId}</td>
								<td class="childClass">${category2.epcName}</td>
								<td class="w1 c">
									<a href="${pageContext.request.contextPath }/category/${category2.epcId}.do">修改</a> 
									<form action="${pageContext.request.contextPath }/category.do" method="post" id="delCategory${category2.epcId}">
											<input type="hidden" name="_method" value="DELETE" /> 
											<input type="hidden" name="epcId" value="${category2.epcId}" />
											<a href="javascript:document.getElementById('delCategory${category2.epcId}').submit();">删除</a>
									</form>
								</td>
						</tr>		
					</c:if>
					
				</c:forEach>
				</c:if> --%>
			</c:forEach>		
			</table>
			<!-- 分页导航 -->
			<div class="pager">
				<ul class="clearfix">
					<li><a href="${pageContext.request.contextPath }/category/${pageInfo.prePage}/${pageInfo.pageSize}/${epcName}.do">上一页</a></li>
					<c:forEach begin="1" end="${pageInfo.pages }" var="i">
						<c:if test="${i eq pageInfo.pageNum }">
							<li class="current">${i}</li>
						</c:if>
						<c:if test="${i ne pageInfo.pageNum }">
						 	<li><a href="${pageContext.request.contextPath }/category/${i}/${pageInfo.pageSize}/${epcName}.do">${i }</a></li>
						</c:if>
					</c:forEach>
					<li><a href="${pageContext.request.contextPath }/category/${pageInfo.nextPage}/${pageInfo.pageSize}/${epcName}.do">下一页</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/manage/category-list.js"></script>
<%@include file="../include/adminFooter.jsp"%>
</body>
</html>