package tarea16;

import tarea16.clases.Electrodomestico;
import tarea16.clases.Lavadora;
import tarea16.clases.Television;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args){
        //Crear el array de objetos
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        double precio_total_lavadoras=  0 , precio_total_televisiones = 0;

        //Creo Televisores
        for (int i=0; i<5; i++){
            double precio = (Math.random() * 1000+1);
            double peso = (Math.random() * 100);
            double pulgadas = (Math.random() * 100);
            Television t = new Television(precio, peso,"negro",'E',pulgadas,true);
            electrodomesticos.add(t);
        }

        for (int i=0; i<5; i++){
            double precio = (Math.random() * 1000+1);
            double peso = (Math.random() * 100);
            double carga = (Math.random() * 100);
            electrodomesticos.add(new Lavadora(precio,peso,"azul",'B',carga));
        }

        //Precio final.
        for(int i=0;i<electrodomesticos.size();i++){
            electrodomesticos.get(i).precioFinal();
        }

        //Mostrar el precio final de cada electrodomestrico
        NumberFormat formatter = new DecimalFormat("#0.00");
        for(int i=0;i<electrodomesticos.size();i++){
            if(electrodomesticos.get(i) instanceof Television){
                Television t = (Television) electrodomesticos.get(i);
                System.out.println("Television "+ i +": $" + formatter.format(t.getPrecioBase()));
                precio_total_televisiones += t.getPrecioBase();
            }else{
                Lavadora l = (Lavadora) electrodomesticos.get(i);
                System.out.println("Lavadora "+ i +": $"+ formatter.format(l.getPrecioBase()));
                precio_total_lavadoras += l.getPrecioBase();
            }
        }

        //Mostrar el precio Total de cada tipo de Electrodomestico
        System.out.println();
        System.out.println("Precio total Lavadoras: $"+formatter.format(precio_total_lavadoras));
        System.out.println("Precio total Television: $"+formatter.format(precio_total_televisiones));
        System.out.println("Precio total Electrodomesticos: $"+formatter.format(precio_total_lavadoras+precio_total_televisiones));

    }
}
