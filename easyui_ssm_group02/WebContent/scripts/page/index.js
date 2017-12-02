$(function(){
	//加载公告
	loadAnnouncementList()
	//加载新闻
	loadNewsList();
	//加载分类
	loadCategoryList();
	//加载今日特价商品列表
	loadProductList();
	//加载热卖商品列表
	loadProductList1();
});

function loadAnnouncementList(){
	var url = $("#ctx").val()+"/announcementAjax.do";
	$.getJSON(url,function(data){
		$(".news-list:eq(0) ul").empty();
		$.each(data,function(i,e){
			$(".news-list:eq(0) ul").append('<li><a href="announcement-view.jsp?eaId='+e.eaId+'" target="_blank">'+this.eaTitle+'</a></li>');
		});
	}) ;
}

function loadNewsList(){
	var url = $("#ctx").val()+"/newsAjax.do";
	$.getJSON(url,function(data){
		$(".news-list:eq(1) ul").empty();
		$.each(data,function(i,e){
			$(".news-list:eq(1) ul").append('<li><a href="news-view.jsp?enId='+e.enId+'" target="_blank">'+this.enTitle+'</a></li>');
		});
	}) ;
}

function loadCategoryList(){
	var url = $("#ctx").val()+"/categoryAjax.do";
	$.getJSON(url,function(data){
		$("dl").eq(0).empty();
		$.each(data, function(i, e) {
			if(e.epcParentId==0){
				$("dl").eq(0).append('<dt>'+e.epcName+'</dt>');
				$.each(data, function(i, e1) {
					if(e1.epcParentId==e.epcId){
						$("dl").eq(0).append('<dd><a href="product-list.html">'+e1.epcName+'</a></dd>');
					}
				});
			}			
		});
	}) ;
}

function loadProductList(){
	var url = $("#ctx").val()+"/productAjax.do";
	$.getJSON(url,function(data){
		$("#productList").empty();
		$.each(data, function(i, e) {
			$("#productList").append('<li>\
					<dl>\
						<dt>\
							<a href="'+$("#ctx").val()+'/page/product-view.jsp?epId='+e.epId+'&epName='+e.epName+'&epPrice='+e.epPrice+'&epFileName='+e.epFileName+'" target="_blank">\
								<img src="'+$("#ctx").val()+'/images/product/'+e.epFileName+'" />\
							</a>\
						</dt>\
						<dd class="title">\
							<a href="'+$("#ctx").val()+'/page/product-view.jsp?epId='+e.epId+'&epName='+e.epName+'&epPrice='+e.epPrice+'&epFileName='+e.epFileName+'" target="_blank">'+e.epName+'</a>\
						</dd>\
					<dd class="price">￥'+e.epPrice+'</dd>\
					</dl>\
					</li>');
		});			
	}) ;	
}

function loadProductList1(){
	var url = $("#ctx").val()+"/productAjax1.do";
	$.getJSON(url,function(data){
		$("#productList1").empty();
		$.each(data, function(i, e) {
			$("#productList1").append('<li>\
					<dl>\
						<dt>\
							<a href="'+$("#ctx").val()+'/page/product-view.jsp?epId='+e.epId+'&epName='+e.epName+'&epPrice='+e.epPrice+'&epFileName='+e.epFileName+'" target="_blank">\
								<img src="'+$("#ctx").val()+'/images/product/'+e.epFileName+'" />\
							</a>\
						</dt>\
						<dd class="title">\
							<a href="'+$("#ctx").val()+'/page/product-view.jsp?epId='+e.epId+'&epName='+e.epName+'&epPrice='+e.epPrice+'&epFileName='+e.epFileName+'" target="_blank">'+e.epName+'</a>\
						</dd>\
					<dd class="price">￥'+e.epPrice+'</dd>\
					</dl>\
					</li>');
		});			
	}) ;	
}
