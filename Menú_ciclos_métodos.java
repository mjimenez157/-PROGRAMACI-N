package paq;

import java.util.Scanner;

public class Menú_ciclos_métodos {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;

		do {
			opcion = mostrarMenu();

			switch (opcion) {
			case 1:
				System.out.print("Ingrese un número: ");
				int n = leer.nextInt();
				mostrarNumeros(n);
				break;

			case 2:
				int suma = sumarNumeros();
				System.out.println("La suma total es: " + suma);
				break;

			case 3:
				validarPassword();
				break;

			case 4:
				System.out.println("Gracias por usar el programa. ¡Adiós!");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 4);
	}

	// MÉTODO DEL MENÚ
	public static int mostrarMenu() {
		System.out.println("\n===== MENÚ PRINCIPAL =====");
		System.out.println("1. Mostrar números (for)");
		System.out.println("2. Sumar números (while)");
		System.out.println("3. Validar contraseña (do-while)");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
		return leer.nextInt();
	}

	// OPCIÓN 1 – FOR
	public static void mostrarNumeros(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	// OPCIÓN 2 – WHILE
	public static int sumarNumeros() {
		int numero;
		int suma = 0;

		System.out.println("Ingrese números (0 para terminar):");

		while (true) {
			numero = leer.nextInt();
			if (numero == 0) {
				break;
			}
			suma += numero;
		}
		return suma;
	}

	// OPCIÓN 3 – DO-WHILE
	public static void validarPassword() {
		String passwordCorrecta = "java123";
		String password;

		do {
			System.out.print("Ingrese la contraseña: ");
			password = leer.next();
		} while (!password.equals(passwordCorrecta));

		System.out.println("Acceso concedido.");
	}
}