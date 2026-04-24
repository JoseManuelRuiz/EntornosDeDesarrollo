package org.example;

public class Divisible3 {
    public static String esDivisible(int n) {
        int suma = n * (n + 1) / 2;
        return (suma % 3 == 0) ? "SI" : "NO";
    }

}
