package com.company;

public class Nodo {
    protected Object dato;
    //es inicio
    protected Nodo siguiente;

    //método constructor
    public Nodo(){
        siguiente=null;
        dato=0;
    }

    //le mandamos un objeto al nodo (envia el valor)
    public Nodo(Object p){
        siguiente = null;
        dato=p;
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    public void linknext(Nodo n){
        siguiente=n;
    }
}
