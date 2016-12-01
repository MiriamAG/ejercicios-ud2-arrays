package com.miriamag;

public class Main {

    public static void visualizarTablero(int [][]m){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            if (m[i][j]==0){
                System.out.println(".");
            }if (m[i][j]==1){
                    System.out.println("X");
                }if(m[i][j]==2){
                    System.out.println("O");
                }
            }

            }


        }



    public static void main(String[] args) {

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
                ter [i][j]= 0;

            }

        }

        visualizarTablero(ter);

    }
}
