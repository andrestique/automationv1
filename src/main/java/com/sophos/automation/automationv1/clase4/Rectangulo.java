package com.sophos.automation.automationv1.clase4;

public class Rectangulo extends Poligono{
	
	public Rectangulo(int numLado) {
		super(numLado);		
	}

	int area;
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void areaRectangulo() {
		area = getCantidadLados()[0]*getCantidadLados()[1];
	}
	
}
