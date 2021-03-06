<%--
  Created by IntelliJ IDEA.
  User: Infy
  Date: 29.05.2016
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="/WEB-INF/tld/functions.tld" prefix="utils" %>

<html>
<head>
  <title>Заказ</title>
  <meta name="title" content="Заказ">
  <meta name="description" content="Заказ">
  <meta http-equiv="content-language" content="ru">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">


  <script type="text/javascript">
    <jsp:include page = "WEB-INF/jsp/js/jquery-1.9.1.min.js" flush = "true" />
  </script>

  <script type="text/javascript">
    <jsp:include page = "WEB-INF/jsp/js/scripts.js" flush = "true" />
  </script>
</head>

<body>
<h2>Данные клиента</h2>
<form action="order" name="orderForm" method="post">
  <fieldset class="highlight">
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;ФИО:
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input id="fioInput" name="fio" value="" title="ФИО" maxlength="255" type="text">
    </div>
    <br/>
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;Номер телефона:
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input name="phone" value="" title="Номер телефона" type="text" placeholder="+38(0XX)XXX-XX-XX" >
    </div>

    <br/>
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;Email адрес:
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input name="email" value="" title="Email адрес" type="text" placeholder="hello@gmail.com">
    </div>

    <br/>
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;Способ доставки:
      <br/>
      <input value="1" title="Самовывоз" type="radio" name="delivery">Самовывоз
      <br/>
      <input value="2" title="Доставка"  type="radio" name="delivery" checked>Доставка
    </div>

    <div class="mandatory-field">
      <em>*cond*</em>&nbsp;&nbsp;Ваш адрес:
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input title="Адрес" id="addressInput" name="address" value="" type="text" style="width: 400px;">
    </div>

    <br/>
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;Оплата:
      <select title="Оплата">
        <option title="Наличными" value="1" id="payment-type-cash">Наличными</option>
        <option title="Безналичная" value="2" id="payment-type-non-cash">Безналичная</option>
      </select>
    </div>

    <br/>
    <div>&nbsp;&nbsp;&nbsp;&nbsp;Комментарий: <br/>
      &nbsp;&nbsp;&nbsp;&nbsp;<textarea id="commentInput" value="" title="Комментарий" style="width:400px; height:40px"></textarea>
    </div>

    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;
      <input type="checkbox">
      Согласен с пользовательским договором.
    </div>
  </fieldset>
</form>

<br/>
<div>
  <table>
    <th><strong>Данные по заказу:</strong></th>
    <c:forEach var="item" items="${basketItems}">
      <tr>
        <td><c:out value="${item.name}"/></td>
        <td><c:out value="${item.count}шт."/></td></td>
      </tr>

    </c:forEach>
    <tr>
      <td><strong>Общая сумма заказа:</strong></td>
      <td><strong><span>${utils:getTotalPrice(basketItems)}</span>грн.</strong></td>
    </tr>
  </table>


</div>

<br/>
<button type="button" onclick="doAjax()" title="Подтвердить заказ"><span style="font-size: 20px">Подтвердить заказ</span></button>

<br/><br/>
<div id ="showHide" style="display: none; color: red">Спасибо за покупку!</div>

</body>
</html>
