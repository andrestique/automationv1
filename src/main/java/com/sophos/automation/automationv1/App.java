package com.sophos.automation.automationv1;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {

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
