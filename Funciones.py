def figura_uno():
    for fila in range(1, 6):
        for col in range(fila):
            print("*", end=" ")
        print()


def figura_dos():
    for fila in range(5, 0, -1):
        for col in range(fila):
            print("*", end=" ")
        print()


def figura_tres():
    for fila in range(1, 6):
        for espacio in range(5 - fila):
            print("  ", end="")
        for col in range(fila):
            print("* ", end="")
        print()


def figura_cuatro():
    for fila in range(5, 0, -1):
        for espacio in range(5 - fila):
            print("  ", end="")
        for col in range(fila):
            print("* ", end="")
        print()


# PROGRAMA PRINCIPAL
opcion = 0

while opcion != 5:
    print("\n=== MENÚ DE FIGURAS ===")
    print("1. Figura creciente izquierda")
    print("2. Figura decreciente izquierda")
    print("3. Figura creciente derecha")
    print("4. Figura decreciente derecha")
    print("5. Salir")

    opcion = int(input("Seleccione una opción: "))

    if opcion == 1:
        figura_uno()
    elif opcion == 2:
        figura_dos()
    elif opcion == 3:
        figura_tres()
    elif opcion == 4:
        figura_cuatro()
    elif opcion == 5:
        print("Programa finalizado.")
    else:
        print("Opción no válida.")