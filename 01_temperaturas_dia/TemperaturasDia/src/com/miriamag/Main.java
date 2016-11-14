package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.

        final int HORAS=5;// Cuando el numero de vueltas se repite demasiado

        double [] temperaturas = new double[HORAS];

        for (int i = 0; i < HORAS; i++) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe temperaturas cada 1h durante 24h: ");

            temperaturas[i] = Double.parseDouble(br.readLine());
            //la i es el valor de la posición


        }//creado el array con los 24 valores

        //calcular max, min y media

        double total =0;
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;

        for (int i = 0; i < HORAS; i++) {
            total += temperaturas[i];
            if (temperaturas[i]>max) {
                max = temperaturas[i];
            }
            if (temperaturas[i]<min){
                min = temperaturas[i];
            }

        }

        double media = total/HORAS;


        for  (int i=0; i<temperaturas.length; i++) {

            System.out.print(i);
            System.out.print("  ");
            for (int x = 0; x < temperaturas[i]; x++){
                System.out.print("*");
                }

            System.out.print("  ");

            System.out.print(temperaturas[i]);

            if (temperaturas[i]== max){
                System.out.print(" MAX ");
                }
            if (temperaturas[i]==min){
                System.out.print(" MIN ");

                System.out.println();//final de línea o salto de línea
                }


        }
        System.out.println(media);



    }
}//no sale max ni min
