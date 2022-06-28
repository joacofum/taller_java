package tarea18.clases;

import tarea18.interfaz.Entregable;

public class Serie implements Entregable {
    //Constantes//
    private static int nro_temporadas_defecto = 3;
    private static boolean entregado_defecto = false;

    //Atributos//
    private String titulo;
    private boolean entregado = entregado_defecto;
    private int nro_temporadas = nro_temporadas_defecto;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int nro_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nro_temporadas = nro_temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNro_temporadas() {
        return nro_temporadas;
    }

    public void setNro_temporadas(int nro_temporadas) {
        this.nro_temporadas = nro_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return " Título: '" + titulo + '\'' +
                ", Entregado: " + entregado +
                ", Número de temporadas: " + nro_temporadas +
                ", Género: '" + genero + '\'' +
                ", Creador: '" + creador + '\'' +
                '}';
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
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
       Serie s = (Serie) a;
       if(nro_temporadas > s.getNro_temporadas())
           return true;
       return false;
    }
}
