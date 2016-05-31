<%@ page import="sun.util.calendar.BaseCalendar" %>
<%@ page import="java.sql.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.sql.Time" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Файл додано</title>
  <!-- Bootstrap core CSS -->
  <link href="<c:url value="../../resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
</head>
<body>
<div class="alert alert-danger" role="alert">

  <p><strong>You have added file, file location is ${Appeal.filePath}</strong><br></p>

  <c:url var="main" value="/main/mainFrame"/>

  <a href="${main}">Click here to return to the main page</a>
</div>
</body>
</html>

