<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//<img src="http://ddragon.leagueoflegends.com/cdn/5.23.1/img/champion/${game.playChamion.key}.png">
%>
<div class="game-list">
	<c:forEach items="${games}" var="game">	
		<div class="listitem-${game.stats.win}">
			<div class="info">
				<div class="gType">
					<span class="game-type">
					<c:if test="${game.subType eq 'ARAM_UNRANKED_5x5'}">
						무작위 총력전
					</c:if>
					<c:if test="${game.subType eq 'RANKED_SOLO_5x5'}">
						랭크
					</c:if>
					<c:if test="${game.subType eq 'NORMAL'}">
						일반게임
					</c:if>
					<c:if test="${game.subType eq 'BOT'}">
						봇전
					</c:if>
					</span>
				</div>
				<div class="time-diff">
					<span id="diff-${game.createDate}" class="timeDiff"><script>getTimeDiff(${game.createDate});</script></span>
				</div>
				
				<div class="game-result">
					<span class="gameResult">
						<c:if test="${game.stats.win == true }">
							<span class="label label-primary">승리</span>
						</c:if>
						<c:if test="${game.stats.win == false }">
							<span class="label label-danger">패배</span>
						</c:if>
					</span>
				</div>
				
				<div class="play-time">
					<span class="playTime" id="pt-${game.createDate}"><script>getPlayTime(${game.stats.timePlayed}, ${game.createDate});</script></span>
				</div>
			</div>
			<div class="play">
				<div class="play-info">
					<img id="${game.createDate}" class="s_r_img" src=""><script>getImage(${game.championId},${game.createDate});</script>
				</div>
				<div class="kda-info">
					<div class="kda">
						<span class="kill">${game.stats.championsKilled}</span>
						/
						<span class="death">${game.stats.numDeaths }</span>
						/
						<span class="assist">${game.stats.assists}</span>
					</div>
					<div class="kda-ratio">
						<span class="ratio" id="r-${game.createDate}"><script>getRatio(${game.stats.championsKilled},${game.stats.numDeaths },${game.stats.assists},${game.createDate});</script>:1평점</span>
					</div>
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
	
