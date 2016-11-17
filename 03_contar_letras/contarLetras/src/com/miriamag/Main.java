package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

                /*Realizar un programa que cuente el número de veces que aparece cada una de las letras del
                alfabeto en un texto introducido por el usuario.

                El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en
                la posición correspondiente de un array.

                Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().

                Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del
                método .charAt().*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un texo: ");

        String texto = br.readLine();

        int [] alfabeto = new int [27];



        for (int i = 0; i < texto.length(); i++) {

            switch (texto.charAt(i)) {
                case 'A':

                    alfabeto[0]= alfabeto[0] +1;




            }
        }System.out.println(alfabeto[0]);


    }
}
