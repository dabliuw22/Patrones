package com.leysoft.patrones;

import com.leysoft.patrones.observer.Observador;
import com.leysoft.patrones.observer.Sujeto;
import com.leysoft.patrones.singleton.Logger;

public class App {
    public static void main( String[] args ) {
        Logger sigleton = Logger.getInstancia();
        sigleton.log("Probando Patron Singleton");
        
        Observador observador = new Observador();
        Sujeto sujeto = new Sujeto();
        sujeto.addObserver(observador);
        sujeto.accion(1);
        sujeto.accion(100);
    }
}
