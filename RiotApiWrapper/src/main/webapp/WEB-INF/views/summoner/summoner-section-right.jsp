<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//<img src="http://ddragon.leagueoflegends.com/cdn/5.23.1/img/champion/${game.playChamion.key}.png">
%>
<table class="table" style="text-align: center;" border="1">
	<c:forEach items="${games}" var="game">	
		<tr>
			<td width="120px">
				<c:if test="${game.subType eq 'ARAM_UNRANKED_5x5'}">
					무작위 총력전
				</c:if>
				<c:if test="${game.subType eq 'RANKED_SOLO_5x5'}">
					랭크
				</c:if>
				<br>
				ㅁㅁ
			</td>
			<td width="50px"><img id="${game.createDate}" class="s_r_img" src=""><script>getImage(${game.championId},${game.createDate})</script></td>
			<td>${game.spell1} ${game.spell2}</td>
			<td>${game.gameMode}</td>
			<td>${game.gameType}</td>
			<td>${game.teamId}</td>
		</tr>
	</c:forEach>
</table>	