<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<c:if test="${not empty refreshUrl}">
<meta http-equiv="Refresh" content="${refreshUrl}">
</c:if>
<title>Bitcamp-LMS</title>
<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css' integrity='sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh' crossorigin='anonymous'>
<style>
body {
  background-color: LightGray;
}
div.container {
  background: white;
  border: 1px solid gray;
  width: 600px;
}
footer {
  margin-top: 20px;
  padding: 10px;
  background-color: navy;
  color: white;
  text-align: center;
}
</style>
</head>
<body>

<tiles:insertAttribute name="header"/>

<div class='container'>
<tiles:insertAttribute name="body"/>
</div>

<tiles:insertAttribute name="footer"/>

</body>
</html>