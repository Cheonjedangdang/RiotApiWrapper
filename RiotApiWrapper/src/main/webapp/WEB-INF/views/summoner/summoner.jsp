<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="../page-import.jsp" %>
	<title>op.gg</title>
</head>
<body>
<div class="container-fluid">
	<%@ include file="../page-header.jsp" %>
	
	<div class="container">
		<div style="border: 1px solid black;">
			<%@ include file="summoner-header.jsp" %>
		</div>
		<div style="border: 1px solid black;">
			<%@ include file="summoner-section.jsp" %>
		</div>
	</div>
	
	<%@ include file="../page-footer.jsp" %>
</div>
</body>
</html>
