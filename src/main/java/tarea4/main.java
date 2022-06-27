package tarea4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        int iva = 21;
        double precio_con_iva = precio - (precio*iva/100);
        System.out.println("El precio del producto con IVA es: " + precio_con_iva);

    }
}
