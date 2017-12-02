<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - 易买网</title>
</head>
<body>
<%@include file="../include/adminNavigation.jsp"%>	
<div id="main" class="wrap">
	<%@include file="../include/adminMain.jsp"%>
	<div class="main">
		<h2>修改用户</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/user.do" method="post">
				<input type="hidden" name="_method" value="PUT"/>
				<input type="hidden" name="EU_USER_ID" value="${user.EU_USER_ID }"/>
				<table class="form">
					<tr>
						<td class="field">用户名：</td>
						<td><input type="text" class="text" value="${user.EU_USER_NAME }" readonly="readonly" /></td>
					</tr>
					<tr>
						<td class="field">姓名：</td>
						<td><input type="text" class="text" name="EU_USER_NAME" value="${user.EU_USER_NAME }" /></td>
					</tr>
					<tr>
						<td class="field">密码：</td>
						<td><input type="text" class="text" name="EU_PASSWORD" value="${user.EU_PASSWORD }" /></td>
					</tr>
					<tr>
						<td class="field">性别：</td>
						<td>
							<c:choose>
								<c:when test="${user.EU_SEX.equals('男')}">
									<input type="radio" name="EU_SEX" value="男" checked="checked"/>男 
									<input type="radio" name="EU_SEX" value="女"/>女
								</c:when>
								<c:otherwise>
									<input type="radio" name="EU_SEX" value="男"/>男 
									<input type="radio" name="EU_SEX" value="女" checked="checked"/>女
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="field">邮箱：</td>
						<td><input type="text" class="text" name="EU_EMAIL" value="${user.EU_EMAIL}" /></td>
					</tr>
					<tr>
						<td class="field">出生日期：</td>
						<td>
							<select name="birthyear">
								<option value="2000">2000</option>
								<option value="1999" selected="selected">1999</option>
							</select>年
							<select name="birthmonth">
								<option value="12">12</option>
								<option value="11" selected="selected">11</option>
							</select>月
							<select name="birthday">
								<option value="2">2</option>
								<option value="1" selected="selected">1</option>
							</select>日
						</td>
					</tr>
					<tr>
						<td class="field">手机号码：</td>
						<td><input type="text" class="text" name="EU_MOBILE" value="${user.EU_MOBILE }" /></td>
					</tr>
					<tr>
						<td class="field">送货地址：</td>
						<td><input type="text" class="text" name="EU_ADDRESS" value="${user.EU_ADDRESS }" /></td>
					</tr>
					<tr>
						<td class="field">头像：</td>
						<td><input type="file" class="text" name="photo" /></td>
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
