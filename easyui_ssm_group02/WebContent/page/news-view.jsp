<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../WEB-INF/jsp/commons/top.jsp"/>
<div id="position" class="wrap">
	您现在的位置：<a href="index.jsp">易买网</a> &gt; 阅读新闻
</div>
<div id="main" class="wrap">
	<input type="hidden" id="enId" value="${param.enId}"/>
	<div class="left-side">
		<div class="news-list">
			<h4>最新公告</h4>
			<ul>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦</a></li>
			</ul>
		</div>
		<div class="spacer"></div>
		<div class="news-list">
			<h4>新闻动态</h4>
			<ul>
				<li><a href="news-view.html" target="_blank">抢钱啦1</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦2</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦3</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦4</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦5</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦6</a></li>
				<li><a href="news-view.html" target="_blank">抢钱啦7</a></li>
			</ul>
		</div>
	</div>
	<div id="news" class="right-main">
		<h1>铁三角 Audio-Technica ATH-EQ300M-SV 银色 挂耳式耳机</h1>
		<div class="content">
			f
		</div>
	</div>
	<div class="clear"></div>
</div>
<jsp:include page="../WEB-INF/jsp/commons/footer.jsp">
	<jsp:param value="page/news-view" name="jsFile"/>
</jsp:include>
