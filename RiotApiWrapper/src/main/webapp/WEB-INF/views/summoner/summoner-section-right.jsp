<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//<img src="http://ddragon.leagueoflegends.com/cdn/5.23.1/img/champion/${game.playChamion.key}.png">
%>
<table class="table">
	<c:forEach items="${games}" var="game">	
		<tr>
			<td><img id="${game.createDate}" src=""><script>getImage(${game.championId},${game.createDate})</script></td>
			<td>${game.gameMode}</td>
			<td>${game.gameType}</td>
			<td>${game.subType}</td>
			<td>${game.teamId}</td>
		</tr>
	</c:forEach>
</table>	