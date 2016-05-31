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
  <script src="<c:url value="../../resources/bootstrap/jquery/jquery-2.2.2.min.js" />" ></script>
  <script src="<c:url value="../../resources/bootstrap/js/bootstrap.min.js" />" ></script>

  <style>
    <%@include file='../../resources/bootstrap/css/bootstrap.css' %>
  </style>

</head>

<body>

<c:url value="/main/new" var="SaveUrl"/>

<form:form method="POST" action="${SaveUrl}" cssStyle="width:400px; margin-left:auto; margin-right:auto;margin-top: 50px;" enctype="multipart/form-data">

  <input type = "number" name="number" class = "form-control" placeholder = "type number"/>
  <br/>
  <input type = "date" name="IncomingDate" class = "form-control"/>
  <br/>
  <input type = "text" name="NameOfDepute" class = "form-control" placeholder = "type name"/>
  <br/>
  <input type = "text" name="ResolutionOfChief" class = "form-control" placeholder = "type resolution"/>
  <br/>
  <label>
    <select name="typeOfAppeal" class="form-control" style="width:400px; margin-left:auto; margin-right:auto;margin-top: 25px;">
      <option value="ЗВЕРНЕННЯ">ЗВЕРНЕННЯ</option>
      <option value="ЗАПИТ">ЗАПИТ</option>
    </select>
  </label>
  <br/>
  <button type = "submit" class = "btn btn-success" value = "Save" style="width: 400px; margin-left:auto; margin-right:auto;margin-top: 20px;">Accept</button>
</form:form>
</body>
</html>
