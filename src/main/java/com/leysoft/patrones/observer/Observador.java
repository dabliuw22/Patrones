package com.leysoft.patrones.observer;

import java.util.Observable;
import java.util.Observer;

public class Observador implements Observer {

	private int contador;
	
	public Observador() {}

	@Override
	public void update(Observable o, Object arg) {
		this.contador++;
		System.out.println("Se ha realizado un cambio, conteo: " + getContador());
	}
	
	public int getContador() {
		return this.contador;
	}
}