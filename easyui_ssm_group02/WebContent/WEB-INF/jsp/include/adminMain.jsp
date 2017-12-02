<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div id="menu-mng" class="lefter">
			<div class="box">
				<dl>
					<dt>用户管理</dt>
					<dd>
						<em><a href="${pageContext.request.contextPath }/user1/user-add.do">新增</a></em>
						<a href="${pageContext.request.contextPath }/user/1/3//.do">用户管理</a>
					</dd>
					<dt>商品信息</dt>
					<dd>
						<em><a href="${pageContext.request.contextPath }/category1/category-add.do">新增</a></em><a
							href="${pageContext.request.contextPath }/category/1/3//.do">分类管理</a>
					</dd>
					<dd>
						<em><a href="${pageContext.request.contextPath }/product1/product-add.do">新增</a></em>
						<a href="${pageContext.request.contextPath }/product/1/3/1/.do">商品管理</a>
					</dd>
					<dt>订单管理</dt>
					<dd>
						<a href="${pageContext.request.contextPath }/order/1/3/1/.do">订单管理</a>
					</dd>
					<dt>留言管理</dt>
					<dd>
						<a href="${pageContext.request.contextPath }/comment/1/3//.do">留言管理</a>
					</dd>
					<dt>新闻管理</dt>
					<dd>
						<em> <a href="${pageContext.request.contextPath }/news1/news-add.do">新增</a>
						</em> <a href="${pageContext.request.contextPath }/news/1/3//.do">新闻管理</a>
					</dd>
				</dl>
			</div>
		</div>
</body>
</html>