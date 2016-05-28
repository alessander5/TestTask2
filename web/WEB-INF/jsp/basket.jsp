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
        <td colspan="50">
          <button type="button" title="Продолжить покупки">
            <span>Добавить еще одно наименование в корзину</span>
          </button>

          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

          <button type="button" title="Продолжить покупки">
            <span>Сделать заказ</span>
          </button>
        </td>
      </tr>
      </tfoot>

      <tbody>
      <tr>
        <td>Редиска</td>

        <td>
          <dl>
            <dt><a href="#">Овощи и фрукты</a>&nbsp;&nbsp; &gt; &nbsp;&nbsp;</dt>
            <dd><a href="#">Овощи</a></dd>
          </dl>
        </td>

        <td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <span>120</span><span> грн.</span>
        </td>

        <td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input style="margin-top: -5px; text-align: center" title="Количество" type="number" min="1" maxlength="3" size="5" value="1" />
        </td>

        <td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="#" title="Удалить товар из корзины">Удалить товар</a>
        </td>
      </tr>

      <tr>
        <td>Арбуз</td>

        <td>
          <dl>
            <dt><a href="#">Овощи и фрукты</a>&nbsp;&nbsp; &gt; &nbsp;&nbsp;</dt>
            <dd><a href="#">Фрукты</a></dd>
          </dl>
        </td>

        <td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <span>150</span><span> грн.</span>
        </td>

        <td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input style="margin-top: -5px; text-align: center" title="Количество" type="number" min="1" maxlength="3" size="5" value="2" />
        </td>

        <td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="#" title="Удалить товар из корзины">Удалить товар</a>
        </td>
      </tr>

      <!-- My -->

      <c:if test="${not empty vegetables}">
          <c:forEach var="veg" items="${vegetables}">
            <tr>
              <td><c:out value="${veg.name}" /></td>

              <td>
                <dl>
                  <dt><a href="#">Овощи и фрукты</a>&nbsp;&nbsp; &gt; &nbsp;&nbsp;</dt>
                  <dd><a href="#">${veg.category}</a></dd>
                </dl>
              </td>

              <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <span>${veg.price}</span><span> грн.</span>
              </td>

              <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input style="margin-top: -5px; text-align: center" title="Количество" type="number" min="1" maxlength="3" size="5" value="2" />
              </td>

              <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="#" title="Удалить товар из корзины">Удалить товар</a>
              </td>
            </tr>
          </c:forEach>
      </c:if>

      </tbody>
    </table>
  </fieldset>
</form>
</body>
</html>
