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
  <!-- Jquery -->
  <script src="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/addDeputeAppealPage.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<c:url value="/deputeAppeal/newDeputeAppealPost" var="SaveUrl"/>

<form:form modelAttribute="${deputeAppeal}" method="POST" action="${SaveUrl}">

  <div class="container content">

    <div class="form-group" id="firstBlock">

      <label>Вид</label>
      <select path="typeOfDeputeAppeal" name="typeOfDeputeAppeal" class="form-control">
        <option disabled selected value>Тип</option>
        <option value="Звернення">Звернення</option>
        <option value="Запит">Запит</option>
      </select>

      <label>Організація з якої надійшов документ</label>
      <input type="text" class="form-control" path="sendingOrganization" name="sendingOrganization"/>


      <label>Номер вих.</label>
      <input type="text" class="form-control" path="outNumber" name="outNumber"/>


      <label>Дата вих.</label>
      <input type="date" class="form-control" path="outDate" name="outDate"/>


      <label>К-сть сторінок</label>
      <input type="text" class="form-control" placeholder="наприклад 1+1" path="countOfPages" name="countOfPages"/>


      <label>П.І.Б народного депутата</label>
      <input type="text" class="form-control" path="nameOfDepute" name="nameOfDepute"/>


      <label>Номер вх.</label>
      <input type="text" class="form-control" path="incomeNumber"  value="${number}нд" name="incomeNumber" readonly/>


      <label>Дата вх.</label>
      <input type="date" class="form-control" path="incomingDate" name="incomingDate"/>


      <label>Тематика</label>
      <select class="form-control" path="themeOfAppeal" name="themeOfAppeal">
        <option disabled selected value>Тип</option>
        <option value="З кадрових питань НПУ">З кадрових питань НПУ</option>
        <option value="Пенсійне забезпечення працівників поліції">Пенсійне забезпечення працівників поліції</option>
        <option value="Щодо неналежного розслідування кримінального провадження">Щодо неналежного розслідування кримінального провадження</option>
        <option value="З питань усунення недоліків у роботі поліції">З питань усунення недоліків у роботі поліції</option>
        <option value="Зловживання службовим становищем посадових осіб">Зловживання службовим становищем посадових осіб</option>
        <option value="Про неправомірні дії працівників поліції">Про неправомірні дії працівників поліції</option>
        <option value="З питань роботи патрульної поліції">З питань роботи патрульної поліції</option>
        <option value="З питань дозвільної системи">З питань дозвільної системи</option>
        <option value="Матеріально-технічне забезпечення поліції">Матеріально-технічне забезпечення поліції</option>
        <option value="Розшук осіб">Розшук осіб</option>
      </select>


      <label>Короткий зміст</label>
      <textarea class="form-control" path="shortContentOfAppeal" name="shortContentOfAppeal"></textarea>


    </div>

    <div class="form-group" id="secondForm">

      <label>Керівник що вчинив резолюцію</label>
      <select class="form-control" path="unitWhoDoResolution" name="unitWhoDoResolution">
        <option disabled selected value>Тип</option>
        <option value="Деканоідзе Х.">Деканоідзе Х.</option>
        <option value="Троян В.А.">Троян В.А.</option>
        <option value="Вакуленко О.Ф.">Вакуленко О.Ф.</option>
        <option value="Фацевич О.Ю.">Фацевич О.Ю.</option>
        <option value="Руденко А.А.">Руденко А.А.</option>
        <option value="Бушуєв К.В.">Бушуєв К.В.</option>
        <option value="Крищенко А.Є.">Крищенко А.Є.</option>
      </select>

      <label>Зміст резолюції</label>
      <textarea class="form-control" path="contentOfResolution" name="contentOfResolution"></textarea>

      <label style="color: red;">Повторність</label>
      <input type="checkbox" value="повторно" path="checkForPlagiarism" name="checkForPlagiarism"/>Так<br>

      <label>П.І.Б. та адреса заявника</label>
      <textarea class="form-control" path="nameAndAddressOfApplicant" name="nameAndAddressOfApplicant"></textarea>


      <label>Дата виконання документу</label>
      <input type="date" class="form-control" path="dateForCheck" name="dateForCheck"/>

      <label>Служба виконавця</label>
      <input type="text" class="form-control" path="mainWorker" name="mainWorker">

      <label>Співвиконавці</label>
      <input type="text" class="form-control" path="secondaryWorkers" name="secondaryWorkers"/>

      <label>Наслідки виконання</label>
      <select class="form-control" path="statusOfWorking" name="statusOfWorking">
        <option disabled selected value>Тип</option>
        <option value="Виконано">Виконано</option>
        <option value="В роботі">В роботі</option>
        <option value="Не виконано">Не виконано</option>
      </select>

      <label>Що зроблено</label>
      <textarea class="form-control" path="result" name="result"></textarea>

    </div>

  </div>

  <div class="container">
    <div class="row">
      <div class="col-md-12 footer_button">
        <button type="submit" value="Save" class="btn btn-success">Зареєструвати</button>
      </div>
    </div>
  </div>

</form:form>

</body>

</html>
