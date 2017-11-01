package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Los datos o valores que se ingresen
        Lista lista = new Lista();

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1) Insertar\n2) Mostrar\n3) Buscar por valor\n4) Buscar por indice\n5) Eliminar indice\n6) Eliminar valor\n7) Contar\n8) Terminar\n¿Cuál es tu opción?");
            opcion = sc.nextInt();

            switch (opcion) {
                //Agregar

                case 1:

                    System.out.println("Teclee la cantidad de elementos de la lista:");

                    int num = sc.nextInt();
                    int obj;
                    for (int i = 1; i <= num; i++) {
                        System.out.print("Teclee el elemento [" + i + "]: ");
                        int valor = sc.nextInt();
                        obj = valor;
                        lista.Agregar(obj);
                    }
                    break;

                //Mostrar lista
                case 2:
                    lista.Mostrar();
                    break;

                case 3:
                    //Busca la posicion por valor
                    if (Lista.Vacio()!=true){
                        System.out.println("Ingrese el valor a buscar: ");
                        int value = sc.nextInt();
                        System.out.println("el valor esta en la posicion: "+lista.buscarvalor(value));
                    }else {
                        System.out.println("No hay elementos en la lista, elija otra opción");
                    }
                    break;

                case 4:
                    //Busca el valor en la posición indicada
                    if (Lista.Vacio()!=true){
                        System.out.println("Teclee la posición del valor que busca: ");
                        int posicion = sc.nextInt();
                        System.out.println("Esta posción contiene el valor: "+lista.buscar(posicion));
                    }else {
                        System.out.println("No hay elementos en la lista, elija otra opción");
                    }
                   break;

                case 5:
                    //Elimina el valor en la posición indicada
                    if (Lista.Vacio()!=true) {
                        System.out.println("Teclee la posición del valor que desea eliminar");
                        int pos = sc.nextInt();
                        lista.Eliminar(pos);
                    }else {
                        System.out.println("No hay elementos que pueda eliminar \n elija otra opción");
                    }
                    break;

                case 6:
                    //eliminar la posición del valor indicado
                    if (Lista.Vacio()!= true){
                        System.out.println("Teclee el valor que desea eliminar");
                        int valor=sc.nextInt();
                        lista.EliminarValor(valor);
                    }else {
                        System.out.println("No hay elementos que pueda eliminar \n elija otra opción");
                    }


                case 7:
                    //Muestra el total de elementos en la lista
                    if (Lista.Vacio() == false) {
                        System.out.println("Total de elementos: " + lista.getTamaño());
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;

                case 8:
                    //Despedida
                    System.out.println("Vuelve pronto");
                    break;
            }
        }while (opcion != 8) ;
    }
}
