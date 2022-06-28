package tarea15.clases;

import java.util.Random;

public class Persona {
    private final String nombre;
    private int edad,DNI;
    private char sexo;
    private double peso,altura;

    static final int insuficiente = -1;
    static final int normal = 0;
    static final int sobrepeso = 1;

    //Defecto
    public Persona(){
        this.nombre = "";
        this.edad=0;
        this.sexo =' ';
        this.peso=0;
        this.altura=0;
        this.DNI=this.crearDNI();
    }

    //Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo = this.comprobarSexo(sexo);
        this.peso=0;
        this.altura=0;
        this.DNI=this.crearDNI();
    }

    //Constructor con todos los atributos
    public Persona(String nombre, int edad, int DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.crearDNI();
        this.sexo = this.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura){
        double estado = 0;
        estado = (peso / (Math.pow(altura,2)));
        if(estado < 20){
            return insuficiente;
        }
        if(estado >= 20 && estado <= 25){ //18.5–24.9
            return normal;
        }
        if(estado > 25){
            return sobrepeso;
        }
        return -2;
    }

    public boolean esMayorDeEdad(int edad){
        if(edad>=18){
            return true;
        } else{
            return false;
        }
    }

    public char comprobarSexo(char sexo){
        if(sexo=='M' || sexo=='m' || sexo=='H' || sexo=='h'){
            return sexo;
        }else{
            return 'H';
        }
    }

    private int crearDNI(){
        Random random = new Random();
        return random.nextInt(99999999);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", genero=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
