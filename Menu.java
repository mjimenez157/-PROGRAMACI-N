package paq;

import java.util.Scanner;

public class Menu {

    public static int mostrarMenu() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Ingrese datos");
        System.out.println("2. Muestre datos");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        return lea.nextInt();
    }

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int opcion = 0;
        String nombre = "";
        int edad = 0;

        while (opcion != 3) {
            opcion = mostrarMenu();

            if (opcion == 1) {
                System.out.println("Ingrese su nombre:");
                nombre = lea.nextLine();

                System.out.println("Ingrese su edad:");
                edad = lea.nextInt();
                lea.nextLine(); // limpiar buffer
            }

            else if (opcion == 2) {
                System.out.println("\n--- Datos ---");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
            }

            else if (opcion == 3) {
                System.out.println("Saliendo...");
            }

            else {
                System.out.println("Opción inválida");
            }
        }
    }
}