<%@ page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<html>
<head>
    <title>Добро пожаловать!</title>
    <link rel="stylesheet" href="resources/css/nothing.css"/>
    <link rel="stylesheet" href="resources/css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body style="background-image: url(resources/images/back.jpg);">
<div id="page" style="width: 55%;">
    <h1 style="margin-top:10px"><a href="index.jsp" class="logo">D&<span>D</span></a></h1>


    <table><tr><td><img src="resources/images/us.gif" id="magic_gif"></td><td>Авторы сайта:<br>Базарова Анна <br>Рожнов Денис</td></tr></table>

    <div class="leftbar-wrap">
        <a href="#page" class="left-controlbar">
            <span class="active-area">
                <span class="bar-desc"> Наверх</span>
            </span>
        </a>
    </div>
    <jsp:include page="templates/footer.jsp"/>
</div>
</body>
</html>