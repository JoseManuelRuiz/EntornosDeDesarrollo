package org.example;

public class Zapping {

    public static int minClicks(int origen, int destino) {
        int diferencia = Math.abs(origen - destino);
        return Math.min(diferencia, 99 - diferencia);
    }
}
