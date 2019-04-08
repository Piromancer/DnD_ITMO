<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>

<head>

    <title>Редактор ландшафта</title>
    <style><%@include file="resources/css/style.css" %></style>
</head>


<body style="background-image: url(resources/images/back.jpg);">

<div id="page">

    <h1 id="top">Добро Пожаловать!</h1>
    <hr>
    <ul class="dropdown">
        <li class="dropdown-top">
            <div class="dropdown-top">Выпадающий список
            </div>
            <ul class="dropdown-inside">
                <li>Элемент1</li>
                <li>Элемент2</li>
                <li>Элемент3</li>
            </ul>
        </li>
    </ul>
    <br>








    <marquee behavior="scroll" direction="right" loop="400" scrollamount="5">
        <img src="resources/images/dragon.gif" alt="The dragon is missing and we're trying to catch it" />
    </marquee>


    <div class="leftbar-wrap">
        <a href="#page" class="left-controlbar">
            <span class="active-area">
                <span class="bar-desc"> Наверх</span>
            </span>
        </a>
    </div>
</div>
</body>

</html>

