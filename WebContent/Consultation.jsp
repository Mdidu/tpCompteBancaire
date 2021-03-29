<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="CompteBean" class="persistance.entities.Compte" type="persistance.entities.Compte" scope="session" />

	<jsp:setProperty property="*" name="CompteBean" />
	Le solde de <jsp:getProperty property="proprietaire" name="CompteBean"/> est 
	<jsp:getProperty property="solde" name="CompteBean"/>€ !
</body>
</html>