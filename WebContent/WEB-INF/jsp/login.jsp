<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
<script type="text/javascript" src="js/jquery-1.11.3.min.js">
</script>
<script type="text/javascript">
	function check(){
		var usercode=$("#usercode").val();
		var password=$("#password").val();
		if(usercode=="" ||password==""){
			$("#message").text("账号或密码不能为空");
			return false;
		}
		return true;	
	}
	
/* 	function go(){
		$.get("${pageContext.request.contextPath}/regist",function(data){
			alert("跳转成功！")
			
		});
	} */


</script>
</head>
<body>
<font color="red">
	<span id="message">${msg }</span>
</font>
<!-- ${pageContext.request.contextPath} 
	 ${pageContext.request.contextPath}
-->

<form action="${pageContext.request.contextPath }/login" method="post" onsubmit="return check()">
	账&nbsp;号<input id="usercode" type="text" name="usercode" />
	<br/><br/>
	密&nbsp;码<input id="password" type="password" name="password" />
	<br/><br/>
	<input type="submit" value="登录" />&nbsp;&nbsp;
	<!-- <input type="button" value="注册" onclick="go()"/> -->
	<a href="${pageContext.request.contextPath }/toregist">注册</a> 	
</form>
</body>
</html>