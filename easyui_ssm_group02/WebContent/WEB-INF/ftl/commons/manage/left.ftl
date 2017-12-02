<#assign ctx=request.contextPath />
<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
					<dd>
						<em><a href="${ctx}/user1/user-add.do">新增</a></em>
						<a href="${ctx}/user/1/3//.do">用户管理</a>
					</dd>
					<dt>商品信息</dt>
					<dd>
						<em><a href="${ctx}/category1/category-add.do">新增</a></em><a
							href="${ctx}/category/1/3//.do">分类管理</a>
					</dd>
					<dd>
						<em><a href="${ctx}/product1/product-add.do">新增</a></em>
						<a href="${ctx}/product/1/3/1/.do">商品管理</a>
					</dd>
					<dt>订单管理</dt>
					<dd>
						<a href="${ctx}/order/1/3/1/.do">订单管理</a>
					</dd>
					<dt>留言管理</dt>
					<dd>
						<a href="${ctx}/comment/1/3//.do">留言管理</a>
					</dd>
					<dt>新闻管理</dt>
					<dd>
						<em> <a href="${ctx}/news1/news-add.do">新增</a>
						</em> <a href="${ctx}/news/1/3//.do">新闻管理</a>
					</dd>
			</dl>
		</div>
	</div>