package tarea18;

import tarea18.clases.Serie;
import tarea18.clases.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<Serie> series = new ArrayList<>(5);
        List<Videojuego> videojuegos = new ArrayList<>(5);

        //Creo series
        series.add(new Serie("Breaking Bad", 5, "Drama criminal", "Vince Gilligan"));
        series.add(new Serie("Game of Thrones", 8, "Fantasía", "D. B. Brothers"));
        series.add(new Serie("Westworld", 4, "Fantasía", "Jonathan Nolan"));
        series.add(new Serie("True Detective", 3, "Crimen", "Cary Fukunaga"));
        series.add(new Serie("The Wire", 5, "Narcotráfico", "David Simon"));

        //Creo videojuegos
        videojuegos.add(new Videojuego("Apex Legends", 500, "Battle Royale", "Respawn"));
        videojuegos.add(new Videojuego("League of Legends", 200, "Multijugador de arena de batalla", "Riot Games"));
        videojuegos.add(new Videojuego("The Walking Dead", 100, "Película interactiva", "Telltale Games"));
        videojuegos.add(new Videojuego("Detroit: Become Human", 50, "Aventura gráfica", "Sony Interactive Entertainment"));
        videojuegos.add(new Videojuego("Until Dawn", 25, "Terror narrativo", "Sony Interactive Entertainment"));


        //Entrego series
        series.get(0).entregar();
        series.get(2).entregar();
        series.get(3).entregar();

        //Entrego juegos
        videojuegos.get(0).entregar();
        videojuegos.get(2).entregar();
        videojuegos.get(3).entregar();

        int cant_series_entregadas = 0;
        Serie serie_con_mas_temporadas = series.get(0);
        System.out.println("-----------------Series---------------------");
        for (Serie serie : series) {
            if(serie.isEntregado()) {
                cant_series_entregadas++;
                System.out.println(serie);
            }

            if(serie.compareTo(serie_con_mas_temporadas))
                serie_con_mas_temporadas = serie;

        }

        System.out.println("\nLa serie con más temporadas es: " + serie_con_mas_temporadas);
        System.out.println("La cantidad de series entregadas es: " + cant_series_entregadas);
        System.out.println("---------------------------------------------\n");

        int cant_juegos_entregados = 0;
        Videojuego juego_con_mas_horas = videojuegos.get(0);
        System.out.println("---------------------------------------------");

        for (Videojuego juego: videojuegos){
            if(juego.isEntregado()) {
                cant_juegos_entregados++;
                System.out.println(juego);
            }

            if(juego.compareTo(juego_con_mas_horas))
                juego_con_mas_horas = juego;
        }


        System.out.println("---------------------------------------------\n");

        System.out.println("El videojuego con más horas es: " + juego_con_mas_horas);
        System.out.println("La cantidad de juegos entregados es: " + cant_juegos_entregados);

    }
}
