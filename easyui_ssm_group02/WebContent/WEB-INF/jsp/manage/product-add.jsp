<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h2>添加商品</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/product.do" method="post" enctype="multipart/form-data">
				<table class="form">
					<tr>
						<td class="field">商品名称：</td>
						<td><input type="text" class="text" name="epName"  /></td>
					</tr>
					<tr>
						<td class="field">所属分类：</td>
						<td>
							<select name=epcId>
								<c:forEach items="${categoryList}" var="c1">
									<c:if test="${c1.epcParentId==0}">
										<option value="${c1.epcId }">${c1.epcName }</option>
										<c:forEach items="${categoryList}" var="c2">
											<c:if test="${c1.epcId==c2.epcParentId}">
												<option value="${c2.epcId }">├ ${c2.epcName }</option>
											</c:if>
										</c:forEach>
									</c:if>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td class="field">商品图片：</td>
						<td><input type="file" class="text" name="photo" /></td>
					</tr>
					<tr>
						<td class="field">商品价格：</td>
						<td><input type="text" class="text tiny" name="epPrice"/> 元</td>
					</tr>
					<tr>
						<td class="field">商品描述：</td>
						<td><input type="text" class="text" name="epDescription"  /></td>
					</tr>
					<tr>
						<td class="field">库存：</td>
						<td><input type="text" class="text tiny" name="epStock"  /></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
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
