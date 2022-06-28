package tarea18.clases;

import tarea18.interfaz.Entregable;

public class Videojuego implements Entregable {
    //Constantes
    private static int horas_estimadas_defecto = 10;
    private static boolean entregado_defecto = false;

    //Atributos
    private String titulo;
    private int horas_estimadas = horas_estimadas_defecto;
    private boolean entregado = entregado_defecto;
    private String genero;
    private String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return " Título: '" + titulo + '\'' +
                ", Horas estimadas: " + horas_estimadas +
                ", Entregado: " + isEntregado() +
                ", Género: '" + genero + '\'' +
                ", Compañía: '" + compania + '\'';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if(this.entregado)
            return true;
        return false;
    }

    @Override
    public boolean compareTo(Object a) {
        Videojuego v = (Videojuego) a;
        if (horas_estimadas > v.getHoras_estimadas())
            return true;
        return false;
    }
}
