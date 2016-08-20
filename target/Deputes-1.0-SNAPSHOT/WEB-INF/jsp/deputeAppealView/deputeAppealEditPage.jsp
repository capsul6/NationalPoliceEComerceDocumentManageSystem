<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<title>Редагування запитів (звернень) народних депутатів</title>
<head>
  <meta charset="utf-8">
  <!-- Jquery -->
  <script src="../../../resources/bootstrap/jquery/jquery-2.2.2.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/deputeAppealEditPage.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<c:url value="/deputeAppeal/editPage?id=${editedAppeal.id}" var="saveEditedDeputeAppeal"/>

<form:form modelAttribute="editedAppeal" action="${saveEditedDeputeAppeal}" method="post">

  <div class="container content">

    <div class="form-group" id="firstBlock">

      <label>Вид</label>
      <select path="typeOfDeputeAppeal" path="typeOfDeputeAppeal" name="typeOfDeputeAppeal" class="form-control">
        <option value="<c:out value="${editedAppeal.typeOfDeputeAppeal}"/>"><c:out value="${editedAppeal.typeOfDeputeAppeal}"/></option>
        <option value="Звернення">Звернення</option>
        <option value="Запит">Запит</option>
      </select>

      <label>Організація з якої надійшов документ</label>
      <input type="text" class="form-control" path="sendingOrganization" name="sendingOrganization" value="<c:out value="${editedAppeal.sendingOrganization}"/>">

      <label>Номер вих.</label>
      <input type="text" class="form-control" path="outNumber" name="outNumber" value="<c:out value="${editedAppeal.outNumber}"/>">

      <label>Дата вих.</label>
      <input type="date" class="form-control" path="outDate" name="outDate" value="<c:out value="${editedAppeal.outDate}"/>">

      <label>К-сть сторінок</label>
      <input type="text" class="form-control" path="countOfPages" name="countOfPages" value="<c:out value="${editedAppeal.countOfPages}"/>">

      <label>П.І.Б народного депутата</label>
      <input type="text" class="form-control" path="nameOfDepute" name="nameOfDepute" value="<c:out value="${editedAppeal.nameOfDepute}"/>">

      <label>Номер вх.</label>
      <input type="text" class="form-control" path="incomeNumber" name="incomeNumber" value="<c:out value="${editedAppeal.incomeNumber}"/>">

      <label>Дата вх.</label>
      <input type="date" class="form-control" path="incomingDate" name="incomingDate" value="<c:out value="${editedAppeal.incomingDate}"/>">

      <label>Тематика</label>
      <select class="form-control" path="themeOfAppeal" name="themeOfAppeal">
        <option value="<c:out value="${editedAppeal.themeOfAppeal}"/>"><c:out value="${editedAppeal.themeOfAppeal}"/></option>
        <option value="Неналежне розслідування крим.проваджень">Неналежне розслідування крим.проваджень</option>
        <option value="Соц.побутові питання працівників поліції">Соц.побутові питання працівників поліції</option>
        <option value="Інші питання">Інші питання</option>
      </select>

      <label>Короткий зміст</label>
      <textarea class="form-control" path="shortContentOfAppeal" name="shortContentOfAppeal"><c:out value="${editedAppeal.shortContentOfAppeal}"/></textarea>

    </div>

    <div class="form-group" id="secondForm">

      <label>Керівник що вчинив резолюцію</label>
      <select class="form-control" path="unitWhoDoResolution" name="unitWhoDoResolution">
        <option value="<c:out value="${editedAppeal.unitWhoDoResolution}"/>"><c:out value="${editedAppeal.unitWhoDoResolution}"/></option>
        <option value="Деканоідзе Х.">Деканоідзе Х.</option>
        <option value="Троян В.А.">Троян В.А.</option>
        <option value="Вакуленко О.Ф.">Вакуленко О.Ф.</option>
        <option value="Фацевич О.Ю.">Фацевич О.Ю.</option>
        <option value="Руденко А.А.">Руденко А.А.</option>
        <option value="Бушуєв К.В.">Бушуєв К.В.</option>
      </select>

      <label>Зміст резолюції</label>
      <textarea class="form-control" path="contentOfResolution" name="contentOfResolution"><c:out value="${editedAppeal.contentOfResolution}"/></textarea>


      <label style="color: red;">Повторність</label>
      <input type="checkbox" value="повторно" path="checkForPlagiarism" name="checkForPlagiarism">Так<br>

      <label>П.І.Б. та адреса заявника</label>
      <textarea class="form-control" path="nameAndAddressOfApplicant" name="nameAndAddressOfApplicant"><c:out value="${editedAppeal.nameAndAddressOfApplicant}"/></textarea>


      <label>Дата виконання документу</label>
      <input type="date" class="form-control" path="dateForCheck" name="dateForCheck" value="<c:out value="${editedAppeal.dateForCheck}"/>">

      <label>Служба виконавця</label>
      <select class="form-control" path="mainWorker" name="mainWorker">
        <option value="<c:out value="${editedAppeal.mainWorker}"/>"><c:out value="${editedAppeal.mainWorker}"/></option>
        <option value="ДПО">ДПО</option>
        <option value="ДЗЕ">ДЗЕ</option>
        <option value="ДПП">ДПП</option>
      </select>

      <label>Співвиконавці</label>
      <input type="text" class="form-control" path="secondaryWorkers" name="secondaryWorkers" value="<c:out value="${editedAppeal.secondaryWorkers}"/>">

      <label>Наслідки виконання</label>
      <select class="form-control" path="statusOfWorking" name="statusOfWorking">
        <option value="<c:out value="${editedAppeal.statusOfWorking}"/>"><c:out value="${editedAppeal.statusOfWorking}"/></option>
        <option value="Виконано">Виконано</option>
        <option value="В роботі">В роботі</option>
        <option value="Не виконано">Не виконано</option>
      </select>

      <label>Що зроблено</label>
      <textarea class="form-control" path="result" name="result"><c:out value="${editedAppeal.result}"/></textarea>

    </div>

  </div>

  <div class="container">
    <div class="row">
      <div class="col-md-12 footer_button">
        <button type="submit" value="Save" class="btn btn-success">Оновити інформацію</button>
      </div>
    </div>
  </div>

</form:form>

</body>
</html>
