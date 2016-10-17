<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//<img src="http://ddragon.leagueoflegends.com/cdn/5.23.1/img/champion/${game.playChamion.key}.png">
%>
<div class="game-list">
	<c:forEach items="${games}" var="game">	
		<div class="listitem">
			<div class="info">
				<c:if test="${game.subType eq 'ARAM_UNRANKED_5x5'}">
					무작위 총력전
				</c:if>
				<c:if test="${game.subType eq 'RANKED_SOLO_5x5'}">
					랭크
				</c:if>
				<br>
			</div>
			<div class="play">
				<div class="play-info">
					<img id="${game.createDate}" class="s_r_img" src=""><script>getImage(${game.championId},${game.createDate})</script>
				</div>
				<div class="kda-info">
					KDA 정보 영역
				</div>
				<div class="item">
					Item 영역
				</div>
			</div>
			<div class="team">
				Team 정보 영역
			</div>
		</div>		
	</c:forEach>
</div>	
	
