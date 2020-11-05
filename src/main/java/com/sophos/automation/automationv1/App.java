package com.sophos.automation.automationv1;

import java.io.*;

import com.sophos.automation.automationv1.clase4.Carro;
import com.sophos.automation.automationv1.clase4.CarroDos;
import com.sophos.automation.automationv1.clase4.Rectangulo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Carro objCarro = new Carro();
    	objCarro.setCantidadLlantas(4);
    	objCarro.setColor("Gris Claro");
    	objCarro.setMarcaCarro("Renault");
    	objCarro.setNumeroPuestos(31);
    	objCarro.setNumeroPuestos(20);
    	
    	System.out.println(objCarro.getNumeroPuestos());
    	
    	Rectangulo objRect = new Rectangulo(2);
    	objRect.setValorLado(0, 4);
    	objRect.setValorLado(1, 5);
    	objRect.areaRectangulo();
    	System.out.println("El area del rectagulo es: "+objRect.getArea());
    	
    	CarroDos objCarroDos = new CarroDos();
    	objCarroDos.setCantidadLlantas(4);
    	objCarroDos.setTipoFuenteEnergia("Energia Solar");
    	objCarroDos.setColor("Rojo Fuego");
    	System.out.println("+++ Carro Dos +++");
    	System.out.println("Cantidad Llantas: "+objCarroDos.getCantidadLlantas());
    	System.out.println("Tipo de de fuente de energia: "+objCarroDos.getTipoFuenteEnergia());
    	System.out.println("Color: "+objCarroDos.getColor());
    	
    	//modificadores1 modif = new modificadores1();
    	
    	//System.out.println(modif.variable3);
    	//System.out.println(modif.retornoVariable1());
    	//System.out.println(modif.retornoVariable3());    	
    }
    
    public void clase3() throws IOException {
    	
    	BufferedReader tecla = new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.print("Ingrese su edad : ");
    	int edad = Integer.parseInt(tecla.readLine());

    	
    	if(edad>=18) {
    		System.out.println("La persona es mayor de edad");
    	}else {
    		System.out.println("La persona es menor de edad");
    	}
    	
    }
}
