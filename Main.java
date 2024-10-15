package AppEstructuraLineales;

import FilasCine.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. fila" +
                "\n 2. Cola");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                pedirFila();
                break;
            case 2:
                pedirCola();
                break;
        }

    }

    public static void pedirCola(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la cola: ");
        int capacidad = scanner.nextInt();
        Cola cola = new Cola(capacidad);
        scanner.nextLine();

        while (true) {
            System.out.println("\n1. Entrar al cine");
            System.out.println("2. Salir de la cola");
            System.out.println("3. Ver cola del cine");
            System.out.println("4. Salir del cine");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("¿Quién entrará al cine? ");
                    String resp = scanner.nextLine();
                    try {
                        cola.encolar(resp);
                        System.out.println(resp + " ha sido encolado.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String elementoDesencolado = cola.desencolar();
                        System.out.println(elementoDesencolado + " ha salido del cine.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo del cine...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }


    public static void pedirFila() {
        FilasCine.Lista lista = new Lista();

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Abrir programa" +
                "\n 2. Cerrar programa");

        int opcion = sc.nextInt();
        do {
            System.out.println("1. Agregue una pelicula  " +
                    "\n 2. Ingresar al cine " +
                    "\n 3. Verificar la cartelera " +
                    "\n 4. Buscar entradas disponibles 1" +
                    "\n 5. Eliminar la pelicula seleccionada" +
                    "\n 6. comprar la lista" +
                    "\n Seleccione una opción");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    lista.crearLista();
                    break;
                case 2:
                    lista.tamanioLista();
                case 3:
                    lista.estavacia();
                    break;
                case 4:
                    lista.buscarElemento();
                    break;
                case 5:
                    lista.eliminarElemento();
                    break;
                case 6:
                    lista.compararListas();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 1);

    }
}
