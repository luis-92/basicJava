package jStrings;
import libs.Input;

public class CifradoCesar {
    public static void main(String[] args) {
        //Recorrer el mensaje
        //tomar letra actual
        //sumar clave
        //si la suma es mayor a 90, entonces solo restar 26
        //convertir la suma en character, y la omprimo suma = 76 (char)suma

        //Recorrer el mensaje
        //tomar la letra
        //sumar la clave
        //si la suma es mayor de 90, le resto 26
        //convertir la suma en caracter e imprimirla -- ex: suma = 76, ((char) suma) char encriptado = (char)('a')+12;
        // agarro el caracter actual que es igual al mensaje

        String mensaje;
        System.out.println("Escribe tu mensaje: ");
        mensaje = Input.get_string();
        System.out.println("Cual es la clave");
        int clave = Input.get_int();

        for (int i = 0, n = mensaje.length(); i < n; i++) {

            char actual = mensaje.charAt(i);
            int suma = actual + clave;

            if (suma > 90) {
                int temp1 =suma- 26;
                System.out.print((char) temp1);
            } else if (suma < 90) {

                System.out.print((char) suma);
            }
        }

    }
}

