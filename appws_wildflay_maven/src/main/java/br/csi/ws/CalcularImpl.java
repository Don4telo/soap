package br.csi.ws;


import javax.jws.WebService;

import br.csi.model.Calcular;

@WebService(endpointInterface = "br.csi.model.Calcular", serviceName="CalcularWS")
public class CalcularImpl implements Calcular{

	 
	public long sum( long a,  long b){
		System.out.println("Somar ...");
		return a+b;
	}

	
	
}
