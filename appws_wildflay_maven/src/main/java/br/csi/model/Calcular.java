package br.csi.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Calcular {

	
	@WebMethod(operationName="somarValores")
	@WebResult(name="valorCalculado")
	public long sum(@WebParam(name="valor1") long a, @WebParam(name="valor2") long b);
}
