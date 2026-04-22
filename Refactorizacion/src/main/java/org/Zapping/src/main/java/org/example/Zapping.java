package org.example;

public class Zapping {

    public static int minClicks(int origen, int destino) {
        int diff = Math.abs(origen - destino);
        return Math.min(diff, 99 - diff);
    }
}
