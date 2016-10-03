<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<title>Пошук запитів (звернень) народних депутатів</title>
<head>
  <meta charset="utf-8">
  <!-- Jquery -->
  <script src="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/deputeAppealSearchPage.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<c:url var="getDeputeAppeals" value="/deputeAppeal/deputeAppealSearchPageResult"/>

<form:form method="GET" action="${getDeputeAppeals}">

<div class="container">

  <div class="row main">

      <div class="col-md-4 left_block">

      <label>Номер вих.</label>
      <input type="text" id="outNumber" class="form-control" name="outNumber" path="outNumber">

      <label>Номер вх.</label>
      <input type="text" id="incomeNumber" class="form-control" name="incomeNumber" path="incomeNumber">

      <label>Дата вх.</label>
      <input type="date" id="incomingDate" class="form-control" name="incomingDate" path="incomingDate">

      <label>Дата вих.</label>
      <input type="date" id="outDate" class="form-control" name="outDate" path="outDate">

      <label>П.І.Б та адреса заявника</label>
      <input type="text" id="nameAndAddressOfApplicant" class="form-control" name="nameAndAddressOfApplicant" path="nameAndAddressOfApplicant">

      </div>

      <div class="col-md-4 right_block">

      <label>П.І.Б народного депутата</label>
      <input type="text" id="nameOfDepute" class="form-control" name="nameOfDepute" path="nameOfDepute">

      <label>Інстанція з якої надійшов документ</label>
      <input type="text" id="sendingOrganization" class="form-control" name="sendingOrganization" path="sendingOrganization">

      <label>Короткий зміст</label>
      <textarea id="shortContentOfAppeal" class="form-control" name="shortContentOfAppeal" path="shortContentOfAppeal"></textarea>

      <label>Вид</label>
      <select class="form-control" id="typeOfDeputeAppeal" name="typeOfDeputeAppeal" path="typeOfDeputeAppeal">
        <option disabled selected value>blank</option>
        <option value="Звернення">Звернення</option>
        <option value="Запит">Запит</option>
      </select>

      <label>Служба виконавець</label>
      <textarea class="form-control" id="mainWorker" name="mainWorker" path="mainWorker"></textarea>

    </div>

    </div>

    </div>

    <div class="container">
      <div class="row">
        <div class="col-md-offset-4 col-md-4 col-md-offset-4">
            <p id="message"></p>
      <button type="submit" class="btn btn-primary">Пошук</button>
          </div>
      </div>
    </div>
</form:form>

</body>

</html>
