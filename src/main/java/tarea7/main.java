package tarea7;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        do{
            System.out.print("Ingresa un numero mayor o igual a 0: ");
            try{
                i = entrada.nextInt();
                if(i >= 0){
                    System.out.print("El número ingresado es correcto: "+ i +"\n");
                }else{
                    System.out.print("Número ingresado incorrecto: "+ i +"\n");
                }
            }catch(Exception e){
                System.out.print("Opción inválida, debe ingresar un número.");
            }
        }while(i<0);
    }
}
