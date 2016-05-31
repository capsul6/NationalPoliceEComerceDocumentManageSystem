<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="uk">
<head>
  <title>Додати нове</title>
  <!-- Bootstrap core -->
  <meta charset="utf-8">
  <script src="<c:url value="../../resources/bootstrap/jquery/jquery-2.2.2.min.js" />" ></script>
  <script src="<c:url value="../../resources/bootstrap/js/bootstrap.min.js" />" ></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">


</head>

<body>

<c:url value="/main/upload?id=${Appeal.id}" var="addFile"/>

<form:form method="POST" action="${addFile}" cssStyle="width:400px; margin-left:auto; margin-right:auto;margin-top: 50px;" enctype="multipart/form-data">

  <input type="text" name="name"/><br>

  <input type="text" value="${Appeal.id}" disabled/>

  <p>File to upload</p><input type="file" name="file"/>

  <button type = "submit" class = "btn btn-primary" value = "Upload" style="width: 400px; margin-left:auto; margin-right:auto;margin-top: 20px;">Accept</button>
</form:form>
</body>
</html>
