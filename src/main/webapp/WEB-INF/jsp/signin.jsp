<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Головна сторінка</title>

  <script src="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

    <link href="<c:url value="/resources/styles/signin.css" />" rel="stylesheet">

</head>
<body>

<div class="container">

    <img class="header" src="../../../resources/images/police.png">

</div>

<c:url value="/j_spring_security_check" var="loginUrl" />

<div class="container content">

<div class="row">

  <div class="col-md-offset-4 col-md-4">

<form class="login-form" action="${loginUrl}" method="post">

    <input type="text" class="form-control" name="username" placeholder="логін">


    <input type="password" class="form-control" name="password" placeholder="пароль">

    <button type="submit" class="btn btn-primary">Увійти</button>

</form>

  </div>

</div>

    </div>

</body>
</html>
