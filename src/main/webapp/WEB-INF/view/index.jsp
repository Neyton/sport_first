<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
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
                <%--<sec:authorize access="isAuthenticated()">--%>
                    <%--<li><sec:authentication property="principal.username"/></li>--%>
                    <%--<li><a href="/logout">Logout</a></li>--%>
                <%--</sec:authorize>--%>
                <%--<sec:authorize access="!isAuthenticated()">--%>
                    <%--<li>                </li>--%>
                    <%--<li>                </li>--%>
                <%--</sec:authorize>--%>
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
            <div id="container">
                <div id="example">
                    <img src="/resource/css/images/example-frame.png" width="600" height="340" alt="Example Frame" id="frame">
                    <div id="slides">
                        <div class="slides_container">
                            <a target="_blank"><img src="/resource/css/images/buffon.jpg" width="540" height="350" alt="Slide 1"></a>
                            <a target="_blank"><img src="/resource/css/images/msn.jpg" width="540" height="350" alt="Slide 2"></a>
                            <a target="_blank"><img src="/resource/css/images/terry.jpg" width="540" height="350" alt="Slide 3"></a>
                            <a target="_blank"><img src="/resource/css/images/rous.jpg" width="540" height="350" alt="Slide 4"></a>
                            <a target="_blank"><img src="/resource/css/images/lester.jpg" width="540" height="350" alt="Slide 5"></a>
                            <a target="_blank"><img src="/resource/css/images/totti.jpg" width="540" height="350" alt="Slide 6"></a>
                        </div>
                        <a href="#" class="prev"><img src="/resource/css/images/arrow-prev.png" width="24" height="43" alt="Arrow Prev"></a>
                        <a href="#" class="next"><img src="/resource/css/images/arrow-next.png" width="24" height="43" alt="Arrow Next"></a>
                    </div>

                </div>
            </div>
            <div id="roud">
                <table>
                    <thead>
                    <tr>
                        <th>England. Premier League</th><td>П1</td><td>X</td><td>П2</td><td>1x</td><td>x2</td>
                    </tr>
                    </thead>
                    <c:forEach var="event" items="${listEvent}">
                        <tbody>
                        <tr>
                            <th>${event.getName()}</th>
                            <c:choose>
                                <c:when test="${event.getIdEvent() == 1}">
                                    <c:forEach var="rate" items="${listRate1}">
                                        <td><a>${rate.getKf()}</a></td>
                                    </c:forEach>
                                </c:when>
                                <c:when test="${event.getIdEvent() == 2}">
                                    <c:forEach var="rate" items="${listRate2}">
                                        <td><a>${rate.getKf()}</a></td>
                                    </c:forEach>
                                </c:when>
                                <c:when test="${event.getIdEvent() == 3}">
                                    <c:forEach var="rate" items="${listRate3}">
                                        <td><a>${rate.getKf()}</a></td>
                                    </c:forEach>
                                </c:when>
                                <c:when test="${event.getIdEvent() == 4}">
                                    <c:forEach var="rate" items="${listRate4}">
                                        <td><a>${rate.getKf()}</a></td>
                                    </c:forEach>
                                </c:when>
                                <c:when test="${event.getIdEvent() == 5}">
                                    <c:forEach var="rate" items="${listRate5}">
                                        <td><a>${rate.getKf()}</a></td>
                                    </c:forEach>
                                </c:when>
                            </c:choose>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>

            </div>
        </div>
        <div class="col-xs-4">
        </div>
    </div>
</body>
</html>