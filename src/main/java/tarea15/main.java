package tarea15;

import tarea15.clases.Persona;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----Crear Persona-----\n");

        System.out.println("Ingrese nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = entrada.nextInt();

        System.out.println("Ingrese sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Ingrese peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Ingrese altura: ");
        double altura = entrada.nextDouble();

        //Todos los atribs
        Persona p1 = new Persona(nombre, edad, 0, sexo, peso, altura);

        //Todos menos peso y altura
        Persona p2 = new Persona(nombre, edad, sexo);

        //Por defecto
        Persona p3 = new Persona();
        p3.setEdad(edad);
        p3.setSexo(sexo);
        p3.setPeso(peso);
        p3.setAltura(altura);

        //Chequeos
        System.out.println("------Persona 1------\n");
        int IMC = p1.calcularIMC(peso, altura);
        System.out.println("Estado de índice de masa corporal: " + obtenerRespuestaIMC(IMC) );

        boolean mayorEdad = p1.esMayorDeEdad(edad);
        System.out.println("Estado de índice de masa corporal: " + mostrarMayorEdad(mayorEdad) );

        System.out.println(p1);

        System.out.println("------Persona 2------\n");
        int IMC2 = p2.calcularIMC(peso, altura);
        System.out.println("Estado de índice de masa corporal: " + obtenerRespuestaIMC(IMC2) );

        boolean mayorEdad2 = p2.esMayorDeEdad(edad);
        System.out.println("Estado de índice de masa corporal: " + mostrarMayorEdad(mayorEdad2) );
        System.out.println(p2);

        System.out.println("------Persona 3------\n");
        int IMC3 = p3.calcularIMC(peso, altura);
        System.out.println("Estado de índice de masa corporal: " + obtenerRespuestaIMC(IMC3) );

        boolean mayorEdad3 = p3.esMayorDeEdad(edad);
        System.out.println("Estado de índice de masa corporal: " + mostrarMayorEdad(mayorEdad3) );
        System.out.println(p3);

    }

    private static String mostrarMayorEdad(boolean mayorEdad) {
        String respuesta = "";
        if(mayorEdad){
            respuesta = "Es mayor de edad";
        }else{
            respuesta = "Es menor de edad";
        }
        return respuesta;
    }

    private static String obtenerRespuestaIMC(int IMC) {
        String respuestaIMC = "";
        if(IMC == -1){
            respuestaIMC = "Insuficiente";
        } else if (IMC == 0) {
            respuestaIMC = "Normal";
        } else if (IMC == 1) {
            respuestaIMC = "Sobrepeso";
        }
        return respuestaIMC;
    }
}
