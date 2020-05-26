package jStrings;

import libs.Input;

public class ConversionSegundosDificil {
    public static void main(String[] args) {

        System.out.println("duracion del video en segundos: ");
        String time = Input.get_string();
        int timeInteger = Integer.parseInt(time);
        int  minutesToSeconds = timeInteger / 60;
        int remainingSeconds = timeInteger % 60;
        int totalSeconds = minutesToSeconds + remainingSeconds;
        System.out.println("Total de segundos: " + totalSeconds);
    }
}

//ciclo hasta que de un valor correcto.
//1.  tiene dos valores el split
//2.  tanto minutos como segundos deben ser enteros
//3.  los segundos deben ser 0 y 59

