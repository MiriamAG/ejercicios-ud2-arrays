package com.miriamag;

public class Main {

    public static void main(String[] args) {
	/*Escribe un programa que permita jugar al Trivial.

    Algunos consejos:

    Utiliza dos arrays, uno para almacenar las preguntas y otro para las respuestas.
    Como no podemos saber si el usuario acierta, nos limitaremos a mostrarle la respuesta cuando nos lo diga y
    le preguntaremos si ha acertado o no. Con eso, actualizaremos el marcador de correctas/incorrectas.
    El programa seguirá mostrando preguntas de forma aleatoria hasta que el usuario nos pida terminar.*/


	//creamos las dos arrays de string

        String preguntas [] = new String [1];

        String respuestaCorrecta [] = new String [1];

        preguntas[0] = "¿Hola?";
        preguntas[1] = "¿Qué tal?";

        respuestaCorrecta[0] = "Hola";
        respuestaCorrecta[1] = "Bien";

    }
}
