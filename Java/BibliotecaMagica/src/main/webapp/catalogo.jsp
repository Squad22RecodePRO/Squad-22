<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="model.Livro"
	import="java.util.List"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/catalogo.css" rel="stylesheet">
    <link rel="stylesheet" href="styles/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Catalogo</title>
</head>

<body>

    
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light border-bottom navbar-custom">
            <div class="container-fluid ">
                <img class="logo logo-padrao" src="img/logo_escrita_semfundo.png" width="60px" href="index.jsp">
        
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
        
                <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="itens nav-item px-3">
                            <a class="nav-link fs-5" aria-current="page" href="index.jsp">Home</a>
                        </li>
                        <li class="itens nav-item px-3 ">
                            <a class="nav-link fs-5" href="catalogo.jsp">Catalogo</a>
                        </li>
                        <li class="itens nav-item px-3">
                            <a class="nav-link fs-5" href="carrousel.jsp">Aplicativo</a>
                        </li>
                        <li class="itens nav-item px-3">
                            <a class="nav-link fs-5" href="contato.jsp">Contato</a>
                        </li>
                    </ul>
                </div>
              </div>
            </nav>

        <div class="container texto mb-5">
            <h2>Receba pontos e recompensas conforme você lê!</h2>
            <p>Melhore seus atributos com base nos livros lidos, cada gênero libera pontos para um ou mais atributos.
                E você pode escolher o gênero que preferir conforme o atributo que deseja melhorar.</p>
            <p>Os livros são agrupados em:</p>
            <p class="d-inline ficcao mx-4">Ficção </p>
            <p class="d-inline nficcao mx-lg-4">Não Ficção </p>
        </div>

        <div class="container-fluid ">
            <div class="row atributos  ">

                <h3><img class="img-livro" src="https://img.icons8.com/ios-glyphs/30/000000/dumbbell.png" style="width:30px; height:30px;"
                        class="l m-0 p-0">Força</h3>
					<p class="ficcao">Agilidade</p>
                <div class="row genero">
			        <div class="card col-2 genero" style="width: 12rem;">
			            <img src="img/books/hp1.jpg" class="card-img-top" alt="...">
			            <div class="card-body">
			              <p class="card-text">Harry potter 1</p>
			            </div>
			          </div>
			          <div class="card col-2 genero" style="width: 12rem;">
			            <img src="img/books/hp2.jpg" class="card-img-top" alt="...">
			            <div class="card-body">
			              <p class="card-text">Harry Potter 2</p>
			            </div>
			          </div>
			          <div class="card col-2 genero" style="width: 12rem;">
			            <img src="img/books/hp3.jpg" class="card-img-top" alt="...">
			            <div class="card-body">
			              <p class="card-text">Harry Potter 3</p>
			            </div>
			          </div>
			          <div class="card col-2 genero" style="width: 12rem;">
			            <img src="img/books/hp4.jpg" class="card-img-top" alt="...">
			            <div class="card-body">
			              <p class="card-text">Harry Potter 4</p>
			            </div>
			          </div>
			    </div>

            </div>
			
            <div class="row atributos">
                <h3> <img class="img-livro" src="https://img.icons8.com/ios-filled/50/000000/brain.png" style="width:25px; height:25px;"
                        class="l m-0 p-0">Inteligência</h3>

                <div class="row genero">
                <p class="nficcao">Ficção</p>
			        <div class="card col-2 genero" style="width: 12rem;">
			            <img src="img/books/1984.jpg" class="card-img-top" alt="...">
			            <div class="card-body">
			              <p class="card-text">1984</p>
			            </div>
			          </div>
			          <div class="card col-2 genero" style="width: 12rem;">
			            <img src="img/books/metamorfose.jpg" class="card-img-top" alt="...">
			            <div class="card-body">
			              <p class="card-text">Metamorfose</p>
			            </div>
			          </div>
			    </div>

            </div>

            <div class="row atributos">
                <h3><svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor"
                        class="bi bi-heart-pulse-fill" viewBox="0 0 16 16">
                        <path fill-rule="evenodd"
                            d="M1.475 9C2.702 10.84 4.779 12.871 8 15c3.221-2.129 5.298-4.16 6.525-6H12a.5.5 0 0 1-.464-.314l-1.457-3.642-1.598 5.593a.5.5 0 0 1-.945.049L5.889 6.568l-1.473 2.21A.5.5 0 0 1 4 9H1.475ZM.879 8C-2.426 1.68 4.41-2 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C11.59-2 18.426 1.68 15.12 8h-2.783l-1.874-4.686a.5.5 0 0 0-.945.049L7.921 8.956 6.464 5.314a.5.5 0 0 0-.88-.091L3.732 8H.88Z" />
                    </svg> Saúde</h3>

                <div class="col genero col-12 col-md-4">
                    <p class="ficcao">Horror</p>
                    <img class="img-livro" src="img/livro.jpeg">
                    <img class="img-livro" src="img/livro.jpeg">
                    <img class="img-livro" src="img/livro.jpeg">

                </div>

                <div class="col genero col-12 col-md-4">
                    <p class="ficcao">Suspense</p>
                    <img class="img-livro" src="img/livro.jpeg">
                    <img class="img-livro" src="img/livro.jpeg">
                    <img class="img-livro" src="img/livro.jpeg">

                </div>

                <div class="col genero col-12 col-md-4">
                    <p class="nficcao">Autoajuda</p>
                    <img class="img-livro" src="img/livro.jpeg">
                    <img class="img-livro" src="img/livro.jpeg">
                    <img class="img-livro" src="img/livro.jpeg">

                </div>

            </div>

           


            
        </div>

        <!-- Footer -->
        <hr>

        <footer class="m-0 bg-light">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <ul class="nav d-flex justify-content-center fs-5">
                            <li class="nav-link mx-3"><a href="index.jsp">Página inicial</a></li>
                            <li class="nav-link mx-3"><a href="#">Sobre</a></li>
                            <li class="nav-link mx-3"><a href="contato.jsp">Contato</a></li>
                            <li class="nav-link mx-3"><a href="#">Suporte</a></li>
                            <li class="nav-link mx-3"><a href="CadastrarLivro.jsp">Adm</a></li>
                        </ul>
                    </div>
                    <div class="text-center fw-light my-2">
                        &copy 2022 Copyright - Biblioteca Mágica
                    </div>
                </div>

                <div class="redes row d-flex justify-content-center">

                    <div class="col-12">
                        <ul class="nav d-flex justify-content-center">
                            <li class="nav-link mx-3"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="30"
                                        height="30" fill="currentColor" class="bi bi-facebook" viewBox="0 0 16 16">
                                        <path
                                            d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z" />
                                    </svg></a>
                            </li>
                            <li class="nav-link mx-3"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="30"
                                        height="30" fill="currentColor" class="bi bi-instagram" viewBox="0 0 16 16">
                                        <path
                                            d="M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z" />
                                    </svg></a>
                            </li>
                            <li class="nav-link mx-3"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="30"
                                        height="30" fill="currentColor" class="bi bi-twitter" viewBox="0 0 16 16">
                                        <path
                                            d="M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z" />
                                    </svg></a></li>
                            <li class="nav-link mx-3"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="30"
                                        height="30" fill="currentColor" class="bi bi-whatsapp" viewBox="0 0 16 16">
                                        <path
                                            d="M13.601 2.326A7.854 7.854 0 0 0 7.994 0C3.627 0 .068 3.558.064 7.926c0 1.399.366 2.76 1.057 3.965L0 16l4.204-1.102a7.933 7.933 0 0 0 3.79.965h.004c4.368 0 7.926-3.558 7.93-7.93A7.898 7.898 0 0 0 13.6 2.326zM7.994 14.521a6.573 6.573 0 0 1-3.356-.92l-.24-.144-2.494.654.666-2.433-.156-.251a6.56 6.56 0 0 1-1.007-3.505c0-3.626 2.957-6.584 6.591-6.584a6.56 6.56 0 0 1 4.66 1.931 6.557 6.557 0 0 1 1.928 4.66c-.004 3.639-2.961 6.592-6.592 6.592zm3.615-4.934c-.197-.099-1.17-.578-1.353-.646-.182-.065-.315-.099-.445.099-.133.197-.513.646-.627.775-.114.133-.232.148-.43.05-.197-.1-.836-.308-1.592-.985-.59-.525-.985-1.175-1.103-1.372-.114-.198-.011-.304.088-.403.087-.088.197-.232.296-.346.1-.114.133-.198.198-.33.065-.134.034-.248-.015-.347-.05-.099-.445-1.076-.612-1.47-.16-.389-.323-.335-.445-.34-.114-.007-.247-.007-.38-.007a.729.729 0 0 0-.529.247c-.182.198-.691.677-.691 1.654 0 .977.71 1.916.81 2.049.098.133 1.394 2.132 3.383 2.992.47.205.84.326 1.129.418.475.152.904.129 1.246.08.38-.058 1.171-.48 1.338-.943.164-.464.164-.86.114-.943-.049-.084-.182-.133-.38-.232z" />
                                    </svg></a></li>
                        </ul>
                    </div>

                </div>

            </div>
        </footer>


    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
        </script>
    <script src="js/modal.js"></script>
</body>

</html>
    