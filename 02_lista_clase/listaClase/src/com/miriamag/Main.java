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






        String []  listaClase = new String[20];

        for ( int i = 0; i <2 ; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe Nombre y Apellidos: ");
            String nombreApellido = br.readLine();

            listaClase[i]=nombreApellido;

        }


    }
}
