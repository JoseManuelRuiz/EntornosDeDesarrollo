import java.util.Scanner;
import java.io.*;

void main() {

    Scanner scanner = new Scanner(System.in);
    MZFecha fecha = new MZFecha();
    MZFecha fecha2 = new MZFecha();

    do {
        System.out.println("Intruduce un día entre 1 y 31: ");
        fecha.setDia(scanner.nextInt());
        System.out.println("Intruduce un mes entre 1 y 31:  ");
        fecha.setMes(scanner.nextInt());
        System.out.println("Intruduce un año entre 1970 y 3000:  ");
        fecha.setAnyo(scanner.nextInt());
        System.out.println("------------------------------------------");
    }while (!fecha.comprueba(fecha.getDia(),fecha.getMes(),fecha.getAnyo()));
    //imprimo la fecha actual
    System.out.print("La fecha introducida es la siguiente: ");
    fecha.imprime();

    System.out.println("Vamos a calcular la diferencia entre la primera fecha y otra fecha: ");

    do {
        System.out.println("Intruduce un día entre 1 y 31: ");
        fecha2.setDia(scanner.nextInt());
        System.out.println("Intruduce un mes entre 1 y 31:  ");
        fecha2.setMes(scanner.nextInt());
        System.out.println("Intruduce un año entre 1970 y 3000:  ");
        fecha2.setAnyo(scanner.nextInt());
        System.out.println("------------------------------------------");
    }while (!fecha2.comprueba(fecha2.getDia(),fecha2.getMes(),fecha2.getAnyo()));

    System.out.println("La diferencia en días es: " + fecha.diferenciaDias(fecha2));

}
