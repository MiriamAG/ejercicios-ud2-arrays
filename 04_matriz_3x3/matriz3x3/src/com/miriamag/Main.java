package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

	/*Crea una matriz de 3x3 elementos pidiendo los valores al usuario. Después, muestra el
      contenido de la matriz por pantalla.
      Para facilitar la visualización es recomendable usar la función System.out.format()*/


        int[][] matrices = new int[3][3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i;
        int j;


        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                System.out.println(" Escribe un numero: ");
                int numero = Integer.parseInt(br.readLine());
                matrices[i][j] = numero;

            }

        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                System.out.format("%4d", matrices[i][j]);
            }
            System.out.println();// para que quede separado


        }
    }
}
