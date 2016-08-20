<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<title>Дані безпечно додані до бази даних</title>
<head>
  <meta charset="utf-8">
  <!-- Jquery -->
  <script src="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/deputeAppealEditingSuccesfull.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>


<div class="container">

  <div class="row">

    <div class="col-md-12">

        <p class="mainText">Дані було редаговано та безпечно додано до бази даних</p>

        <a class="btn btn-primary" href="/main/Menu" role="button">На головну сторінку</a>
        <a class="btn btn-danger" href="/deputeAppeal/deputeAppealSearchPage" role="button">На сторінку пошуку</a>


    </div>

  </div>

  </div>

</body>
</html>
