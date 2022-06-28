package tarea17.clases;

public class Television extends Electrodomestico {
    private double resolucion = 20;
    private boolean sintonizador_TDT = false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, double pulgadas, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = pulgadas;
        this.sintonizador_TDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void precioFinal(){
        double precioFinal=0;
        if(this.resolucion>40){
            precioFinal+=40;
        }
        if(this.sintonizador_TDT){
            precioFinal+=50;
        }
        super.precioFinal();
        super.aumentarPrecio(precioFinal);
    }

}
