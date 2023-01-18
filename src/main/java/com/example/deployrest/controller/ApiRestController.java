package com.example.deployrest.controller;


import com.example.deployrest.entity.Persona;
import com.example.deployrest.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiRestController {

    private final Logger log = LoggerFactory.getLogger(ApiRestController.class);
    private PersonRepository personRepository;

    public ApiRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/api/personas")
    public List<Persona> findAll() {
        // Recuperar y devolver los libros de base de datos
        return personRepository.findAll();
    }

    @GetMapping("/api/personas/{id}")
    public ResponseEntity<Persona> findOneById(@PathVariable Long id) {
        Optional<Persona> personaOpt = personRepository.findById(id);
        if (personaOpt.isPresent()) {
            return ResponseEntity.ok(personaOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/api/personas/1/peliculas")
    public String Peliculas() {
        return """
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta http-equiv="X-UA-Compatible" content="IE=edge">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <style>
                            a {
                                text-decoration: none;
                                color: #4b4b4b;
                                }
                            body{
                               background-color: rgb(20,24,28);
                               display: flex;
                               gap: 30px 0px;
                               flex-direction: column;
                              \s
                               align-items: center;
                            
                            }
                            h1{
                                font-size: 2.8rem;
                                color: rgb(255,255,255);
                        font-family: 'Roboto Slab', serif;
                        font-weight: 300;
                            }
                            .container{
                                \s
                                height: 95vh;
                                display: flex;
                                flex-direction:row;
                                flex-wrap: wrap;
                                /* justify-content: space-evenly; */
                                justify-content: center;
                                gap: 30px 30px;
                            }
                            .movie{
                                /* box-shadow: 0px 20px 0px 12px #0c1627, 0px 10px 0px 50px #0c182a; */
                                display: flex;
                                border-radius: 0.3rem;
                                height: 45%;
                                width:45%;
                                border: 2px solid #81a3d9;
                            }
                            
                            html {
                      box-sizing: border-box;
                      font-size: 16px;
                    }
                            
                    *,
                    *:before,
                    *:after {
                      box-sizing: inherit;
                    }
                            
                    body,
                    h1,
                    h2,
                    h3,
                    h4,
                    h5,
                    h6,
                    p,
                    ol,
                    ul {
                      margin: 0;
                      padding: 0;
                      font-weight: normal;
                    }
                            
                    ol,
                    ul {
                      list-style: none;
                    }
                            
                    img {
                      max-width: 100%;
                      height: auto;
                    }
                            
                    .movie-data{
                        display: flex;
                        height: 100%;
                        flex-direction: row;
                        justify-content: space-evenly;
                        gap:10px;
                    }
                    .image-container {
                        height: 100%;
                    }
                            
                    .movie-information{
                        display: flex;
                        width: 50%;
                        flex-direction: column;
                        justify-content: space-evenly;
                    }
                            
                    .image-container img{
                        height: 100%;
                    }
                            
                    .movie-title{
                        color: rgb(255,255,255);
                        font-family: 'Roboto Slab', serif;
                        font-weight: 500;
                    }
                    p{
                        color:rgb(153,170,187);
                        font-family: 'Roboto Slab', serif;
                        font-weight: 100;
                    }
                        </style>
                        <title>Movies</title>
                        <link rel="preconnect" href="https://fonts.googleapis.com">
                    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                    <link href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@100;300;500&display=swap" rel="stylesheet">
                    </head>
                    <body>
                        <h1>Peliculas favoritas</h1>
                        <article class="container">
                           \s
                            <section class="movie">
                                <div class="movie-data">
                                    <div class="image-container">
                                        <img src="https://cdn.shopify.com/s/files/1/1057/4964/products/Wings-of-Desire-Vintage-Movie-Poster-Original-1-Sheet-27x41.jpg?v=1665724285" alt="imagen portada wings of desire">
                                    </div>
                                    <div class="movie-information">
                                        <h2 class="movie-title">Wings of Desire (Las alas del deseo)</h2>
                                        <p>Director: <a href="https://letterboxd.com/director/wim-wenders/" target="_blank">Wim Wenders</a></p>
                                        <p>Año: 1987</p>
                                        <p>Duracion: 128 minutos.</p>
                                        <p>Elenco: Bruno Ganz, Solveig Dommartin.</p>
                                        <p>Paises: Alemania, Francia.</p>
                                        <p>Resumen: Dos ángeles, Damiel y Cassiel, se deslizan por las calles de Berlín, observando la bulliciosa población, brindando invisibles rayos de esperanza a los afligidos pero nunca interactuando con ellos. Cuando Damiel se enamora de la solitaria trapecista Marion, el ángel anhela experimentar la vida en el mundo físico y descubre, con algunas sabias palabras del actor Peter Falk, que es posible que tome forma humana.</p>
                                    </div>
                                </div>
                            </section>
                            
                            <section class="movie">
                                <div class="movie-data">
                                    <div class="image-container">
                                        <img src="https://1.bp.blogspot.com/-4bbnfSjO5t0/XQp-1Cc1hwI/AAAAAAAAMM8/aorJYsQQGdsMjijpY_lGbigkCVtRtx7lgCLcBGAs/s1600/MV5BMDM1YzUyY2UtMDM1ZC00OTRhLWIxNTktNzA4Mzg3ODlhNmZhL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTMxMjgxMzA%2540._V1_SY1000_CR0%252C0%252C666%252C1000_AL_.jpg" alt="imagen portada wings of desire">
                                    </div>
                                    <div class="movie-information">
                                        <h2 class="movie-title">El Padrino II</h2>
                                        <p>Director:  <a href="https://letterboxd.com/director/francis-ford-coppola/" target="_blank">Francis Ford Coppola</a></p>
                                        <p>Año: 1974</p>
                                        <p>Duracion: 202 minutos</p>
                                        <p>Elenco: Al pacino, Robert De Niro, Diane Keaton</p>
                                        <p>Paises: Estados Unidos</p>
                                        <p>Resumen: En la saga continua de la familia criminal Corleone, un joven Vito Corleone crece en Sicilia y en la década de 1910 en Nueva York. En la década de 1950, Michael Corleone intenta expandir el negocio familiar a Las Vegas, Hollywood y Cuba.</p>
                                    </div>
                                </div>
                            </section>
                            
                            <section class="movie">
                                <div class="movie-data">
                                    <div class="image-container">
                                        <img src="https://arcewestermeier.cl/wp-content/uploads/2021/07/figura-01.-Fitzcarraldo.jpg" alt="imagen portada wings of desire">
                                    </div>
                                    <div class="movie-information">
                                        <h2 class="movie-title">Fitzcarraldo</h2>
                                        <p>Director:  <a href="https://letterboxd.com/director/werner-herzog/" target="_blank">Werner Herzog</a></p>
                                        <p>Año: 1982</p>
                                        <p>Duracion: 157 minutos</p>
                                        <p>Elenco: Klaus Kinski, Claudia Cardinale</p>
                                        <p>Paises: Alemania, Peru </p>
                                        <p>Resumen: Fitzcarraldo es un soñador que planea construir un teatro de ópera en Iquitos, en la Amazonía peruana, por lo que, para financiar su proyecto, se embarca en una aventura épica para recolectar caucho, un producto muy rentable, en una región remota e inexplorada de La selva.</p>
                                    </div>
                                </div>
                            </section>
                           \s
                            <section class="movie">
                                <div class="movie-data">
                                    <div class="image-container">
                                        <img src="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pUKnhEQvQJI7SAIMbDsmrXUAMVE.jpg" alt="imagen portada wings of desire">
                                    </div>
                                    <div class="movie-information">
                                        <h2 class="movie-title">The Lives of Others (La vida de los otros)</h2>
                                        <p>Director:  <a href="https://letterboxd.com/director/florian-henckel-von-donnersmarck/" target="_blank">Florian Henckel von Donnersmarck</a></p>
                                        <p>Año: 2006</p>
                                        <p>Duracion: 137 minutos</p>
                                        <p>Elenco: Ulrich Mühe, Martina Gedeck, Sebastian Koch</p>
                                        <p>Paises: Alemania, Francia </p>
                                        <p>Resumen: Una trágica historia de amor ambientada en Berlín Oriental con el telón de fondo de una cultura encubierta controlada por la Stasi. Al capitán de la Stasi, Wieler, se le ordena seguir al autor Dreyman y se sumerge cada vez más en su vida hasta que llega al umbral de dudar del sistema.</p>
                                    </div>
                                </div>
                            </section>
                        </article>
                    </body>
                    </html>
                """;
    }

    @GetMapping("/api/personas/1/bandas")
    public String Bandas() {

        return """
                    
                <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta http-equiv="X-UA-Compatible" content="IE=edge">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <style>
                            a {
                                text-decoration: none;
                                color: #4b4b4b;
                                }
                            body{
                                background: rgb(255,255,255);
                                background: linear-gradient(0deg, rgb(0, 0, 0) 0%, rgb(20, 20, 20) 35%, rgb(58, 58, 58) 100%);
                               display: flex;
                               gap: 30px 0px;
                               flex-direction: column;
                              \s
                               align-items: center;
                    
                            }
                            h1{
                                font-size: 2.8rem;
                                color: #2eb835;
                                font-family: 'Secular One', sans-serif;
                                font-weight: 400;
                            }
                            .container{
                                \s
                                height: 95vh;
                                display: flex;
                                flex-direction:row;
                                flex-wrap: wrap;
                                /* justify-content: space-evenly; */
                                justify-content: center;
                                gap: 30px 30px;
                            }
                            .banda{
                                /* box-shadow: 0px 20px 0px 12px #0c1627, 0px 10px 0px 50px #0c182a; */
                                display: flex;
                                border-radius: 0.3rem;
                                height: 45%;
                                width:45%;
                                border: 2px solid #2eb835;
                                background-color: #181818;
                            }
                    
                            html {
                      box-sizing: border-box;
                      font-size: 16px;
                    }
                    
                    *,
                    *:before,
                    *:after {
                      box-sizing: inherit;
                    }
                    
                    body,
                    h1,
                    h2,
                    h3,
                    h4,
                    h5,
                    h6,
                    p,
                    ol,
                    ul {
                      margin: 0;
                      padding: 0;
                      font-weight: normal;
                    }
                    
                    ol,
                    ul {
                      list-style: none;
                    }
                    
                    img {
                      max-width: 100%;
                      height: auto;
                    }
                    
                    .banda-data{
                        display: flex;
                        height: 100%;
                        flex-direction: row;
                        justify-content: space-evenly;
                        gap:10px;
                    }
                    .image-container {
                        height: 100%;
                    }
                    
                    .banda-information{
                        display: flex;
                        width: 50%;
                        flex-direction: column;
                        justify-content: space-evenly;
                    }
                    
                    .image-container img{
                        height: 100%;
                       \s
                    }
                    
                    .banda-title{
                        color: rgb(255, 255, 255);
                        font-family: 'Roboto Slab', serif;
                        font-weight: 500;
                    }
                    p{
                        color:rgb(153,170,187);
                        font-family: 'Roboto Slab', serif;
                        font-weight: 100;
                    }
                        </style>
                        <title>Movies</title>
                        <link rel="preconnect" href="https://fonts.googleapis.com">
                        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                        <link href="https://fonts.googleapis.com/css2?family=Secular+One&display=swap" rel="stylesheet">
                    </head>
                    <body>
                        <h1>Bandas favoritas</h1>
                        <article class="container">
                           \s
                            <section class="banda">
                                <div class="banda-data">
                                    <div class="image-container">
                                        <img src="https://img.lagaceta.com.ar/fotos/notas/2023/01/16/970x951_976800_202301152016320000001.webp" alt="imagen de The Beatles">
                                    </div>
                                    <div class="banda-information">
                                        <h2 class="banda-title">The Beatles </h2>
                                        <p> Integrantes: John Lennon, Paul McCartney, George Harrison, Ringo Star</p>
                                        <p>Año: 1962-1970</p>
                                        <p>Album: 13</p>
                                        <p>Lugar: Liverpool, Inglaterra.</p>
                                    </div>
                                </div>
                            </section>
                    
                    
                    
                            <section class="banda">
                                <div class="banda-data">
                                    <div class="image-container">
                                        <img src="https://scontent.faep9-2.fna.fbcdn.net/v/t1.6435-9/133003029_237442907747326_7400938798141302855_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=bbQFwKWasAUAX8c6Dum&_nc_ht=scontent.faep9-2.fna&oh=00_AfBYv-c9ui6z4QB2E9CYU1AYu4aWQCNRXdaD_wxeJHkbcw&oe=63EF6260" alt="imagen de Nirvana">
                                    </div>
                                    <div class="banda-information">
                                        <h2 class="banda-title">Nirvana</h2>
                                        <p> Integrantes: Kurt Cobain, Dave Grohl, Krist Novoselic</p>
                                        <p>Año: 1987-1994</p>
                                        <p>Album: 6</p>
                                        <p>Lugar: Aberdeen, Washington, EEUU.</p>
                                    </div>
                                </div>
                            </section>
                           \s
                            <section class="banda">
                                <div class="banda-data">
                                    <div class="image-container">
                                        <img src="https://www.cmtv.com.ar/imagenes_artistas/276.jpg?Soda%20Stereo" alt="imagen de Soda Stereo">
                                    </div>
                                    <div class="banda-information">
                                        <h2 class="banda-title">Soda Stereo </h2>
                                        <p> Integrantes: Gustavo Cerati, Zeta Bosio, Charly Alberti</p>
                                        <p>Año: 1982-1997</p>
                                        <p>Album: 11</p>
                                        <p>Lugar: Buenos Aires, Argentina.</p>
                                    </div>
                                </div>
                            </section>
                    
                        </article>
                    </body>
                    </html>
                    
                            """;
    }
    @GetMapping("/api/personas/1/comida_favorita")
    public String ComidaFavorita() {
        return"""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <style>
                        a {
                            text-decoration: none;
                            color: #4b4b4b;
                            }
                        body{
                            background: whitesmoke;
                            display: flex;
                            gap: 30px 0px;
                            flex-direction: column;
                            justify-content: space-evenly;
                            align-items: center;
                            font-family: 'Roboto Slab', serif;
                            font-weight: 100;
                            /* height: 100vh; */
                        }
                        h1{
                            font-size: 2.8rem;
                            color: rgb(226,35,26);
                            font-family: 'Secular One', sans-serif;
                            font-weight: 400;
                        }
                        .container{
                            display: flex;
                            flex-direction:column;
                            justify-content: space-between;
                            align-items: center;
                            height: 100%;
                            margin:0 0 2rem;
                        }
                        .comida{
                            /* box-shadow: 0px 20px 0px 12px #0c1627, 0px 10px 0px 50px #0c182a; */
                            display: flex;
                            border-radius: 0.3rem;
                            height: 55%;
                            width:45%;
                            border: 2px solid rgb(255,120,117);
                            background-color: whitesmoke;
                        }
                              
                        html {
                  box-sizing: border-box;
                  font-size: 16px;
                }
                              
                *,
                *:before,
                *:after {
                  box-sizing: inherit;
                }
                              
                body,
                h1,
                h2,
                h3,
                h4,
                h5,
                h6,
                p,
                ol,
                ul {
                  margin: 0;
                  padding: 0;
                  font-weight: normal;
                }
                              
                ol,
                ul {
                  list-style: none;
                }
                              
                img {
                  max-width: 100%;
                  height: auto;
                }
                              
                .comida-data{
                    display: flex;
                    height: 100%;
                    flex-direction: column;
                    justify-content: space-evenly;
                   \s
                }
                .image-container {
                    height: 100%;
                }
                              
                .comida-information{
                    margin:2.5rem;
                    display: flex;
                    flex-direction: column;
                    justify-content: space-around;
                }
                h3,h4{
                    margin-top: 1rem;
                }
                              
                .image-container img{
                    height: 100%;
                   \s
                }
                              
                .comida-title{
                    color: rgb(226,35,26);
                    font-family: 'Roboto Slab', serif;
                    font-weight: 500;
                    font-size: 2rem;
                    text-align: center;
                              
                }
                p{
                    color:rgb(153,170,187);
                    font-family: 'Roboto Slab', serif;
                    font-weight: 100;
                }
                    </style>
                    <title>Movies</title>
                    <link rel="preconnect" href="https://fonts.googleapis.com">
                    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                    <link href="https://fonts.googleapis.com/css2?family=Secular+One&display=swap" rel="stylesheet">
                </head>
                <body>
                    <h1>Comida favorita</h1>
                    <article class="container">
                       \s
                        <section class="comida">
                            <div class="comida-data">
                                <div class="image-container">
                                    <img src="https://assets.unileversolutions.com/recipes-v2/209553.jpg?imwidth=800" alt="imagen de canelones de espinaca con salsa blanca">
                                </div>
                                <div class="comida-information">
                                    <h2 class="comida-title"> Canelones de espinaca con salsa blanca </h2>
                                    <h3> Ingredientes </h3>
                                    <h4>Para los panqueques:</h4>
                                    <ul>
                                        <li>2 huevos</li>
                                        <li>1 taza de harina de trigo 0000</li>
                                        <li>1 taza de espinacas frescas cocinadas y escurridas</li>
                                        <li>30 gramos de manteca</li>
                                        <li>1 cucharadita de sal</li>
                                        <li>200 ml de leche</li>
                                    </ul>
                                    <h4>Para los panqueques:</h4>
                                    <ul>
                                        <li>35 gramos de manteca</li>
                                        <li>35 gramos de harina de trigo 0000</li>
                                        <li>300 ml de leche</li>
                                        <li>2 cucharadas de Savora Original</li>
                                        <li>1 cucharadita de pimienta</li>
                                    </ul>
                                    <h4>Para el relleno:</h4>
                                    <ul>
                                        <li>250 gramos de ricota</li>
                                        <li>100 gramos de queso en hebras</li>
                                        <li>150 gramos de jamón cocido en trozos</li>
                                        <li>50 gramos de queso para gratinar</li>
                                    </ul>
                                </div>
                            </div>
                        </section>
                    </article>
                </body>
                </html>  
                """;
    }

}

