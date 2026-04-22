package org.example;

public class Calculadora {

    public int suma(String texto) {
        if (texto.isEmpty()) return 0;

        String[] partes = texto.split(",");
        int suma = 0;

        for (String numero : partes) {
            if (numero.isEmpty()) return -1;

            int num = Integer.parseInt(numero);

            if (num < 0) {
                System.out.println("Número negativo no permitido");
                return -1;
            }

            if (num > 1000) {
                System.out.println("Número superior a 1000 ignorado");
                continue;
            }

            suma += num;
        }

        return suma;
    }
}
