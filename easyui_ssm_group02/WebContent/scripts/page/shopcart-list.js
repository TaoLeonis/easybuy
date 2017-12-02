$(function(){
	    var url = $("#ctx").val()+"/shopcart.do" ;
		$.getJSON(url,function(data){
			$("#shopping tbody").empty();
			$(data).each(function(){
				var str = '<tr id="product_id_1">\
						<td class="thumb"><img src="'+$("#ctx").val()+'/images/product/'+this.epFileName+'" id="showCart"/><a href="product-view.html">'+this.epName+'</a></td>\
						<td class="price" id="price_id_1">\
							<span>￥'+this.epPrice+'</span>\
							<input type="hidden" value="99" />\
						</td>\
						<td class="number">\
							<dl>\
								<dt><input id="number_id_1" type="text" name="number" value="'+this.epCount+'" /></dt>\
								<dd onclick="reloadPrice(1,true);">修改</dd>\
							</dl>\
						</td>\
						<td class="delete"><a href="javascript:delShopping(1);">删除</a></td>\
					</tr>' ;
				$("#shopping tbody").append(str);
			});
		});
});