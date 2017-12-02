<#assign ctx=request.contextPath />
<#include "../commons/manage/top.ftl">
<div id="main" class="wrap">
	<#include "../commons/manage/left.ftl">
	<div class="main">
		<h2>新闻管理【ftl】</h2>
		<div class="manage">
			<!-- 条件查询 -->
			<div class="search">
				<input id="newsSearchUrl" type="hidden" value="${ctx}/news/1/${pageInfo.pageSize}/"/>
				新闻主题：<input type="text" class="text" name="enTitle" value="${enTitle }"/> 
				<label class="ui-blue"><input type="button" name="submit" id="btn" value="查询" /></label>
			</div>
			<div class="spacer"></div>
			<!-- 新闻列表显示 -->
			<table class="list">
				<tr>
					<th>ID</th>
					<th>新闻标题</th>
					<th>操作</th>
				</tr>
				<#list pageInfo.list as n>
					<tr>
						<td class="first w4 c">${n.enId }</td>
						<td>${n.enTitle}</td>
						<td class="w1 c"><a
							href="${ctx}/news/${n.enId }.do">修改</a>
							<form action="${ctx}/news.do" method="post" id="delForm${n.enId }">
								<input type="hidden" name="_method" value="DELETE" /> 
								<input type="hidden" name="enId" value="${n.enId }" />
								<a href="javascript:document.getElementById('delForm${n.enId }').submit();">删除</a>
							</form>
						</td>
					</tr>
				</#list>
			</table>
			<!-- 分页导航 -->
			<div class="pager">
				<ul class="clearfix">
					<#if pageInfo.isFirstPage>
						<li class="current">上一页</li>
					<#else>
						<li><a href="${ctx}/news/${pageInfo.prePage}/${pageInfo.pageSize}/${enTitle}.do">上一页</a></li>
					</#if>
					<#list 1..pageInfo.pages as i>
						<#if i == pageInfo.pageNum>
							<li class="current">${i}</li>
						<#else>
							<li><a href="${ctx}/news/${i}/${pageInfo.pageSize}/${enTitle}.do">${i }</a></li>
						</#if>
					</#list>
					<#if pageInfo.isLastPage>
						<li class="current">下一页</li>
					<#else>
						<li><a href="${ctx}/news/${pageInfo.nextPage}/${pageInfo.pageSize}/${enTitle}.do">下一页</a></li>
					</#if>
				</ul>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<#include "../commons/footer.ftl">
<script type="text/javascript" src="${ctx}/scripts/manage/news-list.js"></script>