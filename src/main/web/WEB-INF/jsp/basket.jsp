<%--
  Created by IntelliJ IDEA.
  User: Infy
  Date: 28.05.2016
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="/WEB-INF/tld/functions.tld" prefix="utils" %>

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



  <fieldset>
    <table>
      <thead>
      <tr>
        <th>Название товара</th>
        <th>Категория товара</th>
        <th>Цена за 1 артикул</th>
        <th>Количество</th>
        <th>Действия</th>
      </tr>
      </thead>

      <tfoot>
      <tr>
        <td>
          <form action="addRandom" method="post">
            <input type="submit" value="Добавить еще одно наименование в корзину" title="Продолжить покупки"/>
          </form>
        </td>

        <td>
          <form action="createOrder" method="post">
            <input type="submit" value="Сделать заказ" title="Продолжить покупки"/>
          </form>
        </td>
      </tr>
      </tfoot>

      <tbody>

      <!-- My -->

      <c:if test="${not empty basketItems}">
          <c:forEach var="item" items="${basketItems}">
            <tr>
              <td><c:out value="${item.name}" /></td>

              <td>
                <dl>
                  <dt><a href="#">Овощи и фрукты</a>&nbsp;&nbsp; &gt; &nbsp;&nbsp;</dt>
                  <dd><a href="#">${item.category}</a></dd>
                </dl>
              </td>

              <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <span>${item.price}</span><span> грн.</span>
              </td>

              <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input style=" text-align: center" title="Количество" type="number" value="${item.count}"/>
              </td>

              <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <!--
                <c:url var="deleteURL" value="remove">
                  <c:param name="itemId" value="${item.id}"/>
                </c:url>
                <a href="<c:out value="${deleteURL}"/>Удалить</a>
                -->

                <form action="remove" method="POST">
                  <input type="submit" value="Удалить товар" />
                  <input id="itemId" name="itemId" type="hidden" value="${item.id}"/>
                </form>

              </td>
            </tr>
          </c:forEach>
      </c:if>

      </tbody>
    </table>
  </fieldset>

  <form action="test" method="POST">
    <input type="submit" value="Ajax Test" />
  </form>
</body>
</html>
