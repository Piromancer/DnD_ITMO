<%@ page contentType="text/html" pageEncoding="UTF-8" language="java"%>

<html>
<head>
    <title>Создание персонажей</title>
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
                    <h2 >Создание Персонажа</h2><!--TODO-->
                    <form method="post" action="character_creation">

                        <div class="form-group">
                            <label for="login" class="cols-sm-2 control-label">Имя Персонажа</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="name" minlength="4" maxlength="30"
                                           id="name" placeholder="Введите имя персонажа" required/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="sex" class="cols-sm-2 control-label">Пол</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users" aria-hidden="true"></i></span>
                                    <label class="container-for-radio">Мужской
                                        <input type="radio" id="sex" name="sex" value="m" required/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Женский
                                        <input type="radio" id="sex" name="sex" value="f"/>
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="race" class="cols-sm-2 control-label">Раса</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users" aria-hidden="true"></i></span>
                                    <label class="container-for-radio">Орк
                                        <input type="radio" id="race" name="race" value="Orc" required/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Человек
                                        <input type="radio" id="race" name="race" value="Human"/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Эльф
                                        <input type="radio" id="race" name="race" value="Elf"/>
                                        <span class="checkmark"></span>
                                    </label>
                                    <label class="container-for-radio">Дварф
                                        <input type="radio" id="race" name="race" value="Gnome"/>
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <table>
                            <tr><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">СИЛ</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="str" minlength="1" maxlength="2"
                                               id="str" placeholder="Введите значение силы" required/>
                                    </div>
                                </div>
                            </div></td><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ИНТ</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="int" minlength="1" maxlength="2"
                                               id="int" placeholder="Введите значение интеллекта" required/>
                                    </div>
                                </div>
                            </div></td></tr>
                            <tr><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ЛВК</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="dex" minlength="1" maxlength="2"
                                               id="dex" placeholder="Введите значение ловкости" required/>
                                    </div>
                                </div>
                            </div></td><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">МДР</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="wis" minlength="1" maxlength="2"
                                               id="wis" placeholder="Введите значение мудрости" required/>
                                    </div>
                                </div>
                            </div></td></tr>
                            <tr><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ВЫН</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="con" minlength="1" maxlength="2"
                                               id="con" placeholder="Введите значение выносливости" required/>
                                    </div>
                                </div>
                            </div></td><td><div class="form-group">
                                <label for="login" class="cols-sm-2 control-label">ХАР</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="cha" minlength="1" maxlength="2"
                                               id="cha" placeholder="Введите значение харизмы" required/>
                                    </div>
                                </div>
                            </div></td></tr>
                        </table>
                        <div class="form-group ">

                            <input id="npc" name="npc" type="checkbox" value="NPC">
                            <label for="npc">NPC</label>
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