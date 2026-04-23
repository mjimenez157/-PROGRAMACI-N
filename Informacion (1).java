package pak;

import java.util.Scanner;

public class Informacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "Maria";
        int edad = 18;
        String programa = "ing mecatronica";

        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Programa: " + programa);

        System.out.print("¿Cuál es su nombre? ");
        nombre = sc.nextLine();

        System.out.print("¿Cuál es su edad? ");
        edad = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Ingrese su programa: ");
        programa = sc.nextLine();

        System.out.println("Datos ingresados");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Programa: " + programa);

    }
}