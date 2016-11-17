package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*

        Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.

        Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.

                Nota: El programa termina cuando se escriba FIN como búsqueda.*/





        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []  listaClase = new String[20];

        for ( int i = 0; i <3 ; i++) {

            System.out.println("Escribe Nombre y Apellidos: ");
            String nombreApellido = br.readLine();

            listaClase[i]=nombreApellido;

        }

        System.out.println("Escriba una letra: ");

        char letra = br.readLine().charAt(0);

        for (int x = 0; x < 3; x++) {
            if (listaClase[x].charAt(0)==letra) {
                System.out.print(listaClase[x]);

            }



        }

    }
}
