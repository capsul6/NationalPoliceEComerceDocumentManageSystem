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
  <script src="../../../resources/scripts/informDeputeAppealPage.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="../../../resources/bootstrap/js/bootstrap.js"></script>

  <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">

  <link href="<c:url value="/resources/styles/deputeAppealPagesStyle/informDeputeAppealPage.css" />" rel="stylesheet">

</head>

<body>

<div class="container head">

  <a href="/main/Menu"><img class="header" src="../../../resources/images/police.png"></a>

</div>

<div class="container content">

  <div class="row">

    <div class="col-md-12">

      <table class="table">

        <thead>
        <tr>
          <th>Назва файлу</th>
          <th>Тип файлу</th>
          <th>№ документу до якого відносяться файли</th>
          <th>Доступні дії</th>
        </tr>
        </thead>

        <tbody>

        <col width="25%"/>
        <col width="15%"/>
        <col width="30%"/>
        <col width="30%"/>

        <c:forEach items="${listOfFiles}" var="file" >
          <tr>
            <td><c:out value="${file.fileName}"/></td>
            <td><c:out value="${file.fileType}"/></td>
            <td><c:out value="${file.deputeAppealFilesId}нд"/></td>
            <td>
                <a href="<c:url value="/deputeAppeal/downloadFile?fileId=${file.deputeAppealFilesId}"/>" download>
                  <button type="submit" class="btn btn-primary btn-sm">Завантажити файл</button>
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
