<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//<img src="http://ddragon.leagueoflegends.com/cdn/5.23.1/img/champion/${game.playChamion.key}.png">
%>
<script>
	function getImage(id, findId) {
		$.ajax({
			url : "/riotapi/ajax/championKey",
	        type: "get",
	        dataType : "json",
	        data : { "id" : id },
	        success : function(responseData){
	        	var targetImage = document.getElementById(findId);
				targetImage.src = "http://ddragon.leagueoflegends.com/cdn/5.23.1/img/champion/"+responseData.key+".png";
	        },
	        error : function(request,status,error) {
	            alert("code:"+request.status+"\n"+"error:"+error);
	        }
	        
	    });
	}
</script>
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