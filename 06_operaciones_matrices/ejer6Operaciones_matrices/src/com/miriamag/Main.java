package com.miriamag;

import java.util.Random;

public class Main {
    public static int[][] sumarmatrices (int[][] m1,int[][] m2){

        int i;
        int j;

        int [][]m3= new int[4][4];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

               m3[i][j] =m1[i][j]+ m2[i][j];

               // System.out.format("%4d",m3[i][j]);
            }

        }
        return m3;
    }

    public static void main(String[] args) {

	/*Haz un programa que genere dos matrices aleatorias de 4x4 elementos y que muestre:

La suma de las dos matrices.
El producto de la primera por un escalar (se lo pediremos al usuario).
El producto de las dos matrices.
La traspuesta de la segunda matriz.
Cada operación estará contenida en una función a la que llamaremos desde el programa principal pasándole los datos que necesite.

Una vez que se hayan hecho todos los cálculos, mostraremos los resultados llamando a la función visualizarMatriz() las veces que sea necesario.

Aquí hay un poco de ayuda sobre las matrices y sus operaciones.*/


	    int [][]matrizLlorar = new int[4][4];

        int [][]matrizSuicidio = new int[4][4];


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                Random r = new Random ();
                int divina = r.nextInt(16);
                matrizLlorar[i][j]=  divina;

                int providencia = r.nextInt(16);
                matrizSuicidio[i][j]= providencia;

            }
        }//las matrices creadas


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.format("%4d", matrizLlorar[i][j]);

            }
           System.out.println();//mostrar las dos matrices
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.format("%4d", matrizSuicidio[i][j]);

            }
            System.out.println();//mostrar las dos matrices
        }
        System.out.println();


        int [][]matrizMuerte = new int [4][4];



        //sumar matrices

        int[][] r = sumarmatrices(matrizLlorar, matrizSuicidio );

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.format("%4d",r[i][j]);
            }
            System.out.println();
        }





    }
}
