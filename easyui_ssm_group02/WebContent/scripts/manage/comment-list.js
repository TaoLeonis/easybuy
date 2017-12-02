$(function(){
	var url = $("#commentSearchUrl").val() ;
	$("#btn").click(function(){
		url += $("input[name='ecNickName']").val()+".do";
		location.href = url ;
	}) ;
});