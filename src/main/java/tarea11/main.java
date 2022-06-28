package tarea11;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = entrada.nextLine();
        System.out.println("\nEl largo del texto es: " + texto.length());

        char[] char_texto = texto.toLowerCase().toCharArray();
        int cant_vocales = 0;
        for(int i = 0 ; i < char_texto.length; i++){
            if(char_texto[i]=='a' || char_texto[i]=='e' || char_texto[i]=='i' || char_texto[i]=='o' || char_texto[i]=='u'){
                cant_vocales++;
            }
        }

        System.out.println("\nSu número de vocales son: " + cant_vocales);
    }
}
