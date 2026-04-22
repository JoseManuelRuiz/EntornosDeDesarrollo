package org.example;

public class Zapping {

    public static int minClicks(int origen, int destino) {
<<<<<<< HEAD
        return 0;
=======
        int diferencia = Math.abs(origen - destino);
        return Math.min(diferencia, 99 - diferencia);
>>>>>>> 24c3576c65819f11a6223254fa3cab64b2180d12
    }
}
