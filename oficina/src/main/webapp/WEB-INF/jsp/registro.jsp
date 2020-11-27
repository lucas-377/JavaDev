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
    <link rel="stylesheet" href="./css/registro.css">

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
                <div class="data">
                    <p class="data-acesso">Acesso: <span>11/11/2020</span></p>
                    <p class="data-horario">Horário: <span>18:06:53</span></p>
                </div>

                <input type="text" class="input" id="cliente" name="dados" placeholder="Nome do cliente"
                required>
                
                <span class="cadastro valido"><i class="fas fa-check"></i></span>
                <span class="cadastro erro"><i class="fas fa-times"></i></span>

                <select class= "select" name="veiculo" id="tipo-veiculo">
                    <option value="">Tipo de veículo</option>
                    <option value="Carro">Carro</option>
                </select>

                <div class="tabela">
                    <table class="container-radios">
                        <thead>
                            <tr>
                                <th class="radio-head">
                                    <h4 class="radios-titulo">ITENS</h4>
                                </th>
                                <th class="radio-head">
                                    <h4 class="radios-titulo">DEFEITO</h4>
                                </th>
                                <th class="radio-head">
                                    <h4 class="radios-titulo">PEÇA</h4>
                                </th>
                            </tr>
                        </thead>
    
                        <tbody>
                            <tr>
                                <td class="radio"><input type="radio" name="pecas" id="1" value="4"></td>
                                <td class="radio"><label for="1">Ferrugem</label></td>
                                <td class="radio"><label for="1">Motor</label></td>
                            </tr>
                            <tr>
                                <td class="radio"><input type="radio" name="pecas" id="2" value="rodas"></td>
                                <td class="radio"><label for="2">Furo</label></td>
                                <td class="radio"><label for="2">Mangueira</label></td>
                            </tr>
                            <tr>
                                <td class="radio"><input type="radio" name="pecas" id="3" value="rodas"></td>
                                <td class="radio"><label for="3">Furo</label></td>
                                <td class="radio"><label for="3">Roda</label></td>
                            </tr>
                            <tr>
                                <td class="radio"><input type="radio" name="pecas" id="4" value="rodas"></td>
                                <td class="radio"><label for="4">Vazamento de gás</label></td>
                                <td class="radio"><label for="4">Ar condicionado</label></td>
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