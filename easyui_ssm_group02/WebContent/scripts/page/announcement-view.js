$(function(){
	//加载公告
	loadAnnouncementList()
	//加载新闻
	loadNewsList();
	//公告详情
	showAnnouncement()
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

function showAnnouncement(){
	$.getJSON($("#ctx").val()+"/announcementAjaxView.do?eaId="+$("#eaId").val(),function(data){
		$("h1").empty();
		$(".content").empty();
		$("h1").append(data.eaTitle);
		$(".content").append(data.eaContent);
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