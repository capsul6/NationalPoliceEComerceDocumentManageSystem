
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Файл додано</title>
  <!-- Bootstrap core CSS -->
  <link href="<c:url value="../../../resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
  <link href="<c:url value="../../../resources/styles/deputeAppealPagesStyle/addedFile.css" />" rel="stylesheet"/>
</head>
<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<div class="container-fluid">

  <div class="row">

    <div class="col-md-offset-1 col-md-10">

<div class="alert alert-info" role="alert">


  <p>Ви успішно додали файл до документу, файл знаходиться в  ${fileDirection}<br></p>

  <c:url var="main" value="/main/Menu"/>

  <a href="${main}">Натисніть сюди щоб повернутися на головну сторінку</a>

</div>

    </div>

  </div>

  </div>
</body>
</html>

