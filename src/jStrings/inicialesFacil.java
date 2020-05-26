package jStrings;
import libs.Input;

import java.util.Scanner;


public class inicialesFacil {

    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = Input.get_string();
        String[] lista  = nombre.split(" ");
        for(int i = 0; i <  lista.length;i++) {
            Input.print(lista[i].charAt(0));
        }
        //System.out.println(lista);
        //System.out.println(cadena.charAt(2));  // Devuelve la letra 'd'

    }

}
