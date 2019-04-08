<%@ page contentType="text/html" pageEncoding="UTF-8" language="java"%>

<html>
<head>
    <title>Вход в систему</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <link rel="stylesheet" href="resources/css/formstyle.css"/>
    <link rel="stylesheet" href="resources/css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body  style="background-image: url(resources/images/back.jpg);">
<div id="page" style="width: 55%;">
    <h1 style="margin-top:10px"><a href="index.jsp" class="logo">D&<span>D</span></a></h1>
<div class="container" id="center-content">
    <div class="row main-form">
        <h2>Авторизация</h2>
        <form method="post" action="login">
            <div class="form-group">
                <label for="login" class="cols-sm-2 control-label">Логин</label>
                <div class="cols-sm-10">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                        <input type="text" class="form-control" name="login" id="login" placeholder="Введите логин" required/>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="cols-sm-2 control-label">Пароль</label>
                <div class="cols-sm-10">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                        <input type="password" class="form-control" name="password"
                               id="password" placeholder="Введите пароль" required/>
                    </div>
                </div>
            </div>


            <div class="form-group ">
                <input class="btn btn-lg btn-primary btn-block" type="submit" value="Вход">
            </div>
        </form>
        <%if(request.getParameter("error") != null) { %>
        <div class="alert alert-msg">
            <h4 id="error-msg">Неверный логин или пароль</h4>
        </div>
        <%}%>
        <%--<h3><a href="home.jsp" class="logo">Этой кнопки здесь не будет</a></h3>--%>
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