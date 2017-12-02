<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h2>修改商品</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/product.do" method="post">
			    <input type="hidden" name="_method" value="PUT"/>
			    <input type="hidden" name="epId" value="${product.epId}"/>
				<table class="form">
					<tr>
						<td class="field">商品名称：</td>
						<td><input type="text" class="text" name="epName" value="${product.epName }" /></td>
					</tr>
					<tr>
						<td class="field">所属分类：</td>
						<td>
							<select name="parentId">
								<option value="1">电器</option>
								<option value="3">├ 电器</option>
								<option value="3">└ 电器</option>
								<option value="2">衣服</option>
								<option value="3">├ 电器</option>
								<option value="3">└ 电器</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="field">商品图片：</td>
						<td><input type="file" class="text" value="photo" /></td>
					</tr>
					<tr>
						<td class="field">商品价格：</td>
						<td><input type="text" class="text tiny" name="epPrice" value="${product.epPrice}" /> 元</td>
					</tr>
					<tr>
						<td class="field">商品描述：</td>
						<td><input type="text" class="text" name="epDescription" value="${product.epDescription}" /></td>
					</tr>
					<tr>
						<td class="field">库存：</td>
						<td><input type="text" class="text tiny" name="epStock" value="${product.epStock }" /></td>
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
