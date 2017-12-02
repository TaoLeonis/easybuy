<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - 易买网</title>
<script src="../../js/category-add.js"></script>
</head>
<body>
<%@include file="../include/adminNavigation.jsp"%>	
<div id="main" class="wrap">
	<%@include file="../include/adminMain.jsp"%>
	<div class="main">
		<h2>添加分类</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/category.do" method="post"/>
				<table class="form">
					<tr>
						<td class="field" name="">父分类：</td>
						<td>
							<select name="epcParentId">
							<option value="0" selected="selected">根栏目</option>
								<c:forEach items="${categoryList }" var="category">								     
									<c:if test="${empty category.epcParentId || category.epcParentId==0}">									   
										<option value="${category.epcId }">${category.epcName }</option>
									</c:if>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td class="field">分类名称：</td>
						<td><input type="text" class="text" name="epcName"  /></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="新增" /></label></td>
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
