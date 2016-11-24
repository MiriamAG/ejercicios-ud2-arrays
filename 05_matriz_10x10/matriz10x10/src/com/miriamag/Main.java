package com.miriamag;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*Rellena una matriz de 10x10 con valores aleatorios y muéstrala en pantalla.

Como recordatorio, para generar números aleatorios entre 0 y 100 podemos usar:

Random r = new Random();
int aleatorio = r.nextInt(100);*/


        int [][]matrices = new int[10][10];



        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {

                Random r = new Random();
                int aleatorio = r.nextInt(100);
                matrices[i][j] = aleatorio;
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {


                System.out.format("%4d", matrices[i][j]);
            }
            System.out.println();
        }

    }
}
