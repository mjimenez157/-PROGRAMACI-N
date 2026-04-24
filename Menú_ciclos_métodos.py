def mostrar_menu():
    print("\n===== MENÚ PRINCIPAL =====")
    print("1. Mostrar números (for)")
    print("2. Sumar números (while)")
    print("3. Validar contraseña (do-while)")
    print("4. Salir")
    return int(input("Seleccione una opción: "))


def mostrar_numeros(n):
    for i in range(1, n + 1):
        print(i)


def sumar_numeros():
    suma = 0
    print("Ingrese números (0 para terminar):")

    while True:
        num = int(input())
        if num == 0:
            break
        suma += num

    return suma


def validar_password():
    password_correcta = "python123"
    password = ""

    while True:
        password = input("Ingrese la contraseña: ")
        if password == password_correcta:
            break

    print("Acceso concedido.")


# PROGRAMA PRINCIPAL
opcion = 0

while opcion != 4:
    opcion = mostrar_menu()

    if opcion == 1:
        n = int(input("Ingrese un número: "))
        mostrar_numeros(n)

    elif opcion == 2:
        resultado = sumar_numeros()
        print("La suma total es:", resultado)

    elif opcion == 3:
        validar_password()

    elif opcion == 4:
        print("Gracias por usar el programa. ¡Adiós!")

    else:
        print("Opción no válida.")