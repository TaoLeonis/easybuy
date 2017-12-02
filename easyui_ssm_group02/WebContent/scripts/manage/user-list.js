$(function(){
	var url = $("#userSearchUrl").val() ;
	$("#btn").click(function(){
		url += $("input[name='EU_USER_NAME']").val()+".do";
		location.href = url ;
	}) ;
});