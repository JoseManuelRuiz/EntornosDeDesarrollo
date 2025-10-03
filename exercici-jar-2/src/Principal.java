import es.iesmz.prueba.Coche;
import java.util.Scanner;
public class Principal {


    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coche coche = new Coche("Fiat", "Panda", "Groc");
        int opcion = -1;


        while(true) {
            switch (opcion) {
                case 1:
                    System.out.println("Los datos del coche son los siguientes: ");
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 2:
                    System.out.println("Pintemos el coche: ");
                    coche.pinta();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 3:
                    System.out.print("Establece la marca del coche: ");
                    coche.setMarca(scanner.next());
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 4:
                    System.out.println("Establece el modelo del coche: ");
                    coche.setModelo(scanner.next());
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 5:
                    System.out.println("Establece el color del coche: ");
                    coche.setColor(scanner.next());
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 6:
                    System.out.println("Establece la velocidad del coche en KM/H: ");
                    coche.setVelocidad(scanner.nextInt());
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 7:
                    System.out.println("Frena el coche, indica la velocidad en KM/H: ");
                    coche.frena(scanner.nextInt());
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case 8:
                    System.out.println("El coche se ha parado.");
                    coche.para();
                    coche.imprime();
                    System.out.println("-------------------------------------------");
                    opcion = -1;
                    break;
                case -1:
                    System.out.println("Elige una opción del menu:");
                    System.out.println("1. Imprimir datos del coche");
                    System.out.println("2. Pintar el coche");
                    System.out.println("3. Establecer Marca");
                    System.out.println("4. Establecer modelo");
                    System.out.println("5. Establecer color");
                    System.out.println("6. Acelerar");
                    System.out.println("7. Frenar");
                    System.out.println("8. Parar");
                    System.out.println("0. Parar");
                    System.out.print("Elige una opción: ");
                    opcion = scanner.nextInt();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA:");
                    System.out.println("Elige una opción del menu:");
                    System.out.println("1. Imprimir datos del coche");
                    System.out.println("2. Pintar el coche");
                    System.out.println("3. Establecer Marca");
                    System.out.println("4. Establecer modelo");
                    System.out.println("5. Establecer color");
                    System.out.println("6. Acelerar");
                    System.out.println("7. Frenar");
                    System.out.println("8. Parar");
                    System.out.println("0. Parar");
                    opcion = -1;
                    opcion = scanner.nextInt();
              }
            }
        }

    }
