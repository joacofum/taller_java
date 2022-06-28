package tarea17.clases;

public class Electrodomestico {

    //Constantes//
    static final double precio_base = 100, peso_base = 5;
    static final String color_base = "blanco";
    static final char consumoEnergeticoDefault='F';
    static final String blanco="blanco", negro="negro", rojo="rojo", azul="azul", gris="gris";
    //----------//

    private double precioBase = precio_base, peso = peso_base;
    private String color;
    private char consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = chequearColor(color);
        this.consumoEnergetico = chequearConsumoEnergetico(consumoEnergetico);
    }

    public char chequearConsumoEnergetico(char letra){
        if(letra=='A'|| letra =='B'|| letra=='C'|| letra=='D'|| letra=='E'|| letra=='F'){
            return letra;
        }
        return consumoEnergeticoDefault;
    }

    public String chequearColor(String color){
        if(color.equalsIgnoreCase(blanco) || color.equalsIgnoreCase(negro) || color.equalsIgnoreCase(rojo)
                || color.equalsIgnoreCase(azul) || color.equalsIgnoreCase(gris)){
            return color;
        }
        return color_base;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }


    public String getColor() {
        return color;
    }


    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void precioFinal(){
        double precioEnergetico=0, precioPeso=0;
        char consumoEnergetico= this.getConsumoEnergetico();
        double peso= this.getPeso();

        if(consumoEnergetico == 'A' || consumoEnergetico == 'a'){
            precioEnergetico=100;
        }

        if(consumoEnergetico == 'B' || consumoEnergetico == 'b'){
            precioEnergetico=80;
        }

        if(consumoEnergetico == 'C' || consumoEnergetico == 'c'){
            precioEnergetico=60;
        }

        if(consumoEnergetico == 'D' || consumoEnergetico == 'd'){
            precioEnergetico=50;
        }

        if(consumoEnergetico == 'E' || consumoEnergetico == 'e'){
            precioEnergetico=30;
        }

        if(consumoEnergetico == 'F' || consumoEnergetico == 'f'){
            precioEnergetico=10;
        }

        if(peso>=0 && peso<=19){
            precioPeso=10;
        }

        if(peso>=20 && peso<=49){
            precioPeso=50;
        }

        if(peso>=50 && peso<=79){
            precioPeso=80;
        }

        if(peso>=80){
            precioPeso=100;
        }

        this.precioBase += precioEnergetico + precioPeso;

    }

    public void aumentarPrecio(double precio){
        this.precioBase+=precio;
    }

}
