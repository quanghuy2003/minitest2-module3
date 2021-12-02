<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/2/2021
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
  <h1>Edit</h1>
  <form method="post">
    <input type="text" name="id" value="${customer.getId()}">
    <input type="text" name="name" value="${customer.getName()}">
    <input type="text" name="price" value="${customer.getPrice()}">
    <input type="text" name="quantity" value="${customer.getQuantity()}">
    <button>Edit</button>
  </form>
</center>
</body>
</html>
