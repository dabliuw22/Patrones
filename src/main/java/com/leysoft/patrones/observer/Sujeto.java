package com.leysoft.patrones.observer;

import java.util.Observable;

public class Sujeto extends Observable {
	
	public int number;
	
	public Sujeto() {}

	public void accion(int number) {
		this.number = number;
		setChanged();
		notifyObservers();
	}
}