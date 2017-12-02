<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../WEB-INF/jsp/commons/top.jsp"/>
<div id="main" class="wrap">
	<input type="hidden" name="epId" id="epId" value="${param.epId}"/>
	<input type="hidden" name="epName" value="${param.epName}"/>
	<input type="hidden" name="epPrice" value="${param.epPrice}"/>
	<input type="hidden" name="epFileName" value="${param.epFileName}"/>
	<div class="lefter">
		<div class="box">
			<h2>商品分类</h2>
			<dl>
				<dt>图书音像</dt>
				<dd><a href="product-list.html">图书</a></dd>
				<dd><a href="product-list.html">音乐</a></dd>
				<dt>百货</dt>
				<dd><a href="product-list.html">运动健康</a></dd>
				<dd><a href="product-list.html">服装</a></dd>
				<dd><a href="product-list.html">家居</a></dd>
				<dd><a href="product-list.html">美妆</a></dd>
				<dd><a href="product-list.html">母婴</a></dd>
				<dd><a href="product-list.html">食品</a></dd>
				<dd><a href="product-list.html">手机数码</a></dd>
				<dd><a href="product-list.html">家具首饰</a></dd>
				<dd><a href="product-list.html">手表饰品</a></dd>
				<dd><a href="product-list.html">鞋包</a></dd>
				<dd><a href="product-list.html">家电</a></dd>
				<dd><a href="product-list.html">电脑办公</a></dd>
				<dd><a href="product-list.html">玩具文具</a></dd>
				<dd><a href="product-list.html">汽车用品</a></dd>
			</dl>
		</div>
	</div>
	<div id="product" class="main">
		<h1>铁三角 Audio-Technica ATH-EQ300M-SV 银色 挂耳式耳机</h1>
		<div class="infos">
			<div class="thumb"><img src="images/product/0.jpg" /></div>
			<div class="buy">
				<p>商城价：<span class="price">￥99.00</span></p>
				<p>库　存：有货</p>
				<p>库　存：有货</p>
				<p>库　存：有货</p>
				<p>库　存：有货</p>
				<div class="button">
					<input type="button" name="button" value="" />
					<a href="#">放入购物车</a>
				</div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="introduce">
			<h2><strong>商品详情</strong></h2>
			<div class="text">
				sdf<br />
				sdf<br />
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<jsp:include page="../WEB-INF/jsp/commons/footer.jsp">
	<jsp:param value="page/product-view" name="jsFile"/>
</jsp:include>