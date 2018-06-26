package br.csi.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
public interface CarroWS {

	@WebMethod(operationName="todosOsCarros")
	@WebResult(name="carros")
	public ListaCarros getCarros();
	
	
	@WebMethod(operationName="cadastrarCarro")
	@WebResult(name="carro")
	public Carro cadastrarCarro(@WebParam(name="carro") Carro carro, 
								@WebParam(name="chave") String chave, 
								@WebParam(name="token", header = true) String token) 
										throws AutorizacaoException;
	
	
	@WebMethod(operationName="autenticar")
	@WebResult(name="token")
	public String autenticar(@WebParam(name="usuario") Usuario usuario);
	
}
