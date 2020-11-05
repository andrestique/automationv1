package com.sophos.automation.automationv1.clase4;

public class Vehiculo {
	
	private int CantidadLlantas;
	private String tipoFuenteEnergia;
	
	public Vehiculo() {
		super();
		CantidadLlantas = 0;
		tipoFuenteEnergia = null;
	}

	public int getCantidadLlantas() {
		return CantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		CantidadLlantas = cantidadLlantas;
	}

	public String getTipoFuenteEnergia() {
		return tipoFuenteEnergia;
	}

	public void setTipoFuenteEnergia(String tipoFuenteEnergia) {
		this.tipoFuenteEnergia = tipoFuenteEnergia;
	}
		
}
