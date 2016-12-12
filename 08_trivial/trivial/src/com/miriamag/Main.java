package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	/*Escribe un programa que permita jugar al Trivial.

    Algunos consejos:

    Utiliza dos arrays, uno para almacenar las preguntas y otro para las respuestas.
    Como no podemos saber si el usuario acierta, nos limitaremos a mostrarle la respuesta cuando nos lo diga y
    le preguntaremos si ha acertado o no. Con eso, actualizaremos el marcador de correctas/incorrectas.
    El programa seguirá mostrando preguntas de forma aleatoria hasta que el usuario nos pida terminar.*/


	//creamos las dos arrays de string

        String preguntas [] = new String [2];

        String respuestaCorrecta [] = new String [2];

        preguntas[0] = "¿Hola?";

        preguntas[1] = "¿Qué tal?";


        respuestaCorrecta[0] = "Hola";
        respuestaCorrecta[1] = "Bien";

        int contadorCorrectas=0;
        int contadorIncorrectas=0;

        Random posicion = new Random();
        String terminar;

        do {


    System.out.println(preguntas[0]);
    System.out.println("Introduzca la respuesta: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String respuestas = br.readLine();

    System.out.println("¿ " + respuestas + ", es lo mismo que: " + respuestaCorrecta[0] + " ? Escribe si o no.");

    String correcta = br.readLine();

    if (correcta.equals("Si")) {

        contadorCorrectas += 1;
    } else {

        contadorIncorrectas += 1;
    }
        System.out.println("¿Quiere terminar?");
        terminar = br.readLine();

    }while (terminar.equals("No"));


        System.out.println("Incorrectas: "+contadorIncorrectas+" Correctas: "+contadorCorrectas);
    }
}
