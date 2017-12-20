<!--该页面为各种标签和引入的集中管理 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--路径定义 -->
<%String path = request.getContextPath();%>
<script type="text/javascript">var path = '<%=path%>';</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/pageJs/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="${pageContext.request.contextPath}/pageJs/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/pageJs/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="${pageContext.request.contextPath}/pageJs/jquery.waypoints.min.js"></script>
<!-- Stellar Parallax -->
<script src="${pageContext.request.contextPath}/pageJs/jquery.stellar.min.js"></script>
<!-- Main -->
<script src="${pageContext.request.contextPath}/pageJs/main.js"></script>

<!--https://fonts.googleapis.com/css?family=Work+Sans:300,400,500,700,800 -->
<link href="${pageContext.request.contextPath}/css/1.css" rel="stylesheet">

<!--====================================================CSS============================================================== -->
<!-- Animate.css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">

<!-- Theme style  -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

<!-- Modernizr JS -->
<script src="${pageContext.request.contextPath}/pageJs/modernizr-2.6.2.min.js"></script>

<!-- FOR IE9 below -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/js/respond.min.js"></script>
<![endif]-->
