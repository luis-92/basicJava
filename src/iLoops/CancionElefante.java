package iLoops;

public class CancionElefante {
    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 100){

            if(contador ==1)System.out.println(contador + " elfeante  se columpiaba sobre la tela de una araña. \n Como veía que resistía fueron a llamar a otro elefante...");
            else System.out.println(contador + " elfeantes  se columpiaba sobre la tela de una araña. \n Como veía que resistía fueron a llamar a otro elefante...");

            contador++;
        }
        System.out.println("Se acabó");
    }
}
