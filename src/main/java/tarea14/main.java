package tarea14;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");

        do {
            System.out.println("Ingrese una opción: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("NUEVO ACTOR\n");
                    break;
                case 2:
                    System.out.println("BUSCAR ACTOR\n");
                    break;
                case 3:
                    System.out.println("ELIMINAR ACTOR\n");
                    break;
                case 4:
                    System.out.println("MODIFICAR ACTOR\n");
                    break;
                case 5:
                    System.out.println("VER TODOS LOS ACTORES\n");
                    break;
                case 6:
                    System.out.println("VER PELICULAS DE LOS ACTORES\n");
                    break;
                case 7:
                    System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n");
                    break;
            }
        }while(opcion != 8);
    }
}
