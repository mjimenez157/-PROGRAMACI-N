import java.util.Scanner;

public class FigurasConCiclos {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n MENÚ DE FIGURAS ");
            System.out.println("1. Figura creciente izquierda");
            System.out.println("2. Figura decreciente izquierda");
            System.out.println("3. Figura creciente derecha");
            System.out.println("4. Figura decreciente derecha");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = lector.nextInt();

            if (opcion == 1) {
                figuraUno();
            } else if (opcion == 2) {
                figuraDos();
            } else if (opcion == 3) {
                figuraTres();
            } else if (opcion == 4) {
                figuraCuatro();
            } else if (opcion == 5) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    // FIGURA 1
    public static void figuraUno() {
        for (int fila = 1; fila <= 5; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // FIGURA 2
    public static void figuraDos() {
        for (int fila = 5; fila >= 1; fila--) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // FIGURA 3
    public static void figuraTres() {
        for (int fila = 1; fila <= 5; fila++) {
            for (int espacio = 1; espacio <= 5 - fila; espacio++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // FIGURA 4
    public static void figuraCuatro() {
        for (int fila = 5; fila >= 1; fila--) {
            for (int espacio = 1; espacio <= 5 - fila; espacio++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
