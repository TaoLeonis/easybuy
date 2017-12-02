$(function(){
	var url = $("#categorySearchUrl").val() ;
	$("#btn").click(function(){
		url += $("input[name='epcName']").val()+".do";
		location.href = url ;
	}) ;
});