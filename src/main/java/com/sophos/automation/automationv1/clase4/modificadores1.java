package com.sophos.automation.automationv1.clase4;

public class modificadores1 {
	
	private String variable1 = "carros de lujo";
	protected String variable2 = "ingenieros";
	public String variable3 = "servicios";
	
	public String retornoVariable1 () {
		return variable1+" valor x";
	}
	
	protected String retornoVariable2() {
		return variable1+" valor y";
	}
	
	private String retornoVariable3() {
		return variable1+" valor z";
	}
	
	

}
