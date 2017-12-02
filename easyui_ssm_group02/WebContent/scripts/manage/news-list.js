$(function(){
	var url = $("#newsSearchUrl").val() ;
	$("#btn").click(function(){
		url += $("input[name='enTitle']").val()+".do";
		location.href = url ;
	}) ;
});