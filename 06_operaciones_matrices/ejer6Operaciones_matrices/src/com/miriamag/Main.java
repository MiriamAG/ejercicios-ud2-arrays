package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void visualizar(int [][]m){

        for (int i = 0; i < m.length; i++) {//el .length devuelve el numero de filas

            for (int j = 0; j < m[0].length; j++) {//m[0] entra en la primera fila y el .length cuenta la cantidad de huecos que hay a partir de esa posición

                System.out.format("%4d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int[][] sumarmatrices (int[][] m1,int[][] m2){

        int filas = m1.length;//numero de filas de la m1
        int columnas= m1[0].length;//numero de columnas de m1

        int [][]resultado= new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

               resultado[i][j] =m1[i][j]+ m2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] productoEscalar(int [][]m,int x){
        int [][] resultado = new int[m.length][m[0].length];

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[0].length; j++) {

                resultado [i][j]= x * m[i][j];
            }
        }

        return resultado;
    }

    public static int [][]producto(int[][]m1, int[][]m2){
        int [][] resultado = new int[m1.length][m1[0].length];

        //la i y la j recorrn la matriz resultado, no las de origen

        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j <m1[0].length ; j++) {
                for (int k = 0; k < m1.length; k++) {
                    resultado[i][j]= resultado[i][j]+ m1[i][k] * m2[k][j];
                }
            }
        }

        return resultado;
    }

    public static int [][]traspuesta(int[][]m1){
        int [][] resultado = new int[m1[0].length][m1.length ];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {

                resultado[j][i]= m1[i][j];

            }

        }


        return resultado;
    }


    public static void main(String[] args) throws IOException {

	/*Haz un programa que genere dos matrices aleatorias de 4x4 elementos y que muestre:

    La suma de las dos matrices.
    El producto de la primera por un escalar (se lo pediremos al usuario).
    El producto de las dos matrices.
    La traspuesta de la segunda matriz.
    Cada operación estará contenida en una función a la que llamaremos desde el programa principal pasándole los datos que necesite.

    Una vez que se hayan hecho todos los cálculos, mostraremos los resultados llamando a la función visualizarMatriz() las veces que sea necesario.

    Aquí hay un poco de ayuda sobre las matrices y sus operaciones.*/


        //las matrices creadas y con sus recorridos

	    int [][]matrizLlorar = new int[4][4];

        int [][]matrizSuicidio = new int[4][4];


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                Random r = new Random (5);
                int divina = r.nextInt(10);
                matrizLlorar[i][j]=  divina;

                matrizSuicidio[i][j]= r.nextInt(10);//las dos formas funcionan igual
            }
        }

        //llamar a la función visualizar para sacar la matriz

        System.out.println("matriz1: ");
        visualizar(matrizLlorar);

        System.out.println("matriz2: ");
        visualizar(matrizSuicidio);

        //sumar matrices

        /*int[][] matrizMuerte = sumarmatrices(matrizLlorar, matrizSuicidio );*/
        System.out.println("Suma de matriz1 y matriz2: ");

        visualizar(sumarmatrices(matrizLlorar,matrizSuicidio));//es la matriz resultado de la suma, visualiza la suma de...

        //producto de un escalar

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número entero: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("producto de matriz1 * numero: ");
        visualizar(productoEscalar(matrizLlorar,n));//la muestro directamente

        // producto de matrices

        System.out.println("Producto de matriz 1 * matriz 2: ");
        visualizar(producto(matrizLlorar,matrizSuicidio));

        //traspuesta

        System.out.println("traspuesta de la matriz1: ");

        visualizar(traspuesta(matrizLlorar));


    }
}
