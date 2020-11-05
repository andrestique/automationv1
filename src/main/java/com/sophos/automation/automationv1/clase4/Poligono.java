package com.sophos.automation.automationv1.clase4;

public class Poligono {
	
	int [] cantidadLados;
	String color;
	
	public Poligono(int numLado) {
		super();
		color = null;
		cantidadLados = new int[numLado];
	}
	
	public void setValorLado(int posicion,int valor) {
		cantidadLados[posicion] = valor;
	}
	
	public int[] getCantidadLados() {
		return cantidadLados;
	}

	public void setCantidadLados(int[] cantidadLados) {
		this.cantidadLados = cantidadLados;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
		
}
