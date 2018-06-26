package br.csi.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import br.csi.dao.TreinoDAO;
import br.csi.model.ListaTreinos;
import br.csi.model.TrainingCenterDatabase;


@WebService(endpointInterface="br.csi.model.TreinoWS", serviceName="TreinoWS")
public class TreinoWSImpl {

			
	@WebMethod(operationName="todosOsTreinos")
	@WebResult(name="treinos")
	public ListaTreinos getTreinos(){
		System.out.println("vai listar treinos ....");
		
		
	ListaTreinos tt= new ListaTreinos(tDao.getTreinos());
		
            for(int i = 0; i < tDao.getTreinos().size(); i++){
		System.out.println(""+tDao.getTreinos().get(i).getId());
	}
	
		return tt;
	}
	
	private TreinoDAO tDao = new TreinoDAO();

       
        }