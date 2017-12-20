$(function(){
	
})

//博客首页转发
function toIndex(){
	//获取用户标识
	var code = $("#userCode").val();
	window.location.href=path+"/PortalController/toIndex.do?code="+code;
}

