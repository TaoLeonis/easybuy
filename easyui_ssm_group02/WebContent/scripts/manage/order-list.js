$(function(){
	var url = $("#orderSearchUrl").val() ;
	$("#btn").click(function(){
		url += $("input[name='eoId']").val()+"/"+$("input[name='eoUserName']").val()+".do";
		location.href = url ;
	}) ;
});