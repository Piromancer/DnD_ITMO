<%@ page contentType="text/html" pageEncoding="UTF-8" language="java"%>

<html>
<head>
    <title>Создание монстра</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <link rel="stylesheet" href="resources/css/formstyle.css"/>
    <link rel="stylesheet" href="resources/css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body  style="background-image: url(resources/images/back.jpg);">
<div id="page" style="width: 55%;">
    <!--TODO денис, сделай так, чтобы интерактивно подставлялась картинка в правый верхний угол (они есть в images/race)-->
    <!--TODO чтобы при пролистывании формы вниз картинка оставалась приклеенной к тому углу-->
    <h1 style="margin-top:10px"><a href="home.jsp" class="logo">D&<span>D</span></a></h1>
    <div class="wrapper">
        <div class="content">
            <div class="container" id="center-content">
                <div class="row main-form">
                    <h2 >Создание Монстра</h2><!--TODO-->
                    <form method="post" action="/makepers">

                        <div class="form-group">
                            <label for="login" class="cols-sm-2 control-label">Название Монстра</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                           id="login" placeholder="Введите название монстра" required/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="race" class="cols-sm-2 control-label">Тип</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users" aria-hidden="true"></i></span>
                                    <label class="container-for-radio">Существо
                                        <input type="radio" id="race" name="race" value="thing" required/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Элементаль
                                        <input type="radio" id="race" name="race" value="elemental"/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Животное
                                        <input type="radio" id="race" name="race" value="animal"/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Тьма
                                        <input type="radio" id="race" name="race" value="dark"/>
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <table>
                            <tr><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">БМА</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                               id="login" placeholder="Введите модификатор атаки" required/>
                                    </div>
                                </div>
                            </div></td><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">УРОН</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                               id="login" placeholder="Введите значение урона" required/>
                                    </div>
                                </div>
                            </div></td></tr>
                            <tr><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">КБ</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                               id="login" placeholder="Введите класс брони" required/>
                                    </div>
                                </div>
                            </div></td><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ВОЛЯ</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                               id="login" placeholder="Введите значение воли" required/>
                                    </div>
                                </div>
                            </div></td></tr>
                            <tr><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ЛУТ</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                               id="login" placeholder="Введите цену за лут" required/>
                                    </div>
                                </div>
                            </div></td><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ИНИЦ</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="login" minlength="4" maxlength="30"
                                               id="login" placeholder="Введите значение инициативы" required/>
                                    </div>
                                </div>
                            </div></td></tr>
                        </table>
                        <div class="form-group ">

                            <input id="npc" type="checkbox" value="dead">
                            <label for="npc">Нежить</label>
                        </div>
                        <div class="form-group ">
                            <input class="btn btn-lg btn-primary btn-block" type="submit" value="Подтвердить">
                        </div>
                    </form>

                </div>
                <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
                <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
            </div>
        </div>
        <div class="leftbar-wrap">
            <a href="#page" class="left-controlbar">
            <span class="active-area">
                <span class="bar-desc"> Наверх</span>
            </span>
            </a>
        </div>
        <div class="footer">
            <jsp:include page="templates/footer.jsp"/>
        </div>
    </div></div>
</body>
</html>