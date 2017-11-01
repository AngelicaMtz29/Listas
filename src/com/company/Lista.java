package com.company;


public class Lista {

    private static Nodo primero;
    int tamaño;


    //Agrega nuevos valores(objetos, nodos) a la lista
    public  void Agregar(Object p){
        Nodo nuevo=new Nodo(p);
        if(primero==null){
            primero=nuevo;
        }else {
            nuevo.siguiente=primero;
            primero=nuevo;
        }
    }

    //comprueba si hay valores en la lista default=true
    public static boolean Vacio(){
        return  primero==null;
    }


    public int getTamaño() {

        Nodo temporal=null;
        int i=0;
        temporal=primero;
        while (temporal!=null){
            temporal=temporal.siguiente;
            i++;
        }
        return i;

    }

    //muestra la lista de los elementos
    public void Mostrar(){
        Nodo temp=primero;
        if (temp!=null){
            int con=0;
            System.out.println("\nLos datos de la lista son: ");

            while (temp!=null){

                    System.out.println("["+con+"] "+temp.dato.toString()+" ");
                    temp=temp.siguiente;
                    con++;
            }
        }else {
            System.out.println("No hay elementos en la lista");
        }
    }

    //Buscar el valor en la posición indicada
    public Object buscar(int index) {


            int contador = 0;
            //cabecera temporal
            Nodo temporal = primero;
            //ciclo que permite recorrer el indice de la lista hasta llegue al indice indicado
        try {
            while (contador < index) {

                temporal = temporal.getSiguiente();
                contador++;
            }
            return temporal.getDato();

        }catch (Exception e){
            return "Ingrese una posición válida";
        }

    }


    //Muestra la posición del valor ingresado
    public int buscarvalor(int valor){

        Nodo temporal=primero;
        int tamaño=getTamaño();
         int cont=0;


         while (cont <=  tamaño && temporal!=null){
             Integer val=(Integer)temporal.dato;

             if (val==valor){
                 return cont;

             }
             cont++;
             temporal=temporal.getSiguiente();

         }
        return cont;
    }


    //Elimina el valor en la posición indicada

    public void Eliminar(int index) {
            try {
                if (index == 0) {
                    primero = primero.getSiguiente();
                } else {
                    int contador = 0;
                    Nodo temporal = primero;
                    while (contador < index - 1) {
                        temporal = temporal.getSiguiente();
                        contador++;
                    }
                    temporal.linknext(temporal.getSiguiente().getSiguiente());

                }
                tamaño--;
            }catch (NullPointerException e){
                System.out.println("No hay elementos que puedan ser eliminados, elija otra opción");
            }

    }

    //Elimina el valor ingresado
    public void EliminarValor(int valor) {

            int valoreliminar= buscarvalor(valor);
            Eliminar(valoreliminar);

    }

}
