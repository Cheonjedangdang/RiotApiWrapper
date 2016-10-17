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