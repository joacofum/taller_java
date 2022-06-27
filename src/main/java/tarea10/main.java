package tarea10;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = entrada.nextLine().replace(" ", "");
        System.out.println("\nEl texto sin espacios es: " + texto);
    }
}
