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
    <link rel="stylesheet" href="./css/registros.css">

    <!-- Fontes -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link
        href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;700&family=Catamaran:wght@400;700&display=swap"
        rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
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
                Para iniciar, clique no botão "Sistema" na barra de menu acima. Depois escolha a opção desejada no menu
                que aparecerá na tela.
                <br><br>
                Esse sistema foi desenvolvido por Lucas Santana em 2020, utilizando Java SpringBoot, JDBC, H2 Database,
                e Maven. Todo Front-End foi desenvolvido sem frameworks.
            </p>
        </div>
    </section>

    <div class="modal">
        <div class="modal-bg ativo"></div>

        <div class="modal-menu ativo">
            <span class="botao-fechar">x</span>

            <h2 class="titulo">Registros de defeitos veiculares</h2>

            <form method="POST" class="input-group">
                <select class= "select" name="veiculo" id="tipo-veiculo">
                    <option value="">Tipo de veículo</option>
                    <option value="Carro">Carro</option>
                </select>

                <input type="date" name="data-inicio" id="data-inicio" class="data-picker">
                <input type="date" name="data-fim" id="data-fim" class="data-picker">

                <div class="tabela">
                    <table class="container-radios">
                        <thead>
                            <tr>
                                <th class="radio-head">
                                    <h4 class="radios-titulo">CLIENTE</h4>
                                </th>
                                <th class="radio-head">
                                    <h4 class="radios-titulo">DATA</h4>
                                </th>
                                <th class="radio-head">
                                    <h4 class="radios-titulo">VEÍCULO</h4>
                                </th>
                            </tr>
                        </thead>
    
                        <tbody>
                            <tr>
                                <td class="radio">Sidney Matagal</td>
                                <td class="radio">11/11/2020</td>
                                <td class="radio">Carro</td>
                            </tr>
                            <tr>
                                <td class="radio">Sidney Matagal</td>
                                <td class="radio">11/11/2020</td>
                                <td class="radio">Carro</td>
                            </tr>
                            <tr>
                                <td class="radio">Sidney Matagal</td>
                                <td class="radio">11/11/2020</td>
                                <td class="radio">Carro</td>
                            </tr>
                            
                        </tbody>
                    </table>
                </div>

                <div class="botoes">
                    <a class="botao-voltar" href="/menu"><span class="botao-voltar-seta"><i
                                class="fas fa-arrow-left"></i></span>Voltar ao menu</a>
                    <button class="botao-salvar" type="submit"><a style="color: #ffffff; text-decoration:none;"
                            href="/sucesso">Salvar</a></button>
                </div>
            </form>
        </div>
    </div>
</body>

<script src="./js/home.js"></script>

</html>