package tarea14;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = entrada.nextInt();

        if(numero > 1000){
            System.out.print("El número ingresado debe ser menor a mil");
        }else{
            for(int i = numero; i<=1000; i+=2){
                System.out.print(i + "\n");
            }
        }
    }
}
