<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Головна сторінка</title>

  <!-- Jquery -->
  <script src="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

  <link href="<c:url value="/resources/styles/mainPage.css" />" rel="stylesheet">

</head>

<body>

<c:url var="addUrl" value="/main/new"/>
<c:url var="searchResult" value="/main/resultOfSearching"/>

<div class="container">

  <img class="header" src="../../../resources/images/police.png">

</div>


<div class="container-fluid">

  <div class="row navbar">

    <div class = "col-md-12">


      <!-- Split button -->
      <div class="btn-group first_button">
        <button type="button" class="btn btn-default">Звернення (запити) народних депутатів</button>
        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <span class="caret"></span>
          <span class="sr-only">Toggle Dropdown</span>
        </button>
        <ul class="dropdown-menu">
          <li><a href="${addUrl}">Додати нове</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Пошук звернень (запитів) народних депутатів</a></li>
        </ul>
      </div>





      <div class="btn-group second_button">
        <button type="button" class="btn btn-default">Адвокатські запити</button>
        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <span class="caret"></span>
          <span class="sr-only">Toggle Dropdown</span>
        </button>
        <ul class="dropdown-menu">
          <li><a href="#">Додати новий</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Пошук адвокатських запитів</a></li>
        </ul>
      </div>





      <div class="btn-group third_button">
        <button type="button" class="btn btn-default">Доступ до публічної інформації</button>
        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <span class="caret"></span>
          <span class="sr-only">Toggle Dropdown</span>
        </button>
        <ul class="dropdown-menu">
          <li><a href="#">Додати новий</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Пошук запитів на доступ до публічної інформації</a></li>
        </ul>
      </div>

  </div>

</div>


<div class="container search_block">

  <form:form method="get" action="${searchResult}" accept-charset="UTF-8">


  <div class="col-md-offset-3 col-md-6">
    <p>Загальний пошук</p>
    <div class="input-group">
      <input type="text" class="form-control" placeholder="введіть слово для пошуку" name="searchChar">
      <span class="input-group-btn">
          <button class="btn btn-primary" type="submit">Пошук</button>
      </span>
    </div>
  </div>

  </form:form>

</div>

</body>

</html>
