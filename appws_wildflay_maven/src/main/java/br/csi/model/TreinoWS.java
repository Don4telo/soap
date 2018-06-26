package br.csi.model;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
public interface TreinoWS {

	@WebMethod(operationName="todosOsTreinos")
	@WebResult(name="treinos")
	public ListaTreinos getTreinos();

}
