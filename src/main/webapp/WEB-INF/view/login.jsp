<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Sport Portal</title>

	<link href="<c:url value="/resource/css/style.css" />" rel="stylesheet">
	<link href="<c:url value="/resource/css/global.css" />" rel="stylesheet">
	<link href="<c:url value="/resource/css/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resource/css/bootstrap-theme.min.css" />" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/resource/js/jquery-1.4.4.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resource/js/slides.min.jquery.js" />"></script>

</head>
<body>

<div id="header">
	<div class="shell">

		<h1 id="logo" class="notext"><a href="index">Sport Zone Sport Portal</a></h1>
		<
	</div>
</div>

<div id="navigation">
	<div class="shell">
		<ul>
			<li><a href="#">LIVE</a></li>
			<li><a href="#">Results</a></li>
			<li><a href="#">Statistics</a></li>
			<li><a href="#">Rules</a></li>
			<li><a href="#">Contacts</a></li>
			<li><a href="login">Login</a></li>
            <sec:authorize access="isAuthenticated()">
                <li><sec:authentication property="principal.username"/></li>
                <li><a href="/logout">Logout</a></li>
            </sec:authorize>
            <sec:authorize access="!isAuthenticated()">
                <li>                </li>
                <li>                </li>
            </sec:authorize>
		</ul>
	</div>
</div>

<div class="col-xs-3">
	<div id="side-nav">
		<ul>
			<li><div class="link"><a href="#">England. Premier League</a></div></li>
			<li><div class="link"><a href="#">Spain. Primera Division</a></div></li>
			<li><div class="link"><a href="#">Germany. Bundesliga</a></div></li>
			<li><div class="link"><a href="#">Italy. Seria A</a></div></li>
			<li><div class="link"><a href="#">France. Liga 1</a></div></li>
		</ul>
	</div>
</div>
<div class="col-xs-5">
	<div class="login-fon">
		<div class="login-form">
			<div class="form">
				<form class="form-horizontal" name="form" action="j_spring_security_check" role="form" method="POST">
					<div class="form-group">
						<div class="form-group">
							<label  class="col-sm-3 control-label">Login</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" placeholder="Login" name="login">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-3 control-label">Password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" placeholder="Password" name="password">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-9">
								<div class="checkbox">
									<label>
										<input type="checkbox" name="_spring_security_remember_me"> Remember me
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-9">
								<button type="submit" class="btn btn-default btn-sm">Sing me</button>
							</div>
						</div>
				</form>
			</div><!-- form  -->
		</div>
	</div>
</div>

<div class="col-xs-4">
</div>
</body>
</html>