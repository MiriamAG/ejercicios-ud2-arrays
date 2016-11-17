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


         final int ALUMNOS = 3;// Es una constante que se repite en el programa, si se cambia aquí se cambia en todas.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String []  listaClase = new String[ALUMNOS];


            for (int i = 0; i < ALUMNOS; i++) {// es un bucle for porque recorremos todo el array

                System.out.println("Escribe Nombre y Apellidos: ");
                String nombreApellido  = br.readLine();

                listaClase[i] = nombreApellido;

            }//el array + los nombres con los que se llena

        String texto;

            do {


                System.out.println("Escriba una letra o FIN para terminar: ");

                texto = br.readLine().toLowerCase();/*necesitamos un string no un char porque
                 tiene que escribir escribir FIN.
                 Además se cambia todo a letra minusculas*/

                for (int x = 0; x < ALUMNOS; x++) {

                    if (!texto.equalsIgnoreCase("FIN")) {//el if es para que no te saque la lista con la f cuando escribes fin
                        char letra = texto.charAt(0);/*Creamos variable letra para poder comparar la letra que ponga con la primera letra del string del array*/
                        if (listaClase[x].toLowerCase().charAt(0) == letra) {/*aquí las comparaciones debes comparar lo que hay en la lista en minus*/
                            System.out.println(listaClase[x]);

                        }//muestra todos los nombres que empiecen por la letra que elija el user

                    }
                }
            } while (!texto.equalsIgnoreCase("FIN"));//ignore case para que no importe si es minus o mayus

        System.out.println("Hasta luego.");
    }
}
