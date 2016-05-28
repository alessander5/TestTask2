<%--
  Created by IntelliJ IDEA.
  User: Infy
  Date: 28.05.2016
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
  <title>Корзина</title>
  <meta name="title" content="Корзина">
  <meta name="description" content="Корзина">
  <meta http-equiv="content-language" content="ru">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
</head>
<body>
<h1>Корзина</h1>

<form>
  <fieldset>
    <tbody>
    <ul>
      <c:forEach var="vegetable" items="${vegetables}">
        <li>
          <td><c:out value="${vegetable}" /></td>
        </li>
      </c:forEach>
    </ul>
  </fieldset>
</form>
</body>
</html>