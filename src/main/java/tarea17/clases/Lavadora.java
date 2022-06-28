package tarea17.clases;

public class Lavadora extends Electrodomestico{
    final static double carga_defecto = 5;

    private double carga = carga_defecto;

    public Lavadora(){
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void precioFinal(){
        if(this.carga > 30){
            super.precioFinal();
            super.aumentarPrecio(50);
        }
    }

}
