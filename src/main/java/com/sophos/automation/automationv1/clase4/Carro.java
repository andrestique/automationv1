package com.sophos.automation.automationv1.clase4;

public class Carro {
	
	private int numeroPuestos;
	private String color;
	private int cantidadLlantas;
	private String marcaCarro;
	
	public Carro() {
		numeroPuestos = 0;
		color = null;
		cantidadLlantas = 0;
		marcaCarro = null;
	}

	public int getNumeroPuestos() {
		return numeroPuestos;
	}

	public void setNumeroPuestos(int numeroPuestos) {
		if(numeroPuestos<30) {
		this.numeroPuestos = numeroPuestos;
		}else {
			System.out.println("La cantidad de ocupantes no puede ser mayor a 30");
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidadLlantas() {
		return cantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		this.cantidadLlantas = cantidadLlantas;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}
	
		
}
