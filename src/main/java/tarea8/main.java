package tarea8;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner keyScanner = new Scanner(System.in);
        String dia;
        while(true){
            try {
                System.out.print("Ingrese un dia: ");
                dia = keyScanner.nextLine();
                switch (dia.toLowerCase()) {
                    case "lunes":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "martes":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "miercoles":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "jueves":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "viernes":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "sabado":
                        System.out.println("No es un día laboral.");
                        break;
                    case "domingo":
                        System.out.println("No es un día laboral.");
                        break;
                    default:
                        System.out.println("El día que ingresó no existe.");
                        break;
                }
            } catch (Exception e) {
                System.out.print(e.toString());
            }
        }
    }
}
