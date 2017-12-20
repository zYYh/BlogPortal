<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/util/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Story &mdash; Free Website Template, Free HTML5 Template by freehtml5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by freehtml5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="freehtml5.co" />
	
	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />
	
	<script src="${pageContext.request.contextPath}/js/index.js""></script>
</head>

<body>
	<div class="fh5co-loader"></div>
		
		<div id="page">
			<div id="fh5co-aside" style="background-image: url(${pageContext.request.contextPath}/images/image_1.jpg)">
				<div class="overlay"></div>
				<nav role="navigation">
					<ul>
						<li><a href="#" onclick=""><i class="icon-home"></i></a></li>
					</ul>
				</nav>
				<div class="featured">
					<span>你好</span>
					<%-- <c:forEach items="${user}" var="user">
						<!--用户昵称 -->
						<h2>${user.username}</a></h2>
					</c:forEach> --%>
					<h2>${name}</a></h2>
				</div>
			</div>
			<div id="fh5co-main-content">
				<div class="fh5co-post"> 
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-1.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="#" onclick="toSinglePage()">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<%-- <div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-2.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-3.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-4.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-5.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-6.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-7.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-8.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-1.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	                <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-2.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-3.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-4.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-5.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-6.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-7.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div>
	
					<div class="fh5co-entry padding">
						<img src="${pageContext.request.contextPath}/images/project-8.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
						<div>
							<span class="fh5co-post-date">October 12, 2016</span>
							<h2><a href="single.html">How to be an effective web developer</a></h2>
							<p>How two simple exercises changed my life</p>
						</div>
					</div> --%>
					<footer>
						<div>
						&copy; 2016 Free HTML5. All Rights Reserved. More Templates <a href="#" target="_blank" title="#"></a> - Collect from <a href="#" title="#" target="_blank"></a>
						</div>
					</footer>
				</div>
			</div>
		</div>
	
		<div class="gototop js-top">
			<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
		</div>
</body>
</html>