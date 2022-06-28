package tarea12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra1 = entrada.nextLine();
        System.out.print("Ingresa otra palabra: ");
        String palabra2 = entrada.nextLine();

        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("\nLas palabras son iguales");
        }else{
            System.out.println("Las diferencias son: "+ mostrarDiferencias(palabra1, palabra2));
        }
    }

    private static String mostrarDiferencias(String palabra1, String palabra2) {
        List<String> diferencias = new ArrayList<>();
        if(palabra1 == null || palabra1.isEmpty()){
            return palabra2;
        }

        if(palabra2 == null || palabra2.isEmpty()){
            return palabra1;
        }

        char[] palabra_mas_larga = palabra1.length() > palabra2.length() ? palabra1.toCharArray() : palabra2.toCharArray();
        char[] palabra_mas_corta = palabra1.length() <= palabra2.length() ? palabra1.toCharArray() : palabra2.toCharArray();

        for(int i = 0; i < palabra_mas_larga.length; i++){

            if(i == palabra_mas_corta.length){
                diferencias.add(String.valueOf(palabra_mas_larga[i]));
                break;
            }

            if(palabra_mas_larga[i] != palabra_mas_corta[i]){
                diferencias.add(String.valueOf(palabra_mas_larga[i]));
            }

        }
        return diferencias.toString();
    }

}
