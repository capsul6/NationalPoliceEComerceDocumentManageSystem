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



    <div class="form-group" id="firstBlock">

        <label>Вид</label>
        <input class="form-control" disabled
        value="<c:out value="${deputeAppealIdForInformPage.typeOfDeputeAppeal}"/>"
        >

        <label>Організація з якої надійшов документ</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.sendingOrganization}"/>"
        >

        <label>Номер вих.</label>
        <input class="form-control" disabled
        value="<c:out value="${deputeAppealIdForInformPage.outNumber}"/>"
        >

        <label>Дата вих.</label>
        <input class="form-control" disabled
        value="<c:out value="${deputeAppealIdForInformPage.outDate}"/>"
        >

        <label>К-сть сторінок</label>
        <input class="form-control" disabled
        value="<c:out value="${deputeAppealIdForInformPage.countOfPages}"/>"
        >

        <label>П.І.Б народного депутата</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.nameOfDepute}"/>"
                >

        <label>Номер вх.</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.incomeNumber}"/>"
                >


        <label>Дата вх.</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.incomingDate}"/>"
                >

        <label>Тематика</label>
        <textarea class="form-control" disabled rows="3"><c:out value="${deputeAppealIdForInformPage.themeOfAppeal}"/>
        </textarea>

        <label>Короткий зміст</label>
        <textarea class="form-control" disabled rows="3"><c:out value="${deputeAppealIdForInformPage.shortContentOfAppeal}"/>
        </textarea>

    </div>

    <div class="form-group" id="secondForm">

        <label>Керівник що вчинив резолюцію</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.unitWhoDoResolution}"/>"
                >


        <label>Зміст резолюції</label>
        <textarea class="form-control" disabled rows="3"><c:out value="${deputeAppealIdForInformPage.contentOfResolution}"/>
        </textarea>

        <label>Повторність</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.checkForPlagiarism}"/>"
                >

        <label>П.І.Б. та адреса заявника</label>
        <textarea class="form-control" disabled rows="3"><c:out value="${deputeAppealIdForInformPage.nameAndAddressOfApplicant}"/>
        </textarea>

        <label>Дата виконання документу</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.dateForCheck}"/>"
                >

        <label>Служба виконавця</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.mainWorker}"/>"
                >

        <label>Співвиконавці</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.secondaryWorkers}"/>"
                >

        <label>Наслідки виконання</label>
        <input class="form-control" disabled
               value="<c:out value="${deputeAppealIdForInformPage.statusOfWorking}"/>"
                >

        <label>Що зроблено</label>
        <textarea class="form-control" disabled rows="3"><c:out value="${deputeAppealIdForInformPage.result}"/>
        </textarea>

        <a href="<c:url value='/deputeAppeal/listOfFiles?id=${deputeAppealIdForInformPage.id}'/>">Показати список файлів</a>

    </div>

    </div>

    <div class="row">
    <div class="col-md-offset-5 col-md-3">
        <button onclick="myFunction()" type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-print" aria-hidden="true"></span> Друк</button>
    </div>
    </div>

</body>

</html>