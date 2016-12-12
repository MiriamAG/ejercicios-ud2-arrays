package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void mostrar(int[][] m) {
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {


                System.out.format("%3d", m[i][j]);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) throws IOException {


	/*Algunos consejos y reglas:

    Representa el tablero como una matriz y fija los valores iniciales (puedes usar el del ejemplo de Wikipedia).
    El programa pide la fila y columna en la que queremos poner el número cada vez.
    Comprobará si el valor se puede poner en la posición y, si no, pedirá otro.
    El programa termina cuando el usuario escriba FIN o el tablero se complete.*/


        int[][] tablero = new int[9][9];

        //valores fijos ejemplo wiki
        tablero[0][0] = 5;
        tablero[0][1] = 3;
        tablero[1][0] = 6;
        tablero[2][1] = 9;
        tablero[2][2] = 8;
        tablero[0][4] = 7;
        tablero[1][3] = 1;
        tablero[1][4] = 9;
        tablero[1][5] = 5;
        tablero[2][7] = 6;
        tablero[3][0] = 8;
        tablero[4][0] = 4;
        tablero[5][0] = 7;
        tablero[6][1] = 6;
        tablero[3][4] = 6;
        tablero[4][3] = 8;
        tablero[4][5] = 3;
        tablero[5][4] = 2;
        tablero[3][8] = 3;
        tablero[4][8] = 1;
        tablero[5][8] = 6;
        tablero[7][3] = 4;
        tablero[7][4] = 1;
        tablero[7][5] = 9;
        tablero[7][8] = 5;
        tablero[8][4] = 8;
        tablero[8][7] = 7;
        tablero[8][8] = 9;
        tablero[6][6] = 2;
        tablero[6][7] = 8;

        mostrar(tablero);

        int fila;
        int columna;
        int numero;
        boolean error;


        do {

            error = false;

            //PEDIR NUMERO Y POSICION
            System.out.println("Elige el número que quieres poner: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            numero = Integer.parseInt(br.readLine());

            System.out.println("Introduce fila en la que quieres colocar el núnero: ");
            fila = Integer.parseInt(br.readLine());
            System.out.println("Introduce columna en la que quieres colocar el número: ");
            columna = Integer.parseInt(br.readLine());


            //COMPROBAR SI SE PUEDE PONER EN FILA Y COLUMNA

            for (int i = 0; i < 9; i++) {
                if (tablero[fila][i] == numero || tablero[i][columna] == numero) {
                    error = true;
                }
            }

            //COMPROBAR SUBCUADRÍCULA

            int fila2= (fila%3)*3;
            int columna2=(columna%3)*3;

            for (int i = fila2; i < 3; i++) {
                for (int j = columna2; j < 3; j++) {

                    if (tablero[i][j]==numero){
                        error=true;
                    }
                }

            }


            if (error) {
                System.out.println("Error");
            }
        } while (error);//SEGUIR PRIDIENDO MIENTRAS HAYA UN ERROR, SI NO LO HAY SE CAMBIA EL NUMERO

        tablero[fila][columna]=numero;

        //comprobar tablero acabado

        boolean lleno;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (tablero[i][j]==0){
                    lleno = false;

                }
            }
        }


        mostrar(tablero);
    }
}

