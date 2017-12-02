<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="../WEB-INF/jsp/commons/top.jsp"/>
<style type="text/css">
	#showCart{
		width:70px;
		height:65px;
	}		
</style>
<div id="position" class="wrap">
	您现在的位置：<a href="index.html">易买网</a> &gt; 购物车
</div>
<div class="wrap">
	<div id="shopping">
			<table>
				<thead>
				<tr>
					<th>商品名称</th>
					<th>商品价格</th>
					<th>购买数量</th>
					<th>操作</th>
				</tr>
				</thead>
				<tbody>
					<tr id="product_id_1">
						<td class="thumb"><img src="images/product/0_tiny.gif" /><a href="product-view.html">铁三角 Audio-Technica ATH-EQ300M-SV 银色 挂耳式耳机</a></td>
						<td class="price" id="price_id_1">
							<span>￥99.00</span>
							<input type="hidden" value="99" />
						</td>
						<td class="number">
							<dl>
								<dt><input id="number_id_1" type="text" name="number" value="1" /></dt>
								<dd onclick="reloadPrice(1,true);">修改</dd>
							</dl>
						</td>
						<td class="delete"><a href="javascript:delShopping(1);">删除</a></td>
					</tr>
				</tbody>
			</table>
			<div class="button"><input type="submit" value="" /></div>
	</div>
</div>
<jsp:include page="../WEB-INF/jsp/commons/footer.jsp">
	<jsp:param value="page/shopcart-list" name="jsFile"/>
</jsp:include>
