$(function(){
	var url = $("#productSearchUrl").val() ;
	$("#btn").click(function(){
		url += $("input[name='epId']").val()+"/"+$("input[name='epName']").val()+".do";
		location.href = url ;
	}) ;
});