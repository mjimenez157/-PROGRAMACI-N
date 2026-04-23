def mostrarMenu():
    print("Menu")
    print("1. Ingrese datos")
    print("2. Muestre datos")
    print("3. Salir")
    opcion = int(input("Seleccione una opcion: "))
    return opcion


opcion = 0
nombre = ""
edad = 0

while opcion != 3:
    opcion = mostrarMenu()

    if opcion == 1:
        nombre = input("Ingrese su nombre: ")
        edad = int(input("Ingrese su edad: "))

    elif opcion == 2:
        print("\n--- Datos ---")
        print("Nombre:", nombre)
        print("Edad:", edad)

    elif opcion == 3:
        print("Saliendo...")

    else:
        print("Opción inválida")