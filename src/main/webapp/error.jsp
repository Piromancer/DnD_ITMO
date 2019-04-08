<%@ page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<html>
<head>
    <title>Ошибка!</title>
    <link rel="stylesheet" href="resources/css/error.css"/>
    <link rel="stylesheet" href="resources/css/index.css"/>
    <link rel="stylesheet" href="resources/css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body style="background-image: url(resources/images/back.jpg);">
<div id="page" style="width: 55%;">
    <table width="100%"><tr>
        <td><h1 style="margin-top:10px"><a href="index.jsp" class="logo">D&<span>D</span></a> </h1></td>
        <td><div class="pict2"><img src="resources/images/sadcat.jpg"></div></td></tr></table>
    <ul class="dropdown">
        <li class="dropdown-top">
            <div class="dropdown-top">О нас
            </div>
            <ul class="dropdown-inside">
                <li><a href="nothing.jsp">Уголок разработчика</a></li>
            </ul>
        </li>
    </ul>
    <div class="container">
        <div class="row center-content">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                <h2>
                    Ой-ёй!<br></h2>
                <h3>Произошла какая-то ошибочная ошибка(<br></h3>
                <div class="pict">
                <img src="resources/images/sadcat2.jpg" style="text-align: center"></div>
                <h3>Но не волнуйтесь, мы все предусмотрели, просто нажмите на логотип D&D наверху<br></h3>



            </div>
            <div class="col-sm-2"></div>
        </div>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </div>

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