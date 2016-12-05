package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(int [][]m) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                switch (m[i][j]){

                    case 0:
                        System.out.print(" O ");
                        break;
                    case 1:
                        System.out.print(" X ");
                        break;
                    case 7:
                        System.out.print(" . ");
                        break;

                }
            }
            System.out.println();
        }
    }


public static boolean comprobarGanador(int [][]partida){

    for (int i = 0; i < 2; i++) {


        if (partida[0][0] == i && partida[0][1] == i && partida[0][2] == i) {
            return true;
        }
        if (partida[1][0] == i && partida[1][1] == i && partida[1][2] == i) {
            return true;
        }
        if (partida[2][0] == i && partida[2][1] == i && partida[2][2] == i) {
            return true;
        }
        if (partida[0][0] == i && partida[1][0] == i && partida[2][0] == i) {
            return true;
        }
        if (partida[0][1] == i && partida[1][1] == i && partida[2][1] == i) {
            return true;
        }
        if (partida[0][2] == i && partida[1][2] == i && partida[2][2] == i) {
            return true;
        }
        if (partida[0][0] == i && partida[1][1] == i && partida[2][2] == i) {
            return true;
             }
        if (partida[0][2] == i && partida[1][1] == i && partida[2][2] == i) {
            return true;
            }
    }
    
    return false;
}

    public static void main(String[] args) throws IOException {

    /*Queremos escribir un programa que permita jugar al tres en raya a dos jugadores.

    Algunos consejos para conseguirlo:

    Para representar el tablero usaremos una matriz numérica y lo mostraremos con visualizarTablero().
    Las tiradas de los jugadores se representan como un 0 o un 1 en cada casilla de esa matriz.
    Vamos pidiendo alternativamente a cada jugador (siempre empieza el 0) dónde quiere poner su ficha (fila y columna donde quiere ponerla).
    Al final de cada movimiento, comprobamos si alguien ha ganado o hay un empate, usando la función comprobarGanador().
    El programa terminará cuando tengamos ganador o haya empate.*/

    int ter [][]= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ter[i][j]=7;
            }
        }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //visualizamos el tablero
            visualizarTablero(ter);

            //ver a quien le toca jugar
            int turno = 0;

            //cuántas tiradas llevamos
            int tiradas = 0;

        do {
            //el usuario elige casilla
            System.out.println("Elige fila:0-2  ");
            int fila = Integer.parseInt(br.readLine());
            System.out.println("Elige columna: 0-2");
            int columna = Integer.parseInt(br.readLine());

            //tirada válida?
            if (ter[fila][columna] == 7) {
                ter[fila][columna] = turno;

                //se suma una tirada al contador si la tirada es válida
                tiradas += 1;
            //cambiamos de turno

            if (turno == 0){
                turno = 1;
            }else {
                turno = 0;
            }
            visualizarTablero(ter);

            }else {
                System.out.println("POSICIÓN OCUPADA");
            }

        }while (tiradas < 9 && !comprobarGanador(ter));

        if (tiradas < 9){
            System.out.println("Has ganado!");

        }else   {
            System.out.println("Empate");
        }



    }
}
