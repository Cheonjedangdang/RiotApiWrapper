<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<div class="Header">
	<div class="Face">
		<div class="ProfileIcon">
			<!--<img src="http://sk2.op.gg/images/borders2/gold.png">-->
			<div class="borderImage" style="background-image: url(http://sk2.op.gg/images/borders2/gold.png);"></div>
			<img src="http://sk2.op.gg/images/profile_icons/profileIcon${summoner.profileIconId}.jpg" class="ProfileImage">
		</div>
	</div>
	<div class="Profile">
		<div class=Information">
			<span class="Name">${summoner.name}</span>
			<a class="FavoriteButton" href="#" id="FavoriteButton" onclick="$.OP.GG.common.SummonerHistory.Favorite.toggle('${summoner.name}')'"; return false;">
			${lwt.tier} ${lwt.entry.division}
			Lv ${summoner.summonerLevel}</a>
			<div class="Rank">
				<div class="LadderRank">
					<a href="/ranking/ladeer/
					summonerName=${summoner.name}" class="tip Link__tipped__" taget="_blank">...</a>
				</div>
			</div>
		</div>
		<div class="Buttons">
			<button class="Button SemiRound Blue" id="SummonerRefreschButton" onClick=""; style="postion: relative;">전적갱신</button>
			<button class="Button SemiRound White" id="SpectateButton" onClick="">인게임 정보</button>
			<button class="Button SemiRound White"  onClick="">MMR체크</button>
			<button class="Button SemiRound White"  onClick="">티어 그래프</button>
		</div>
	</div>
</div>
	
	<!--<img src="http://ddragon.leagueoflegends.com/cdn/6.20.1/img/profileicon/${summoner.profileIconId}.png">-->
