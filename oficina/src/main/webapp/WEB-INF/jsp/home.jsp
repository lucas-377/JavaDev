<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Home | Oficina</title>

    <!-- CSS -->
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/home.css">
    <link rel="stylesheet" href="./css/menu.css">

    <!-- Fontes -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;700&family=Catamaran:wght@400;700&display=swap" rel="stylesheet">
</head>

<body>
    <div class="container-home">
        <nav class="home-menu">
            <img class="menu-logo" src="./images/logo.jpg" alt="Logo da oficina">
            
            <ul>
                <li><a href="/">Home</a></li>
                <li><a class="menu-ativo sistema" href="#">Sistema</a></li>
            </ul>

        </nav>
    </div>

    <section class="home">
        <img src="./images/logo.jpg" alt="Logo da oficina">
        <div class="home-texto">
            <h3 class="home-titulo">Bem-vindo!</h3>
            <p class="home-paragrafo">
                Para iniciar, clique no botão "Sistema" na barra de menu acima. Depois escolha a opção desejada no menu que aparecerá na tela.
                <br><br>
                Esse sistema foi desenvolvido por Lucas Santana em 2020, utilizando Java SpringBoot, JDBC, H2 Database, e Maven. Todo Front-End foi desenvolvido sem frameworks.
            </p>
        </div>
    </section>

    <div class="modal">
        <div class="modal-bg"></div>

        <div class="modal-menu">
            <h2 class="titulo">Sistema de oficina da MJV!</h2>

            <div class="botoes">
                <a href="#" class="botao">Registro de <br>
                    defeitos veiculares</a>
                <a href="#" class="botao">Cadastrar tipos <br>
                    de veículos</a>
                <a href="#" class="botao">Cadastrar peças</a>
                <a href="/cadastrar-defeitos" class="botao">Cadastrar defeitos</a>
            </div>
        </div>
    </div>
</body>

<script src="./js/home.js"></script>

</html>