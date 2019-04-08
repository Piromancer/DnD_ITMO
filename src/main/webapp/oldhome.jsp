<%@ page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<html>
<head>
    <title>Лобби</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <link rel="stylesheet" href="resources/css/lobby.css"/>
    <link rel="stylesheet" href="resources/css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body style="background-image: url(resources/images/back.jpg);">

<h1 style="margin-top:10px"><a href="index.jsp" class="logo">D&<span>D</span></a></h1>
<a name="top"></a>
<div class="wrapper">
    <div class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-sm-12 col-md-8">
                    <h1 class="character-list-header">Выбери роль!</h1>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="photobox">
                                <div class="photobox__previewbox" id="player-mode">
                                    <img src="resources/images/gamermode.jpg" class="photobox__preview img-thumbnail" alt="Preview">
                                    <span class="photobox__label">Быть игроком</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="photobox">
                                <div class="photobox__previewbox" id="gm-mode">
                                    <img src="resources/images/gmmode.jpg" class="photobox__preview img-thumbnail" alt="Preview">
                                    <span class="photobox__label">Быть мастером</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <!-- Версия лобби для игрока -->
                        <div id="player-form" hidden>
                            <div id="page" style="width: 100%;">
                            <h1 class="character-list-header">Буду игроком!</h1>
                            <h3 class="character-list-header">Список доступных персонажей</h3>
                            <div id="character-list"></div>
                            <div class="row" id="player-form-2" hidden>
                                <div class="col-md-6">
                                    <div class="info-form">
                                        <div id="player-character-info">
                                            <h2 id="char-name" class="header-form fill-game-form-header"></h2>
                                            <div class="photobox">
                                                <div class="photobox__previewbox">
                                                    <img class="character-preview img-thumbnail" id="char-avatar" alt="Preview">
                                                </div>
                                            </div>
                                            <div class="lobby-params">
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Статус:</label>
                                                    <label id="char-condition" class="lobby-param"></label>
                                                </div>
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Уровень:</label>
                                                    <label id="char-level" class="lobby-param"></label>
                                                </div>
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Раса:</label>
                                                    <label id="char-race" class="lobby-param"></label>
                                                </div>
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Класс:</label>
                                                    <label id="char-class" class="lobby-param"></label>
                                                </div>
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Пол:</label>
                                                    <label id="char-sex" class="lobby-param"></label>
                                                </div>
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Количество денег:</label>
                                                    <label id="char-money" class="lobby-param"></label>
                                                </div>
                                                <div class="lobby-param-row">
                                                    <label class="header-lobby-param">Максимальный вес:</label>
                                                    <label class="lobby-param"><span id="char-maxWeight"></span> кг</label>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="player-game-info"></div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="game-info" style="position: relative">
                                        <div id="player-games-slider" class="lobby-slider"></div>
                                        <div id="player-players-slider" class="lobby-slider"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div></div>
                    <!-- Версия лобби для мастера -->
                    <div id="gm-form" hidden><div id="page" style="width: 100%;">
                        <h1 class="character-list-header">Буду мастером!</h1>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="info-form">
                                    <div id="create-new-game-form"><!--TODO-->
                                        <form id="new-game-form" action="lobby">
                                            <div class="form-group">
                                                <h3 class="header-form header-form-sub">Название игры</h3>
                                                <div class="lobby-input-group">
                                                    <input type="text" name="name" minlength="2" maxlength="12"
                                                           id="name" placeholder="Введите название игры" required>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <h3 class="header-form header-form-sub">Количество игроков</h3>
                                                <div class="lobby-input-group js">
                                                    <div>
                                                        <input type='range' id="personCount" name="personCount" required
                                                               min='1' max='4' step='1' value='1'/>
                                                        <div class="row">
                                                            <label class="number-label" style="">1</label>
                                                            <label class="number-label" style="">2</label>
                                                            <label class="number-label" style="">3</label>
                                                            <label class="number-label" style="">4</label>
                                                        </div>

                                                    </div>

                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <h4 class="header-form header-form-sub">Описание</h4>
                                                <div class="lobby-input-group">
                                                    <textarea id="description" name="description" rows="4" cols="50"
                                                              minlength="2" placeholder="Введите описание игры">
                                                    </textarea>
                                                </div>
                                            </div>
                                            <table width="100%"><tr>
                                                <td width="50%"><a href="char.jsp"><input id="sub" type="button" class="stamp-btn1" value="Монстр/NPC"/></a></td>
                                                <td rowspan="2"><input id="submit-btn" type="submit" class="stamp-btn" value="Создать"/></td>
                                                <tr><td><a href="land.jsp"><input id="submit" type="button" class="stamp-btn2" value="Ландшафт"/></a></td>
                                            </tr></table>
                                        </form>
                                    </div>
                                    <div id="gm-game-info"></div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="game-info">
                                    <div id="gm-games-slider" class="lobby-slider"></div>
                                </div>
                            </div>
                            <!--TODO-->
                            <a href="game.jsp" class="logo">Тестовый вариант поля</a>
                        </div>
                    </div>
                    </div></div>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
    <div class="leftbar-wrap">
        <a href="#top" class="left-controlbar">
            <span class="active-area">
                <span class="bar-desc"> Наверх</span>
            </span>
        </a>
    </div>
    <div class="footer">
        <jsp:include page="templates/footer.jsp"/>
    </div>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/jquery-ui/1.12.1/jquery-ui.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<!-- Либы для работы с WebSocket -->
<script src="http://cdn.sockjs.org/sockjs-0.3.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.js"></script>
<script type="text/javascript" src="resources/js/lobby.js"></script>
</body>
</html>