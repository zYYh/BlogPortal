<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>
</head>
<body>
	Spring框架测试成功<br/>
	MyBaties框架测试：<br/>
	获取到的ID为：
	<c:forEach items="${noticeManagers}" var="test">
		<tr>
			<td>${test.noticeId}</td>
		</tr>
	</c:forEach>
	<div><font color="red">当看到ID具体数字时表明MyBaties测试成功</font></div>
</body>
</html>