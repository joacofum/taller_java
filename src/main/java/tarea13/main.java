package tarea13;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args){
        System.out.println(obtenerFecha());
    }

    private static String obtenerFecha() {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
        return formateador.format(LocalDateTime.now());
    }
}
