package tarea3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        double radio = entrada.nextDouble();

        System.out.println("El área del círculo es: " + Math.PI*(Math.pow(radio,2)));

    }
}
