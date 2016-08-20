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
  <script src="<c:url value="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js" />" ></script>
  <script src="<c:url value="../../../resources/bootstrap/js/bootstrap.min.js" />" ></script>

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/addFileToDeputeAppeal.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<c:url value="/deputeAppeal/uploadingPageFileForDeputeAppeal?id=${deputeAppealId.id}" var="addFile"/>

<form:form method="POST" action="${addFile}" enctype="multipart/form-data">

  <p>Ви намагаєтесь додати файл до документу з номером ${deputeAppealId.incomeNumber}</p>

  <p>Оберіть файл для завантаження</p>

  <input type="file" name="file" path="file"/><br>

  <button type = "submit" class = "btn btn-primary" value = "Upload">Завантажити</button>

</form:form>


</body>
</html>
