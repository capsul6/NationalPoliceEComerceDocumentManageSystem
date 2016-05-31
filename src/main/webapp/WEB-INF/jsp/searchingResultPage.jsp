<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"%>
<!DOCTYPE HTML>
<html lang="uk">
<head>
    <meta charset="utf-8">
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/styles/searchingResultPage.css" />" rel="stylesheet">


    <title>Результати пошуку</title>
</head>

<body>

<h1 style="text-align: center">Список звернень (запитів)</h1>


<table class="table table-bordered">

    <thead>
    <tr>
        <th style="text-align:center">#</th>
        <th style="text-align:center">Номер звернення (запиту)</th>
        <th style="text-align:center">Вхідний номер</th>
        <th style="text-align:center">П.І.Б. народного депутата</th>
        <th style="text-align:center">Резолюція керівника</th>
        <th style="text-align:center">Тип документу</th>
        <th class="example" style="text-align:center">Дії з документом</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach items="${ListOfAppeals}" var="Appeals">

        <c:url value="/main/editPage?id=${Appeals.id}" var="edit"/>
        <c:url value="/main/getUpload?id=${Appeals.id}" var="upload"/>

        <tr>
            <td style="text-align:center"><c:out value="${Appeals.id}"/></td>
            <td style="text-align:center"><c:out value="${Appeals.number}"/></td>
            <td style="text-align:center"><c:out value="${Appeals.incomingDate}"/></td>
            <td style="text-align:center"><c:out value="${Appeals.nameOfDepute}"/></td>
            <td style="text-align:center"><c:out value="${Appeals.resolutionOfChief}"/></td>
            <td style="text-align:center"><c:out value="${Appeals.typeOfAppeal}"/></td>
            <td style="text-align:center">

                <a href="${edit}"><button type="button" class="btn btn-warning btn-sm">редагувати</button></a>
                <a href="${upload}"><button type="button" class="btn btn-danger btn-sm">додати файл</button></a>

            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>