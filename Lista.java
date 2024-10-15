package AppEstructuraLineales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    List<String> lista1 = new ArrayList<>();

    public void crearLista() {
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        lista1.add(nombre);
    }
    //Metodo para mostrar la cantidad de elementos de la lista

    public void tamanioLista() {
        System.out.println("El tamaño de la lista es de " + lista1.size() + " elementos");
    }

    //Para ver si esta vacia
    public void estavacia() {
        if (lista1.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista no esta vacia");
        }

    }

    //Metodo para buscar un elemento
    public void buscarElemento() {
        System.out.println("Ingrese el elemento que desea buscar: ");
        String elemento = sc.next();

        if (lista1.contains(elemento)) {
            System.out.println("El elemento es: " + elemento + " Si se encuentra en la lista");
        } else {
            System.out.println("El elemento :" + elemento + " no existe");
        }
    }

    //Metodo para eleminar elemento

    public void eliminarElemento() {
        System.out.println("Ingrese el elemento que desea eliminar: " +
                "\n 1. Un elemento de la lista" +
                "\n 2. Toda la lista");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el elemento que desea eliminar: ");
                String elemento = sc.next();
                if (lista1.remove(elemento)) {
                    System.out.println("El elemento eliminado es: " + elemento + "\n");
                } else {
                    System.out.println("El elemento no existe :(");
                }
                for (String element : lista1) {
                    System.out.println(element);
                }
                break;
            case 2:
                lista1.clear();
                break;
        }
    }

    public void compararListas(){
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();

        lista2.add("peter");
        lista3.add("peter");

        if (lista1.equals(lista3)){
            System.out.println("Las listas son identicas");
        }else {
            System.out.println("Las listas son diferentes");
        }

    }

}
