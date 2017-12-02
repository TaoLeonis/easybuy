$(function(){
	showProduct();
});
function showProduct(){
	$.getJSON($("#ctx").val()+"/productAjaxView.do?epId="+$("#epId").val(),function(data){
		$("h1").empty();
		$(".infos").empty();
		$("h1").append(data.epName);
		$(".infos").append('<div class="thumb">\
				<img src="'+$("#ctx").val()+'/images/product/'+data.epFileName+'" id="showProduct"/></div>\
				<div class="buy">\
				<p>商城价：<span class="price">'+data.epPrice+'</span></p>\
				<p>库　存：'+data.epStock+'</p>\
				<p>描     述：'+data.epDescription+'</p>\
				<p>库　存：有货</p>\
				<p>库　存：有货</p>\
				<div class="button"><input type="button" id="productBuy" onclick="showProduct2();" name="button" value=""  /><a href="#">放入购物车</a></div>\
			</div><div class="clear"></div>');
		$(".introduce>.text").empty();
		$(".introduce>.text").append(data.epDescription);
	});
}

function showProduct2(){
		var url = $("#ctx").val()+"/shopcart.do" ;
		var params = {
				"epId":$("input[name='epId']").val(),
				"epName":$("input[name='epName']").val(),
				"epPrice":$("input[name='epPrice']").val(),
				"epFileName":$("input[name='epFileName']").val()
		} ;
		$.post(url,params,function(data){
			if(data){
				location.href = $("#ctx").val()+"/page/shopcart-list.jsp" ;
			}
		});
}