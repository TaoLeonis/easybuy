<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - 易买网</title>
</head>
<body>
<%@include file="../include/adminNavigation.jsp"%>	
<div id="main" class="wrap">
	<%@include file="../include/adminMain.jsp"%>
	<div class="main">
		<h2>修改分类</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/category.do" method="post">
			    <input type="hidden" name="_method" value="PUT"/>
				<input type="hidden" name="epcId" value="${category.epcId }"/>
				<table class="form">
					<tr>
						<td class="field">父分类：</td>
						<td>
							<select name="epcParentId">
							<c:forEach items="${categoryList }" var="c">
								<c:if test="${empty c.epcParentId || c.epcParentId==0}">
									<c:choose>
   									<c:when test="${category.epcParentId==c.epcId}">  
     									<option value="${c.epcId }" selected="selected">${c.epcName }</option>
								   </c:when>
								   <c:otherwise> 
										<option value="${c.epcId }">${c.epcName }</option>
								   </c:otherwise>
								</c:choose> 
								</c:if>
							</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td class="field">分类名称：</td>
						<td><input type="text" class="text" name="epcName" value="${category.epcName}" /></td>
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
