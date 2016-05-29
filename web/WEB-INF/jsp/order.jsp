<%--
  Created by IntelliJ IDEA.
  User: Infy
  Date: 29.05.2016
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
  <title>Заказ</title>
  <meta name="title" content="Заказ">
  <meta name="description" content="Заказ">
  <meta http-equiv="content-language" content="ru">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
</head>

<body>

<h2>Данные клиента</h2>
<form enctype="multipart/form-data;charset=UTF-8">
  <fieldset class="highlight">
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;ФИО:
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input name="fio" value="" title="ФИО" maxlength="255" type="text">
    </div>

    <br/>
    <div class="mandatory-field">
      <em>*</em>&nbsp;&nbsp;Номер телефона:
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input name="phone" value="" title="Номер телефона" type="text" placeholder="+38(0XX)XXX-XX-XX">
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
      <input title="Адрес" name="address" value="" type="text" style="width: 400px;">
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
      &nbsp;&nbsp;&nbsp;&nbsp;<textarea value="" title="Комментарий" style="width:400px; height:40px"></textarea>
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
    <tr><td>Редиска</td><td><span>1</span>шт.</td></tr>
    <tr><td>Арбуз</td><td><span>2</span>шт.</td></tr>
  </table>
  <strong>Общая сумма заказа: &nbsp;&nbsp;&nbsp;&nbsp; <span>420</span>грн.</strong>
</div>

<br/>
<button type="button" title="Подтвердить заказ"><span style="font-size: 20px">Подтвердить заказ</span></button>

<br/><br/>
<div style="display: none; color: red">Спасибо за покупку!</div>

</body>
</html>