<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h2>修改订单</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/order.do" method="post">
				<input type="hidden" name="_method" value="PUT"/>
				<input type="hidden" name="eoUserId" value="${order.eoUserId }"/>
				<input type="hidden" name="eoUserAddress" value="${order.eoUserAddress}"/>
				<input type="hidden" name="eoCreateTime" value="${order.eoCreateTime}"/>
				<input type="hidden" name="eoCost" value="${order.eoCost}"/>
				<input type="hidden" name="eoStatus" value="${order.eoStatus}"/>
				<input type="hidden" name="eoType" value="${order.eoType}"/>
				<table class="form">
					<tr>
						<td class="field">订单ID：</td>
						<td><input type="text" class="text" name="eoId" value="${order.eoId }" readonly="readonly" /></td>
					</tr>
					<tr>
						<td class="field">订购人姓名：</td>
						<td><input type="text" class="text" name="eoUserName" value="${order.eoUserName}" /></td>
					</tr>
					<tr>
						<td class="field">...：</td>
						<td>...</td>
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