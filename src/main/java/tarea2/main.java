package tarea2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = entrada.nextInt();

        if(a>b){
            System.out.println(a + " es mayor que " + b);
        }else if(a == b){
            System.out.println(a + " es igual que " + b);
        }else{
            System.out.println(a + " es menor que " + b);
        }
    }
}
