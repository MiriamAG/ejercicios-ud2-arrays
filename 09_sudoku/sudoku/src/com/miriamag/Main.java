package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean numeroValidoFila(int[][]tablero, int fila, int numero){

        //búsqueda lineal de un array
        int i =0;
        while (1< tablero[0].length && tablero[fila][i] != numero){
            i++;
        }return !(i<tablero[0].length);
    }
    public static boolean numeroValidoColumna(int[][]tablero, int columna, int numero){

        //búsqueda lineal de un array
        int i =0;
        while (1< tablero.length && tablero[i][columna]!= numero){
            i++;
        }return !(i<tablero.length);
    }

    public static boolean numeroValidoSubcuadricula(int[][]tablero,int fila, int columna, int numero){

    boolean encontrado =false;

        int filaInicio = (fila / 3) * 3;
        int columnaInicio = (columna / 3) * 3;

        for (int i = filaInicio; i < filaInicio + 3; i++) {
            for (int j = columnaInicio; j < columnaInicio + 3; j++) {

                if (tablero[i][j] == numero) {
                    encontrado = true;
                }
            }

        }

     return !encontrado;//en funcion del nombre de la funcion, numero valido? No true.
    }

    public static boolean terminado (int[][]tablero){

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if(tablero[i][j]==0){
                    return false;
                }

            }
        }
        return true;
    }

    public static void mostrar(int[][] m) {

        for (int i = 0; i < m.length; i++) {//cuantas filas hay
            for (int j = 0; j < m[0].length; j++) {//cuanto mide la fila 0

                if(m[i][j] != 0) {
                    System.out.format("%2d", m[i][j]);
                }else{
                    System.out.println(" .");
                }
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


        int[][] tablero = new int[9][9];//[][] = doble indireccion

        //primero se ponen todos a 0

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j]= 0;
            }
        }

        //luego se le aisgnan valores a las posiciones fijas
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


        int fila;
        int columna;
        int numero;

        String respuesta;

            do {
                mostrar(tablero);

            //PEDIR NUMERO Y POSICION
            System.out.println("Elige el número que quieres poner: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            numero = Integer.parseInt(br.readLine());

            System.out.println("Introduce fila en la que quieres colocar el núnero: ");
            fila = Integer.parseInt(br.readLine());
            System.out.println("Introduce columna en la que quieres colocar el número: ");
            columna = Integer.parseInt(br.readLine());


            if (numeroValidoFila(tablero,fila,numero)&&
                    numeroValidoColumna(tablero,columna,numero) &&
                    numeroValidoSubcuadricula(tablero, fila,columna,numero)){

                tablero[fila][columna]= numero;


            }else{
                System.out.println("Error.");

            }

                System.out.println("Pulsa ENTER para continuar o escribe FIN para terminar: ");

                respuesta = br.readLine();


    }while(!terminado(tablero) && !respuesta.equalsIgnoreCase("FIN"));/*cuando lleno sea true que significa que ha
        encontrado 0 en el tablero o si escribe FIN*/

    if (terminado(tablero)){
            System.out.println("Bravo");

    }else{
        System.out.println(":(");
    }


    }
}

