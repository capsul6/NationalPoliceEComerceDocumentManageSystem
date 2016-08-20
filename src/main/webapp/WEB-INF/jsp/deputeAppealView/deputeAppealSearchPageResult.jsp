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

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/deputeAppealSearchPageResult.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<div class="container-fluid">

  <div class="row">

  <div class="col-md-12">

      <table class="table">

        <thead>
        <tr>
        <th>№ вх.</th>
        <th>Дата вх.</th>
        <th>П.І.Б. народного депутата</th>
        <th>Короткий зміст</th>
        <th>Статус</th>
        <th>Доступні дії</th>
        </tr>
        </thead>

        <tbody>

        <col width="8%"/>
        <col width="10%"/>
        <col width="17%"/>
        <col width="20%"/>
        <col width="10%"/>
        <col width="30%"/>

          <c:forEach var="appeal" items="${deputeAppealList}">
        <tr>
          <td><c:out value="${appeal.incomeNumber}"/></td>
          <td><c:out value="${appeal.incomingDate}"/></td>
          <td><c:out value="${appeal.nameOfDepute}"/></td>
          <td><c:out value="${appeal.shortContentOfAppeal}"/></td>
          <td><c:out value="${appeal.statusOfWorking}"/></td>
          <td>
            <c:url var="edit" value="/deputeAppeal/editPage?id=${appeal.id}"/>
            <c:url var="upload" value="/deputeAppeal/getPageForUploadFileForDeputeAppeal?id=${appeal.id}"/>
            <c:url var="detailInformOfAppeal" value="/deputeAppeal/detailInformationAboutDeputeAppeal?id=${appeal.id}"/>
            <a href="${detailInformOfAppeal}"><button type="button" class="btn btn-primary btn-sm">детальна інформація</button></a>
            <a href="${edit}"><button type="button" class="btn btn-warning btn-sm"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> редагувати</button></a>
            <a href="${upload}">
              <button type="button" class="btn btn-success btn-sm"><span class="glyphicon glyphicon-save" aria-hidden="true"></span> додати файл</button>
            </a>
          </td>
        </tr>
          </c:forEach>

        </tbody>

        </table>

    </div>

    </div>

  </div>

  </body>

  </html>
