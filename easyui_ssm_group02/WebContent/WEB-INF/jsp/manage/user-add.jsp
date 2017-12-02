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
		<h2>新增用户</h2>
		<div class="manage">
			<form action="${pageContext.request.contextPath }/user.do" method="post" enctype="multipart/form-data">
				<table class="form">
					<tr>
						<td class="field">用户名：</td>
						<td><input type="text" class="text"  value="" /></td>
					</tr>
					<tr>
						<td class="field">姓名：</td>
						<td><input type="text" class="text" name="EU_USER_NAME" value="" /></td>
					</tr>
					<tr>
						<td class="field">密码：</td>
						<td><input type="text" class="text" name="EU_PASSWORD" value="" /></td>
					</tr>
					<tr>
						<td class="field">性别：</td>
						<td><input type="radio" name="EU_SEX" value="男"/>男 
						<input type="radio" name="EU_SEX" value="女" />女</td>
					</tr>
					<tr>
						<td class="field">邮箱：</td>
						<td><input type="text" class="text" name="EU_EMAIL" value="" /></td>
					</tr>
					<tr>
						<td class="field">出生日期：</td>
						<td>
							<select name="birthyear">
								<option value="2000">2000</option>
								<option value="1999">1999</option>
							</select>年
							<select name="birthmonth">
								<option value="12">12</option>
								<option value="11">11</option>
							</select>月
							<select name="birthday">
								<option value="2">2</option>
								<option value="1">1</option>
							</select>日
						</td>
					</tr>
					<tr>
						<td class="field">手机号码：</td>
						<td><input type="text" class="text" name="EU_MOBILE" value="" /></td>
					</tr>
					<tr>
						<td class="field">送货地址：</td>
						<td><input type="text" class="text" name="EU_ADDRESS" value="" /></td>
					</tr>
					<tr>
						<td class="field">头像：</td>
						<td><input type="file" class="text" name="photo" /></td>
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