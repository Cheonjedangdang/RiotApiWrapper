function getImage(id, findId) {
		$.ajax({
			url : "/riotapi/ajax/championKey",
	        type: "get",
	        dataType : "json",
	        data : { "id" : id },
	        success : function(responseData){
	        	var targetImage = document.getElementById(findId);
				targetImage.src = "http://ddragon.leagueoflegends.com/cdn/6.20.1/img/champion/"+responseData.key+".png";
	        },
	        error : function(request,status,error) {
	            alert("code:"+request.status+"\n"+"error:"+error);
	        }
	        
	    });
	}

function getRatio(kill, death, assist, id) {
	
	var result = (kill+death)/assist;
	var s = result.toFixed(2);
	
	var targetSpan = document.getElementById("r-"+id);
	
	targetSpan.innerHTML = s;
	
}

function getTimeDiff(gameDate) {
	
	var now = new Date();
	
	var diff = now.getTime() - gameDate;
	
	var hour_gap = diff / 1000 /60 / 60;
	
	var targetSpan = document.getElementById("diff-"+gameDate);
	
	if(hour_gap<24)
	{
		targetSpan.innerHTML = Math.round(hour_gap)+"시간 전";
	}
	else
	{
		var day_gap = Math.round(hour_gap)/24;
		targetSpan.innerHTML = Math.round(day_gap)+"일 전";
	}
}

function getPlayTime(gameTime, findId) {
	
	var hour = gameTime / 3600;
	var min = gameTime % 3600 / 60;
	var sec = gameTime % 3600 % 60;
	
	var targetSpan = document.getElementById("pt-"+findId);
	
	if(hour<1)
	{
		targetSpan.innerHTML = Math.floor(min)+"분 "+sec+"초";
	}
	else
	{
		var day_gap = Math.round(hour_gap)/24;
		targetSpan.innerHTML = Math.round(day_gap)+"일 전";
	}
}
