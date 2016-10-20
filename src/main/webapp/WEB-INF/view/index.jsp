<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Free CSS template by ChocoTemplates.com</title>

	<link href="<c:url value="/resource/css/style.css" />" rel="stylesheet">
	<link href="<c:url value="/resource/css/global.css" />" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/resource/js/jquery-1.4.4.min.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resource/js/slides.min.jquery.js" />"></script>

	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'img/loading.gif',
				play: 5000,
				pause: 1,
				hoverPause: true
			});
		});
	</script>
	<style type="text/css">
		 table {
    	width: 600px;                   /**   размер таблицы  **/
   		margin:0 ;						/**   размещение по центру  **/   
   		border-collapse: collapse; 		/**   отображение границ  **/
   		background: #e6e6e6;
   		
   		} 
   			thead {
   				height: 35px; 
   				background: #9fea00;
   				}
   			th{
   				text-align: left;			/**   выравнивание текста  **/
   				height: 30px;				/**  высота строки	**/	
   				width: 300px;				/**   ширина строки  **/
   				border: 1px solid black;	/**   рамка вокруг ячеек   **/
   				padding-left: 5px;
   				font-family: tahoma, sans-serif;
   				vertical-align: middle;
   				font-size: 14px;
   
   							/**   отступ  **/
   				
   			}
   			tbody tr:nth-child(2n+1){		/**   зебра  **/
            		background: #b3b3b3;
            	}
   			td {
   				text-align: center;		
   				width: 60px;
   				border: 1px solid black;
   				font-family: tahoma, sans-serif;
   				vertical-align: middle;
   				font-size: 15px;
   				
   			}		
   			tbody td:hover  {
   				background-color: #ccff66;		/**   действие при наведении  **/
   				
   			} 
   		</style>
</head>
<body>
	
	<div id="header">
		<div class="shell">
			
			<h1 id="logo" class="notext"><a href="#">Sport Zone Sport Portal</a></h1>
			<
		</div>
	</div>
	
	<div id="navigation">
		<div class="shell">
			<ul>
			    <li><a href="#">LIVE</a></li>
			    <li><a href="#">Результаты</a></li>
			    <li><a href="#">Статистика</a></li>
			    <li><a href="#">Правила</a></li>
			    <li><a href="#">Контакты</a></li>
			</ul>
		</div>
	</div>

	<div id="heading">
		<div class="shell">

			<div id="heading-cnt">
				<div id="side-nav">
					<ul>
					    <li><div class="link"><a href="#">Англия. Премьер Лига</a></div></li>
					    <li><div class="link"><a href="#">Испания. Примера Дивизион</a></div></li>
					    <li><div class="link"><a href="#">Германия. Бундеслига</a></div></li>
					    <li><div class="link"><a href="#">Италия. Серия А</a></div></li>
					    <li><div class="link"><a href="#">Франция. Лига 1</a></div></li>
					</ul>
				</div>
		
			
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
					<th>Ангия.Премьер Лига</th><td>П1</td><td>X</td><td>П2</td><td>1x</td><td>x2</td>
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
				</div>
			</div>			
		</div>
	</div>

</body>
</html>