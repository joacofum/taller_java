package tarea9;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
       String texto = "La sonrisa sera la mejor arma contra la tristeza";
       Scanner entrada = new Scanner(System.in);

       texto = texto.replace('a','e');
       System.out.print("Ingresa una frase:");
       String concatenacion = entrada.nextLine();

       System.out.println("\nEl texto final es: " + texto + " " + concatenacion);

    }
}
